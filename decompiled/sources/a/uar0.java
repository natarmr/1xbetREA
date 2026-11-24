package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uar0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uar0 f35347a;
    private static final ugi0 descriptor;

    static {
        uar0 uar0Var = new uar0();
        f35347a = uar0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.player.top_players.data.models.responses.TopPlayersResponse", uar0Var, 4);
        zna0Var.j("teams", true);
        zna0Var.j("players", true);
        zna0Var.j("sportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = war0.e;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0(s710.f31729a), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = war0.e;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        Long l = null;
        List list3 = null;
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
            } else if (iF == 2) {
                l = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list3 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new war0(i, list, list2, l, list3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        war0 war0Var = (war0) obj;
        war0Var.getClass();
        List list = war0Var.d;
        Long l = war0Var.c;
        List list2 = war0Var.b;
        List list3 = war0Var.f38844a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = war0.e;
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
