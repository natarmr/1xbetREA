package android.gov.nist.javax.sip.header;

import a.hny;
import android.javax.sip.header.UnsupportedHeader;

/* JADX INFO: loaded from: classes.dex */
public class Unsupported extends SIPHeader implements UnsupportedHeader {
    private static final long serialVersionUID = -2479414149440236199L;
    protected String optionTag;

    public Unsupported(String str) {
        super("Unsupported");
        this.optionTag = str;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(this.optionTag);
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
            hny.u("JAIN-SIP Exception,  Unsupported, setOptionTag(), The option tag parameter is null");
        }
    }

    public Unsupported() {
        super("Unsupported");
    }
}
