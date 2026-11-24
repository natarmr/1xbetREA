package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class eft implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eft f7733a;
    private static final ugi0 descriptor;

    static {
        eft eftVar = new eft();
        f7733a = eftVar;
        zna0 zna0Var = new zna0("org.xplatform.tile_matching.data.response.gems_odyssey.GemsOdysseyCoeffStartInfoResponse", eftVar, 2);
        zna0Var.j("Key", true);
        zna0Var.j("Value", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(tbl.f33669a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Double d = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new gft(i, d, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gft gftVar = (gft) obj;
        gftVar.getClass();
        Double d = gftVar.b;
        String str = gftVar.f11221a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
