package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qbv implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qbv f28457a;
    private static final ugi0 descriptor;

    static {
        qbv qbvVar = new qbv();
        f28457a = qbvVar;
        zna0 zna0Var = new zna0("org.xplatform.web.impl.domain.models.gp_web_app.GpWebAppBonusData", qbvVar, 2);
        zna0Var.j(Payload.TYPE, false);
        zna0Var.j("value", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{okx.f25427a, mrv.j0(tbl.f33669a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        Double d = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
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
        return new sbv(i, iJ, d);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        sbv sbvVar = (sbv) obj;
        sbvVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        int i = sbvVar.f31955a;
        Double d = sbvVar.b;
        cldVarA.i(0, i, ugi0Var);
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
