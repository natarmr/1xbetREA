package android.gov.nist.javax.sip.message;

import android.javax.sip.header.ContentTypeHeader;
import android.javax.sip.header.ServerHeader;
import android.javax.sip.header.UserAgentHeader;
import android.javax.sip.message.MessageFactory;

/* JADX INFO: loaded from: classes.dex */
public interface MessageFactoryExt extends MessageFactory {
    MultipartMimeContent createMultipartMimeContent(ContentTypeHeader contentTypeHeader, String[] strArr, String[] strArr2, String[] strArr3);

    void setDefaultContentEncodingCharset(String str);

    void setDefaultServerHeader(ServerHeader serverHeader);

    void setDefaultUserAgentHeader(UserAgentHeader userAgentHeader);
}
