package android.gov.nist.javax.sip.header;

import a.hny;
import android.gov.nist.core.Separators;
import android.javax.sip.header.ContentTypeHeader;

/* JADX INFO: loaded from: classes.dex */
public class ContentType extends ParametersHeader implements ContentTypeHeader {
    private static final long serialVersionUID = 8475682204373446610L;
    protected MediaRange mediaRange;

    public ContentType(String str, String str2) {
        this();
        setContentType(str, str2);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        ContentType contentType = (ContentType) super.clone();
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange != null) {
            contentType.mediaRange = (MediaRange) mediaRange.clone();
        }
        return contentType;
    }

    public int compareMediaRange(String str) {
        return (this.mediaRange.type + Separators.SLASH + this.mediaRange.subtype).compareToIgnoreCase(str);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        this.mediaRange.encode(sb);
        if (hasParameters()) {
            sb.append(Separators.SEMICOLON);
            this.parameters.encode(sb);
        }
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj instanceof ContentTypeHeader) {
            ContentTypeHeader contentTypeHeader = (ContentTypeHeader) obj;
            if (getContentType().equalsIgnoreCase(contentTypeHeader.getContentType()) && getContentSubType().equalsIgnoreCase(contentTypeHeader.getContentSubType()) && equalParameters(contentTypeHeader)) {
                return true;
            }
        }
        return false;
    }

    public String getCharset() {
        return getParameter("charset");
    }

    @Override // android.javax.sip.header.MediaType
    public String getContentSubType() {
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange == null) {
            return null;
        }
        return mediaRange.getSubtype();
    }

    @Override // android.javax.sip.header.MediaType
    public String getContentType() {
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange == null) {
            return null;
        }
        return mediaRange.getType();
    }

    public MediaRange getMediaRange() {
        return this.mediaRange;
    }

    public String getMediaSubType() {
        return this.mediaRange.subtype;
    }

    public String getMediaType() {
        return this.mediaRange.type;
    }

    @Override // android.javax.sip.header.MediaType
    public void setContentSubType(String str) {
        if (str == null) {
            hny.u("null arg");
            return;
        }
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange == null) {
            mediaRange = new MediaRange();
            this.mediaRange = mediaRange;
        }
        mediaRange.setSubtype(str);
    }

    @Override // android.javax.sip.header.MediaType
    public void setContentType(String str) {
        if (str == null) {
            hny.u("null arg");
            return;
        }
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange == null) {
            mediaRange = new MediaRange();
            this.mediaRange = mediaRange;
        }
        mediaRange.setType(str);
    }

    public void setMediaRange(MediaRange mediaRange) {
        this.mediaRange = mediaRange;
    }

    public ContentType() {
        super("Content-Type");
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    public void setContentType(String str, String str2) {
        MediaRange mediaRange = this.mediaRange;
        if (mediaRange == null) {
            mediaRange = new MediaRange();
            this.mediaRange = mediaRange;
        }
        mediaRange.setType(str);
        this.mediaRange.setSubtype(str2);
    }
}
