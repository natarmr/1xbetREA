package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i7a0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i7a0 f14284a;
    private static final ugi0 descriptor;

    static {
        i7a0 i7a0Var = new i7a0();
        f14284a = i7a0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.player.medals.data.models.PlayerMedalsResponse", i7a0Var, 4);
        zna0Var.j("players", true);
        zna0Var.j("sportId", true);
        zna0Var.j("subSportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = k7a0.e;
        jiy jiyVarJ0 = mrv.j0((jiy) a8zVarArr[0].getValue());
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = k7a0.e;
        boolean z = true;
        int i = 0;
        List list = null;
        Integer num = null;
        Integer num2 = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else if (iF == 2) {
                num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new k7a0(i, list, num, num2, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        k7a0 k7a0Var = (k7a0) obj;
        k7a0Var.getClass();
        List list = k7a0Var.d;
        Integer num = k7a0Var.c;
        Integer num2 = k7a0Var.b;
        List list2 = k7a0Var.f17811a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = k7a0.e;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
