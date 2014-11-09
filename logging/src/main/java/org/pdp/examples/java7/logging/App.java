package org.pdp.examples.java7.logging;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Enumeration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

  private static final Logger SLF4J_LOGGER = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {

    HostDescriptor descriptor = new HostDescriptor();
    descriptor.describe();

    SLF4J_LOGGER.info("timestamp=\"{}\" hostname=\"{}\" ip=\"{}\" message=\"{}\"", new Date(), descriptor.getHostName(), descriptor.getIpAddress(), "my info message");
    SLF4J_LOGGER.debug("timestamp=\"{}\" hostname=\"{}\" ip=\"{}\" message=\"{}\"", new Date(), descriptor.getHostName(), descriptor.getIpAddress(), "my debug message");
  }

  private static final class HostDescriptor {

    private String ipAddress = null;
    private String hostName = null;

    public String getIpAddress() {
      return ipAddress;
    }

    public String getHostName() {
      return hostName;
    }

    public void describe() {
      ipAddress = discoverIpAddress();
      hostName = discoverHostName();
    }

    // http://stackoverflow.com/questions/7348711/recommended-way-to-get-hostname-in-java
    private String discoverHostName() {
      String hostName;
      try {
        hostName = InetAddress.getLocalHost().getHostName();
      }
      catch (UnknownHostException e) {
        hostName = null;
      }
      return hostName;
    }

    // http://stackoverflow.com/questions/8083479/java-getting-my-ip-address
    private String discoverIpAddress() {
      String ip = null;
      try {
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
          NetworkInterface iface = interfaces.nextElement();
          // filters out 127.0.0.1 and inactive interfaces
          if (iface.isLoopback() || !iface.isUp()) {
            continue;
          }

          Enumeration<InetAddress> addresses = iface.getInetAddresses();
          while (addresses.hasMoreElements()) {
            InetAddress addr = addresses.nextElement();
            ip = addr.getHostAddress();
            System.out.println(iface.getDisplayName() + " " + ip);
          }
        }
      }
      catch (SocketException e) {
        ip = null;
      }
      return ip;
    }
  }

}