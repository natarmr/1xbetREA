package android.gov.nist.javax.sip.message;

import android.javax.sip.header.CSeqHeader;
import android.javax.sip.header.CallIdHeader;
import android.javax.sip.header.ContentLengthHeader;
import android.javax.sip.header.ContentTypeHeader;
import android.javax.sip.header.FromHeader;
import android.javax.sip.header.ToHeader;
import android.javax.sip.header.ViaHeader;
import android.javax.sip.message.Message;

/* JADX INFO: loaded from: classes.dex */
public interface MessageExt extends Message {
    Object getApplicationData();

    CSeqHeader getCSeqHeader();

    CallIdHeader getCallIdHeader();

    ContentLengthHeader getContentLengthHeader();

    ContentTypeHeader getContentTypeHeader();

    String getFirstLine();

    FromHeader getFromHeader();

    MultipartMimeContent getMultipartMimeContent();

    ToHeader getToHeader();

    ViaHeader getTopmostViaHeader();

    void setApplicationData(Object obj);
}
