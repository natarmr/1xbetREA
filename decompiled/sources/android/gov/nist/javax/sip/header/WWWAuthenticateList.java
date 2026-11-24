package android.gov.nist.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public class WWWAuthenticateList extends SIPHeaderList<WWWAuthenticate> {
    private static final long serialVersionUID = -6978902284285501346L;

    public WWWAuthenticateList() {
        super(WWWAuthenticate.class, "WWW-Authenticate");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeaderList, android.gov.nist.core.GenericObject
    public Object clone() {
        return new WWWAuthenticateList().clonehlist(this.hlist);
    }
}
