package android.gov.nist.javax.sip.message;

import a.f140;
import a.hny;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.ContentType;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.MaxForwards;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.StatusLine;
import android.gov.nist.javax.sip.header.To;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.parser.ParseExceptionListener;
import android.gov.nist.javax.sip.parser.StringMsgParser;
import android.javax.sip.address.URI;
import android.javax.sip.header.CSeqHeader;
import android.javax.sip.header.CallIdHeader;
import android.javax.sip.header.ContentTypeHeader;
import android.javax.sip.header.FromHeader;
import android.javax.sip.header.MaxForwardsHeader;
import android.javax.sip.header.ServerHeader;
import android.javax.sip.header.ToHeader;
import android.javax.sip.header.UserAgentHeader;
import android.javax.sip.message.MessageFactory;
import android.javax.sip.message.Request;
import android.javax.sip.message.Response;
import java.text.ParseException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MessageFactoryImpl implements MessageFactory, MessageFactoryExt {
    private static String defaultContentEncodingCharset = "UTF-8";
    private static ServerHeader server;
    private static UserAgentHeader userAgent;
    private boolean testing = false;
    private boolean strict = true;

    public static String getDefaultContentEncodingCharset() {
        return defaultContentEncodingCharset;
    }

    public static ServerHeader getDefaultServerHeader() {
        return server;
    }

    public static UserAgentHeader getDefaultUserAgentHeader() {
        return userAgent;
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public MultipartMimeContent createMultipartMimeContent(ContentTypeHeader contentTypeHeader, String[] strArr, String[] strArr2, String[] strArr3) {
        contentTypeHeader.getParameter(MultipartMimeContentImpl.BOUNDARY);
        MultipartMimeContentImpl multipartMimeContentImpl = new MultipartMimeContentImpl(contentTypeHeader);
        for (int i = 0; i < strArr.length; i++) {
            ContentType contentType = new ContentType(strArr[i], strArr2[i]);
            ContentImpl contentImpl = new ContentImpl(strArr3[i]);
            contentImpl.setContentTypeHeader(contentType);
            multipartMimeContentImpl.add(contentImpl);
        }
        return multipartMimeContentImpl;
    }

    public Request createRequest(URI uri, String str, CallIdHeader callIdHeader, CSeqHeader cSeqHeader, FromHeader fromHeader, ToHeader toHeader, List list, MaxForwardsHeader maxForwardsHeader, byte[] bArr, ContentTypeHeader contentTypeHeader) throws ParseException {
        if (uri == null || str == null || callIdHeader == null || cSeqHeader == null || fromHeader == null || toHeader == null || list == null || maxForwardsHeader == null || bArr == null || contentTypeHeader == null) {
            hny.j(0, "JAIN-SIP Exception, some parameters are missing, unable to create the request");
            return null;
        }
        SIPRequest sIPRequest = new SIPRequest();
        sIPRequest.setRequestURI(uri);
        sIPRequest.setMethod(str);
        sIPRequest.setCallId(callIdHeader);
        sIPRequest.setCSeq(cSeqHeader);
        sIPRequest.setFrom(fromHeader);
        sIPRequest.setTo(toHeader);
        sIPRequest.setVia(list);
        sIPRequest.setMaxForwards(maxForwardsHeader);
        sIPRequest.setHeader((ContentType) contentTypeHeader);
        sIPRequest.setMessageContent(bArr);
        UserAgentHeader userAgentHeader = userAgent;
        if (userAgentHeader != null) {
            sIPRequest.setHeader(userAgentHeader);
        }
        return sIPRequest;
    }

    @Override // android.javax.sip.message.MessageFactory
    public Response createResponse(int i, CallIdHeader callIdHeader, CSeqHeader cSeqHeader, FromHeader fromHeader, ToHeader toHeader, List list, MaxForwardsHeader maxForwardsHeader, ContentTypeHeader contentTypeHeader, Object obj) throws ParseException {
        if (callIdHeader == null || cSeqHeader == null || fromHeader == null || toHeader == null || list == null || maxForwardsHeader == null || obj == null || contentTypeHeader == null) {
            hny.u("missing parameters");
            return null;
        }
        SIPResponse sIPResponse = new SIPResponse();
        StatusLine statusLine = new StatusLine();
        statusLine.setStatusCode(i);
        String reasonPhrase = SIPResponse.getReasonPhrase(i);
        if (reasonPhrase == null) {
            hny.j(0, f140.i(i, " Unknown"));
            return null;
        }
        statusLine.setReasonPhrase(reasonPhrase);
        sIPResponse.setStatusLine(statusLine);
        sIPResponse.setCallId(callIdHeader);
        sIPResponse.setCSeq(cSeqHeader);
        sIPResponse.setFrom(fromHeader);
        sIPResponse.setTo(toHeader);
        sIPResponse.setVia(list);
        sIPResponse.setContent(obj, contentTypeHeader);
        UserAgentHeader userAgentHeader = userAgent;
        if (userAgentHeader != null) {
            sIPResponse.setHeader(userAgentHeader);
        }
        return sIPResponse;
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public void setDefaultContentEncodingCharset(String str) {
        if (str != null) {
            defaultContentEncodingCharset = str;
        } else {
            hny.u("Null argument!");
        }
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public void setDefaultServerHeader(ServerHeader serverHeader) {
        server = serverHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MessageFactoryExt
    public void setDefaultUserAgentHeader(UserAgentHeader userAgentHeader) {
        userAgent = userAgentHeader;
    }

    public void setStrict(boolean z) {
        this.strict = z;
    }

    public void setTest(boolean z) {
        this.testing = z;
    }

    @Override // android.javax.sip.message.MessageFactory
    public Request createRequest(URI uri, String str, CallIdHeader callIdHeader, CSeqHeader cSeqHeader, FromHeader fromHeader, ToHeader toHeader, List list, MaxForwardsHeader maxForwardsHeader, ContentTypeHeader contentTypeHeader, Object obj) {
        if (uri != null && str != null && callIdHeader != null && cSeqHeader != null && fromHeader != null && toHeader != null && list != null && maxForwardsHeader != null && obj != null && contentTypeHeader != null) {
            SIPRequest sIPRequest = new SIPRequest();
            sIPRequest.setRequestURI(uri);
            sIPRequest.setMethod(str);
            sIPRequest.setCallId(callIdHeader);
            sIPRequest.setCSeq(cSeqHeader);
            sIPRequest.setFrom(fromHeader);
            sIPRequest.setTo(toHeader);
            sIPRequest.setVia(list);
            sIPRequest.setMaxForwards(maxForwardsHeader);
            sIPRequest.setContent(obj, contentTypeHeader);
            UserAgentHeader userAgentHeader = userAgent;
            if (userAgentHeader != null) {
                sIPRequest.setHeader(userAgentHeader);
            }
            return sIPRequest;
        }
        hny.u("Null parameters");
        return null;
    }

    public Response createResponse(int i, CallIdHeader callIdHeader, CSeqHeader cSeqHeader, FromHeader fromHeader, ToHeader toHeader, List list, MaxForwardsHeader maxForwardsHeader, byte[] bArr, ContentTypeHeader contentTypeHeader) {
        if (callIdHeader != null && cSeqHeader != null && fromHeader != null && toHeader != null && list != null && maxForwardsHeader != null && bArr != null && contentTypeHeader != null) {
            SIPResponse sIPResponse = new SIPResponse();
            sIPResponse.setStatusCode(i);
            sIPResponse.setCallId(callIdHeader);
            sIPResponse.setCSeq(cSeqHeader);
            sIPResponse.setFrom(fromHeader);
            sIPResponse.setTo(toHeader);
            sIPResponse.setVia(list);
            sIPResponse.setMaxForwards(maxForwardsHeader);
            sIPResponse.setHeader((ContentType) contentTypeHeader);
            sIPResponse.setMessageContent(bArr);
            UserAgentHeader userAgentHeader = userAgent;
            if (userAgentHeader != null) {
                sIPResponse.setHeader(userAgentHeader);
            }
            return sIPResponse;
        }
        hny.u("Null params ");
        return null;
    }

    @Override // android.javax.sip.message.MessageFactory
    public Request createRequest(URI uri, String str, CallIdHeader callIdHeader, CSeqHeader cSeqHeader, FromHeader fromHeader, ToHeader toHeader, List list, MaxForwardsHeader maxForwardsHeader) throws ParseException {
        if (uri != null && str != null && callIdHeader != null && cSeqHeader != null && fromHeader != null && toHeader != null && list != null && maxForwardsHeader != null) {
            SIPRequest sIPRequest = new SIPRequest();
            sIPRequest.setRequestURI(uri);
            sIPRequest.setMethod(str);
            sIPRequest.setCallId(callIdHeader);
            sIPRequest.setCSeq(cSeqHeader);
            sIPRequest.setFrom(fromHeader);
            sIPRequest.setTo(toHeader);
            sIPRequest.setVia(list);
            sIPRequest.setMaxForwards(maxForwardsHeader);
            UserAgentHeader userAgentHeader = userAgent;
            if (userAgentHeader != null) {
                sIPRequest.setHeader(userAgentHeader);
            }
            return sIPRequest;
        }
        hny.j(0, "JAIN-SIP Exception, some parameters are missing, unable to create the request");
        return null;
    }

    @Override // android.javax.sip.message.MessageFactory
    public Request createRequest(URI uri, String str, CallIdHeader callIdHeader, CSeqHeader cSeqHeader, FromHeader fromHeader, ToHeader toHeader, List list, MaxForwardsHeader maxForwardsHeader, ContentTypeHeader contentTypeHeader, byte[] bArr) {
        if (uri != null && str != null && callIdHeader != null && cSeqHeader != null && fromHeader != null && toHeader != null && list != null && maxForwardsHeader != null && bArr != null && contentTypeHeader != null) {
            SIPRequest sIPRequest = new SIPRequest();
            sIPRequest.setRequestURI(uri);
            sIPRequest.setMethod(str);
            sIPRequest.setCallId(callIdHeader);
            sIPRequest.setCSeq(cSeqHeader);
            sIPRequest.setFrom(fromHeader);
            sIPRequest.setTo(toHeader);
            sIPRequest.setVia(list);
            sIPRequest.setMaxForwards(maxForwardsHeader);
            sIPRequest.setContent(bArr, contentTypeHeader);
            UserAgentHeader userAgentHeader = userAgent;
            if (userAgentHeader != null) {
                sIPRequest.setHeader(userAgentHeader);
            }
            return sIPRequest;
        }
        hny.u("missing parameters");
        return null;
    }

    @Override // android.javax.sip.message.MessageFactory
    public Response createResponse(int i, CallIdHeader callIdHeader, CSeqHeader cSeqHeader, FromHeader fromHeader, ToHeader toHeader, List list, MaxForwardsHeader maxForwardsHeader) throws ParseException {
        if (callIdHeader != null && cSeqHeader != null && fromHeader != null && toHeader != null && list != null && maxForwardsHeader != null) {
            SIPResponse sIPResponse = new SIPResponse();
            sIPResponse.setStatusCode(i);
            sIPResponse.setCallId(callIdHeader);
            sIPResponse.setCSeq(cSeqHeader);
            sIPResponse.setFrom(fromHeader);
            sIPResponse.setTo(toHeader);
            sIPResponse.setVia(list);
            sIPResponse.setMaxForwards(maxForwardsHeader);
            UserAgentHeader userAgentHeader = userAgent;
            if (userAgentHeader != null) {
                sIPResponse.setHeader(userAgentHeader);
            }
            return sIPResponse;
        }
        hny.j(0, "JAIN-SIP Exception, some parameters are missing, unable to create the response");
        return null;
    }

    @Override // android.javax.sip.message.MessageFactory
    public Response createResponse(int i, Request request, ContentTypeHeader contentTypeHeader, Object obj) {
        if (request != null && obj != null && contentTypeHeader != null) {
            SIPResponse sIPResponseCreateResponse = ((SIPRequest) request).createResponse(i);
            sIPResponseCreateResponse.setContent(obj, contentTypeHeader);
            ServerHeader serverHeader = server;
            if (serverHeader != null) {
                sIPResponseCreateResponse.setHeader(serverHeader);
            }
            return sIPResponseCreateResponse;
        }
        hny.u("null parameters");
        return null;
    }

    @Override // android.javax.sip.message.MessageFactory
    public Request createRequest(String str) throws ParseException {
        if (str != null && !str.equals("")) {
            StringMsgParser stringMsgParser = new StringMsgParser();
            ParseExceptionListener parseExceptionListener = new ParseExceptionListener() { // from class: android.gov.nist.javax.sip.message.MessageFactoryImpl.1
                @Override // android.gov.nist.javax.sip.parser.ParseExceptionListener
                public void handleException(ParseException parseException, SIPMessage sIPMessage, Class cls, String str2, String str3) throws ParseException {
                    if (MessageFactoryImpl.this.testing) {
                        if (cls == From.class || cls == To.class || cls == CallID.class || cls == MaxForwards.class || cls == Via.class || cls == RequestLine.class || cls == StatusLine.class || cls == CSeq.class) {
                            throw parseException;
                        }
                        sIPMessage.addUnparsed(str2);
                    }
                }
            };
            if (!this.testing) {
                parseExceptionListener = null;
            }
            SIPMessage sIPMessage = stringMsgParser.parseSIPMessage(str.getBytes(), true, this.strict, parseExceptionListener);
            if (sIPMessage instanceof SIPRequest) {
                return (SIPRequest) sIPMessage;
            }
            hny.j(0, str);
            return null;
        }
        SIPRequest sIPRequest = new SIPRequest();
        sIPRequest.setNullRequest();
        return sIPRequest;
    }

    @Override // android.javax.sip.message.MessageFactory
    public Response createResponse(int i, Request request, ContentTypeHeader contentTypeHeader, byte[] bArr) {
        if (request != null && bArr != null && contentTypeHeader != null) {
            SIPResponse sIPResponseCreateResponse = ((SIPRequest) request).createResponse(i);
            sIPResponseCreateResponse.setHeader((ContentType) contentTypeHeader);
            sIPResponseCreateResponse.setMessageContent(bArr);
            ServerHeader serverHeader = server;
            if (serverHeader != null) {
                sIPResponseCreateResponse.setHeader(serverHeader);
            }
            return sIPResponseCreateResponse;
        }
        hny.u("null Parameters");
        return null;
    }

    @Override // android.javax.sip.message.MessageFactory
    public Response createResponse(int i, Request request) {
        if (request != null) {
            SIPResponse sIPResponseCreateResponse = ((SIPRequest) request).createResponse(i);
            sIPResponseCreateResponse.removeContent();
            sIPResponseCreateResponse.removeHeader("Content-Type");
            ServerHeader serverHeader = server;
            if (serverHeader != null) {
                sIPResponseCreateResponse.setHeader(serverHeader);
            }
            return sIPResponseCreateResponse;
        }
        hny.u("null parameters");
        return null;
    }

    public Response createResponse(int i, CallIdHeader callIdHeader, CSeqHeader cSeqHeader, FromHeader fromHeader, ToHeader toHeader, List list, MaxForwardsHeader maxForwardsHeader, Object obj, ContentTypeHeader contentTypeHeader) {
        if (callIdHeader != null && cSeqHeader != null && fromHeader != null && toHeader != null && list != null && maxForwardsHeader != null && obj != null && contentTypeHeader != null) {
            SIPResponse sIPResponse = new SIPResponse();
            StatusLine statusLine = new StatusLine();
            statusLine.setStatusCode(i);
            statusLine.setReasonPhrase(SIPResponse.getReasonPhrase(i));
            sIPResponse.setStatusLine(statusLine);
            sIPResponse.setCallId(callIdHeader);
            sIPResponse.setCSeq(cSeqHeader);
            sIPResponse.setFrom(fromHeader);
            sIPResponse.setTo(toHeader);
            sIPResponse.setVia(list);
            sIPResponse.setMaxForwards(maxForwardsHeader);
            sIPResponse.setContent(obj, contentTypeHeader);
            UserAgentHeader userAgentHeader = userAgent;
            if (userAgentHeader != null) {
                sIPResponse.setHeader(userAgentHeader);
            }
            return sIPResponse;
        }
        hny.u(" unable to create the response");
        return null;
    }

    @Override // android.javax.sip.message.MessageFactory
    public Response createResponse(int i, CallIdHeader callIdHeader, CSeqHeader cSeqHeader, FromHeader fromHeader, ToHeader toHeader, List list, MaxForwardsHeader maxForwardsHeader, ContentTypeHeader contentTypeHeader, byte[] bArr) throws ParseException {
        if (callIdHeader != null && cSeqHeader != null && fromHeader != null && toHeader != null && list != null && maxForwardsHeader != null && bArr != null && contentTypeHeader != null) {
            SIPResponse sIPResponse = new SIPResponse();
            StatusLine statusLine = new StatusLine();
            statusLine.setStatusCode(i);
            String reasonPhrase = SIPResponse.getReasonPhrase(i);
            if (reasonPhrase != null) {
                statusLine.setReasonPhrase(reasonPhrase);
                sIPResponse.setStatusLine(statusLine);
                sIPResponse.setCallId(callIdHeader);
                sIPResponse.setCSeq(cSeqHeader);
                sIPResponse.setFrom(fromHeader);
                sIPResponse.setTo(toHeader);
                sIPResponse.setVia(list);
                sIPResponse.setContent(bArr, contentTypeHeader);
                UserAgentHeader userAgentHeader = userAgent;
                if (userAgentHeader != null) {
                    sIPResponse.setHeader(userAgentHeader);
                }
                return sIPResponse;
            }
            hny.j(0, f140.i(i, " : Unknown"));
            return null;
        }
        hny.u("missing parameters");
        return null;
    }

    @Override // android.javax.sip.message.MessageFactory
    public Response createResponse(String str) throws ParseException {
        if (str == null) {
            return new SIPResponse();
        }
        SIPMessage sIPMessage = new StringMsgParser().parseSIPMessage(str.getBytes(), true, false, null);
        if (sIPMessage instanceof SIPResponse) {
            return (SIPResponse) sIPMessage;
        }
        hny.j(0, str);
        return null;
    }
}
