package android.gov.nist.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public class SupportedList extends SIPHeaderList<Supported> {
    private static final long serialVersionUID = -4539299544895602367L;

    public SupportedList() {
        super(Supported.class, "Supported");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeaderList, android.gov.nist.core.GenericObject
    public Object clone() {
        SupportedList supportedList = new SupportedList();
        supportedList.clonehlist(this.hlist);
        return supportedList;
    }
}
