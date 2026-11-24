package android.gov.nist.javax.sip.message;

import a.hny;
import a.jf4;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.javax.sip.header.StatusLine;
import android.javax.sip.message.Response;
import com.appsflyer.sdk_base.referrer.Payload;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class SIPResponse extends SIPMessage implements Response, ResponseExt {
    private boolean isRetransmission = true;
    protected StatusLine statusLine;

    public static String getReasonPhrase(int i) {
        if (i == 420) {
            return "Bad extension";
        }
        if (i == 421) {
            return "Etension Required";
        }
        if (i == 603) {
            return "Decline";
        }
        if (i == 604) {
            return "Does not exist anywhere";
        }
        switch (i) {
            case Response.TRYING /* 100 */:
                return "Trying";
            case Response.OK /* 200 */:
                return Payload.RESPONSE_OK;
            case Response.ACCEPTED /* 202 */:
                return "Accepted";
            case 305:
                return "Use proxy";
            case Response.ALTERNATIVE_SERVICE /* 380 */:
                return "Alternative service";
            case Response.GONE /* 410 */:
                return "Gone";
            case Response.INTERVAL_TOO_BRIEF /* 423 */:
                return "Interval too brief";
            case Response.REQUEST_PENDING /* 491 */:
                return "Request Pending";
            case Response.UNDECIPHERABLE /* 493 */:
                return "Undecipherable";
            case Response.MESSAGE_TOO_LARGE /* 513 */:
                return "Message Too Large";
            case Response.BUSY_EVERYWHERE /* 600 */:
                return "Busy everywhere";
            case Response.SESSION_NOT_ACCEPTABLE /* 606 */:
                return "Session Not acceptable";
            default:
                switch (i) {
                    case 180:
                        return "Ringing";
                    case Response.CALL_IS_BEING_FORWARDED /* 181 */:
                        return "Call is being forwarded";
                    case Response.QUEUED /* 182 */:
                        return "Queued";
                    case Response.SESSION_PROGRESS /* 183 */:
                        return "Session progress";
                    default:
                        switch (i) {
                            case 300:
                                return "Multiple choices";
                            case 301:
                                return "Moved permanently";
                            case 302:
                                return "Moved Temporarily";
                            default:
                                switch (i) {
                                    case Response.BAD_REQUEST /* 400 */:
                                        return "Bad request";
                                    case Response.UNAUTHORIZED /* 401 */:
                                        return "Unauthorized";
                                    case Response.PAYMENT_REQUIRED /* 402 */:
                                        return "Payment required";
                                    case Response.FORBIDDEN /* 403 */:
                                        return "Forbidden";
                                    case Response.NOT_FOUND /* 404 */:
                                        return "Not found";
                                    case Response.METHOD_NOT_ALLOWED /* 405 */:
                                        return "Method not allowed";
                                    case Response.NOT_ACCEPTABLE /* 406 */:
                                        return "Not acceptable";
                                    case Response.PROXY_AUTHENTICATION_REQUIRED /* 407 */:
                                        return "Proxy Authentication required";
                                    case Response.REQUEST_TIMEOUT /* 408 */:
                                        return "Request timeout";
                                    default:
                                        switch (i) {
                                            case Response.CONDITIONAL_REQUEST_FAILED /* 412 */:
                                                return "Conditional request failed";
                                            case Response.REQUEST_ENTITY_TOO_LARGE /* 413 */:
                                                return "Request entity too large";
                                            case Response.REQUEST_URI_TOO_LONG /* 414 */:
                                                return "Request-URI too large";
                                            case Response.UNSUPPORTED_MEDIA_TYPE /* 415 */:
                                                return "Unsupported media type";
                                            case Response.UNSUPPORTED_URI_SCHEME /* 416 */:
                                                return "Unsupported URI Scheme";
                                            default:
                                                switch (i) {
                                                    case Response.TEMPORARILY_UNAVAILABLE /* 480 */:
                                                        return "Temporarily Unavailable";
                                                    case Response.CALL_OR_TRANSACTION_DOES_NOT_EXIST /* 481 */:
                                                        return "Call leg/Transaction does not exist";
                                                    case Response.LOOP_DETECTED /* 482 */:
                                                        return "Loop detected";
                                                    case Response.TOO_MANY_HOPS /* 483 */:
                                                        return "Too many hops";
                                                    case Response.ADDRESS_INCOMPLETE /* 484 */:
                                                        return "Address incomplete";
                                                    case Response.AMBIGUOUS /* 485 */:
                                                        return "Ambiguous";
                                                    case Response.BUSY_HERE /* 486 */:
                                                        return "Busy here";
                                                    case Response.REQUEST_TERMINATED /* 487 */:
                                                        return "Request Terminated";
                                                    case Response.NOT_ACCEPTABLE_HERE /* 488 */:
                                                        return "Not Acceptable here";
                                                    case Response.BAD_EVENT /* 489 */:
                                                        return "Bad Event";
                                                    default:
                                                        switch (i) {
                                                            case 500:
                                                                return "Server Internal Error";
                                                            case Response.NOT_IMPLEMENTED /* 501 */:
                                                                return "Not implemented";
                                                            case Response.BAD_GATEWAY /* 502 */:
                                                                return "Bad gateway";
                                                            case Response.SERVICE_UNAVAILABLE /* 503 */:
                                                                return "Service unavailable";
                                                            case Response.SERVER_TIMEOUT /* 504 */:
                                                                return "Gateway timeout";
                                                            case Response.VERSION_NOT_SUPPORTED /* 505 */:
                                                                return "SIP version not supported";
                                                            default:
                                                                return "Unknown Status";
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static boolean isFinalResponse(int i) {
        return i >= 200 && i < 700;
    }

    public void checkHeaders() throws ParseException {
        if (getCSeq() == null) {
            hny.j(0, "CSeq Is missing ");
            return;
        }
        if (getTo() == null) {
            hny.j(0, "To Is missing ");
            return;
        }
        if (getFrom() == null) {
            hny.j(0, "From Is missing ");
            return;
        }
        if (getViaHeaders() == null) {
            hny.j(0, "Via Is missing ");
            return;
        }
        if (getCallId() == null) {
            hny.j(0, "Call-ID Is missing ");
        } else {
            if (getStatusCode() <= 699) {
                return;
            }
            throw new ParseException("Unknown error code!" + getStatusCode(), 0);
        }
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public void cleanUp() {
        super.cleanUp();
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.core.GenericObject
    public Object clone() {
        SIPResponse sIPResponse = (SIPResponse) super.clone();
        StatusLine statusLine = this.statusLine;
        if (statusLine != null) {
            sIPResponse.statusLine = (StatusLine) statusLine.clone();
        }
        return sIPResponse;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageObject, android.gov.nist.core.GenericObject
    public String debugDump() {
        String strDebugDump = super.debugDump();
        this.stringRepresentation = "";
        sprint(SIPResponse.class.getCanonicalName());
        sprint("{");
        StatusLine statusLine = this.statusLine;
        if (statusLine != null) {
            sprint(statusLine.debugDump());
        }
        sprint(strDebugDump);
        sprint("}");
        return this.stringRepresentation;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageObject, android.gov.nist.core.GenericObject
    public String encode() {
        if (this.statusLine == null) {
            return super.encode();
        }
        return this.statusLine.encode() + super.encode();
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public byte[] encodeAsBytes(String str) {
        byte[] bytes;
        StatusLine statusLine = this.statusLine;
        if (statusLine != null) {
            try {
                bytes = statusLine.encode().getBytes("UTF-8");
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
        StatusLine statusLine = this.statusLine;
        if (statusLine == null) {
            return super.encodeSIPHeaders(sb);
        }
        statusLine.encode(sb);
        super.encodeSIPHeaders(sb);
        return sb;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return getClass().equals(obj.getClass()) && this.statusLine.equals(((SIPResponse) obj).statusLine) && super.equals(obj);
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.gov.nist.javax.sip.message.MessageExt
    public String getFirstLine() {
        StatusLine statusLine = this.statusLine;
        if (statusLine == null) {
            return null;
        }
        return statusLine.encode();
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage
    public LinkedList getMessageAsEncodedStrings() {
        LinkedList<String> messageAsEncodedStrings = super.getMessageAsEncodedStrings();
        StatusLine statusLine = this.statusLine;
        if (statusLine != null) {
            messageAsEncodedStrings.addFirst(statusLine.encode());
        }
        return messageAsEncodedStrings;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.javax.sip.message.Message
    public String getSIPVersion() {
        return this.statusLine.getSipVersion();
    }

    @Override // android.javax.sip.message.Response
    public int getStatusCode() {
        return this.statusLine.getStatusCode();
    }

    public StatusLine getStatusLine() {
        return this.statusLine;
    }

    public boolean isRetransmission() {
        return this.isRetransmission;
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
        Object obj2 = ((SIPResponse) obj).statusLine;
        StatusLine statusLine = this.statusLine;
        if (statusLine == null && obj2 != null) {
            return false;
        }
        if (statusLine == obj2) {
            return super.match(obj);
        }
        return statusLine.match(obj2) && super.match(obj);
    }

    @Override // android.javax.sip.message.Response
    public void setReasonPhrase(String str) {
        if (str == null) {
            jf4.o("Bad reason phrase");
            return;
        }
        StatusLine statusLine = this.statusLine;
        if (statusLine == null) {
            statusLine = new StatusLine();
            this.statusLine = statusLine;
        }
        statusLine.setReasonPhrase(str);
    }

    public void setRetransmission(boolean z) {
        this.isRetransmission = z;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.javax.sip.message.Message
    public void setSIPVersion(String str) {
        this.statusLine.setSipVersion(str);
    }

    @Override // android.javax.sip.message.Response
    public void setStatusCode(int i) {
        if (i < 100 || i > 699) {
            hny.j(0, "bad status code");
            return;
        }
        StatusLine statusLine = this.statusLine;
        if (statusLine == null) {
            statusLine = new StatusLine();
            this.statusLine = statusLine;
        }
        statusLine.setStatusCode(i);
    }

    public void setStatusLine(StatusLine statusLine) {
        this.statusLine = statusLine;
    }

    @Override // android.gov.nist.javax.sip.message.SIPMessage, android.javax.sip.message.Message
    public String toString() {
        if (this.statusLine == null) {
            return "";
        }
        return this.statusLine.encode() + super.encode();
    }

    public boolean isFinalResponse() {
        return isFinalResponse(this.statusLine.getStatusCode());
    }

    @Override // android.javax.sip.message.Response
    public String getReasonPhrase() {
        StatusLine statusLine = this.statusLine;
        if (statusLine != null && statusLine.getReasonPhrase() != null) {
            return this.statusLine.getReasonPhrase();
        }
        return "";
    }
}
