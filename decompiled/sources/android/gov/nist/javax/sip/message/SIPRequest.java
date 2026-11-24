package android.gov.nist.javax.sip.message;

import a.axq;
import a.hny;
import a.jf4;
import a.twn;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.address.GenericURI;
import android.gov.nist.javax.sip.address.SipUri;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.RecordRouteList;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderList;
import android.gov.nist.javax.sip.header.To;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.header.ViaList;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import android.javax.sip.SipException;
import android.javax.sip.address.URI;
import android.javax.sip.header.Header;
import android.javax.sip.header.ServerHeader;
import android.javax.sip.message.Request;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SIPRequest extends SIPMessage implements Request, RequestExt {
    private static final String DEFAULT_TRANSPORT = "udp";
    private static final String DEFAULT_USER = "ip";
    protected static final Set<String> headersToIncludeInResponse;
    private static final Map<String, String> nameTable;
    private static final long serialVersionUID = 3360720013577322927L;
    private static final Set<String> targetRefreshMethods;
    private transient Object inviteTransaction;
    private transient Object messageChannel;
    protected RequestLine requestLine;
    private transient Object transactionPointer;

    static {
        HashSet hashSet = new HashSet();
        targetRefreshMethods = hashSet;
        nameTable = new ConcurrentHashMap(15);
        HashSet hashSet2 = new HashSet(0);
        headersToIncludeInResponse = hashSet2;
        hashSet.add("INVITE");
        hashSet.add(Request.UPDATE);
        hashSet.add("SUBSCRIBE");
        hashSet.add("NOTIFY");
        hashSet.add(Request.REFER);
        putName("INVITE");
        putName("BYE");
        putName(Request.CANCEL);
        putName("ACK");
        putName(Request.PRACK);
        putName(Request.INFO);
        putName("MESSAGE");
        putName("NOTIFY");
        putName("OPTIONS");
        putName(Request.PRACK);
        putName("PUBLISH");
        putName(Request.REFER);
        putName("REGISTER");
        putName("SUBSCRIBE");
        putName(Request.UPDATE);
        hashSet2.add("From".toLowerCase());
        hashSet2.add("To".toLowerCase());
        hashSet2.add("Via".toLowerCase());
        hashSet2.add("Record-Route".toLowerCase());
        hashSet2.add("Call-ID".toLowerCase());
        hashSet2.add("CSeq".toLowerCase());
        hashSet2.add("Timestamp".toLowerCase());
    }

    public static String getCannonicalName(String str) {
        Map<String, String> map = nameTable;
        return map.containsKey(str) ? map.get(str) : str;
    }

    public static boolean isDialogCreating(String str) {
        return SIPTransactionStack.isDialogCreated(str);
    }

    public static boolean isTargetRefresh(String str) {
        return targetRefreshMethods.contains(str);
    }

    private static void putName(String str) {
        nameTable.put(str, str);
    }

    public void checkHeaders() {
        if (getCSeq() == null) {
            hny.j(0, "Missing a required header : CSeq");
            return;
        }
        if (getTo() == null) {
            hny.j(0, "Missing a required header : To");
            return;
        }
        CallID callID = this.callIdHeader;
        if (callID == null || callID.getCallId() == null || this.callIdHeader.getCallId().equals("")) {
            hny.j(0, "Missing a required header : Call-ID");
            return;
        }
        if (getFrom() == null) {
            hny.j(0, "Missing a required header : From");
            return;
        }
        if (getViaHeaders() == null) {
            hny.j(0, "Missing a required header : Via");
            return;
        }
        if (getMaxForwards() == null) {
            hny.j(0, "Missing a required header : Max-Forwards");
            return;
        }
        if (getTopmostVia() == null) {
            hny.j(0, "No via header in request! ");
            return;
        }
        if (getMethod().equals("NOTIFY")) {
            if (getHeader("Subscription-State") == null) {
                hny.j(0, "Missing a required header : Subscription-State");
                return;
            } else if (getFromHeader().getTag() != null && getToHeader().getTag() != null && getHeader("Event") == null) {
                hny.j(0, "Missing a required header : Event");
                return;
            }
        } else if (getMethod().equals("PUBLISH") && getHeader("Event") == null) {
            hny.j(0, "Missing a required header : Event");
            return;
        }
        String method = this.requestLine.getMethod();
        if (SIPTransactionStack.isDialogCreated(method) && getContactHeader() == null && getToTag() == null) {
            hny.j(0, "Missing a required header : Contact");
        } else {
            if (this.requestLine == null || method == null || getCSeq().getMethod() == null || method.compareTo(getCSeq().getMethod()) == 0) {
                return;
            }
            hny.j(0, "CSEQ method mismatch with  Request-Line ");
        }
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public void cleanUp() {
        super.cleanUp();
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.core.GenericObject
    public Object clone() {
        SIPRequest sIPRequest = (SIPRequest) super.clone();
        sIPRequest.transactionPointer = null;
        RequestLine requestLine = this.requestLine;
        if (requestLine != null) {
            sIPRequest.requestLine = (RequestLine) requestLine.clone();
        }
        return sIPRequest;
    }

    public SIPRequest createAckRequest(To to) {
        SIPRequest sIPRequest = (SIPRequest) clone();
        sIPRequest.setMethod("ACK");
        sIPRequest.removeHeader("Route");
        sIPRequest.removeHeader("Proxy-Authorization");
        sIPRequest.removeContent();
        sIPRequest.removeHeader("Content-Type");
        try {
            sIPRequest.getCSeq().setMethod("ACK");
        } catch (ParseException unused) {
        }
        if (to != null) {
            sIPRequest.setTo(to);
        }
        sIPRequest.removeHeader("Contact");
        sIPRequest.removeHeader("Expires");
        ViaList viaHeaders = sIPRequest.getViaHeaders();
        if (viaHeaders != null && viaHeaders.size() > 1) {
            for (int i = 2; i < viaHeaders.size(); i++) {
                viaHeaders.remove(i);
            }
        }
        if (MessageFactoryImpl.getDefaultUserAgentHeader() != null) {
            sIPRequest.setHeader(MessageFactoryImpl.getDefaultUserAgentHeader());
        }
        return sIPRequest;
    }

    public SIPRequest createCancelRequest() throws SipException {
        if (!getMethod().equals("INVITE")) {
            throw new SipException("Attempt to create CANCEL for " + getMethod());
        }
        SIPRequest sIPRequest = new SIPRequest();
        sIPRequest.setRequestLine((RequestLine) this.requestLine.clone());
        sIPRequest.setMethod(Request.CANCEL);
        sIPRequest.setHeader((Header) this.callIdHeader.clone());
        sIPRequest.setHeader((Header) this.toHeader.clone());
        sIPRequest.setHeader((Header) this.cSeqHeader.clone());
        try {
            sIPRequest.getCSeq().setMethod(Request.CANCEL);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sIPRequest.setHeader((Header) this.fromHeader.clone());
        sIPRequest.addFirst((Header) getTopmostVia().clone());
        sIPRequest.setHeader((Header) this.maxForwardsHeader.clone());
        if (getRouteHeaders() != null) {
            sIPRequest.setHeader((Header) getRouteHeaders().clone());
        }
        if (MessageFactoryImpl.getDefaultUserAgentHeader() != null) {
            sIPRequest.setHeader(MessageFactoryImpl.getDefaultUserAgentHeader());
        }
        return sIPRequest;
    }

    public final SIPRequest createErrorAck(To to) throws SipException {
        SIPRequest sIPRequest = new SIPRequest();
        sIPRequest.setRequestLine((RequestLine) this.requestLine.clone());
        sIPRequest.setMethod("ACK");
        sIPRequest.setHeader((Header) this.callIdHeader.clone());
        sIPRequest.setHeader((Header) this.maxForwardsHeader.clone());
        sIPRequest.setHeader((Header) this.fromHeader.clone());
        sIPRequest.setHeader((Header) to.clone());
        sIPRequest.addFirst((Header) getTopmostVia().clone());
        sIPRequest.setHeader((Header) this.cSeqHeader.clone());
        sIPRequest.getCSeq().setMethod("ACK");
        if (getRouteHeaders() != null) {
            sIPRequest.setHeader((SIPHeaderList<Via>) getRouteHeaders().clone());
        }
        if (MessageFactoryImpl.getDefaultUserAgentHeader() != null) {
            sIPRequest.setHeader(MessageFactoryImpl.getDefaultUserAgentHeader());
        }
        return sIPRequest;
    }

    public SIPResponse createResponse(int i, String str) {
        boolean z;
        SIPResponse sIPResponse = new SIPResponse();
        try {
            sIPResponse.setStatusCode(i);
            if (str != null) {
                sIPResponse.setReasonPhrase(str);
            } else {
                sIPResponse.setReasonPhrase(SIPResponse.getReasonPhrase(i));
            }
            Iterator<String> it = headersToIncludeInResponse.iterator();
            while (it.hasNext()) {
                SIPHeader sIPHeader = this.headerTable.get(it.next());
                if (sIPHeader != null && (!((z = sIPHeader instanceof RecordRouteList)) || (z && mustCopyRR(i)))) {
                    try {
                        sIPResponse.attachHeader((SIPHeader) sIPHeader.clone(), false);
                    } catch (SIPDuplicateHeaderException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (MessageFactoryImpl.getDefaultServerHeader() != null) {
                sIPResponse.setHeader(MessageFactoryImpl.getDefaultServerHeader());
            }
            ServerHeader defaultServerHeader = MessageFactoryImpl.getDefaultServerHeader();
            if (defaultServerHeader != null) {
                sIPResponse.setHeader(defaultServerHeader);
            }
            return sIPResponse;
        } catch (ParseException unused) {
            jf4.o(twn.m(i, "Bad code "));
            return null;
        }
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageObject, android.gov.nist.core.GenericObject
    public String debugDump() {
        String strDebugDump = super.debugDump();
        this.stringRepresentation = "";
        sprint(SIPRequest.class.getName());
        sprint("{");
        RequestLine requestLine = this.requestLine;
        if (requestLine != null) {
            sprint(requestLine.debugDump());
        }
        sprint(strDebugDump);
        sprint("}");
        return this.stringRepresentation;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageObject, android.gov.nist.core.GenericObject
    public String encode() {
        if (this.requestLine == null) {
            return isNullRequest() ? "\r\n\r\n" : super.encode();
        }
        setRequestLineDefaults();
        return this.requestLine.encode() + super.encode();
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public byte[] encodeAsBytes(String str) {
        byte[] bytes;
        if (isNullRequest()) {
            return "\r\n\r\n".getBytes();
        }
        RequestLine requestLine = this.requestLine;
        if (requestLine == null) {
            return new byte[0];
        }
        if (requestLine != null) {
            try {
                bytes = requestLine.encode().getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                InternalErrorHandler.handleException(e);
                bytes = null;
            }
        } else {
            bytes = null;
        }
        byte[] bArrEncodeAsBytes = super.encodeAsBytes(str);
        byte[] bArr = new byte[bytes.length + bArrEncodeAsBytes.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        System.arraycopy(bArrEncodeAsBytes, 0, bArr, bytes.length, bArrEncodeAsBytes.length);
        return bArr;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public StringBuilder encodeMessage(StringBuilder sb) {
        if (this.requestLine != null) {
            setRequestLineDefaults();
            this.requestLine.encode(sb);
            encodeSIPHeaders(sb);
            return sb;
        }
        if (!isNullRequest()) {
            return encodeSIPHeaders(sb);
        }
        sb.append("\r\n\r\n");
        return sb;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return getClass().equals(obj.getClass()) && this.requestLine.equals(((SIPRequest) obj).requestLine) && super.equals(obj);
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageExt
    public String getFirstLine() {
        RequestLine requestLine = this.requestLine;
        if (requestLine == null) {
            return null;
        }
        return requestLine.encode();
    }

    public Object getInviteTransaction() {
        return this.inviteTransaction;
    }

    public String getMergeId() {
        String fromTag = getFromTag();
        String string = this.cSeqHeader.toString();
        String callId = this.callIdHeader.getCallId();
        String string2 = getRequestURI().toString();
        if (fromTag == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(string2);
        sb.append(Separators.COLON);
        sb.append(fromTag);
        sb.append(Separators.COLON);
        sb.append(string);
        return axq.n(sb, Separators.COLON, callId);
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public LinkedList getMessageAsEncodedStrings() {
        LinkedList<String> messageAsEncodedStrings = super.getMessageAsEncodedStrings();
        if (this.requestLine != null) {
            setRequestLineDefaults();
            messageAsEncodedStrings.addFirst(this.requestLine.encode());
        }
        return messageAsEncodedStrings;
    }

    public Object getMessageChannel() {
        return this.messageChannel;
    }

    @Override // android.javax.sip.message.Request
    public String getMethod() {
        RequestLine requestLine = this.requestLine;
        if (requestLine == null) {
            return null;
        }
        return requestLine.getMethod();
    }

    public RequestLine getRequestLine() {
        return this.requestLine;
    }

    @Override // android.javax.sip.message.Request
    public URI getRequestURI() {
        RequestLine requestLine = this.requestLine;
        if (requestLine == null) {
            return null;
        }
        return requestLine.getUri();
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.javax.sip.message.Message
    public String getSIPVersion() {
        return this.requestLine.getSipVersion();
    }

    public Object getTransaction() {
        return this.transactionPointer;
    }

    public String getViaHost() {
        return ((Via) getViaHeaders().getFirst()).getHost();
    }

    public int getViaPort() {
        Via via = (Via) getViaHeaders().getFirst();
        if (via.hasPort()) {
            return via.getPort();
        }
        return 5060;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.core.GenericObject
    public boolean match(Object obj) {
        if (obj == null) {
            return true;
        }
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Object obj2 = ((SIPRequest) obj).requestLine;
        RequestLine requestLine = this.requestLine;
        if (requestLine == null && obj2 != null) {
            return false;
        }
        if (requestLine == obj2) {
            return super.match(obj);
        }
        return requestLine.match(obj2) && super.match(obj);
    }

    public final boolean mustCopyRR(int i) {
        return i > 100 && i < 300 && isDialogCreating(getMethod()) && getToTag() == null;
    }

    public void setDefaults() {
        String method;
        GenericURI uri;
        RequestLine requestLine = this.requestLine;
        if (requestLine == null || (method = requestLine.getMethod()) == null || (uri = this.requestLine.getUri()) == null) {
            return;
        }
        if ((method.compareTo("REGISTER") == 0 || method.compareTo("INVITE") == 0) && (uri instanceof SipUri)) {
            SipUri sipUri = (SipUri) uri;
            sipUri.setUserParam(DEFAULT_USER);
            try {
                sipUri.setTransportParam("udp");
            } catch (ParseException unused) {
            }
        }
    }

    public void setInviteTransaction(Object obj) {
        this.inviteTransaction = obj;
    }

    public void setMessageChannel(Object obj) {
        this.messageChannel = obj;
    }

    @Override // android.javax.sip.message.Request
    public void setMethod(String str) {
        if (str == null) {
            jf4.o("null method");
            return;
        }
        if (this.requestLine == null) {
            this.requestLine = new RequestLine();
        }
        String cannonicalName = getCannonicalName(str);
        this.requestLine.setMethod(cannonicalName);
        CSeq cSeq = this.cSeqHeader;
        if (cSeq != null) {
            try {
                cSeq.setMethod(cannonicalName);
            } catch (ParseException unused) {
            }
        }
    }

    public void setRequestLine(RequestLine requestLine) {
        this.requestLine = requestLine;
    }

    public void setRequestLineDefaults() {
        CSeq cSeq;
        if (this.requestLine.getMethod() != null || (cSeq = (CSeq) getCSeq()) == null) {
            return;
        }
        this.requestLine.setMethod(getCannonicalName(cSeq.getMethod()));
    }

    @Override // android.javax.sip.message.Request
    public void setRequestURI(URI uri) {
        if (uri == null) {
            hny.u("Null request URI");
            return;
        }
        RequestLine requestLine = this.requestLine;
        if (requestLine == null) {
            requestLine = new RequestLine();
            this.requestLine = requestLine;
        }
        requestLine.setUri((GenericURI) uri);
        this.nullRequest = false;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.javax.sip.message.Message
    public void setSIPVersion(String str) throws ParseException {
        if (str == null || !str.equalsIgnoreCase(SIPConstants.SIP_VERSION_STRING)) {
            hny.j(0, "sipVersion");
        } else {
            this.requestLine.setSipVersion(str);
        }
    }

    public void setTransaction(Object obj) {
        this.transactionPointer = obj;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.javax.sip.message.Message
    public String toString() {
        return encode();
    }

    public SIPResponse createResponse(int i) {
        return createResponse(i, SIPResponse.getReasonPhrase(i));
    }
}
