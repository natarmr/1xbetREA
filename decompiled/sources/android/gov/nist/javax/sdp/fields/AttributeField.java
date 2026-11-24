package android.gov.nist.javax.sdp.fields;

import a.ohq;
import a.qqp;
import a.v4i0;
import a.wch0;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public class AttributeField extends SDPField implements qqp {
    protected NameValue attribute;

    public AttributeField() {
        super(SDPFieldNames.ATTRIBUTE_FIELD);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        AttributeField attributeField = (AttributeField) super.clone();
        NameValue nameValue = this.attribute;
        if (nameValue != null) {
            attributeField.attribute = (NameValue) nameValue.clone();
        }
        return attributeField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        NameValue nameValue = this.attribute;
        String str = SDPFieldNames.ATTRIBUTE_FIELD;
        if (nameValue != null) {
            str = SDPFieldNames.ATTRIBUTE_FIELD + this.attribute.encode();
        }
        return str.concat(Separators.NEWLINE);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        boolean zEquals;
        if (!(obj instanceof AttributeField)) {
            return false;
        }
        AttributeField attributeField = (AttributeField) obj;
        boolean zEqualsIgnoreCase = attributeField.getAttribute().getName().equalsIgnoreCase(getAttribute().getName());
        if (getAttribute().getValueAsObject() != null) {
            zEquals = getAttribute().getValueAsObject().equals(attributeField.getAttribute().getValueAsObject());
        } else {
            zEquals = attributeField.getAttribute().getValueAsObject() == null;
        }
        return zEqualsIgnoreCase && zEquals;
    }

    public NameValue getAttribute() {
        return this.attribute;
    }

    public String getName() {
        String name;
        NameValue attribute = getAttribute();
        if (attribute == null || (name = attribute.getName()) == null) {
            return null;
        }
        return name;
    }

    public String getValue() {
        Object valueAsObject;
        NameValue attribute = getAttribute();
        if (attribute == null || (valueAsObject = attribute.getValueAsObject()) == null) {
            return null;
        }
        return valueAsObject instanceof String ? (String) valueAsObject : valueAsObject.toString();
    }

    public boolean hasValue() {
        NameValue attribute = getAttribute();
        return (attribute == null || attribute.getValueAsObject() == null) ? false : true;
    }

    public int hashCode() {
        if (getAttribute() != null) {
            return encode().hashCode();
        }
        v4i0.p("Attribute is null cannot compute hashCode ");
        return 0;
    }

    public void setAttribute(NameValue nameValue) {
        this.attribute = nameValue;
        nameValue.setSeparator(Separators.COLON);
    }

    public void setName(String str) throws wch0 {
        if (str == null) {
            ohq.s("The name is null");
            return;
        }
        NameValue attribute = getAttribute();
        if (attribute == null) {
            attribute = new NameValue();
        }
        attribute.setName(str);
        setAttribute(attribute);
    }

    public void setValue(String str) throws wch0 {
        if (str == null) {
            ohq.s("The value is null");
            return;
        }
        NameValue attribute = getAttribute();
        if (attribute == null) {
            attribute = new NameValue();
        }
        attribute.setValueAsObject(str);
        setAttribute(attribute);
    }

    public void setValueAllowNull(String str) {
        NameValue attribute = getAttribute();
        if (attribute == null) {
            attribute = new NameValue();
        }
        attribute.setValueAsObject(str);
        setAttribute(attribute);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject
    public String toString() {
        return encode();
    }
}
