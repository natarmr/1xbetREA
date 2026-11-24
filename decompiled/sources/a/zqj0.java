package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zqj0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zqj0 f44810a;
    private static final ugi0 descriptor;

    static {
        zqj0 zqj0Var = new zqj0();
        f44810a = zqj0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.statistic_core.data.models.ShortGameResponse", zqj0Var, 4);
        zna0Var.j("teams", true);
        zna0Var.j("players", true);
        zna0Var.j("sportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = drj0.e;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0(okx.f25427a), mrv.j0(tqj0.f34383a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = drj0.e;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        Integer num = null;
        vqj0 vqj0Var = null;
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
                vqj0Var = (vqj0) bldVarA.e(ugi0Var, 3, tqj0.f34383a, vqj0Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new drj0(i, list, list2, num, vqj0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        drj0 drj0Var = (drj0) obj;
        drj0Var.getClass();
        vqj0 vqj0Var = drj0Var.d;
        Integer num = drj0Var.c;
        List list = drj0Var.b;
        List list2 = drj0Var.f6562a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = drj0.e;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || vqj0Var != null) {
            cldVarA.p(ugi0Var, 3, tqj0.f34383a, vqj0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
