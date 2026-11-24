package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dff implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dff f5997a;
    private static final ugi0 descriptor;

    static {
        dff dffVar = new dff();
        f5997a = dffVar;
        zna0 zna0Var = new zna0("org.xplatform.crystal.data.models.resquests.CrystalGameRequest", dffVar, 3);
        zna0Var.j("BAC", false);
        zna0Var.j("BS", true);
        zna0Var.j("BINF", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a, mrv.j0(tbl.f33669a), mrv.j0(zf8.f44290a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        long jR = 0;
        bg8 bg8Var = null;
        Double d = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                bg8Var = (bg8) bldVarA.e(ugi0Var, 2, zf8.f44290a, bg8Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new fff(i, jR, bg8Var, d);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fff fffVar = (fff) obj;
        fffVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        long j = fffVar.f9444a;
        bg8 bg8Var = fffVar.c;
        Double d = fffVar.b;
        cldVarA.n(ugi0Var, 0, j);
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || bg8Var != null) {
            cldVarA.p(ugi0Var, 2, zf8.f44290a, bg8Var);
        }
        cldVarA.c(ugi0Var);
    }
}
