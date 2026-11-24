package android.gov.nist.javax.sdp;

import a.cki0;
import a.f8x;
import a.hny;
import a.j1e;
import a.mji0;
import a.o2t0;
import a.ohq;
import a.sjy;
import a.ta80;
import a.vbu0;
import a.wch0;
import android.gov.nist.javax.sdp.fields.AttributeField;
import android.gov.nist.javax.sdp.fields.BandwidthField;
import android.gov.nist.javax.sdp.fields.ConnectionField;
import android.gov.nist.javax.sdp.fields.EmailField;
import android.gov.nist.javax.sdp.fields.InformationField;
import android.gov.nist.javax.sdp.fields.KeyField;
import android.gov.nist.javax.sdp.fields.MediaField;
import android.gov.nist.javax.sdp.fields.OriginField;
import android.gov.nist.javax.sdp.fields.PhoneField;
import android.gov.nist.javax.sdp.fields.ProtoVersionField;
import android.gov.nist.javax.sdp.fields.RepeatField;
import android.gov.nist.javax.sdp.fields.SDPField;
import android.gov.nist.javax.sdp.fields.SessionNameField;
import android.gov.nist.javax.sdp.fields.TimeField;
import android.gov.nist.javax.sdp.fields.URIField;
import android.gov.nist.javax.sdp.fields.ZoneField;
import java.text.ParseException;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class SessionDescriptionImpl implements mji0 {
    protected Vector attributesList;
    protected Vector bandwidthList;
    protected ConnectionField connectionImpl;
    private MediaDescriptionImpl currentMediaDescription;
    private TimeDescriptionImpl currentTimeDescription;
    protected Vector emailList;
    protected InformationField infoImpl;
    protected KeyField keyImpl;
    protected Vector mediaDescriptions;
    protected OriginField originImpl;
    protected Vector phoneList;
    protected SessionNameField sessionNameImpl;
    protected Vector timeDescriptions;
    protected URIField uriImpl;
    protected ProtoVersionField versionImpl;
    protected Vector zoneAdjustments;

    public SessionDescriptionImpl(mji0 mji0Var) throws wch0 {
        if (mji0Var == null) {
            return;
        }
        vbu0 version = mji0Var.getVersion();
        if (version != null) {
            setVersion((vbu0) version.clone());
        }
        ta80 origin = mji0Var.getOrigin();
        if (origin != null) {
            setOrigin((ta80) origin.clone());
        }
        cki0 sessionName = mji0Var.getSessionName();
        if (sessionName != null) {
            setSessionName((cki0) sessionName.clone());
        }
        f8x info = mji0Var.getInfo();
        if (info != null) {
            setInfo((f8x) info.clone());
        }
        URIField uRIField = (URIField) mji0Var.getURI();
        if (uRIField != null) {
            URIField uRIField2 = new URIField();
            uRIField2.set(uRIField.get());
            setURI(uRIField2);
        }
        j1e connection = mji0Var.getConnection();
        if (connection != null) {
            setConnection((j1e) connection.clone());
        }
        sjy key = mji0Var.getKey();
        if (key != null) {
            setKey((sjy) key.clone());
        }
        Vector<TimeDescriptionImpl> timeDescriptions = mji0Var.getTimeDescriptions(false);
        if (timeDescriptions != null) {
            Vector vector = new Vector();
            for (TimeDescriptionImpl timeDescriptionImpl : timeDescriptions) {
                if (timeDescriptionImpl != null) {
                    TimeDescriptionImpl timeDescriptionImpl2 = new TimeDescriptionImpl((TimeField) timeDescriptionImpl.getTime().clone());
                    Vector<RepeatField> repeatTimes = timeDescriptionImpl.getRepeatTimes(false);
                    if (repeatTimes != null) {
                        for (RepeatField repeatField : repeatTimes) {
                            if (repeatField != null) {
                                timeDescriptionImpl2.addRepeatField((RepeatField) repeatField.clone());
                            }
                        }
                    }
                    vector.add(timeDescriptionImpl2);
                }
            }
            setTimeDescriptions(vector);
        }
        Vector<EmailField> emails = mji0Var.getEmails(false);
        if (emails != null) {
            Vector vector2 = new Vector();
            for (EmailField emailField : emails) {
                if (emailField != null) {
                    vector2.add((EmailField) emailField.clone());
                }
            }
            setEmails(vector2);
        }
        Vector<PhoneField> phones = mji0Var.getPhones(false);
        if (phones != null) {
            Vector vector3 = new Vector();
            for (PhoneField phoneField : phones) {
                if (phoneField != null) {
                    vector3.add((PhoneField) phoneField.clone());
                }
            }
            setPhones(vector3);
        }
        Vector<ZoneField> zoneAdjustments = mji0Var.getZoneAdjustments(false);
        if (zoneAdjustments != null) {
            Vector vector4 = new Vector();
            for (ZoneField zoneField : zoneAdjustments) {
                if (zoneField != null) {
                    vector4.add((ZoneField) zoneField.clone());
                }
            }
            setZoneAdjustments(vector4);
        }
        Vector<BandwidthField> bandwidths = mji0Var.getBandwidths(false);
        if (bandwidths != null) {
            Vector vector5 = new Vector();
            for (BandwidthField bandwidthField : bandwidths) {
                if (bandwidthField != null) {
                    vector5.add((BandwidthField) bandwidthField.clone());
                }
            }
            setBandwidths(vector5);
        }
        Vector<AttributeField> attributes = mji0Var.getAttributes(false);
        if (attributes != null) {
            Vector vector6 = new Vector();
            for (AttributeField attributeField : attributes) {
                if (attributeField != null) {
                    vector6.add((AttributeField) attributeField.clone());
                }
            }
            setAttributes(vector6);
        }
        Vector<MediaDescriptionImpl> mediaDescriptions = mji0Var.getMediaDescriptions(false);
        if (mediaDescriptions != null) {
            Vector vector7 = new Vector();
            for (MediaDescriptionImpl mediaDescriptionImpl : mediaDescriptions) {
                if (mediaDescriptionImpl != null) {
                    MediaDescriptionImpl mediaDescriptionImpl2 = new MediaDescriptionImpl();
                    MediaField mediaField = mediaDescriptionImpl.getMediaField();
                    if (mediaField != null) {
                        MediaField mediaField2 = new MediaField();
                        mediaField2.setMedia(mediaField.getMedia());
                        mediaField2.setPort(mediaField.getPort());
                        mediaField2.setNports(mediaField.getNports());
                        mediaField2.setProto(mediaField.getProto());
                        Vector formats = mediaField.getFormats();
                        if (formats != null) {
                            Vector vector8 = new Vector();
                            for (Object obj : formats) {
                                if (obj != null) {
                                    vector8.add(String.valueOf(obj));
                                }
                            }
                            mediaField2.setFormats(vector8);
                        }
                        mediaDescriptionImpl2.setMedia(mediaField2);
                    }
                    InformationField informationField = mediaDescriptionImpl.getInformationField();
                    if (informationField != null) {
                        mediaDescriptionImpl2.setInformationField((InformationField) informationField.clone());
                    }
                    ConnectionField connectionField = mediaDescriptionImpl.getConnectionField();
                    if (connectionField != null) {
                        mediaDescriptionImpl2.setConnectionField((ConnectionField) connectionField.clone());
                    }
                    Vector<BandwidthField> bandwidths2 = mediaDescriptionImpl.getBandwidths(false);
                    if (bandwidths2 != null) {
                        Vector vector9 = new Vector();
                        for (BandwidthField bandwidthField2 : bandwidths2) {
                            if (bandwidthField2 != null) {
                                vector9.add((BandwidthField) bandwidthField2.clone());
                            }
                        }
                        mediaDescriptionImpl2.setBandwidths(vector9);
                    }
                    KeyField keyField = mediaDescriptionImpl.getKeyField();
                    if (keyField != null) {
                        mediaDescriptionImpl2.setKeyField((KeyField) keyField.clone());
                    }
                    Vector<AttributeField> attributeFields = mediaDescriptionImpl.getAttributeFields();
                    if (attributeFields != null) {
                        Vector vector10 = new Vector();
                        for (AttributeField attributeField2 : attributeFields) {
                            if (attributeField2 != null) {
                                vector10.add((AttributeField) attributeField2.clone());
                            }
                        }
                        mediaDescriptionImpl2.setAttributeFields(vector10);
                    }
                    vector7.add(mediaDescriptionImpl2);
                }
            }
            setMediaDescriptions(vector7);
        }
    }

    private String encodeVector(Vector vector) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vector.size(); i++) {
            sb.append(vector.elementAt(i));
        }
        return sb.toString();
    }

    public void addField(SDPField sDPField) throws ParseException {
        try {
            if (sDPField instanceof ProtoVersionField) {
                this.versionImpl = (ProtoVersionField) sDPField;
                return;
            }
            if (sDPField instanceof OriginField) {
                this.originImpl = (OriginField) sDPField;
                return;
            }
            if (sDPField instanceof SessionNameField) {
                this.sessionNameImpl = (SessionNameField) sDPField;
                return;
            }
            if (sDPField instanceof InformationField) {
                MediaDescriptionImpl mediaDescriptionImpl = this.currentMediaDescription;
                if (mediaDescriptionImpl != null) {
                    mediaDescriptionImpl.setInformationField((InformationField) sDPField);
                    return;
                } else {
                    this.infoImpl = (InformationField) sDPField;
                    return;
                }
            }
            if (sDPField instanceof URIField) {
                this.uriImpl = (URIField) sDPField;
                return;
            }
            if (sDPField instanceof ConnectionField) {
                MediaDescriptionImpl mediaDescriptionImpl2 = this.currentMediaDescription;
                if (mediaDescriptionImpl2 != null) {
                    mediaDescriptionImpl2.setConnectionField((ConnectionField) sDPField);
                    return;
                } else {
                    this.connectionImpl = (ConnectionField) sDPField;
                    return;
                }
            }
            if (sDPField instanceof KeyField) {
                MediaDescriptionImpl mediaDescriptionImpl3 = this.currentMediaDescription;
                if (mediaDescriptionImpl3 != null) {
                    mediaDescriptionImpl3.setKey((KeyField) sDPField);
                    return;
                } else {
                    this.keyImpl = (KeyField) sDPField;
                    return;
                }
            }
            if (sDPField instanceof EmailField) {
                getEmails(true).add(sDPField);
                return;
            }
            if (sDPField instanceof PhoneField) {
                getPhones(true).add(sDPField);
                return;
            }
            if (sDPField instanceof TimeField) {
                this.currentTimeDescription = new TimeDescriptionImpl((TimeField) sDPField);
                getTimeDescriptions(true).add(this.currentTimeDescription);
                return;
            }
            if (sDPField instanceof RepeatField) {
                TimeDescriptionImpl timeDescriptionImpl = this.currentTimeDescription;
                if (timeDescriptionImpl == null) {
                    throw new ParseException("no time specified", 0);
                }
                timeDescriptionImpl.addRepeatField((RepeatField) sDPField);
                return;
            }
            if (sDPField instanceof ZoneField) {
                getZoneAdjustments(true).add(sDPField);
                return;
            }
            if (sDPField instanceof BandwidthField) {
                MediaDescriptionImpl mediaDescriptionImpl4 = this.currentMediaDescription;
                if (mediaDescriptionImpl4 != null) {
                    mediaDescriptionImpl4.addBandwidthField((BandwidthField) sDPField);
                    return;
                } else {
                    getBandwidths(true).add(sDPField);
                    return;
                }
            }
            if (sDPField instanceof AttributeField) {
                if (this.currentMediaDescription == null) {
                    getAttributes(true).add(sDPField);
                    return;
                } else {
                    ((AttributeField) sDPField).getName();
                    this.currentMediaDescription.addAttribute((AttributeField) sDPField);
                    return;
                }
            }
            if (sDPField instanceof MediaField) {
                this.currentMediaDescription = new MediaDescriptionImpl();
                getMediaDescriptions(true).add(this.currentMediaDescription);
                this.currentMediaDescription.setMediaField((MediaField) sDPField);
            }
        } catch (wch0 unused) {
            hny.j(0, sDPField.encode());
        }
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return new SessionDescriptionImpl(this);
        } catch (wch0 unused) {
            throw new CloneNotSupportedException();
        }
    }

    public String getAttribute(String str) {
        AttributeField attributeField;
        String name;
        if (str == null || this.attributesList == null) {
            return null;
        }
        for (int i = 0; i < this.attributesList.size(); i++) {
            Object objElementAt = this.attributesList.elementAt(i);
            if ((objElementAt instanceof AttributeField) && (name = (attributeField = (AttributeField) objElementAt).getName()) != null && str.equals(name)) {
                return attributeField.getValue();
            }
        }
        return null;
    }

    @Override // a.mji0
    public Vector getAttributes(boolean z) {
        Vector vector = this.attributesList;
        if (vector != null || !z) {
            return vector;
        }
        Vector vector2 = new Vector();
        this.attributesList = vector2;
        return vector2;
    }

    public int getBandwidth(String str) {
        BandwidthField bandwidthField;
        String type;
        if (str == null || this.bandwidthList == null) {
            return -1;
        }
        for (int i = 0; i < this.bandwidthList.size(); i++) {
            Object objElementAt = this.bandwidthList.elementAt(i);
            if ((objElementAt instanceof BandwidthField) && (type = (bandwidthField = (BandwidthField) objElementAt).getType()) != null && str.equals(type)) {
                return bandwidthField.getValue();
            }
        }
        return -1;
    }

    @Override // a.mji0
    public Vector getBandwidths(boolean z) {
        Vector vector = this.bandwidthList;
        if (vector != null || !z) {
            return vector;
        }
        Vector vector2 = new Vector();
        this.bandwidthList = vector2;
        return vector2;
    }

    @Override // a.mji0
    public j1e getConnection() {
        return this.connectionImpl;
    }

    @Override // a.mji0
    public Vector getEmails(boolean z) {
        Vector vector = this.emailList;
        if (vector != null || !z) {
            return vector;
        }
        Vector vector2 = new Vector();
        this.emailList = vector2;
        return vector2;
    }

    @Override // a.mji0
    public f8x getInfo() {
        return this.infoImpl;
    }

    @Override // a.mji0
    public sjy getKey() {
        return this.keyImpl;
    }

    @Override // a.mji0
    public Vector getMediaDescriptions(boolean z) {
        Vector vector = this.mediaDescriptions;
        if (vector != null || !z) {
            return vector;
        }
        Vector vector2 = new Vector();
        this.mediaDescriptions = vector2;
        return vector2;
    }

    @Override // a.mji0
    public ta80 getOrigin() {
        return this.originImpl;
    }

    @Override // a.mji0
    public Vector getPhones(boolean z) {
        Vector vector = this.phoneList;
        if (vector != null || !z) {
            return vector;
        }
        Vector vector2 = new Vector();
        this.phoneList = vector2;
        return vector2;
    }

    @Override // a.mji0
    public cki0 getSessionName() {
        return this.sessionNameImpl;
    }

    @Override // a.mji0
    public Vector getTimeDescriptions(boolean z) {
        Vector vector = this.timeDescriptions;
        if (vector != null || !z) {
            return vector;
        }
        Vector vector2 = new Vector();
        this.timeDescriptions = vector2;
        return vector2;
    }

    @Override // a.mji0
    public o2t0 getURI() {
        return this.uriImpl;
    }

    @Override // a.mji0
    public vbu0 getVersion() {
        return this.versionImpl;
    }

    @Override // a.mji0
    public Vector getZoneAdjustments(boolean z) {
        Vector vector = this.zoneAdjustments;
        if (vector != null || !z) {
            return vector;
        }
        Vector vector2 = new Vector();
        this.zoneAdjustments = vector2;
        return vector2;
    }

    public void removeAttribute(String str) {
        AttributeField attributeField;
        String name;
        if (str == null || this.attributesList == null) {
            return;
        }
        for (int i = 0; i < this.attributesList.size(); i++) {
            Object objElementAt = this.attributesList.elementAt(i);
            if ((objElementAt instanceof AttributeField) && (name = (attributeField = (AttributeField) objElementAt).getName()) != null && str.equals(name)) {
                this.attributesList.remove(attributeField);
            }
        }
    }

    public void removeBandwidth(String str) {
        BandwidthField bandwidthField;
        String type;
        if (str == null || this.bandwidthList == null) {
            return;
        }
        for (int i = 0; i < this.bandwidthList.size(); i++) {
            Object objElementAt = this.bandwidthList.elementAt(i);
            if ((objElementAt instanceof BandwidthField) && (type = (bandwidthField = (BandwidthField) objElementAt).getType()) != null && str.equals(type)) {
                this.bandwidthList.remove(bandwidthField);
            }
        }
    }

    public void setAttribute(String str, String str2) throws wch0 {
        AttributeField attributeField;
        String name;
        if (str == null || str2 == null) {
            ohq.s("The parameter is null");
            return;
        }
        if (this.attributesList != null) {
            for (int i = 0; i < this.attributesList.size(); i++) {
                Object objElementAt = this.attributesList.elementAt(i);
                if ((objElementAt instanceof AttributeField) && (name = (attributeField = (AttributeField) objElementAt).getName()) != null && str.equals(name)) {
                    attributeField.setValue(str2);
                }
            }
        }
    }

    public void setAttributes(Vector vector) throws wch0 {
        if (vector != null) {
            this.attributesList = vector;
        } else {
            ohq.s("The parameter is null");
        }
    }

    public void setBandwidth(String str, int i) throws wch0 {
        BandwidthField bandwidthField;
        String type;
        if (str == null) {
            ohq.s("The parameter is null");
            return;
        }
        if (this.bandwidthList != null) {
            for (int i2 = 0; i2 < this.bandwidthList.size(); i2++) {
                Object objElementAt = this.bandwidthList.elementAt(i2);
                if ((objElementAt instanceof BandwidthField) && (type = (bandwidthField = (BandwidthField) objElementAt).getType()) != null && str.equals(type)) {
                    bandwidthField.setValue(i);
                }
            }
        }
    }

    public void setBandwidths(Vector vector) throws wch0 {
        if (vector != null) {
            this.bandwidthList = vector;
        } else {
            ohq.s("The parameter is null");
        }
    }

    public void setConnection(j1e j1eVar) throws wch0 {
        if (j1eVar == null) {
            ohq.s("The parameter is null");
        } else if (j1eVar instanceof ConnectionField) {
            this.connectionImpl = (ConnectionField) j1eVar;
        } else {
            ohq.s("Bad implementation class ConnectionField");
        }
    }

    public void setEmails(Vector vector) throws wch0 {
        if (vector != null) {
            this.emailList = vector;
        } else {
            ohq.s("The parameter is null");
        }
    }

    public void setInfo(f8x f8xVar) throws wch0 {
        if (f8xVar == null) {
            ohq.s("The parameter is null");
        } else if (f8xVar instanceof InformationField) {
            this.infoImpl = (InformationField) f8xVar;
        } else {
            ohq.s("The parameter must be an instance of InformationField");
        }
    }

    public void setKey(sjy sjyVar) throws wch0 {
        if (sjyVar == null) {
            ohq.s("The parameter is null");
        } else if (sjyVar instanceof KeyField) {
            this.keyImpl = (KeyField) sjyVar;
        } else {
            ohq.s("The parameter must be an instance of KeyField");
        }
    }

    public void setMediaDescriptions(Vector vector) throws wch0 {
        if (vector != null) {
            this.mediaDescriptions = vector;
        } else {
            ohq.s("The parameter is null");
        }
    }

    public void setOrigin(ta80 ta80Var) throws wch0 {
        if (ta80Var == null) {
            ohq.s("The parameter is null");
        } else if (ta80Var instanceof OriginField) {
            this.originImpl = (OriginField) ta80Var;
        } else {
            ohq.s("The parameter must be an instance of OriginField");
        }
    }

    public void setPhones(Vector vector) throws wch0 {
        if (vector != null) {
            this.phoneList = vector;
        } else {
            ohq.s("The parameter is null");
        }
    }

    public void setSessionName(cki0 cki0Var) throws wch0 {
        if (cki0Var == null) {
            ohq.s("The parameter is null");
        } else if (cki0Var instanceof SessionNameField) {
            this.sessionNameImpl = (SessionNameField) cki0Var;
        } else {
            ohq.s("The parameter must be an instance of SessionNameField");
        }
    }

    public void setTimeDescriptions(Vector vector) throws wch0 {
        if (vector != null) {
            this.timeDescriptions = vector;
        } else {
            ohq.s("The parameter is null");
        }
    }

    public void setURI(o2t0 o2t0Var) throws wch0 {
        if (o2t0Var == null) {
            ohq.s("The parameter is null");
        } else if (o2t0Var instanceof URIField) {
            this.uriImpl = (URIField) o2t0Var;
        } else {
            ohq.s("The parameter must be an instance of URIField");
        }
    }

    public void setVersion(vbu0 vbu0Var) throws wch0 {
        if (vbu0Var == null) {
            ohq.s("The parameter is null");
        } else if (vbu0Var instanceof ProtoVersionField) {
            this.versionImpl = (ProtoVersionField) vbu0Var;
        } else {
            ohq.s("The parameter must be an instance of VersionField");
        }
    }

    public void setZoneAdjustments(Vector vector) throws wch0 {
        if (vector != null) {
            this.zoneAdjustments = vector;
        } else {
            ohq.s("The parameter is null");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String strEncodeVector = "";
        sb.append(getVersion() == null ? "" : getVersion().toString());
        sb.append(getOrigin() == null ? "" : getOrigin().toString());
        sb.append(getSessionName() == null ? "" : getSessionName().toString());
        sb.append(getInfo() == null ? "" : getInfo().toString());
        try {
            sb.append(getURI() == null ? "" : getURI().toString());
            sb.append(getEmails(false) == null ? "" : encodeVector(getEmails(false)));
            sb.append(getPhones(false) == null ? "" : encodeVector(getPhones(false)));
            sb.append(getConnection() == null ? "" : getConnection().toString());
            sb.append(getBandwidths(false) == null ? "" : encodeVector(getBandwidths(false)));
            sb.append(getTimeDescriptions(false) == null ? "" : encodeVector(getTimeDescriptions(false)));
            sb.append(getZoneAdjustments(false) == null ? "" : encodeVector(getZoneAdjustments(false)));
            sb.append(getKey() == null ? "" : getKey().toString());
            sb.append(getAttributes(false) == null ? "" : encodeVector(getAttributes(false)));
            if (getMediaDescriptions(false) != null) {
                strEncodeVector = encodeVector(getMediaDescriptions(false));
            }
            sb.append(strEncodeVector);
        } catch (wch0 unused) {
        }
        return sb.toString();
    }

    public SessionDescriptionImpl() {
    }
}
