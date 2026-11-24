package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pk6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pk6 f27120a;
    private static final ugi0 descriptor;

    static {
        pk6 pk6Var = new pk6();
        f27120a = pk6Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.betbuilder.game_info.BetBuilderPenaltyResponse", pk6Var, 2);
        zna0Var.j("score", true);
        zna0Var.j("shots", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ih6.f14767a), mrv.j0((jiy) rk6.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = rk6.c;
        boolean z = true;
        int i = 0;
        kh6 kh6Var = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                kh6Var = (kh6) bldVarA.e(ugi0Var, 0, ih6.f14767a, kh6Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new rk6(i, kh6Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rk6 rk6Var = (rk6) obj;
        rk6Var.getClass();
        List list = rk6Var.b;
        kh6 kh6Var = rk6Var.f30633a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = rk6.c;
        if (cldVarA.u(ugi0Var) || kh6Var != null) {
            cldVarA.p(ugi0Var, 0, ih6.f14767a, kh6Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
