package a;

/* JADX INFO: loaded from: classes2.dex */
public final class fys0 extends xnm0 {
    public static final fys0 b = new fys0(0);
    public static final fys0 c = new fys0(1);
    public static final fys0 d = new fys0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10376a;

    public /* synthetic */ fys0(byte b2) {
        this.f10376a = b2;
    }

    @Override // a.xnm0
    public final dcg0 n(gys0 gys0Var, aty atyVar) {
        switch (this.f10376a) {
            case 0:
                gys0Var.getClass();
                atyVar.getClass();
                return gys0Var.c.m0(atyVar);
            case 1:
                gys0Var.getClass();
                atyVar.getClass();
                throw new UnsupportedOperationException("Should not be called");
            default:
                gys0Var.getClass();
                atyVar.getClass();
                return gys0Var.c.W(atyVar);
        }
    }
}
