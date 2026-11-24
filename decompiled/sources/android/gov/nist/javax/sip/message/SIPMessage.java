package android.gov.nist.javax.sip.message;

import a.hny;
import a.itt0;
import a.jf4;
import a.ohq;
import a.v4i0;
import android.gov.nist.core.GenericObject;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.Utils;
import android.gov.nist.javax.sip.header.AlertInfo;
import android.gov.nist.javax.sip.header.Authorization;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.Contact;
import android.gov.nist.javax.sip.header.ContactList;
import android.gov.nist.javax.sip.header.ContentLength;
import android.gov.nist.javax.sip.header.ContentType;
import android.gov.nist.javax.sip.header.ErrorInfo;
import android.gov.nist.javax.sip.header.ErrorInfoList;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.InReplyTo;
import android.gov.nist.javax.sip.header.MaxForwards;
import android.gov.nist.javax.sip.header.Priority;
import android.gov.nist.javax.sip.header.ProxyAuthenticate;
import android.gov.nist.javax.sip.header.ProxyAuthorization;
import android.gov.nist.javax.sip.header.ProxyRequire;
import android.gov.nist.javax.sip.header.ProxyRequireList;
import android.gov.nist.javax.sip.header.RSeq;
import android.gov.nist.javax.sip.header.RecordRouteList;
import android.gov.nist.javax.sip.header.RetryAfter;
import android.gov.nist.javax.sip.header.Route;
import android.gov.nist.javax.sip.header.RouteList;
import android.gov.nist.javax.sip.header.SIPETag;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderList;
import android.gov.nist.javax.sip.header.SIPHeaderNamesCache;
import android.gov.nist.javax.sip.header.SIPIfMatch;
import android.gov.nist.javax.sip.header.Server;
import android.gov.nist.javax.sip.header.Subject;
import android.gov.nist.javax.sip.header.To;
import android.gov.nist.javax.sip.header.Unsupported;
import android.gov.nist.javax.sip.header.UserAgent;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.header.ViaList;
import android.gov.nist.javax.sip.header.WWWAuthenticate;
import android.gov.nist.javax.sip.header.Warning;
import android.gov.nist.javax.sip.parser.ParserFactory;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.SipException;
import android.javax.sip.header.CSeqHeader;
import android.javax.sip.header.CallIdHeader;
import android.javax.sip.header.ContentDispositionHeader;
import android.javax.sip.header.ContentEncodingHeader;
import android.javax.sip.header.ContentLanguageHeader;
import android.javax.sip.header.ContentLengthHeader;
import android.javax.sip.header.ContentTypeHeader;
import android.javax.sip.header.ExpiresHeader;
import android.javax.sip.header.FromHeader;
import android.javax.sip.header.Header;
import android.javax.sip.header.MaxForwardsHeader;
import android.javax.sip.header.RecordRouteHeader;
import android.javax.sip.header.ToHeader;
import android.javax.sip.header.ViaHeader;
import android.javax.sip.message.Message;
import android.javax.sip.message.Request;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public abstract class SIPMessage extends MessageObject implements Message, MessageExt {
    protected Object applicationData;
    protected CSeq cSeqHeader;
    protected CallID callIdHeader;
    protected ContentLength contentLengthHeader;
    protected String forkId;
    protected From fromHeader;
    private InetAddress localAddress;
    private int localPort;
    protected MaxForwards maxForwardsHeader;
    protected String messageContent;
    protected byte[] messageContentBytes;
    protected Object messageContentObject;
    protected boolean nullRequest;
    private InetAddress peerPacketSourceAddress;
    private int peerPacketSourcePort;
    private InetAddress remoteAddress;
    private int remotePort;
    protected int size;
    protected To toHeader;
    private static final String CONTENT_TYPE_LOWERCASE = SIPHeaderNamesCache.toLowerCase("Content-Type");
    private static final String ERROR_LOWERCASE = SIPHeaderNamesCache.toLowerCase("Error-Info");
    private static final String CONTACT_LOWERCASE = SIPHeaderNamesCache.toLowerCase("Contact");
    private static final String VIA_LOWERCASE = SIPHeaderNamesCache.toLowerCase("Via");
    private static final String AUTHORIZATION_LOWERCASE = SIPHeaderNamesCache.toLowerCase("Authorization");
    private static final String ROUTE_LOWERCASE = SIPHeaderNamesCache.toLowerCase("Route");
    private static final String RECORDROUTE_LOWERCASE = SIPHeaderNamesCache.toLowerCase("Record-Route");
    private static final String CONTENT_DISPOSITION_LOWERCASE = SIPHeaderNamesCache.toLowerCase("Content-Disposition");
    private static final String CONTENT_ENCODING_LOWERCASE = SIPHeaderNamesCache.toLowerCase("Content-Encoding");
    private static final String CONTENT_LANGUAGE_LOWERCASE = SIPHeaderNamesCache.toLowerCase("Content-Language");
    private static final String EXPIRES_LOWERCASE = SIPHeaderNamesCache.toLowerCase("Expires");
    private String contentEncodingCharset = MessageFactoryImpl.getDefaultContentEncodingCharset();
    protected LinkedList<String> unrecognizedHeaders = new LinkedList<>();
    protected ConcurrentLinkedQueue<SIPHeader> headers = new ConcurrentLinkedQueue<>();
    protected Map<String, SIPHeader> headerTable = new ConcurrentHashMap();

    public SIPMessage() {
        try {
            attachHeader(new ContentLength(0), false);
        } catch (Exception unused) {
        }
    }

    private void computeContentLength(Object obj) {
        int length;
        if (obj == null) {
            length = 0;
        } else if (obj instanceof String) {
            try {
                length = ((String) obj).getBytes(getCharset()).length;
            } catch (UnsupportedEncodingException e) {
                InternalErrorHandler.handleException(e);
                length = 0;
            }
        } else {
            length = obj instanceof byte[] ? ((byte[]) obj).length : obj.toString().length();
        }
        try {
            this.contentLengthHeader.setContentLength(length);
        } catch (InvalidArgumentException unused) {
        }
    }

    private List<SIPHeader> getHeaderList(String str) {
        SIPHeader sIPHeader = this.headerTable.get(SIPHeaderNamesCache.toLowerCase(str));
        if (sIPHeader == null) {
            return null;
        }
        if (sIPHeader instanceof SIPHeaderList) {
            return ((SIPHeaderList) sIPHeader).getHeaderList();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(sIPHeader);
        return linkedList;
    }

    public static boolean isRequestHeader(SIPHeader sIPHeader) {
        return (sIPHeader instanceof AlertInfo) || (sIPHeader instanceof InReplyTo) || (sIPHeader instanceof Authorization) || (sIPHeader instanceof MaxForwards) || (sIPHeader instanceof UserAgent) || (sIPHeader instanceof Priority) || (sIPHeader instanceof ProxyAuthorization) || (sIPHeader instanceof ProxyRequire) || (sIPHeader instanceof ProxyRequireList) || (sIPHeader instanceof Route) || (sIPHeader instanceof RouteList) || (sIPHeader instanceof Subject) || (sIPHeader instanceof SIPIfMatch);
    }

    public static boolean isResponseHeader(SIPHeader sIPHeader) {
        return (sIPHeader instanceof ErrorInfo) || (sIPHeader instanceof ProxyAuthenticate) || (sIPHeader instanceof Server) || (sIPHeader instanceof Unsupported) || (sIPHeader instanceof RetryAfter) || (sIPHeader instanceof Warning) || (sIPHeader instanceof WWWAuthenticate) || (sIPHeader instanceof SIPETag) || (sIPHeader instanceof RSeq);
    }

    @Override // android.javax.sip.message.Message
    public void addFirst(Header header) throws SipException {
        if (header == null) {
            hny.u("null arg!");
            return;
        }
        try {
            attachHeader((SIPHeader) header, false, true);
        } catch (SIPDuplicateHeaderException unused) {
            v4i0.k("Cannot add header - header already exists");
        }
    }

    @Override // android.javax.sip.message.Message
    public void addHeader(Header header) {
        SIPHeader sIPHeader = (SIPHeader) header;
        try {
            try {
                if (!(header instanceof ViaHeader) && !(header instanceof RecordRouteHeader)) {
                    attachHeader(sIPHeader, false, false);
                    return;
                }
                attachHeader(sIPHeader, false, true);
            } catch (SIPDuplicateHeaderException unused) {
                if (header instanceof ContentLength) {
                    this.contentLengthHeader.setContentLength(((ContentLength) header).getContentLength());
                }
            }
        } catch (InvalidArgumentException unused2) {
        }
    }

    @Override // android.javax.sip.message.Message
    public void addLast(Header header) throws SipException {
        if (header == null) {
            hny.u("null arg!");
            return;
        }
        try {
            attachHeader((SIPHeader) header, false, false);
        } catch (SIPDuplicateHeaderException unused) {
            v4i0.k("Cannot add header - header already exists");
        }
    }

    public void addUnparsed(String str) {
        getUnrecognizedHeadersList().add(str);
    }

    public void attachHeader(SIPHeader sIPHeader, boolean z, boolean z2) {
        SIPHeader sIPHeader2;
        if (sIPHeader == null) {
            hny.u("null header");
            return;
        }
        if (!ListMap.hasList(sIPHeader) || SIPHeaderList.class.isAssignableFrom(sIPHeader.getClass())) {
            sIPHeader2 = sIPHeader;
        } else {
            SIPHeaderList<SIPHeader> list = ListMap.getList(sIPHeader);
            list.add(sIPHeader);
            sIPHeader2 = list;
        }
        String lowerCase = SIPHeaderNamesCache.toLowerCase(sIPHeader2.getName());
        Map<String, SIPHeader> map = this.headerTable;
        if (z) {
            map.remove(lowerCase);
        } else if (map.containsKey(lowerCase) && !(sIPHeader2 instanceof SIPHeaderList)) {
            if (sIPHeader2 instanceof ContentLength) {
                try {
                    this.contentLengthHeader.setContentLength(((ContentLength) sIPHeader2).getContentLength());
                    return;
                } catch (InvalidArgumentException unused) {
                    return;
                }
            }
            return;
        }
        SIPHeader sIPHeader3 = (SIPHeader) getHeader(sIPHeader.getName());
        if (sIPHeader3 != null) {
            Iterator<SIPHeader> it = this.headers.iterator();
            while (it.hasNext()) {
                if (it.next().equals(sIPHeader3)) {
                    it.remove();
                }
            }
        }
        if (this.headerTable.containsKey(lowerCase)) {
            boolean z3 = sIPHeader2 instanceof SIPHeaderList;
            Map<String, SIPHeader> map2 = this.headerTable;
            if (z3) {
                SIPHeaderList sIPHeaderList = (SIPHeaderList) map2.get(lowerCase);
                if (sIPHeaderList != null) {
                    sIPHeaderList.concatenate((SIPHeaderList) sIPHeader2, z2);
                } else {
                    this.headerTable.put(lowerCase, sIPHeader2);
                }
            } else {
                map2.put(lowerCase, sIPHeader2);
            }
        } else {
            this.headerTable.put(lowerCase, sIPHeader2);
            this.headers.add(sIPHeader2);
        }
        if (sIPHeader2 instanceof From) {
            this.fromHeader = (From) sIPHeader2;
            return;
        }
        if (sIPHeader2 instanceof ContentLength) {
            this.contentLengthHeader = (ContentLength) sIPHeader2;
            return;
        }
        if (sIPHeader2 instanceof To) {
            this.toHeader = (To) sIPHeader2;
            return;
        }
        if (sIPHeader2 instanceof CSeq) {
            this.cSeqHeader = (CSeq) sIPHeader2;
        } else if (sIPHeader2 instanceof CallID) {
            this.callIdHeader = (CallID) sIPHeader2;
        } else if (sIPHeader2 instanceof MaxForwards) {
            this.maxForwardsHeader = (MaxForwards) sIPHeader2;
        }
    }

    public void cleanUp() {
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        SIPMessage sIPMessage = (SIPMessage) super.clone();
        sIPMessage.headerTable = new ConcurrentHashMap();
        sIPMessage.fromHeader = null;
        sIPMessage.toHeader = null;
        sIPMessage.cSeqHeader = null;
        sIPMessage.callIdHeader = null;
        sIPMessage.contentLengthHeader = null;
        sIPMessage.maxForwardsHeader = null;
        sIPMessage.forkId = null;
        if (this.headers != null) {
            sIPMessage.headers = new ConcurrentLinkedQueue<>();
            Iterator<SIPHeader> it = this.headers.iterator();
            while (it.hasNext()) {
                sIPMessage.attachHeader((SIPHeader) it.next().clone());
            }
        }
        byte[] bArr = this.messageContentBytes;
        if (bArr != null) {
            sIPMessage.messageContentBytes = (byte[]) bArr.clone();
        }
        Object obj = this.messageContentObject;
        if (obj != null) {
            sIPMessage.messageContentObject = GenericObject.makeClone(obj);
        }
        sIPMessage.unrecognizedHeaders = this.unrecognizedHeaders;
        sIPMessage.remoteAddress = this.remoteAddress;
        sIPMessage.remotePort = this.remotePort;
        return sIPMessage;
    }

    @Override // android.gov.nist.javax.sip.message.MessageObject, android.gov.nist.core.GenericObject
    public String debugDump() {
        this.stringRepresentation = "";
        sprint("SIPMessage:");
        sprint("{");
        try {
            for (Field field : getClass().getDeclaredFields()) {
                Class<?> type = field.getType();
                String name = field.getName();
                if (field.get(this) != null && SIPHeader.class.isAssignableFrom(type) && name.compareTo("headers") != 0) {
                    sprint(name + "=");
                    sprint(((SIPHeader) field.get(this)).debugDump());
                }
            }
        } catch (Exception e) {
            InternalErrorHandler.handleException(e);
        }
        sprint("List of headers : ");
        sprint(this.headers.toString());
        sprint("messageContent = ");
        sprint("{");
        sprint(this.messageContent);
        sprint("}");
        if (getContent() != null) {
            sprint(getContent().toString());
        }
        sprint("}");
        return this.stringRepresentation;
    }

    @Override // android.gov.nist.javax.sip.message.MessageObject, android.gov.nist.core.GenericObject
    public String encode() {
        StringBuilder sb = new StringBuilder();
        for (SIPHeader sIPHeader : this.headers) {
            if (!(sIPHeader instanceof ContentLength)) {
                sIPHeader.encode(sb);
            }
        }
        LinkedList<String> linkedList = this.unrecognizedHeaders;
        if (linkedList != null) {
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(Separators.NEWLINE);
            }
        }
        this.contentLengthHeader.encode(sb).append(Separators.NEWLINE);
        if (this.messageContentObject != null) {
            sb.append(getContent().toString());
        } else {
            String str = this.messageContent;
            if (str != null || this.messageContentBytes != null) {
                if (str == null) {
                    try {
                        str = new String(this.messageContentBytes, getCharset());
                    } catch (UnsupportedEncodingException e) {
                        InternalErrorHandler.handleException(e);
                        str = null;
                    }
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public byte[] encodeAsBytes(String str) {
        if ((this instanceof SIPRequest) && ((SIPRequest) this).isNullRequest()) {
            return "\r\n\r\n".getBytes();
        }
        try {
            ((ViaHeader) getHeader("Via")).setTransport(str);
        } catch (ParseException e) {
            InternalErrorHandler.handleException(e);
        }
        StringBuilder sb = new StringBuilder();
        synchronized (this.headers) {
            try {
                for (SIPHeader sIPHeader : this.headers) {
                    if (!(sIPHeader instanceof ContentLength)) {
                        sIPHeader.encode(sb);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.contentLengthHeader.encode(sb);
        sb.append(Separators.NEWLINE);
        byte[] rawContent = getRawContent();
        byte[] bytes = null;
        if (rawContent == null) {
            try {
                return sb.toString().getBytes(getCharset());
            } catch (UnsupportedEncodingException e2) {
                InternalErrorHandler.handleException(e2);
                return null;
            }
        }
        try {
            bytes = sb.toString().getBytes(getCharset());
        } catch (UnsupportedEncodingException e3) {
            InternalErrorHandler.handleException(e3);
        }
        byte[] bArr = new byte[bytes.length + rawContent.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        System.arraycopy(rawContent, 0, bArr, bytes.length, rawContent.length);
        return bArr;
    }

    public abstract StringBuilder encodeMessage(StringBuilder sb);

    public StringBuilder encodeSIPHeaders(StringBuilder sb) {
        for (SIPHeader sIPHeader : this.headers) {
            if (!(sIPHeader instanceof ContentLength)) {
                sIPHeader.encode(sb);
            }
        }
        StringBuilder sbEncode = this.contentLengthHeader.encode(sb);
        sbEncode.append(Separators.NEWLINE);
        return sbEncode;
    }

    @Override // android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        SIPMessage sIPMessage = (SIPMessage) obj;
        if (this.headerTable.size() != sIPMessage.headerTable.size()) {
            return false;
        }
        for (SIPHeader sIPHeader : this.headerTable.values()) {
            SIPHeader sIPHeader2 = sIPMessage.headerTable.get(SIPHeaderNamesCache.toLowerCase(sIPHeader.getName()));
            if (sIPHeader2 == null || !sIPHeader2.equals(sIPHeader)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public Object getApplicationData() {
        return this.applicationData;
    }

    public Authorization getAuthorization() {
        return (Authorization) getHeaderLowerCase(AUTHORIZATION_LOWERCASE);
    }

    public CSeqHeader getCSeq() {
        return this.cSeqHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public CSeqHeader getCSeqHeader() {
        return this.cSeqHeader;
    }

    public CallIdHeader getCallId() {
        return this.callIdHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public CallIdHeader getCallIdHeader() {
        return this.callIdHeader;
    }

    public final String getCharset() {
        ContentType contentTypeHeader = getContentTypeHeader();
        if (contentTypeHeader == null) {
            return this.contentEncodingCharset;
        }
        String charset = contentTypeHeader.getCharset();
        return charset != null ? charset : this.contentEncodingCharset;
    }

    public Contact getContactHeader() {
        ContactList contactHeaders = getContactHeaders();
        if (contactHeaders != null) {
            return (Contact) contactHeaders.getFirst();
        }
        return null;
    }

    public ContactList getContactHeaders() {
        return (ContactList) getSIPHeaderListLowerCase(CONTACT_LOWERCASE);
    }

    @Override // android.javax.sip.message.Message
    public Object getContent() {
        Object obj = this.messageContentObject;
        if (obj != null) {
            return obj;
        }
        String str = this.messageContent;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.messageContentBytes;
        if (bArr != null) {
            return bArr;
        }
        return null;
    }

    @Override // android.javax.sip.message.Message
    public ContentDispositionHeader getContentDisposition() {
        return (ContentDispositionHeader) getHeaderLowerCase(CONTENT_DISPOSITION_LOWERCASE);
    }

    @Override // android.javax.sip.message.Message
    public ContentEncodingHeader getContentEncoding() {
        return (ContentEncodingHeader) getHeaderLowerCase(CONTENT_ENCODING_LOWERCASE);
    }

    @Override // android.javax.sip.message.Message
    public ContentLanguageHeader getContentLanguage() {
        return (ContentLanguageHeader) getHeaderLowerCase(CONTENT_LANGUAGE_LOWERCASE);
    }

    @Override // android.javax.sip.message.Message
    public ContentLengthHeader getContentLength() {
        return this.contentLengthHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public ContentLengthHeader getContentLengthHeader() {
        return getContentLength();
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public ContentType getContentTypeHeader() {
        return (ContentType) getHeaderLowerCase(CONTENT_TYPE_LOWERCASE);
    }

    public final String getDialogId(boolean z, String str) {
        From from = (From) getFrom();
        StringBuffer stringBuffer = new StringBuffer(((CallID) getCallId()).getCallId());
        if (z) {
            if (str != null) {
                stringBuffer.append(Separators.COLON);
                stringBuffer.append(str);
            }
            if (from.getTag() != null) {
                stringBuffer.append(Separators.COLON);
                stringBuffer.append(from.getTag());
            }
        } else {
            if (from.getTag() != null) {
                stringBuffer.append(Separators.COLON);
                stringBuffer.append(from.getTag());
            }
            if (str != null) {
                stringBuffer.append(Separators.COLON);
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString().toLowerCase();
    }

    public ErrorInfoList getErrorInfoHeaders() {
        return (ErrorInfoList) getSIPHeaderListLowerCase(ERROR_LOWERCASE);
    }

    @Override // android.javax.sip.message.Message
    public ExpiresHeader getExpires() {
        return (ExpiresHeader) getHeaderLowerCase(EXPIRES_LOWERCASE);
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public abstract String getFirstLine();

    public String getForkId() {
        String str = this.forkId;
        if (str != null) {
            return str;
        }
        String callId = getCallId().getCallId();
        String fromTag = getFromTag();
        if (fromTag == null) {
            jf4.n("From tag is not yet set. Cannot compute forkId");
            return null;
        }
        String lowerCase = (callId + Separators.COLON + fromTag).toLowerCase();
        this.forkId = lowerCase;
        return lowerCase;
    }

    public FromHeader getFrom() {
        return this.fromHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public FromHeader getFromHeader() {
        return this.fromHeader;
    }

    public String getFromTag() {
        From from = this.fromHeader;
        if (from == null) {
            return null;
        }
        return from.getTag();
    }

    @Override // android.javax.sip.message.Message
    public Header getHeader(String str) {
        return getHeaderLowerCase(SIPHeaderNamesCache.toLowerCase(str));
    }

    public String getHeaderAsFormattedString(String str) {
        String lowerCase = SIPHeaderNamesCache.toLowerCase(str);
        return this.headerTable.containsKey(lowerCase) ? this.headerTable.get(lowerCase).toString() : getHeader(str).toString();
    }

    public Header getHeaderLowerCase(String str) {
        if (str != null) {
            SIPHeader sIPHeader = this.headerTable.get(str);
            return sIPHeader instanceof SIPHeaderList ? ((SIPHeaderList) sIPHeader).getFirst() : sIPHeader;
        }
        hny.u("bad name");
        return null;
    }

    @Override // android.javax.sip.message.Message
    public ListIterator<String> getHeaderNames() {
        Iterator<SIPHeader> it = this.headers.iterator();
        LinkedList linkedList = new LinkedList();
        while (it.hasNext()) {
            linkedList.add(it.next().getName());
        }
        return linkedList.listIterator();
    }

    @Override // android.javax.sip.message.Message
    public ListIterator<SIPHeader> getHeaders(String str) {
        if (str == null) {
            hny.u("null headerName");
            return null;
        }
        SIPHeader sIPHeader = this.headerTable.get(SIPHeaderNamesCache.toLowerCase(str));
        if (sIPHeader == null) {
            return new LinkedList().listIterator();
        }
        return sIPHeader instanceof SIPHeaderList ? ((SIPHeaderList) sIPHeader).listIterator() : new HeaderIterator(this, sIPHeader);
    }

    public InetAddress getLocalAddress() {
        return this.localAddress;
    }

    public int getLocalPort() {
        return this.localPort;
    }

    public MaxForwardsHeader getMaxForwards() {
        return this.maxForwardsHeader;
    }

    public LinkedList<String> getMessageAsEncodedStrings() {
        LinkedList<String> linkedList = new LinkedList<>();
        for (SIPHeader sIPHeader : this.headers) {
            if (sIPHeader instanceof SIPHeaderList) {
                linkedList.addAll(((SIPHeaderList) sIPHeader).getHeadersAsEncodedStrings());
            } else {
                linkedList.add(sIPHeader.encode());
            }
        }
        return linkedList;
    }

    public String getMessageContent() {
        String str = this.messageContent;
        if (str == null && this.messageContentBytes == null) {
            return null;
        }
        if (str != null) {
            return str;
        }
        String str2 = new String(this.messageContentBytes, getCharset());
        this.messageContent = str2;
        return str2;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public MultipartMimeContent getMultipartMimeContent() {
        if (this.contentLengthHeader.getContentLength() == 0) {
            return null;
        }
        MultipartMimeContentImpl multipartMimeContentImpl = new MultipartMimeContentImpl(getContentTypeHeader());
        try {
            multipartMimeContentImpl.createContentList(new String(getRawContent(), getCharset()));
            return multipartMimeContentImpl;
        } catch (UnsupportedEncodingException e) {
            InternalErrorHandler.handleException(e);
            return null;
        }
    }

    public InetAddress getPeerPacketSourceAddress() {
        return this.peerPacketSourceAddress;
    }

    public int getPeerPacketSourcePort() {
        return this.peerPacketSourcePort;
    }

    @Override // android.javax.sip.message.Message
    public byte[] getRawContent() {
        try {
            byte[] bArr = this.messageContentBytes;
            if (bArr != null) {
                return bArr;
            }
            Object obj = this.messageContentObject;
            if (obj != null) {
                byte[] bytes = obj.toString().getBytes(getCharset());
                this.messageContentBytes = bytes;
                return bytes;
            }
            String str = this.messageContent;
            if (str == null) {
                return bArr;
            }
            byte[] bytes2 = str.getBytes(getCharset());
            this.messageContentBytes = bytes2;
            return bytes2;
        } catch (UnsupportedEncodingException e) {
            InternalErrorHandler.handleException(e);
            return null;
        }
    }

    public RecordRouteList getRecordRouteHeaders() {
        return (RecordRouteList) getSIPHeaderListLowerCase(RECORDROUTE_LOWERCASE);
    }

    public InetAddress getRemoteAddress() {
        return this.remoteAddress;
    }

    public int getRemotePort() {
        return this.remotePort;
    }

    public RouteList getRouteHeaders() {
        return (RouteList) getSIPHeaderListLowerCase(ROUTE_LOWERCASE);
    }

    public SIPHeader getSIPHeaderListLowerCase(String str) {
        return this.headerTable.get(str);
    }

    @Override // android.javax.sip.message.Message
    public abstract String getSIPVersion();

    public int getSize() {
        return this.size;
    }

    public ToHeader getTo() {
        return this.toHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public ToHeader getToHeader() {
        return this.toHeader;
    }

    public String getToTag() {
        To to = this.toHeader;
        if (to == null) {
            return null;
        }
        return to.getTag();
    }

    public Via getTopmostVia() {
        if (getViaHeaders() == null) {
            return null;
        }
        return (Via) getViaHeaders().getFirst();
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public ViaHeader getTopmostViaHeader() {
        return getTopmostVia();
    }

    public String getTransactionId() {
        Via topmostVia = getTopmostVia();
        if (topmostVia != null && topmostVia.getBranch() != null && topmostVia.getBranch().toUpperCase().startsWith(SIPConstants.BRANCH_MAGIC_COOKIE_UPPER_CASE)) {
            if (!getCSeq().getMethod().equals(Request.CANCEL)) {
                return topmostVia.getBranch().toLowerCase();
            }
            return (topmostVia.getBranch() + Separators.COLON + getCSeq().getMethod()).toLowerCase();
        }
        StringBuilder sb = new StringBuilder();
        From from = (From) getFrom();
        if (from.hasTag()) {
            sb.append(from.getTag());
            sb.append("-");
        }
        sb.append(this.callIdHeader.getCallId());
        sb.append("-");
        sb.append(this.cSeqHeader.getSequenceNumber());
        sb.append("-");
        sb.append(this.cSeqHeader.getMethod());
        if (topmostVia != null) {
            sb.append("-");
            sb.append(topmostVia.getSentBy().encode());
            if (!topmostVia.getSentBy().hasPort()) {
                sb.append("-5060");
            }
        }
        if (getCSeq().getMethod().equals(Request.CANCEL)) {
            sb.append(Request.CANCEL);
        }
        return sb.toString().toLowerCase().replace(Separators.COLON, "-").replace(Separators.AT, "-") + Utils.getSignature();
    }

    @Override // android.javax.sip.message.Message
    public ListIterator<String> getUnrecognizedHeaders() {
        return getUnrecognizedHeadersList().listIterator();
    }

    public LinkedList<String> getUnrecognizedHeadersList() {
        LinkedList<String> linkedList = this.unrecognizedHeaders;
        if (linkedList != null) {
            return linkedList;
        }
        LinkedList<String> linkedList2 = new LinkedList<>();
        this.unrecognizedHeaders = linkedList2;
        return linkedList2;
    }

    public ViaList getViaHeaders() {
        return (ViaList) getSIPHeaderListLowerCase(VIA_LOWERCASE);
    }

    public boolean hasContent() {
        return (this.messageContent == null && this.messageContentBytes == null) ? false : true;
    }

    public boolean hasFromTag() {
        From from = this.fromHeader;
        return (from == null || from.getTag() == null) ? false : true;
    }

    public boolean hasHeader(String str) {
        return this.headerTable.containsKey(SIPHeaderNamesCache.toLowerCase(str));
    }

    public boolean hasToTag() {
        To to = this.toHeader;
        return (to == null || to.getTag() == null) ? false : true;
    }

    @Override // android.javax.sip.message.Message
    public int hashCode() {
        CallID callID = this.callIdHeader;
        if (callID != null) {
            return callID.getCallId().hashCode();
        }
        itt0.k("Invalid message! Cannot compute hashcode! call-id header is missing !");
        return 0;
    }

    public boolean isNullRequest() {
        return this.nullRequest;
    }

    @Override // android.gov.nist.core.GenericObject
    public boolean match(Object obj) {
        if (obj == null) {
            return true;
        }
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        Iterator<SIPHeader> headers = ((SIPMessage) obj).getHeaders();
        while (headers.hasNext()) {
            SIPHeader next = headers.next();
            List<SIPHeader> headerList = getHeaderList(next.getHeaderName());
            if (headerList != null && headerList.size() != 0) {
                if (next instanceof SIPHeaderList) {
                    ListIterator listIterator = ((SIPHeaderList) next).listIterator();
                    while (listIterator.hasNext()) {
                        SIPHeader sIPHeader = (SIPHeader) listIterator.next();
                        if (!(sIPHeader instanceof ContentLength)) {
                            ListIterator<SIPHeader> listIterator2 = headerList.listIterator();
                            while (listIterator2.hasNext()) {
                                if (listIterator2.next().match(sIPHeader)) {
                                }
                            }
                            return false;
                        }
                    }
                } else {
                    ListIterator<SIPHeader> listIterator3 = headerList.listIterator();
                    while (listIterator3.hasNext()) {
                        if (listIterator3.next().match(next)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.gov.nist.core.GenericObject
    public void merge(Object obj) {
        if (!obj.getClass().equals(getClass())) {
            ohq.k(obj.getClass(), "Bad class ");
            return;
        }
        for (Object obj2 : ((SIPMessage) obj).headers.toArray()) {
            SIPHeader sIPHeader = (SIPHeader) obj2;
            List<SIPHeader> headerList = getHeaderList(sIPHeader.getHeaderName());
            if (headerList == null) {
                attachHeader(sIPHeader);
            } else {
                ListIterator<SIPHeader> listIterator = headerList.listIterator();
                while (listIterator.hasNext()) {
                    listIterator.next().merge(sIPHeader);
                }
            }
        }
    }

    @Override // android.javax.sip.message.Message
    public void removeContent() {
        this.messageContent = null;
        this.messageContentBytes = null;
        this.messageContentObject = null;
        try {
            this.contentLengthHeader.setContentLength(0);
        } catch (InvalidArgumentException unused) {
        }
    }

    @Override // android.javax.sip.message.Message
    public void removeFirst(String str) {
        if (str != null) {
            removeHeader(str, true);
        } else {
            hny.u("Null argument Provided!");
        }
    }

    public void removeHeader(String str, boolean z) {
        String lowerCase = SIPHeaderNamesCache.toLowerCase(str);
        SIPHeader sIPHeader = this.headerTable.get(lowerCase);
        if (sIPHeader == null) {
            return;
        }
        if (sIPHeader instanceof SIPHeaderList) {
            SIPHeaderList sIPHeaderList = (SIPHeaderList) sIPHeader;
            if (z) {
                sIPHeaderList.removeFirst();
            } else {
                sIPHeaderList.removeLast();
            }
            if (sIPHeaderList.isEmpty()) {
                Iterator<SIPHeader> it = this.headers.iterator();
                while (it.hasNext()) {
                    if (it.next().getName().equalsIgnoreCase(lowerCase)) {
                        it.remove();
                    }
                }
                this.headerTable.remove(lowerCase);
                return;
            }
            return;
        }
        this.headerTable.remove(lowerCase);
        if (sIPHeader instanceof From) {
            this.fromHeader = null;
        } else if (sIPHeader instanceof To) {
            this.toHeader = null;
        } else if (sIPHeader instanceof CSeq) {
            this.cSeqHeader = null;
        } else if (sIPHeader instanceof CallID) {
            this.callIdHeader = null;
        } else if (sIPHeader instanceof MaxForwards) {
            this.maxForwardsHeader = null;
        } else if (sIPHeader instanceof ContentLength) {
            this.contentLengthHeader = null;
        }
        Iterator<SIPHeader> it2 = this.headers.iterator();
        while (it2.hasNext()) {
            if (it2.next().getName().equalsIgnoreCase(str)) {
                it2.remove();
            }
        }
    }

    @Override // android.javax.sip.message.Message
    public void removeLast(String str) {
        if (str != null) {
            removeHeader(str, false);
        } else {
            hny.u("Null argument Provided!");
        }
    }

    @Override // android.gov.nist.javax.sip.message.MessageExt
    public void setApplicationData(Object obj) {
        this.applicationData = obj;
    }

    public void setCSeq(CSeqHeader cSeqHeader) {
        setHeader(cSeqHeader);
    }

    public void setCallId(String str) {
        if (this.callIdHeader == null) {
            setHeader(new CallID());
        }
        this.callIdHeader.setCallId(str);
    }

    @Override // android.javax.sip.message.Message
    public void setContent(Object obj, ContentTypeHeader contentTypeHeader) {
        if (obj == null) {
            hny.u("null content");
            return;
        }
        setHeader(contentTypeHeader);
        this.messageContent = null;
        this.messageContentBytes = null;
        this.messageContentObject = null;
        if (obj instanceof String) {
            this.messageContent = (String) obj;
        } else if (obj instanceof byte[]) {
            this.messageContentBytes = (byte[]) obj;
        } else {
            this.messageContentObject = obj;
        }
        computeContentLength(obj);
    }

    @Override // android.javax.sip.message.Message
    public void setContentDisposition(ContentDispositionHeader contentDispositionHeader) {
        setHeader(contentDispositionHeader);
    }

    @Override // android.javax.sip.message.Message
    public void setContentEncoding(ContentEncodingHeader contentEncodingHeader) {
        setHeader(contentEncodingHeader);
    }

    @Override // android.javax.sip.message.Message
    public void setContentLanguage(ContentLanguageHeader contentLanguageHeader) {
        setHeader(contentLanguageHeader);
    }

    @Override // android.javax.sip.message.Message
    public void setContentLength(ContentLengthHeader contentLengthHeader) {
        try {
            this.contentLengthHeader.setContentLength(contentLengthHeader.getContentLength());
        } catch (InvalidArgumentException unused) {
        }
    }

    @Override // android.javax.sip.message.Message
    public void setExpires(ExpiresHeader expiresHeader) {
        setHeader(expiresHeader);
    }

    public void setFrom(FromHeader fromHeader) {
        setHeader(fromHeader);
    }

    public void setFromTag(String str) {
        try {
            this.fromHeader.setTag(str);
        } catch (ParseException unused) {
        }
    }

    @Override // android.javax.sip.message.Message
    public void setHeader(Header header) {
        SIPHeader sIPHeader = (SIPHeader) header;
        if (sIPHeader == null) {
            jf4.o("null header!");
            return;
        }
        try {
            if ((sIPHeader instanceof SIPHeaderList) && ((SIPHeaderList) sIPHeader).isEmpty()) {
                return;
            }
            removeHeader(sIPHeader.getHeaderName());
            attachHeader(sIPHeader, true, false);
        } catch (SIPDuplicateHeaderException e) {
            InternalErrorHandler.handleException(e);
        }
    }

    public void setHeaders(List<SIPHeader> list) {
        ListIterator<SIPHeader> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            try {
                attachHeader(listIterator.next(), false);
            } catch (SIPDuplicateHeaderException unused) {
            }
        }
    }

    public void setLocalAddress(InetAddress inetAddress) {
        this.localAddress = inetAddress;
    }

    public void setLocalPort(int i) {
        this.localPort = i;
    }

    public void setMaxForwards(MaxForwardsHeader maxForwardsHeader) {
        setHeader(maxForwardsHeader);
    }

    public void setMessageContent(byte[] bArr, boolean z, boolean z2, int i) throws ParseException {
        computeContentLength(bArr);
        if (z2 || ((z || this.contentLengthHeader.getContentLength() == i) && this.contentLengthHeader.getContentLength() >= i)) {
            this.messageContent = null;
            this.messageContentBytes = bArr;
            this.messageContentObject = null;
        } else {
            throw new ParseException("Invalid content length " + this.contentLengthHeader.getContentLength() + " / " + i, 0);
        }
    }

    public void setNullRequest() {
        this.nullRequest = true;
    }

    public void setPeerPacketSourceAddress(InetAddress inetAddress) {
        this.peerPacketSourceAddress = inetAddress;
    }

    public void setPeerPacketSourcePort(int i) {
        this.peerPacketSourcePort = i;
    }

    public void setRemoteAddress(InetAddress inetAddress) {
        this.remoteAddress = inetAddress;
    }

    public void setRemotePort(int i) {
        this.remotePort = i;
    }

    @Override // android.javax.sip.message.Message
    public abstract void setSIPVersion(String str);

    public void setSize(int i) {
        this.size = i;
    }

    public void setTo(ToHeader toHeader) {
        setHeader(toHeader);
    }

    public void setToTag(String str) {
        try {
            this.toHeader.setTag(str);
        } catch (ParseException unused) {
        }
    }

    public void setUnrecognizedHeadersList(LinkedList<String> linkedList) {
        this.unrecognizedHeaders = linkedList;
    }

    public void setVia(List list) {
        ViaList viaList = new ViaList();
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            viaList.add((Via) listIterator.next());
        }
        setHeader((SIPHeaderList<Via>) viaList);
    }

    @Override // android.javax.sip.message.Message
    public abstract String toString();

    public void setCallId(CallIdHeader callIdHeader) {
        setHeader(callIdHeader);
    }

    public void addHeader(String str) {
        try {
            attachHeader(ParserFactory.createParser(str + Separators.RETURN).parse(), false);
        } catch (ParseException unused) {
            getUnrecognizedHeadersList().add(str);
        }
    }

    public void setHeader(SIPHeaderList<Via> sIPHeaderList) {
        setHeader((Header) sIPHeaderList);
    }

    public Iterator<SIPHeader> getHeaders() {
        return this.headers.iterator();
    }

    public void setMessageContent(String str, String str2, byte[] bArr) {
        setHeader(new ContentType(str, str2));
        setMessageContent(bArr);
        computeContentLength(bArr);
    }

    public void setMessageContent(String str, String str2, String str3) {
        if (str3 != null) {
            setHeader(new ContentType(str, str2));
            this.messageContent = str3;
            this.messageContentBytes = null;
            this.messageContentObject = null;
            computeContentLength(str3);
            return;
        }
        jf4.o("messgeContent is null");
    }

    public void setMessageContent(byte[] bArr) {
        computeContentLength(bArr);
        this.messageContentBytes = bArr;
        this.messageContent = null;
        this.messageContentObject = null;
    }

    public void setMessageContent(byte[] bArr, boolean z, int i) throws ParseException {
        computeContentLength(bArr);
        if (!z && this.contentLengthHeader.getContentLength() < i) {
            throw new ParseException("Invalid content length " + this.contentLengthHeader.getContentLength() + " / " + i, 0);
        }
        this.messageContentBytes = bArr;
        this.messageContent = null;
        this.messageContentObject = null;
    }

    public final String getDialogId(boolean z) {
        return getDialogId(z, ((To) getTo()).getTag());
    }

    @Override // android.javax.sip.message.Message
    public void removeHeader(String str) {
        if (str != null) {
            String lowerCase = SIPHeaderNamesCache.toLowerCase(str);
            SIPHeader sIPHeaderRemove = this.headerTable.remove(lowerCase);
            if (sIPHeaderRemove == null) {
                return;
            }
            if (sIPHeaderRemove instanceof From) {
                this.fromHeader = null;
            } else if (sIPHeaderRemove instanceof To) {
                this.toHeader = null;
            } else if (sIPHeaderRemove instanceof CSeq) {
                this.cSeqHeader = null;
            } else if (sIPHeaderRemove instanceof CallID) {
                this.callIdHeader = null;
            } else if (sIPHeaderRemove instanceof MaxForwards) {
                this.maxForwardsHeader = null;
            } else if (sIPHeaderRemove instanceof ContentLength) {
                this.contentLengthHeader = null;
            }
            Iterator<SIPHeader> it = this.headers.iterator();
            while (it.hasNext()) {
                if (it.next().getName().equalsIgnoreCase(lowerCase)) {
                    it.remove();
                }
            }
            return;
        }
        hny.u("null arg");
    }

    public void attachHeader(SIPHeader sIPHeader, boolean z) {
        attachHeader(sIPHeader, z, false);
    }

    private void attachHeader(SIPHeader sIPHeader) {
        if (sIPHeader != null) {
            try {
                if ((sIPHeader instanceof SIPHeaderList) && ((SIPHeaderList) sIPHeader).isEmpty()) {
                    return;
                }
                attachHeader(sIPHeader, false, false);
                return;
            } catch (SIPDuplicateHeaderException unused) {
                return;
            }
        }
        jf4.o("null header!");
    }
}
