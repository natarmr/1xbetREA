package android.gov.nist.javax.sip.header;

import a.axq;
import a.brm0;
import a.hny;
import android.gov.nist.core.Separators;
import android.javax.sip.header.SupportedHeader;

/* JADX INFO: loaded from: classes.dex */
public class Supported extends SIPHeader implements SupportedHeader {
    private static final long serialVersionUID = -7679667592702854542L;
    protected String optionTag;

    public Supported() {
        super("Supported");
        this.optionTag = null;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String strN = axq.n(new StringBuilder(), this.headerName, Separators.COLON);
        if (this.optionTag != null) {
            StringBuilder sbT = brm0.t(strN, Separators.SP);
            sbT.append(this.optionTag);
            strN = sbT.toString();
        }
        return strN.concat(Separators.NEWLINE);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        String str = this.optionTag;
        if (str != null) {
            sb.append(str);
            return sb;
        }
        sb.append("");
        return sb;
    }

    @Override // android.javax.sip.header.OptionTag
    public String getOptionTag() {
        return this.optionTag;
    }

    @Override // android.javax.sip.header.OptionTag
    public void setOptionTag(String str) {
        if (str != null) {
            this.optionTag = str;
        } else {
            hny.u("JAIN-SIP Exception, Supported, setOptionTag(), the optionTag parameter is null");
        }
    }

    public Supported(String str) {
        super("Supported");
        this.optionTag = str;
    }
}
