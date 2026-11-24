package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nir implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nir f23603a;
    private static final ugi0 descriptor;

    static {
        nir nirVar = new nir();
        f23603a = nirVar;
        zna0 zna0Var = new zna0("org.xplatform.web.impl.domain.models.gp_web_app.GPWebAppBonusRequest", nirVar, 3);
        zna0Var.j(Payload.TYPE, false);
        zna0Var.j("gameId", true);
        zna0Var.j("freeBetAmount", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{okx.f25427a, mrv.j0(s710.f31729a), mrv.j0(tbl.f33669a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        Long l = null;
        Double d = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new pir(i, iJ, l, d);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pir pirVar = (pir) obj;
        pirVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        int i = pirVar.f27057a;
        Double d = pirVar.c;
        Long l = pirVar.b;
        cldVarA.i(0, i, ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
