package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zbq implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zbq f44128a;
    private static final ugi0 descriptor;

    static {
        zbq zbqVar = new zbq();
        f44128a = zbqVar;
        zna0 zna0Var = new zna0("org.xplatform.feature.fin_bet.impl.data.model.FinanceGraphPointResponse", zbqVar, 2);
        zna0Var.j("P", true);
        zna0Var.j(TokenNames.T, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(klq.f18504a), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Float f = null;
        Long l = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                f = (Float) bldVarA.e(ugi0Var, 0, klq.f18504a, f);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new bcq(i, f, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bcq bcqVar = (bcq) obj;
        bcqVar.getClass();
        Long l = bcqVar.b;
        Float f = bcqVar.f2365a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 0, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
