package android.gov.nist.javax.sip.header.ims;

import a.hny;
import android.gov.nist.core.NameValue;
import android.gov.nist.javax.sip.header.ParametersHeader;
import android.javax.sip.header.ExtensionHeader;
import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public class PChargingFunctionAddresses extends ParametersHeader implements PChargingFunctionAddressesHeader, SIPHeaderNamesIms, ExtensionHeader {
    public PChargingFunctionAddresses() {
        super("P-Charging-Function-Addresses");
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void addChargingCollectionFunctionAddress(String str) {
        if (str != null) {
            this.parameters.set(ParameterNamesIms.CCF, str);
        } else {
            hny.u("JAIN-SIP Exception, P-Charging-Function-Addresses, setChargingCollectionFunctionAddress(), the ccfAddress parameter is null.");
        }
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void addEventChargingFunctionAddress(String str) {
        if (str != null) {
            this.parameters.set(ParameterNamesIms.ECF, str);
        } else {
            hny.u("JAIN-SIP Exception, P-Charging-Function-Addresses, setEventChargingFunctionAddress(), the ecfAddress parameter is null.");
        }
    }

    public boolean delete(String str, String str2) {
        Iterator<NameValue> it = this.parameters.iterator();
        boolean z = false;
        while (it.hasNext()) {
            NameValue next = it.next();
            if (((String) next.getValueAsObject()).equalsIgnoreCase(str) && next.getName().equalsIgnoreCase(str2)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        if (!this.duplicates.isEmpty()) {
            this.duplicates.encode(sb);
        }
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public ListIterator getChargingCollectionFunctionAddresses() {
        LinkedList linkedList = new LinkedList();
        for (NameValue nameValue : this.parameters) {
            if (nameValue.getName().equalsIgnoreCase(ParameterNamesIms.CCF)) {
                NameValue nameValue2 = new NameValue();
                nameValue2.setName(nameValue.getName());
                nameValue2.setValueAsObject(nameValue.getValueAsObject());
                linkedList.add(nameValue2);
            }
        }
        return linkedList.listIterator();
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public ListIterator<NameValue> getEventChargingFunctionAddresses() {
        LinkedList linkedList = new LinkedList();
        ListIterator<NameValue> listIterator = linkedList.listIterator();
        for (NameValue nameValue : this.parameters) {
            if (nameValue.getName().equalsIgnoreCase(ParameterNamesIms.ECF)) {
                NameValue nameValue2 = new NameValue();
                nameValue2.setName(nameValue.getName());
                nameValue2.setValueAsObject(nameValue.getValueAsObject());
                listIterator.add(nameValue2);
            }
        }
        return listIterator;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void removeChargingCollectionFunctionAddress(String str) throws ParseException {
        if (str == null) {
            hny.u("JAIN-SIP Exception, P-Charging-Function-Addresses, setChargingCollectionFunctionAddress(), the ccfAddress parameter is null.");
        } else {
            if (delete(str, ParameterNamesIms.CCF)) {
                return;
            }
            hny.j(0, "CCF Address Not Removed");
        }
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void removeEventChargingFunctionAddress(String str) throws ParseException {
        if (str == null) {
            hny.u("JAIN-SIP Exception, P-Charging-Function-Addresses, setEventChargingFunctionAddress(), the ecfAddress parameter is null.");
        } else {
            if (delete(str, ParameterNamesIms.ECF)) {
                return;
            }
            hny.j(0, "ECF Address Not Removed");
        }
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void setChargingCollectionFunctionAddress(String str) {
        if (str != null) {
            setMultiParameter(ParameterNamesIms.CCF, str);
        } else {
            hny.u("JAIN-SIP Exception, P-Charging-Function-Addresses, setChargingCollectionFunctionAddress(), the ccfAddress parameter is null.");
        }
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void setEventChargingFunctionAddress(String str) {
        if (str != null) {
            setMultiParameter(ParameterNamesIms.ECF, str);
        } else {
            hny.u("JAIN-SIP Exception, P-Charging-Function-Addresses, setEventChargingFunctionAddress(), the ecfAddress parameter is null.");
        }
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }
}
