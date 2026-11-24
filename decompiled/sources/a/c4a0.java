package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c4a0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c4a0 f3716a;
    private static final ugi0 descriptor;

    static {
        c4a0 c4a0Var = new c4a0();
        f3716a = c4a0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.cycling.impl.cycling_results.data.model.PlayerInfoResponse", c4a0Var, 3);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("country", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(fre.f10015a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        lre lreVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                lreVar = (lre) bldVarA.e(ugi0Var, 2, fre.f10015a, lreVar);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new g4a0(i, str, str2, lreVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        g4a0 g4a0Var = (g4a0) obj;
        g4a0Var.getClass();
        lre lreVar = g4a0Var.c;
        String str = g4a0Var.b;
        String str2 = g4a0Var.f10656a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || lreVar != null) {
            cldVarA.p(ugi0Var, 2, fre.f10015a, lreVar);
        }
        cldVarA.c(ugi0Var);
    }
}
