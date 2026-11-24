package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cks0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cks0 f4523a;
    private static final ugi0 descriptor;

    static {
        cks0 cks0Var = new cks0();
        f4523a = cks0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.transfers.data.model.TransfersResponse", cks0Var, 4);
        zna0Var.j("dateStamp", true);
        zna0Var.j("player", true);
        zna0Var.j("oldTeam", true);
        zna0Var.j("newTeam", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        jiy jiyVarJ1 = mrv.j0(qjs0.f28856a);
        rks0 rks0Var = rks0.f30663a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(rks0Var), mrv.j0(rks0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        sjs0 sjs0Var = null;
        tks0 tks0Var = null;
        tks0 tks0Var2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                sjs0Var = (sjs0) bldVarA.e(ugi0Var, 1, qjs0.f28856a, sjs0Var);
                i |= 2;
            } else if (iF == 2) {
                tks0Var = (tks0) bldVarA.e(ugi0Var, 2, rks0.f30663a, tks0Var);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                tks0Var2 = (tks0) bldVarA.e(ugi0Var, 3, rks0.f30663a, tks0Var2);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new eks0(i, l, sjs0Var, tks0Var, tks0Var2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        eks0 eks0Var = (eks0) obj;
        eks0Var.getClass();
        tks0 tks0Var = eks0Var.d;
        tks0 tks0Var2 = eks0Var.c;
        sjs0 sjs0Var = eks0Var.b;
        Long l = eks0Var.f7967a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || sjs0Var != null) {
            cldVarA.p(ugi0Var, 1, qjs0.f28856a, sjs0Var);
        }
        if (cldVarA.u(ugi0Var) || tks0Var2 != null) {
            cldVarA.p(ugi0Var, 2, rks0.f30663a, tks0Var2);
        }
        if (cldVarA.u(ugi0Var) || tks0Var != null) {
            cldVarA.p(ugi0Var, 3, rks0.f30663a, tks0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
