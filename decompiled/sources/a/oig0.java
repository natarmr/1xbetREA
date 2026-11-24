package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oig0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oig0 f25310a;
    private static final ugi0 descriptor;

    static {
        oig0 oig0Var = new oig0();
        f25310a = oig0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.rps.RpsGameInformationResponse", oig0Var, 4);
        zna0Var.j("P1", true);
        zna0Var.j("P2", true);
        zna0Var.j("P3", true);
        zna0Var.j(TokenNames.R, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        rjg0 rjg0Var = rjg0.f30592a;
        return new jiy[]{mrv.j0(rjg0Var), mrv.j0(rjg0Var), mrv.j0(rjg0Var), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        tjg0 tjg0Var = null;
        tjg0 tjg0Var2 = null;
        tjg0 tjg0Var3 = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                tjg0Var = (tjg0) bldVarA.e(ugi0Var, 0, rjg0.f30592a, tjg0Var);
                i |= 1;
            } else if (iF == 1) {
                tjg0Var2 = (tjg0) bldVarA.e(ugi0Var, 1, rjg0.f30592a, tjg0Var2);
                i |= 2;
            } else if (iF == 2) {
                tjg0Var3 = (tjg0) bldVarA.e(ugi0Var, 2, rjg0.f30592a, tjg0Var3);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new qig0(i, tjg0Var, tjg0Var2, tjg0Var3, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qig0 qig0Var = (qig0) obj;
        qig0Var.getClass();
        Integer num = qig0Var.d;
        tjg0 tjg0Var = qig0Var.c;
        tjg0 tjg0Var2 = qig0Var.b;
        tjg0 tjg0Var3 = qig0Var.f28791a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || tjg0Var3 != null) {
            cldVarA.p(ugi0Var, 0, rjg0.f30592a, tjg0Var3);
        }
        if (cldVarA.u(ugi0Var) || tjg0Var2 != null) {
            cldVarA.p(ugi0Var, 1, rjg0.f30592a, tjg0Var2);
        }
        if (cldVarA.u(ugi0Var) || tjg0Var != null) {
            cldVarA.p(ugi0Var, 2, rjg0.f30592a, tjg0Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
