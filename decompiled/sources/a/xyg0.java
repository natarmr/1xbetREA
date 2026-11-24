package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xyg0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xyg0 f41704a;
    private static final ugi0 descriptor;

    static {
        xyg0 xyg0Var = new xyg0();
        f41704a = xyg0Var;
        zna0 zna0Var = new zna0("org.xplatform.analytics.data.model.SaveUserReactionRequest", xyg0Var, 2);
        zna0Var.j("TaskId", false);
        zna0Var.j("Reaction", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ysm0.f43175a, iae0.f14435a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        hae0 hae0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                hae0Var = (hae0) bldVarA.m(ugi0Var, 1, iae0.f14435a, hae0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new zyg0(i, hae0Var, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zyg0 zyg0Var = (zyg0) obj;
        zyg0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, zyg0Var.f45204a);
        cldVarA.m(ugi0Var, 1, iae0.f14435a, zyg0Var.b);
        cldVarA.c(ugi0Var);
    }
}
