package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gea0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gea0 f11144a;
    private static final ugi0 descriptor;

    static {
        gea0 gea0Var = new gea0();
        f11144a = gea0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.player_transfers.data.model.PlayerTransfersTransferResponse", gea0Var, 5);
        zna0Var.j("date", true);
        zna0Var.j("dateStamp", true);
        zna0Var.j("player", true);
        zna0Var.j("oldTeam", true);
        zna0Var.j("newTeam", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        jiy jiyVarJ1 = mrv.j0(s710.f31729a);
        jiy jiyVarJ2 = mrv.j0(lda0.f19841a);
        bea0 bea0Var = bea0.f2440a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(bea0Var), mrv.j0(bea0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Long l = null;
        nda0 nda0Var = null;
        dea0 dea0Var = null;
        dea0 dea0Var2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            } else if (iF == 2) {
                nda0Var = (nda0) bldVarA.e(ugi0Var, 2, lda0.f19841a, nda0Var);
                i |= 4;
            } else if (iF == 3) {
                dea0Var = (dea0) bldVarA.e(ugi0Var, 3, bea0.f2440a, dea0Var);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                dea0Var2 = (dea0) bldVarA.e(ugi0Var, 4, bea0.f2440a, dea0Var2);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new iea0(i, str, l, nda0Var, dea0Var, dea0Var2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        iea0 iea0Var = (iea0) obj;
        iea0Var.getClass();
        dea0 dea0Var = iea0Var.e;
        dea0 dea0Var2 = iea0Var.d;
        nda0 nda0Var = iea0Var.c;
        Long l = iea0Var.b;
        String str = iea0Var.f14623a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || nda0Var != null) {
            cldVarA.p(ugi0Var, 2, lda0.f19841a, nda0Var);
        }
        if (cldVarA.u(ugi0Var) || dea0Var2 != null) {
            cldVarA.p(ugi0Var, 3, bea0.f2440a, dea0Var2);
        }
        if (cldVarA.u(ugi0Var) || dea0Var != null) {
            cldVarA.p(ugi0Var, 4, bea0.f2440a, dea0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
