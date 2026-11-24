package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class px5 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final px5 f27738a;
    private static final ugi0 descriptor;

    static {
        px5 px5Var = new px5();
        f27738a = px5Var;
        descriptor = new zna0("org.xplatform.onexuser.data.models.base.BaseEmptyRequest", px5Var, 0);
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[0];
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int iF = bldVarA.f(ugi0Var);
        if (iF == -1) {
            bldVarA.c(ugi0Var);
            return new rx5();
        }
        itt0.c(iF);
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ((rx5) obj).getClass();
        ugi0 ugi0Var = descriptor;
        bwnVar.a(ugi0Var).c(ugi0Var);
    }
}
