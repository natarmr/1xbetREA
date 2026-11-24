package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pd40 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pd40 f26790a;
    private static final ugi0 descriptor;

    static {
        pd40 pd40Var = new pd40();
        f26790a = pd40Var;
        zna0 zna0Var = new zna0("org.xplatform.fatmananalytics.impl.data.models.MetadataPackageRequest", pd40Var, 3);
        zna0Var.j("e", false);
        zna0Var.j("ts", false);
        zna0Var.j("m", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{s710Var, s710Var, gdy.f11125a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        long jR = 0;
        long jR2 = 0;
        edy edyVar = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                jR2 = bldVarA.r(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                edyVar = (edy) bldVarA.m(ugi0Var, 2, gdy.f11125a, edyVar);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new rd40(i, jR, jR2, edyVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rd40 rd40Var = (rd40) obj;
        rd40Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, rd40Var.f30273a);
        cldVarA.n(ugi0Var, 1, rd40Var.b);
        cldVarA.m(ugi0Var, 2, gdy.f11125a, rd40Var.c);
        cldVarA.c(ugi0Var);
    }
}
