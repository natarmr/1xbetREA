package android.gov.nist.javax.sdp.fields;

import a.b1j;
import a.ohq;
import a.ua80;
import a.wch0;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import java.io.Serializable;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class PreconditionFields implements Serializable {
    public static final int DIRECTION_NONE = 0;
    public static final int DIRECTION_RECV = 2;
    public static final int DIRECTION_SEND = 1;
    public static final int DIRECTION_SENDRECV = 3;
    public static final int PRECONDITION_QOS = 0;
    public static final int STATUS_E2E = 0;
    public static final int STATUS_LOCAL = 1;
    public static final int STATUS_REMOTE = 2;
    public static final int STRENGTH_FAILURE = 1;
    public static final int STRENGTH_MANDATORY = 4;
    public static final int STRENGTH_NONE = 2;
    public static final int STRENGTH_OPTIONAL = 3;
    public static final int STRENGTH_UNKNOWN = 0;
    protected Vector preconditionAttributes = new Vector();
    public static final String[] STRENGTH = {"unknown", "failure", "none", ParameterNames.OPTIONAL, "mandatory"};
    public static final String[] DIRECTION = {"none", "send", "recv", "sendrecv"};
    public static final String[] STATUS = {"e2e", "local", "remote"};
    public static final String[] PRECONDITION = {"qos"};

    public Vector getPreconditionConfirmStatus() {
        if (this.preconditionAttributes == null) {
            return null;
        }
        Vector vector = new Vector();
        for (int i = 0; i < this.preconditionAttributes.size(); i++) {
            AttributeField attributeField = (AttributeField) this.preconditionAttributes.elementAt(i);
            if (attributeField.getAttribute().getName().equals("conf")) {
                vector.addElement(attributeField);
            }
        }
        if (vector.size() == 0) {
            return null;
        }
        return vector;
    }

    public Vector getPreconditionCurr(String str) throws wch0 {
        if (str == null) {
            ohq.s("The status-type is null");
            return null;
        }
        if (this.preconditionAttributes == null) {
            return null;
        }
        Vector vector = new Vector();
        for (int i = 0; i < this.preconditionAttributes.size(); i++) {
            AttributeField attributeField = (AttributeField) this.preconditionAttributes.elementAt(i);
            if (attributeField.getAttribute().getName().equals("curr") && attributeField.getValue().indexOf(str) != -1) {
                vector.addElement(attributeField);
            }
        }
        if (vector.size() == 0) {
            return null;
        }
        return vector;
    }

    public Vector getPreconditionDes(String str) throws wch0 {
        if (str == null) {
            ohq.s("The status-type is null");
            return null;
        }
        if (this.preconditionAttributes == null) {
            return null;
        }
        Vector vector = new Vector();
        for (int i = 0; i < this.preconditionAttributes.size(); i++) {
            AttributeField attributeField = (AttributeField) this.preconditionAttributes.elementAt(i);
            if (attributeField.getAttribute().getName().equals("des") && attributeField.getValue().indexOf(str) != -1) {
                vector.addElement(attributeField);
            }
        }
        if (vector.size() == 0) {
            return null;
        }
        return vector;
    }

    public int getPreconditionSize() {
        Vector vector = this.preconditionAttributes;
        if (vector != null) {
            return vector.size();
        }
        return -1;
    }

    public Vector getPreconditions() {
        return this.preconditionAttributes;
    }

    public void setPreconditionConfirmStatus(String str, String str2) throws wch0 {
        if (str == null || str2.length() == 0) {
            ohq.s("The status-type is null");
            return;
        }
        if (str2.length() == 0) {
            ohq.s("The direction-tag is null");
            return;
        }
        if (this.preconditionAttributes == null) {
            ohq.s("Precondition Attributes is null");
            return;
        }
        int i = 0;
        while (i < this.preconditionAttributes.size()) {
            AttributeField attributeField = (AttributeField) this.preconditionAttributes.elementAt(i);
            if (attributeField.getAttribute().getName().equals("conf") && attributeField.getValue().indexOf(str) != -1) {
                if (attributeField.getValue().indexOf(str2) != -1) {
                    break;
                }
                attributeField.setValue("qos " + str + Separators.SP + str2);
                this.preconditionAttributes.setElementAt(attributeField, i);
                break;
            }
            i++;
        }
        if (i == this.preconditionAttributes.size()) {
            NameValue nameValue = new NameValue("conf", ua80.i("qos ", str, Separators.SP, str2));
            AttributeField attributeField2 = new AttributeField();
            attributeField2.setAttribute(nameValue);
            this.preconditionAttributes.add(attributeField2);
        }
    }

    public void setPreconditionCurr(String str, String str2) throws wch0 {
        if (str == null) {
            ohq.s("The status-type is null");
            return;
        }
        if (str2 == null) {
            ohq.s("The direction-tag is null");
            return;
        }
        if (this.preconditionAttributes == null) {
            ohq.s("Precondition Attributes is null");
            return;
        }
        int i = 0;
        while (i < this.preconditionAttributes.size()) {
            AttributeField attributeField = (AttributeField) this.preconditionAttributes.elementAt(i);
            if (attributeField.getAttribute().getName().equals("curr") && attributeField.getValue().indexOf(str) != -1) {
                if (attributeField.getValue().indexOf(str2) != -1) {
                    break;
                }
                attributeField.setValue("qos " + str + Separators.SP + str2);
                this.preconditionAttributes.setElementAt(attributeField, i);
            }
            i++;
        }
        if (i == this.preconditionAttributes.size()) {
            NameValue nameValue = new NameValue("curr", ua80.i("qos ", str, Separators.SP, str2));
            AttributeField attributeField2 = new AttributeField();
            attributeField2.setAttribute(nameValue);
            this.preconditionAttributes.add(attributeField2);
        }
    }

    public void setPreconditionDes(String str, String str2, String str3) throws wch0 {
        Vector vector;
        if (str == null) {
            ohq.s("The strength-tag is null");
            return;
        }
        if (str2 == null) {
            ohq.s("The status-type is null");
            return;
        }
        if (str3 == null) {
            ohq.s("The direction-tag is null");
            return;
        }
        if (this.preconditionAttributes == null) {
            ohq.s("Precondition Attributes is null");
            return;
        }
        int i = 0;
        while (true) {
            int size = this.preconditionAttributes.size();
            vector = this.preconditionAttributes;
            if (i >= size) {
                break;
            }
            AttributeField attributeField = (AttributeField) vector.elementAt(i);
            if (attributeField.getAttribute().getName().equals("des") && attributeField.getValue().indexOf(str2) != -1) {
                StringBuilder sbN = b1j.n("qos ", str, Separators.SP, str2, Separators.SP);
                sbN.append(str3);
                attributeField.setValue(sbN.toString());
                this.preconditionAttributes.setElementAt(attributeField, i);
            }
            i++;
        }
        if (i == vector.size()) {
            StringBuilder sbN2 = b1j.n("qos ", str, Separators.SP, str2, Separators.SP);
            sbN2.append(str3);
            NameValue nameValue = new NameValue("des", sbN2.toString());
            AttributeField attributeField2 = new AttributeField();
            attributeField2.setAttribute(nameValue);
            this.preconditionAttributes.add(attributeField2);
        }
    }

    public void setPreconditions(Vector vector) {
        if (vector != null) {
            this.preconditionAttributes = vector;
        } else {
            ohq.s("Precondition attributes are null");
        }
    }

    public void setPreconditionDes(String str) throws wch0 {
        if (str != null) {
            if (this.preconditionAttributes != null) {
                try {
                    String[] strArrSplit = str.split(Separators.SP);
                    setPreconditionDes(strArrSplit[1], strArrSplit[2], strArrSplit[3]);
                    return;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new wch0("Error spliting the \"des\" attribute into words", e);
                }
            }
            ohq.s("The Precondition Attributes is null");
            return;
        }
        ohq.s("The Precondition \"des\" attribute value is null");
    }

    public void setPreconditionCurr(String str) throws wch0 {
        if (str != null) {
            if (this.preconditionAttributes != null) {
                try {
                    String[] strArrSplit = str.split(Separators.SP);
                    setPreconditionCurr(strArrSplit[1], strArrSplit[2]);
                    return;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new wch0("Error spliting the \"curr\" attribute into words", e);
                }
            }
            ohq.s("The Precondition Attributes is null");
            return;
        }
        ohq.s("The Precondition \"curr\" attribute value is null");
    }

    public void setPreconditionConfirmStatus(String str) throws wch0 {
        if (str != null && str.length() != 0) {
            if (this.preconditionAttributes != null) {
                try {
                    String[] strArrSplit = str.split(Separators.SP);
                    setPreconditionConfirmStatus(strArrSplit[1], strArrSplit[2]);
                    return;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new wch0("Error spliting the \"conf\" attribute into words", e);
                }
            }
            ohq.s("The Precondition Attributes is null");
            return;
        }
        ohq.s("The Precondition \"conf\" attribute value is null");
    }
}
