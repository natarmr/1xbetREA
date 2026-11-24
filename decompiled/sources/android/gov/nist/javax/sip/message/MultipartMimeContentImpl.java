package android.gov.nist.javax.sip.message;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.HeaderFactoryExt;
import android.gov.nist.javax.sip.header.HeaderFactoryImpl;
import android.javax.sip.header.ContentDispositionHeader;
import android.javax.sip.header.ContentTypeHeader;
import android.javax.sip.header.Header;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* JADX INFO: loaded from: classes.dex */
public class MultipartMimeContentImpl implements MultipartMimeContent {
    public static final String BOUNDARY = "boundary";
    private String boundary;
    private List<Content> contentList = new LinkedList();
    private HeaderFactoryExt headerFactory = new HeaderFactoryImpl();
    private ContentTypeHeader multipartMimeContentTypeHeader;

    public MultipartMimeContentImpl(ContentTypeHeader contentTypeHeader) {
        this.multipartMimeContentTypeHeader = contentTypeHeader;
        this.boundary = contentTypeHeader.getParameter(BOUNDARY);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    private ContentImpl parseBodyPart(String str) {
        String[] strArrSplit;
        if (str.startsWith(Separators.RETURN) || str.startsWith(Separators.NEWLINE)) {
            strArrSplit = null;
        } else {
            String[] strArrSplit2 = str.split("\r?\n\r?\n", 2);
            if (strArrSplit2.length == 2) {
                strArrSplit = strArrSplit2[0].split("\r?\n");
                if (strArrSplit[0].indexOf(Separators.COLON) > 0) {
                    str = strArrSplit2[1];
                } else {
                    strArrSplit = null;
                }
            } else {
                strArrSplit = null;
            }
        }
        ContentImpl contentImpl = new ContentImpl(str);
        if (strArrSplit != null) {
            for (String str2 : strArrSplit) {
                Header headerCreateHeader = this.headerFactory.createHeader(str2);
                if (headerCreateHeader instanceof ContentTypeHeader) {
                    contentImpl.setContentTypeHeader((ContentTypeHeader) headerCreateHeader);
                } else if (headerCreateHeader instanceof ContentDispositionHeader) {
                    contentImpl.setContentDispositionHeader((ContentDispositionHeader) headerCreateHeader);
                } else {
                    contentImpl.addExtensionHeader(headerCreateHeader);
                }
            }
        }
        return contentImpl;
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public boolean add(Content content) {
        return this.contentList.add((ContentImpl) content);
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public void addContent(Content content) {
        add(content);
    }

    public void createContentList(String str) {
        if (this.boundary == null) {
            ContentImpl bodyPart = parseBodyPart(str);
            bodyPart.setContentTypeHeader(getContentTypeHeader());
            this.contentList.add(bodyPart);
            return;
        }
        Scanner scanner = new Scanner(str);
        scanner.useDelimiter("\r?\n?--" + this.boundary + "(--)?\r?\n?");
        while (scanner.hasNext()) {
            try {
                this.contentList.add(parseBodyPart(scanner.next()));
            } catch (NoSuchElementException unused) {
            }
        }
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public int getContentCount() {
        return this.contentList.size();
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public ContentTypeHeader getContentTypeHeader() {
        return this.multipartMimeContentTypeHeader;
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public Iterator<Content> getContents() {
        return this.contentList.iterator();
    }

    @Override // android.gov.nist.javax.sip.message.MultipartMimeContent
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Content content : this.contentList) {
            sb.append("--" + this.boundary + Separators.NEWLINE);
            sb.append(content.toString());
            sb.append(Separators.NEWLINE);
        }
        if (!this.contentList.isEmpty()) {
            sb.append("--" + this.boundary + "--");
        }
        return sb.toString();
    }
}
