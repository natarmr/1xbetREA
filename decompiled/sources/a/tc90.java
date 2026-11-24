package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tc90 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tc90 f33710a;
    private static final ugi0 descriptor;

    static {
        tc90 tc90Var = new tc90();
        f33710a = tc90Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.game_details.PenaltyResponse", tc90Var, 2);
        zna0Var.j("score", true);
        zna0Var.j("shots", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(vc90.f37177a), mrv.j0((jiy) bd90.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = bd90.c;
        boolean z = true;
        int i = 0;
        xc90 xc90Var = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                xc90Var = (xc90) bldVarA.e(ugi0Var, 0, vc90.f37177a, xc90Var);
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
        return new bd90(i, xc90Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bd90 bd90Var = (bd90) obj;
        bd90Var.getClass();
        List list = bd90Var.b;
        xc90 xc90Var = bd90Var.f2388a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = bd90.c;
        if (cldVarA.u(ugi0Var) || xc90Var != null) {
            cldVarA.p(ugi0Var, 0, vc90.f37177a, xc90Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
