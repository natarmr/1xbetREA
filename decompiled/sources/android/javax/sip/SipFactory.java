package android.javax.sip;

import android.gov.nist.core.Separators;
import android.javax.sip.address.AddressFactory;
import android.javax.sip.header.HeaderFactory;
import android.javax.sip.message.MessageFactory;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public class SipFactory {
    private static SipFactory myFactory;
    private String pathName = "gov.nist";
    private MessageFactory messageFactory = null;
    private HeaderFactory headerFactory = null;
    private AddressFactory addressFactory = null;
    private final LinkedList sipStackList = new LinkedList();
    private Hashtable sipStackByName = new Hashtable();

    private SipFactory() {
    }

    private Object createSipFactory(String str) throws PeerUnavailableException {
        str.getClass();
        try {
            return Class.forName(getPathName() + Separators.DOT + str).newInstance();
        } catch (Exception e) {
            throw new PeerUnavailableException("The Peer Factory: " + getPathName() + Separators.DOT + str + " could not be instantiated. Ensure the Path Name has been set.", e);
        }
    }

    private SipStack createStack(Properties properties) throws PeerUnavailableException {
        try {
            SipStack sipStack = (SipStack) Class.forName(getPathName() + ".javax.sip.SipStackImpl").getConstructor(Class.forName("java.util.Properties")).newInstance(properties);
            this.sipStackList.add(sipStack);
            this.sipStackByName.put(properties.getProperty("android.javax.sip.STACK_NAME"), sipStack);
            return sipStack;
        } catch (Exception e) {
            throw new PeerUnavailableException("The Peer SIP Stack: " + getPathName() + ".javax.sip.SipStackImpl could not be instantiated. Ensure the Path Name has been set.", e);
        }
    }

    public static synchronized SipFactory getInstance() {
        SipFactory sipFactory;
        sipFactory = myFactory;
        if (sipFactory == null) {
            sipFactory = new SipFactory();
            myFactory = sipFactory;
        }
        return sipFactory;
    }

    public AddressFactory createAddressFactory() {
        AddressFactory addressFactory = this.addressFactory;
        if (addressFactory != null) {
            return addressFactory;
        }
        AddressFactory addressFactory2 = (AddressFactory) createSipFactory("javax.sip.address.AddressFactoryImpl");
        this.addressFactory = addressFactory2;
        return addressFactory2;
    }

    public HeaderFactory createHeaderFactory() {
        HeaderFactory headerFactory = this.headerFactory;
        if (headerFactory != null) {
            return headerFactory;
        }
        HeaderFactory headerFactory2 = (HeaderFactory) createSipFactory("javax.sip.header.HeaderFactoryImpl");
        this.headerFactory = headerFactory2;
        return headerFactory2;
    }

    public MessageFactory createMessageFactory() {
        MessageFactory messageFactory = this.messageFactory;
        if (messageFactory != null) {
            return messageFactory;
        }
        MessageFactory messageFactory2 = (MessageFactory) createSipFactory("javax.sip.message.MessageFactoryImpl");
        this.messageFactory = messageFactory2;
        return messageFactory2;
    }

    public synchronized SipStack createSipStack(Properties properties) {
        String property = properties.getProperty("android.javax.sip.IP_ADDRESS");
        String property2 = properties.getProperty("android.javax.sip.STACK_NAME");
        if (property2 == null) {
            throw new PeerUnavailableException("Missing android.javax.sip.STACK_NAME property");
        }
        if (property == null) {
            SipStack sipStackCreateStack = (SipStack) this.sipStackByName.get(property2);
            if (sipStackCreateStack == null) {
                sipStackCreateStack = createStack(properties);
            }
            return sipStackCreateStack;
        }
        for (int i = 0; i < this.sipStackList.size(); i++) {
            if (((SipStack) this.sipStackList.get(i)).getIPAddress().equals(property)) {
                return (SipStack) this.sipStackList.get(i);
            }
        }
        return createStack(properties);
    }

    public String getPathName() {
        return this.pathName;
    }

    public void resetFactory() {
        this.sipStackList.clear();
        this.messageFactory = null;
        this.headerFactory = null;
        this.addressFactory = null;
        this.sipStackByName = new Hashtable();
        this.pathName = "gov.nist";
    }

    public void setPathName(String str) {
        this.pathName = str;
    }
}
