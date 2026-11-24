package android.gov.nist.javax.sip.header;

import a.hny;
import android.javax.sip.header.ProxyRequireHeader;

/* JADX INFO: loaded from: classes.dex */
public class ProxyRequire extends SIPHeader implements ProxyRequireHeader {
    private static final long serialVersionUID = -3269274234851067893L;
    protected String optionTag;

    public ProxyRequire(String str) {
        super("Proxy-Require");
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
            hny.u("JAIN-SIP Exception, ProxyRequire, setOptionTag(), the optionTag parameter is null");
        }
    }

    public ProxyRequire() {
        super("Proxy-Require");
    }
}
