package android.gov.nist.javax.sip.header;

import a.hny;
import android.javax.sip.header.OrganizationHeader;

/* JADX INFO: loaded from: classes.dex */
public class Organization extends SIPHeader implements OrganizationHeader {
    private static final long serialVersionUID = -2775003113740192712L;
    protected String organization;

    public Organization() {
        super("Organization");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(this.organization);
        return sb;
    }

    @Override // android.javax.sip.header.OrganizationHeader
    public String getOrganization() {
        return this.organization;
    }

    @Override // android.javax.sip.header.OrganizationHeader
    public void setOrganization(String str) {
        if (str != null) {
            this.organization = str;
        } else {
            hny.u("JAIN-SIP Exception, Organization, setOrganization(), the organization parameter is null");
        }
    }
}
