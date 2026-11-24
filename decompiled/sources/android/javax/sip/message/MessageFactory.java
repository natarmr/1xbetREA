package android.javax.sip.message;

import android.javax.sip.address.URI;
import android.javax.sip.header.CSeqHeader;
import android.javax.sip.header.CallIdHeader;
import android.javax.sip.header.ContentTypeHeader;
import android.javax.sip.header.FromHeader;
import android.javax.sip.header.MaxForwardsHeader;
import android.javax.sip.header.ToHeader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface MessageFactory {
    Request createRequest(URI uri, String str, CallIdHeader callIdHeader, CSeqHeader cSeqHeader, FromHeader fromHeader, ToHeader toHeader, List list, MaxForwardsHeader maxForwardsHeader);

    Request createRequest(URI uri, String str, CallIdHeader callIdHeader, CSeqHeader cSeqHeader, FromHeader fromHeader, ToHeader toHeader, List list, MaxForwardsHeader maxForwardsHeader, ContentTypeHeader contentTypeHeader, Object obj);

    Request createRequest(URI uri, String str, CallIdHeader callIdHeader, CSeqHeader cSeqHeader, FromHeader fromHeader, ToHeader toHeader, List list, MaxForwardsHeader maxForwardsHeader, ContentTypeHeader contentTypeHeader, byte[] bArr);

    Request createRequest(String str);

    Response createResponse(int i, CallIdHeader callIdHeader, CSeqHeader cSeqHeader, FromHeader fromHeader, ToHeader toHeader, List list, MaxForwardsHeader maxForwardsHeader);

    Response createResponse(int i, CallIdHeader callIdHeader, CSeqHeader cSeqHeader, FromHeader fromHeader, ToHeader toHeader, List list, MaxForwardsHeader maxForwardsHeader, ContentTypeHeader contentTypeHeader, Object obj);

    Response createResponse(int i, CallIdHeader callIdHeader, CSeqHeader cSeqHeader, FromHeader fromHeader, ToHeader toHeader, List list, MaxForwardsHeader maxForwardsHeader, ContentTypeHeader contentTypeHeader, byte[] bArr);

    Response createResponse(int i, Request request);

    Response createResponse(int i, Request request, ContentTypeHeader contentTypeHeader, Object obj);

    Response createResponse(int i, Request request, ContentTypeHeader contentTypeHeader, byte[] bArr);

    Response createResponse(String str);
}
