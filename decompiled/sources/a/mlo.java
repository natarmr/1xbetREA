package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mlo implements sg00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22001a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ mlo(byte b, boolean z) {
        this.f22001a = b;
        this.b = z;
    }

    @Override // a.sg00
    public final void invoke(Object obj) {
        byte b = this.f22001a;
        boolean z = this.b;
        ky90 ky90Var = (ky90) obj;
        switch (b) {
            case 0:
                ky90Var.g(z);
                break;
            default:
                ky90Var.m(z);
                break;
        }
    }
}
