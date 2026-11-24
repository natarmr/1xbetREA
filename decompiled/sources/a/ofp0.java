package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ofp0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ofp0 f25181a;
    private static final ugi0 descriptor;

    static {
        ofp0 ofp0Var = new ofp0();
        f25181a = ofp0Var;
        zna0 zna0Var = new zna0("org.xplatform.favorites.impl.data.teambet.models.TeamMenuResponse", ofp0Var, 3);
        zna0Var.j("sportId", true);
        zna0Var.j("subSportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ffp0.f9457a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        hfp0 hfp0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                hfp0Var = (hfp0) bldVarA.e(ugi0Var, 2, ffp0.f9457a, hfp0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new qfp0(i, l, l2, hfp0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qfp0 qfp0Var = (qfp0) obj;
        qfp0Var.getClass();
        hfp0 hfp0Var = qfp0Var.c;
        Long l = qfp0Var.b;
        Long l2 = qfp0Var.f28648a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || hfp0Var != null) {
            cldVarA.p(ugi0Var, 2, ffp0.f9457a, hfp0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
