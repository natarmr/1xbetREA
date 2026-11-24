package android.gov.nist.javax.sdp.fields;

import a.brm0;
import a.ohq;
import a.wch0;
import a.zl30;
import android.gov.nist.core.Separators;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class MediaField extends SDPField implements zl30 {
    protected Vector formats;
    protected String media;
    protected int nports;
    protected int port;
    protected String proto;

    public MediaField() {
        super(SDPFieldNames.MEDIA_FIELD);
        this.formats = new Vector();
    }

    private String encodeFormats() {
        StringBuilder sb = new StringBuilder(this.formats.size() * 3);
        for (int i = 0; i < this.formats.size(); i++) {
            sb.append(this.formats.elementAt(i));
            if (i < this.formats.size() - 1) {
                sb.append(Separators.SP);
            }
        }
        return sb.toString();
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        MediaField mediaField = (MediaField) super.clone();
        Vector vector = this.formats;
        if (vector != null) {
            mediaField.formats = (Vector) vector.clone();
        }
        return mediaField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = this.media;
        String string = SDPFieldNames.MEDIA_FIELD;
        if (str != null) {
            string = SDPFieldNames.MEDIA_FIELD + this.media.toLowerCase() + Separators.SP + this.port;
        }
        if (this.nports > 1) {
            StringBuilder sbT = brm0.t(string, Separators.SLASH);
            sbT.append(this.nports);
            string = sbT.toString();
        }
        if (this.proto != null) {
            StringBuilder sbT2 = brm0.t(string, Separators.SP);
            sbT2.append(this.proto);
            string = sbT2.toString();
        }
        if (this.formats != null) {
            StringBuilder sbT3 = brm0.t(string, Separators.SP);
            sbT3.append(encodeFormats());
            string = sbT3.toString();
        }
        return string.concat(Separators.NEWLINE);
    }

    public Vector getFormats() {
        return this.formats;
    }

    public String getMedia() {
        return this.media;
    }

    public Vector getMediaFormats(boolean z) {
        if (z || this.formats.size() != 0) {
            return this.formats;
        }
        return null;
    }

    public int getMediaPort() {
        return getPort();
    }

    public String getMediaType() {
        return getMedia();
    }

    public int getNports() {
        return this.nports;
    }

    public int getPort() {
        return this.port;
    }

    public int getPortCount() {
        return getNports();
    }

    public String getProto() {
        return this.proto;
    }

    public String getProtocol() {
        return getProto();
    }

    public void setFormats(Vector vector) {
        this.formats = vector;
    }

    public void setMedia(String str) {
        this.media = str;
    }

    public void setMediaFormats(Vector vector) throws wch0 {
        if (vector != null) {
            this.formats = vector;
        } else {
            ohq.s("The mediaFormats is null");
        }
    }

    public void setMediaPort(int i) throws wch0 {
        if (i >= 0) {
            setPort(i);
        } else {
            ohq.s("The port is < 0");
        }
    }

    public void setMediaType(String str) throws wch0 {
        if (str != null) {
            setMedia(str);
        } else {
            ohq.s("The mediaType is null");
        }
    }

    public void setNports(int i) {
        this.nports = i;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public void setPortCount(int i) throws wch0 {
        if (i >= 0) {
            setNports(i);
        } else {
            ohq.s("The port count is < 0");
        }
    }

    public void setProto(String str) {
        this.proto = str;
    }

    public void setProtocol(String str) throws wch0 {
        if (str != null) {
            setProto(str);
        } else {
            ohq.s("The protocol is null");
        }
    }
}
