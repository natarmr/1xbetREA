package android.gov.nist.javax.sip.stack;

import a.e9d0;
import a.jf4;
import android.javax.sip.ListeningPoint;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes.dex */
public class OIOMessageProcessorFactory implements MessageProcessorFactory {
    @Override // android.gov.nist.javax.sip.stack.MessageProcessorFactory
    public MessageProcessor createMessageProcessor(SIPTransactionStack sIPTransactionStack, InetAddress inetAddress, int i, String str) {
        if (str.equalsIgnoreCase(ListeningPoint.UDP)) {
            UDPMessageProcessor uDPMessageProcessor = new UDPMessageProcessor(inetAddress, sIPTransactionStack, i);
            sIPTransactionStack.udpFlag = true;
            return uDPMessageProcessor;
        }
        if (str.equalsIgnoreCase(ListeningPoint.TCP)) {
            return new TCPMessageProcessor(inetAddress, sIPTransactionStack, i);
        }
        if (str.equalsIgnoreCase(ListeningPoint.TLS)) {
            return new TLSMessageProcessor(inetAddress, sIPTransactionStack, i);
        }
        if (!str.equalsIgnoreCase(ListeningPoint.SCTP)) {
            jf4.o("bad transport");
            return null;
        }
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
}
