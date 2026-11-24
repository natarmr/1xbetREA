package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i8a0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i8a0 f14329a;
    private static final ugi0 descriptor;

    static {
        i8a0 i8a0Var = new i8a0();
        f14329a = i8a0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.player.player_menu.data.model.PlayerMenuResponse", i8a0Var, 4);
        zna0Var.j("teams", true);
        zna0Var.j("players", true);
        zna0Var.j("sportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = k8a0.e;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0(ysm0.f43175a), mrv.j0(b8a0.f2148a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = k8a0.e;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        String str = null;
        d8a0 d8a0Var = null;
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
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                d8a0Var = (d8a0) bldVarA.e(ugi0Var, 3, b8a0.f2148a, d8a0Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new k8a0(i, list, list2, str, d8a0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        k8a0 k8a0Var = (k8a0) obj;
        k8a0Var.getClass();
        d8a0 d8a0Var = k8a0Var.d;
        String str = k8a0Var.c;
        List list = k8a0Var.b;
        List list2 = k8a0Var.f17864a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = k8a0.e;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d8a0Var != null) {
            cldVarA.p(ugi0Var, 3, b8a0.f2148a, d8a0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
