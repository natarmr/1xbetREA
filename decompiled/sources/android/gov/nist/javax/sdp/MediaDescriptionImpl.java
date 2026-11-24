package android.gov.nist.javax.sdp;

import a.f8x;
import a.hny;
import a.j1e;
import a.ohq;
import a.sjy;
import a.w6x;
import a.wch0;
import a.zl30;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AttributeField;
import android.gov.nist.javax.sdp.fields.BandwidthField;
import android.gov.nist.javax.sdp.fields.ConnectionField;
import android.gov.nist.javax.sdp.fields.InformationField;
import android.gov.nist.javax.sdp.fields.KeyField;
import android.gov.nist.javax.sdp.fields.MediaField;
import android.gov.nist.javax.sdp.fields.PreconditionFields;
import android.gov.nist.javax.sdp.fields.SDPField;
import java.io.Serializable;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class MediaDescriptionImpl implements Serializable, Cloneable {
    protected ConnectionField connectionField;
    protected InformationField informationField;
    protected KeyField keyField;
    protected MediaField mediaField;
    protected Vector bandwidthFields = new Vector();
    protected Vector attributeFields = new Vector();
    protected PreconditionFields preconditionFields = new PreconditionFields();

    public void addAttribute(AttributeField attributeField) {
        this.attributeFields.add(attributeField);
    }

    public void addBandwidthField(BandwidthField bandwidthField) {
        this.bandwidthFields.add(bandwidthField);
    }

    public void addDynamicPayloads(Vector vector, Vector vector2) throws wch0 {
        if (vector == null || vector2 == null) {
            ohq.s(" The vectors are null");
            return;
        }
        if (vector.isEmpty() || vector2.isEmpty()) {
            ohq.s(" The vectors are empty");
            return;
        }
        if (vector.size() != vector2.size()) {
            ohq.s(" The vector sizes are unequal");
            return;
        }
        for (int i = 0; i < vector.size(); i++) {
            setAttribute((String) vector.elementAt(i), (String) vector2.elementAt(i));
        }
    }

    public String encode() {
        StringBuilder sb = new StringBuilder();
        MediaField mediaField = this.mediaField;
        if (mediaField != null) {
            sb.append(mediaField.encode());
        }
        InformationField informationField = this.informationField;
        if (informationField != null) {
            sb.append(informationField.encode());
        }
        ConnectionField connectionField = this.connectionField;
        if (connectionField != null) {
            sb.append(connectionField.encode());
        }
        if (this.bandwidthFields != null) {
            for (int i = 0; i < this.bandwidthFields.size(); i++) {
                sb.append(((SDPField) this.bandwidthFields.elementAt(i)).encode());
            }
            PreconditionFields preconditionFields = this.preconditionFields;
            if (preconditionFields != null) {
                int preconditionSize = preconditionFields.getPreconditionSize();
                for (int i2 = 0; i2 < preconditionSize; i2++) {
                    sb.append(((SDPField) this.preconditionFields.getPreconditions().elementAt(i2)).encode());
                }
            }
        }
        KeyField keyField = this.keyField;
        if (keyField != null) {
            sb.append(keyField.encode());
        }
        if (this.attributeFields != null) {
            for (int i3 = 0; i3 < this.attributeFields.size(); i3++) {
                sb.append(((SDPField) this.attributeFields.elementAt(i3)).encode());
            }
        }
        return sb.toString();
    }

    public String getAttribute(String str) {
        if (str == null) {
            hny.u("null arg!");
            return null;
        }
        for (int i = 0; i < this.attributeFields.size(); i++) {
            AttributeField attributeField = (AttributeField) this.attributeFields.elementAt(i);
            if (str.equals(attributeField.getAttribute().getName())) {
                return (String) attributeField.getAttribute().getValueAsObject();
            }
        }
        return null;
    }

    public Vector getAttributeFields() {
        return this.attributeFields;
    }

    public Vector getAttributes(boolean z) {
        return this.attributeFields;
    }

    public int getBandwidth(String str) {
        if (str == null) {
            hny.u("null parameter");
            return 0;
        }
        if (this.bandwidthFields == null) {
            return -1;
        }
        for (int i = 0; i < this.bandwidthFields.size(); i++) {
            BandwidthField bandwidthField = (BandwidthField) this.bandwidthFields.elementAt(i);
            String bwtype = bandwidthField.getBwtype();
            if (bwtype != null && bwtype.equals(str)) {
                return bandwidthField.getBandwidth();
            }
        }
        return -1;
    }

    public Vector getBandwidths(boolean z) {
        return this.bandwidthFields;
    }

    public j1e getConnection() {
        return this.connectionField;
    }

    public ConnectionField getConnectionField() {
        return this.connectionField;
    }

    public String getDuplexity() {
        for (int i = 0; i < this.attributeFields.size(); i++) {
            AttributeField attributeField = (AttributeField) this.attributeFields.elementAt(i);
            if (attributeField.getAttribute().getName().equalsIgnoreCase("sendrecv") || attributeField.getAttribute().getName().equalsIgnoreCase("recvonly") || attributeField.getAttribute().getName().equalsIgnoreCase("sendonly") || attributeField.getAttribute().getName().equalsIgnoreCase("inactive")) {
                return attributeField.getAttribute().getName();
            }
        }
        return null;
    }

    public f8x getInfo() {
        InformationField informationField = getInformationField();
        if (informationField == null) {
            return null;
        }
        return informationField;
    }

    public InformationField getInformationField() {
        return this.informationField;
    }

    public sjy getKey() {
        KeyField keyField = this.keyField;
        if (keyField == null) {
            return null;
        }
        return keyField;
    }

    public KeyField getKeyField() {
        return this.keyField;
    }

    public zl30 getMedia() {
        return this.mediaField;
    }

    public MediaField getMediaField() {
        return this.mediaField;
    }

    public Vector getMimeParameters() {
        String attribute = getAttribute("rate");
        String attribute2 = getAttribute("ptime");
        String attribute3 = getAttribute("maxptime");
        String attribute4 = getAttribute("ftmp");
        Vector vector = new Vector();
        vector.addElement(attribute);
        vector.addElement(attribute2);
        vector.addElement(attribute3);
        vector.addElement(attribute4);
        return vector;
    }

    public Vector getMimeTypes() {
        MediaField mediaField = (MediaField) getMedia();
        String mediaType = mediaField.getMediaType();
        String protocol = mediaField.getProtocol();
        Vector mediaFormats = mediaField.getMediaFormats(false);
        Vector vector = new Vector();
        for (int i = 0; i < mediaFormats.size(); i++) {
            vector.addElement(protocol.equals("RTP/AVP") ? getAttribute("rtpmap") != null ? w6x.q(mediaType, Separators.SLASH, protocol) : null : w6x.q(mediaType, Separators.SLASH, protocol));
        }
        return vector;
    }

    public Vector getPreconditionFields() {
        return this.preconditionFields.getPreconditions();
    }

    public boolean hasAttribute(String str) {
        for (int i = 0; i < this.attributeFields.size(); i++) {
            if (((AttributeField) this.attributeFields.elementAt(i)).getAttribute().getName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void removeAttribute(String str) {
        if (str == null) {
            hny.u("null arg!");
            return;
        }
        int i = 0;
        while (i < this.attributeFields.size() && !((AttributeField) this.attributeFields.elementAt(i)).getAttribute().getName().equals(str)) {
            i++;
        }
        if (i < this.attributeFields.size()) {
            this.attributeFields.removeElementAt(i);
        }
    }

    public void removeBandwidth(String str) {
        String bwtype;
        if (str == null) {
            hny.u("null bandwidth type");
            return;
        }
        int i = 0;
        while (i < this.bandwidthFields.size() && ((bwtype = ((BandwidthField) this.bandwidthFields.elementAt(i)).getBwtype()) == null || !bwtype.equals(str))) {
            i++;
        }
        if (i < this.bandwidthFields.size()) {
            this.bandwidthFields.removeElementAt(i);
        }
    }

    public void setAttribute(String str, String str2) throws wch0 {
        if (str == null) {
            ohq.s("The parameters are null");
            return;
        }
        int i = 0;
        while (i < this.attributeFields.size()) {
            AttributeField attributeField = (AttributeField) this.attributeFields.elementAt(i);
            if (attributeField.getAttribute().getName().equals(str)) {
                attributeField.getAttribute().setValueAsObject(str2);
                break;
            }
            i++;
        }
        if (i == this.attributeFields.size()) {
            AttributeField attributeField2 = new AttributeField();
            attributeField2.setAttribute(new NameValue(str, str2));
            this.attributeFields.add(attributeField2);
        }
    }

    public void setAttributeFields(Vector vector) {
        this.attributeFields = vector;
    }

    public void setAttributes(Vector vector) {
        this.attributeFields = vector;
    }

    public void setBandwidth(String str, int i) throws wch0 {
        if (str == null) {
            ohq.s("The name is null");
            return;
        }
        int i2 = 0;
        while (i2 < this.bandwidthFields.size()) {
            BandwidthField bandwidthField = (BandwidthField) this.bandwidthFields.elementAt(i2);
            String bwtype = bandwidthField.getBwtype();
            if (bwtype != null && bwtype.equals(str)) {
                bandwidthField.setBandwidth(i);
                break;
            }
            i2++;
        }
        if (i2 == this.bandwidthFields.size()) {
            BandwidthField bandwidthField2 = new BandwidthField();
            bandwidthField2.setType(str);
            bandwidthField2.setValue(i);
            this.bandwidthFields.add(bandwidthField2);
        }
    }

    public void setBandwidths(Vector vector) throws wch0 {
        if (vector != null) {
            this.bandwidthFields = vector;
        } else {
            ohq.s("The vector bandwidths is null");
        }
    }

    public void setConnection(j1e j1eVar) throws wch0 {
        if (j1eVar == null) {
            ohq.s("The conn is null");
        } else if (j1eVar instanceof ConnectionField) {
            this.connectionField = (ConnectionField) j1eVar;
        } else {
            ohq.s("bad implementation");
        }
    }

    public void setConnectionField(ConnectionField connectionField) {
        this.connectionField = connectionField;
    }

    public void setDuplexity(String str) {
        if (str == null) {
            hny.u("Null arg");
            return;
        }
        int i = 0;
        while (true) {
            int size = this.attributeFields.size();
            Vector vector = this.attributeFields;
            if (i >= size) {
                if (i == vector.size()) {
                    AttributeField attributeField = new AttributeField();
                    attributeField.setAttribute(new NameValue(str, null));
                    this.attributeFields.add(attributeField);
                    return;
                }
                return;
            }
            AttributeField attributeField2 = (AttributeField) vector.elementAt(i);
            if (attributeField2.getAttribute().getName().equalsIgnoreCase("sendrecv") || attributeField2.getAttribute().getName().equalsIgnoreCase("recvonly") || attributeField2.getAttribute().getName().equalsIgnoreCase("sendonly") || attributeField2.getAttribute().getName().equalsIgnoreCase("inactive")) {
                attributeField2.setAttribute(new NameValue(str, null));
                return;
            }
            i++;
        }
    }

    public void setInfo(f8x f8xVar) throws wch0 {
        if (f8xVar == null) {
            ohq.s("The info is null");
        } else if (f8xVar instanceof InformationField) {
            this.informationField = (InformationField) f8xVar;
        } else {
            ohq.s("A informationField parameter is required");
        }
    }

    public void setInformationField(InformationField informationField) {
        this.informationField = informationField;
    }

    public void setKey(sjy sjyVar) throws wch0 {
        if (sjyVar == null) {
            ohq.s("The key is null");
        } else if (sjyVar instanceof KeyField) {
            setKeyField((KeyField) sjyVar);
        } else {
            ohq.s("A keyField parameter is required");
        }
    }

    public void setKeyField(KeyField keyField) {
        this.keyField = keyField;
    }

    public void setMedia(zl30 zl30Var) throws wch0 {
        if (zl30Var == null) {
            ohq.s("The media is null");
        } else if (zl30Var instanceof MediaField) {
            this.mediaField = (MediaField) zl30Var;
        } else {
            ohq.s("A mediaField parameter is required");
        }
    }

    public void setMediaField(MediaField mediaField) {
        this.mediaField = mediaField;
    }

    public void setPreconditionFields(Vector vector) {
        this.preconditionFields.setPreconditions(vector);
    }

    public void setPreconditions(PreconditionFields preconditionFields) {
        this.preconditionFields = preconditionFields;
    }

    public String toString() {
        return encode();
    }
}
