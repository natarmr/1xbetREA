package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gia0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gia0 f11335a;
    private static final ugi0 descriptor;

    static {
        gia0 gia0Var = new gia0();
        f11335a = gia0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.player.players_statistic_cricket.data.models.PlayersStatisticCricketResponse", gia0Var, 3);
        zna0Var.j("teams", true);
        zna0Var.j("players", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = iia0.d;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0(zha0.f44384a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = iia0.d;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        bia0 bia0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                list2 = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                bia0Var = (bia0) bldVarA.e(ugi0Var, 2, zha0.f44384a, bia0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new iia0(i, list, list2, bia0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        iia0 iia0Var = (iia0) obj;
        iia0Var.getClass();
        bia0 bia0Var = iia0Var.c;
        List list = iia0Var.b;
        List list2 = iia0Var.f14820a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = iia0.d;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || bia0Var != null) {
            cldVarA.p(ugi0Var, 2, zha0.f44384a, bia0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
