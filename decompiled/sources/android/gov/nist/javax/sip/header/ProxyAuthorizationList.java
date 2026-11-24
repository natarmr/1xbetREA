package android.gov.nist.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public class ProxyAuthorizationList extends SIPHeaderList<ProxyAuthorization> {
    private static final long serialVersionUID = -1;

    public ProxyAuthorizationList() {
        super(ProxyAuthorization.class, "Proxy-Authorization");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeaderList, android.gov.nist.core.GenericObject
    public Object clone() {
        ProxyAuthorizationList proxyAuthorizationList = new ProxyAuthorizationList();
        proxyAuthorizationList.clonehlist(this.hlist);
        return proxyAuthorizationList;
    }
}
