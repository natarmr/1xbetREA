package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b0m0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0m0 f1771a;
    private static final ugi0 descriptor;

    static {
        b0m0 b0m0Var = new b0m0();
        f1771a = b0m0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.stage.impl.core.navigation.StageNetBottomSheetRoute", b0m0Var, 2);
        zna0Var.j("title", false);
        zna0Var.j("sportId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ysm0.f43175a, s710.f31729a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        long jR = 0;
        boolean z = true;
        int i = 0;
        String strX = null;
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
                jR = bldVarA.r(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new d0m0(strX, i, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        d0m0 d0m0Var = (d0m0) obj;
        d0m0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, d0m0Var.f5275a);
        cldVarA.n(ugi0Var, 1, d0m0Var.b);
        cldVarA.c(ugi0Var);
    }
}
