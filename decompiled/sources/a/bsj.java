package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bsj implements sg00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3132a;
    public final /* synthetic */ int b;

    public /* synthetic */ bsj(ft2 ft2Var, int i, ly90 ly90Var, ly90 ly90Var2) {
        this.f3132a = (byte) 0;
        this.b = i;
    }

    @Override // a.sg00
    public final void invoke(Object obj) {
        byte b = this.f3132a;
        int i = this.b;
        switch (b) {
            case 0:
                gt2 gt2Var = (gt2) obj;
                gt2Var.getClass();
                kn30 kn30Var = (kn30) gt2Var;
                if (i == 1) {
                    kn30Var.v = true;
                }
                kn30Var.l = i;
                break;
            case 1:
                ((ky90) obj).D(i);
                break;
            default:
                ((ky90) obj).e(i);
                break;
        }
    }

    public /* synthetic */ bsj(int i, byte b) {
        this.f3132a = b;
        this.b = i;
    }
}
