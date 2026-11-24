package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class owh implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final owh f25964a;
    private static final ugi0 descriptor;

    static {
        owh owhVar = new owh();
        f25964a = owhVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.cycling.impl.cycling_menu.data.model.CyclingResponse", owhVar, 2);
        zna0Var.j("sportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0(zxh.f45158a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        byh byhVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                byhVar = (byh) bldVarA.e(ugi0Var, 1, zxh.f45158a, byhVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new swh(i, l, byhVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        swh swhVar = (swh) obj;
        swhVar.getClass();
        byh byhVar = swhVar.b;
        Long l = swhVar.f32921a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || byhVar != null) {
            cldVarA.p(ugi0Var, 1, zxh.f45158a, byhVar);
        }
        cldVarA.c(ugi0Var);
    }
}
