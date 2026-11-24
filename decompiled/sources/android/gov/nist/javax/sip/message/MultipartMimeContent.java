package android.gov.nist.javax.sip.message;

import android.javax.sip.header.ContentTypeHeader;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public interface MultipartMimeContent {
    boolean add(Content content);

    void addContent(Content content);

    int getContentCount();

    ContentTypeHeader getContentTypeHeader();

    Iterator<Content> getContents();

    String toString();
}
