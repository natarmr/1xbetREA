package android.gov.nist.javax.sip.header;

import a.hny;
import android.javax.sip.header.RequireHeader;

/* JADX INFO: loaded from: classes.dex */
public class Require extends SIPHeader implements RequireHeader {
    private static final long serialVersionUID = -3743425404884053281L;
    protected String optionTag;

    public Require(String str) {
        super("Require");
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
            hny.u("JAIN-SIP Exception, Require, setOptionTag(), the optionTag parameter is null");
        }
    }

    public Require() {
        super("Require");
    }
}
