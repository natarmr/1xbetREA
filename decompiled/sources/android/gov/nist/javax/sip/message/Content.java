package android.gov.nist.javax.sip.message;

import android.javax.sip.header.ContentDispositionHeader;
import android.javax.sip.header.ContentTypeHeader;
import android.javax.sip.header.Header;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public interface Content {
    Object getContent();

    ContentDispositionHeader getContentDispositionHeader();

    ContentTypeHeader getContentTypeHeader();

    Iterator<Header> getExtensionHeaders();

    void setContent(Object obj);

    String toString();
}
