package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bar0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bar0 f2275a;
    private static final ugi0 descriptor;

    static {
        bar0 bar0Var = new bar0();
        f2275a = bar0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.player.top_players.data.models.responses.TopPlayersInfoResponse", bar0Var, 4);
        zna0Var.j("team", true);
        zna0Var.j("ratings", true);
        zna0Var.j("goals", true);
        zna0Var.j("assists", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = dar0.e;
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = dar0.e;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            } else if (iF == 2) {
                list2 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list2);
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
        return new dar0(i, str, list, list2, list3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dar0 dar0Var = (dar0) obj;
        dar0Var.getClass();
        List list = dar0Var.d;
        List list2 = dar0Var.c;
        List list3 = dar0Var.b;
        String str = dar0Var.f5765a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = dar0.e;
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
