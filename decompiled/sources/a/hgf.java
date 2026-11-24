package a;

import android.gov.nist.javax.sip.ListeningPointExt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hgf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hgf f13016a;
    private static final ugi0 descriptor;

    static {
        hgf hgfVar = new hgf();
        f13016a = hgfVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.crystal.CrystalMatrixResponse", hgfVar, 4);
        zna0Var.j("Cr", true);
        zna0Var.j("Row", true);
        zna0Var.j("Col", true);
        zna0Var.j(ListeningPointExt.WS, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            } else if (iF == 2) {
                num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                num4 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num4);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new jgf(i, num, num2, num3, num4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jgf jgfVar = (jgf) obj;
        jgfVar.getClass();
        Integer num = jgfVar.d;
        Integer num2 = jgfVar.c;
        Integer num3 = jgfVar.b;
        Integer num4 = jgfVar.f16475a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
