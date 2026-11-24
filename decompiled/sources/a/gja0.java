package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gja0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gja0 f11388a;
    private static final ugi0 descriptor;

    static {
        gja0 gja0Var = new gja0();
        f11388a = gja0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.player.players_statistic.data.models.PlayersStatisticResponse", gja0Var, 4);
        zna0Var.j("teams", true);
        zna0Var.j("players", true);
        zna0Var.j("sportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = ija0.e;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0(okx.f25427a), mrv.j0(aja0.f965a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ija0.e;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        Integer num = null;
        cja0 cja0Var = null;
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
                num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                cja0Var = (cja0) bldVarA.e(ugi0Var, 3, aja0.f965a, cja0Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new ija0(i, list, list2, num, cja0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ija0 ija0Var = (ija0) obj;
        ija0Var.getClass();
        cja0 cja0Var = ija0Var.d;
        Integer num = ija0Var.c;
        List list = ija0Var.b;
        List list2 = ija0Var.f14865a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ija0.e;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || cja0Var != null) {
            cldVarA.p(ugi0Var, 3, aja0.f965a, cja0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
