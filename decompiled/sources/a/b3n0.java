package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b3n0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b3n0 f1916a;
    private static final ugi0 descriptor;

    static {
        b3n0 b3n0Var = new b3n0();
        f1916a = b3n0Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.dictionaries.sport.domain.model.SubSportModel", b3n0Var, 3);
        zna0Var.j("subSportId", false);
        zna0Var.j("name", false);
        zna0Var.j("sportImageModel", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a, ysm0.f43175a, jel0.f16380a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        long jR = 0;
        String strX = null;
        lel0 lel0Var = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                lel0Var = (lel0) bldVarA.m(ugi0Var, 2, jel0.f16380a, lel0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new f3n0(i, jR, strX, lel0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        f3n0 f3n0Var = (f3n0) obj;
        f3n0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, f3n0Var.f8872a);
        cldVarA.z(ugi0Var, 1, f3n0Var.b);
        cldVarA.m(ugi0Var, 2, jel0.f16380a, f3n0Var.c);
        cldVarA.c(ugi0Var);
    }
}
