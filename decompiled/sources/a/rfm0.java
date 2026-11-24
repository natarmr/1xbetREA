package a;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rfm0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rfm0 f30396a;
    private static final ugi0 descriptor;

    static {
        rfm0 rfm0Var = new rfm0();
        f30396a = rfm0Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.common.models.games_by_champ.StatisticResponse", rfm0Var, 2);
        zna0Var.j("main", true);
        zna0Var.j("periodsWinners", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = xfm0.c;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = xfm0.c;
        boolean z = true;
        int i = 0;
        Map map = null;
        Map map2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                map = (Map) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), map);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                map2 = (Map) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), map2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new xfm0(i, map, map2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xfm0 xfm0Var = (xfm0) obj;
        xfm0Var.getClass();
        Map map = xfm0Var.b;
        Map map2 = xfm0Var.f40797a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = xfm0.c;
        if (cldVarA.u(ugi0Var) || map2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), map2);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), map);
        }
        cldVarA.c(ugi0Var);
    }
}
