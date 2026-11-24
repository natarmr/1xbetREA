package android.gov.nist.javax.sip.message;

import android.gov.nist.core.Separators;
import android.javax.sip.header.ContentDispositionHeader;
import android.javax.sip.header.ContentTypeHeader;
import android.javax.sip.header.Header;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ContentImpl implements Content {
    private Object content;
    private ContentDispositionHeader contentDispositionHeader;
    private ContentTypeHeader contentTypeHeader;
    private List<Header> extensionHeaders = new ArrayList();

    public ContentImpl(String str) {
        this.content = str;
    }

    public void addExtensionHeader(Header header) {
        this.extensionHeaders.add(header);
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public Object getContent() {
        return this.content;
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public ContentDispositionHeader getContentDispositionHeader() {
        return this.contentDispositionHeader;
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public ContentTypeHeader getContentTypeHeader() {
        return this.contentTypeHeader;
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public Iterator<Header> getExtensionHeaders() {
        return this.extensionHeaders.iterator();
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public void setContent(Object obj) {
        this.content = obj;
    }

    public void setContentDispositionHeader(ContentDispositionHeader contentDispositionHeader) {
        this.contentDispositionHeader = contentDispositionHeader;
    }

    public void setContentTypeHeader(ContentTypeHeader contentTypeHeader) {
        this.contentTypeHeader = contentTypeHeader;
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ContentTypeHeader contentTypeHeader = this.contentTypeHeader;
        if (contentTypeHeader != null) {
            sb.append(contentTypeHeader.toString());
        }
        ContentDispositionHeader contentDispositionHeader = this.contentDispositionHeader;
        if (contentDispositionHeader != null) {
            sb.append(contentDispositionHeader.toString());
        }
        Iterator<Header> it = this.extensionHeaders.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        sb.append(Separators.NEWLINE);
        sb.append(this.content.toString());
        return sb.toString();
    }
}
