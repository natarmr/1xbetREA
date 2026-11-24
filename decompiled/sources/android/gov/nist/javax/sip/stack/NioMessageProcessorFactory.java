package android.gov.nist.javax.sip.stack;

import a.e9d0;
import a.jf4;
import android.gov.nist.javax.sip.ListeningPointExt;
import android.gov.nist.javax.sip.SipStackImpl;
import android.javax.sip.ListeningPoint;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes.dex */
public class NioMessageProcessorFactory implements MessageProcessorFactory {
    @Override // android.gov.nist.javax.sip.stack.MessageProcessorFactory
    public MessageProcessor createMessageProcessor(SIPTransactionStack sIPTransactionStack, InetAddress inetAddress, int i, String str) {
        if (str.equalsIgnoreCase(ListeningPoint.UDP)) {
            UDPMessageProcessor uDPMessageProcessor = new UDPMessageProcessor(inetAddress, sIPTransactionStack, i);
            sIPTransactionStack.udpFlag = true;
            return uDPMessageProcessor;
        }
        if (str.equalsIgnoreCase(ListeningPoint.TCP)) {
            return new NioTcpMessageProcessor(inetAddress, sIPTransactionStack, i);
        }
        if (str.equalsIgnoreCase(ListeningPoint.TLS)) {
            return new NioTlsMessageProcessor(inetAddress, sIPTransactionStack, i);
        }
        if (str.equalsIgnoreCase(ListeningPoint.SCTP)) {
            try {
                MessageProcessor messageProcessor = (MessageProcessor) ClassLoader.getSystemClassLoader().loadClass("android.gov.nist.javax.sip.stack.sctp.SCTPMessageProcessor").newInstance();
                messageProcessor.initialize(inetAddress, i, sIPTransactionStack);
                return messageProcessor;
            } catch (ClassNotFoundException unused) {
                jf4.o("SCTP not supported (needs Java 7 and SCTP jar in classpath)");
                return null;
            } catch (IllegalAccessException e) {
                e9d0.t("Error initializing SCTP", e);
                return null;
            } catch (InstantiationException e2) {
                e9d0.t("Error initializing SCTP", e2);
                return null;
            }
        }
        if (str.equalsIgnoreCase(ListeningPointExt.WS)) {
            if ("true".equals(((SipStackImpl) sIPTransactionStack).getConfigurationProperties().getProperty("android.gov.nist.javax.sip.USE_TLS_GATEWAY"))) {
                NioTlsWebSocketMessageProcessor nioTlsWebSocketMessageProcessor = new NioTlsWebSocketMessageProcessor(inetAddress, sIPTransactionStack, i);
                nioTlsWebSocketMessageProcessor.transport = ListeningPointExt.WS;
                return nioTlsWebSocketMessageProcessor;
            }
            NioWebSocketMessageProcessor nioWebSocketMessageProcessor = new NioWebSocketMessageProcessor(inetAddress, sIPTransactionStack, i);
            nioWebSocketMessageProcessor.transport = ListeningPointExt.WS;
            return nioWebSocketMessageProcessor;
        }
        if (!str.equalsIgnoreCase(ListeningPointExt.WSS)) {
            jf4.o("bad transport");
            return null;
        }
        if ("true".equals(((SipStackImpl) sIPTransactionStack).getConfigurationProperties().getProperty("android.gov.nist.javax.sip.USE_TLS_GATEWAY"))) {
            NioWebSocketMessageProcessor nioWebSocketMessageProcessor2 = new NioWebSocketMessageProcessor(inetAddress, sIPTransactionStack, i);
            nioWebSocketMessageProcessor2.transport = ListeningPointExt.WSS;
            return nioWebSocketMessageProcessor2;
        }
        NioTlsWebSocketMessageProcessor nioTlsWebSocketMessageProcessor2 = new NioTlsWebSocketMessageProcessor(inetAddress, sIPTransactionStack, i);
        nioTlsWebSocketMessageProcessor2.transport = ListeningPointExt.WSS;
        return nioTlsWebSocketMessageProcessor2;
    }
}
