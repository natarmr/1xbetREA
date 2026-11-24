package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nfd implements jgd, sg00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23430a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nfd(ft2 ft2Var, Object obj, long j) {
        this.f23430a = (byte) 2;
        this.b = obj;
    }

    @Override // a.sg00
    public void invoke(Object obj) {
        ((gt2) obj).getClass();
    }

    @Override // a.jgd
    public Object x0(pzu pzuVar) {
        byte b = this.f23430a;
        return this.b;
    }

    public /* synthetic */ nfd(Object obj, byte b) {
        this.f23430a = b;
        this.b = obj;
    }
}
