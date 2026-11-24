package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.address.ParameterNames;
import android.javax.sip.ListeningPoint;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class TCPMessageProcessor extends ConnectionOrientedMessageProcessor implements Runnable {
    private static StackLogger logger = CommonLogger.getLogger(TCPMessageProcessor.class);

    public TCPMessageProcessor(InetAddress inetAddress, SIPTransactionStack sIPTransactionStack, int i) {
        super(inetAddress, i, ParameterNames.TCP, sIPTransactionStack);
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public synchronized MessageChannel createMessageChannel(InetAddress inetAddress, int i) {
        try {
            String key = MessageChannel.getKey(inetAddress, i, ListeningPoint.TCP);
            if (this.messageChannels.get(key) != null) {
                return (TCPMessageChannel) this.messageChannels.get(key);
            }
            TCPMessageChannel tCPMessageChannel = new TCPMessageChannel(inetAddress, i, this.sipStack, this);
            this.messageChannels.put(key, tCPMessageChannel);
            tCPMessageChannel.isCached = true;
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("key " + key);
                logger.logDebug("Creating " + tCPMessageChannel);
            }
            return tCPMessageChannel;
        } catch (UnknownHostException e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public int getDefaultTargetPort() {
        return 5060;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public String getTransport() {
        return ParameterNames.TCP;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public boolean isSecure() {
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.isRunning) {
            try {
                synchronized (this) {
                    while (true) {
                        try {
                            int i = this.sipStack.maxConnections;
                            if (i == -1 || this.nConnections < i) {
                                break;
                            }
                            try {
                                wait();
                                if (!this.isRunning) {
                                    return;
                                }
                            } catch (InterruptedException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    this.nConnections++;
                }
                Socket socketAccept = this.sock.accept();
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Accepting new connection!");
                }
                TCPMessageChannel tCPMessageChannel = new TCPMessageChannel(socketAccept, this.sipStack, this, "TCPMessageChannelThread-" + this.nConnections);
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug(Thread.currentThread() + " adding incoming channel " + tCPMessageChannel.getKey() + " for processor " + getIpAddress() + Separators.COLON + getPort() + Separators.SLASH + getTransport());
                }
                this.incomingMessageChannels.put(tCPMessageChannel.getKey(), tCPMessageChannel);
            } catch (SocketException unused2) {
                this.isRunning = false;
            } catch (IOException e) {
                if (logger.isLoggingEnabled()) {
                    logger.logException(e);
                }
            } catch (Exception e2) {
                InternalErrorHandler.handleException(e2);
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public void start() {
        Thread thread = new Thread(this);
        thread.setName("MessageProcessorThread-TCP-" + getIpAddress().getHostAddress() + '/' + getPort());
        thread.setPriority(this.sipStack.getThreadPriority());
        thread.setDaemon(true);
        this.sock = this.sipStack.getNetworkLayer().createServerSocket(getPort(), 0, getIpAddress());
        if (getIpAddress().getHostAddress().equals("0.0.0.0") || getIpAddress().getHostAddress().equals("::0")) {
            super.setIpAddress(this.sock.getInetAddress());
        }
        this.isRunning = true;
        thread.start();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public synchronized void stop() {
        this.isRunning = false;
        try {
            this.sock.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Iterator<ConnectionOrientedMessageChannel> it = this.messageChannels.values().iterator();
        while (it.hasNext()) {
            ((TCPMessageChannel) it.next()).close();
        }
        Iterator<ConnectionOrientedMessageChannel> it2 = this.incomingMessageChannels.values().iterator();
        while (it2.hasNext()) {
            ((TCPMessageChannel) it2.next()).close();
        }
        notify();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageProcessor
    public synchronized MessageChannel createMessageChannel(HostPort hostPort) {
        String key = MessageChannel.getKey(hostPort, ListeningPoint.TCP);
        if (this.messageChannels.get(key) != null) {
            return (TCPMessageChannel) this.messageChannels.get(key);
        }
        TCPMessageChannel tCPMessageChannel = new TCPMessageChannel(hostPort.getInetAddress(), hostPort.getPort(), this.sipStack, this);
        this.messageChannels.put(key, tCPMessageChannel);
        tCPMessageChannel.isCached = true;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("key " + key);
            logger.logDebug("Creating " + tCPMessageChannel);
        }
        return tCPMessageChannel;
    }
}
