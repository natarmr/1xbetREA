package android.javax.sip.message;

import android.javax.sip.header.ContentDispositionHeader;
import android.javax.sip.header.ContentEncodingHeader;
import android.javax.sip.header.ContentLanguageHeader;
import android.javax.sip.header.ContentLengthHeader;
import android.javax.sip.header.ContentTypeHeader;
import android.javax.sip.header.ExpiresHeader;
import android.javax.sip.header.Header;
import java.io.Serializable;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public interface Message extends Cloneable, Serializable {
    void addFirst(Header header);

    void addHeader(Header header);

    void addLast(Header header);

    Object clone();

    boolean equals(Object obj);

    Object getContent();

    ContentDispositionHeader getContentDisposition();

    ContentEncodingHeader getContentEncoding();

    ContentLanguageHeader getContentLanguage();

    ContentLengthHeader getContentLength();

    ExpiresHeader getExpires();

    Header getHeader(String str);

    ListIterator getHeaderNames();

    ListIterator getHeaders(String str);

    byte[] getRawContent();

    String getSIPVersion();

    ListIterator getUnrecognizedHeaders();

    int hashCode();

    void removeContent();

    void removeFirst(String str);

    void removeHeader(String str);

    void removeLast(String str);

    void setContent(Object obj, ContentTypeHeader contentTypeHeader);

    void setContentDisposition(ContentDispositionHeader contentDispositionHeader);

    void setContentEncoding(ContentEncodingHeader contentEncodingHeader);

    void setContentLanguage(ContentLanguageHeader contentLanguageHeader);

    void setContentLength(ContentLengthHeader contentLengthHeader);

    void setExpires(ExpiresHeader expiresHeader);

    void setHeader(Header header);

    void setSIPVersion(String str);

    String toString();
}
