package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tyy implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tyy f34779a;
    private static final ugi0 descriptor;

    static {
        tyy tyyVar = new tyy();
        f34779a = tyyVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.lastgames.data.model.LastGameData", tyyVar, 4);
        zna0Var.j("players", true);
        zna0Var.j("response", true);
        zna0Var.j("sportId", true);
        zna0Var.j("teams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = vyy.e;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0(ydp0.f42450a), mrv.j0(okx.f25427a), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = vyy.e;
        boolean z = true;
        int i = 0;
        List list = null;
        aep0 aep0Var = null;
        Integer num = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                aep0Var = (aep0) bldVarA.e(ugi0Var, 1, ydp0.f42450a, aep0Var);
                i |= 2;
            } else if (iF == 2) {
                num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
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
        return new vyy(i, list, aep0Var, num, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vyy vyyVar = (vyy) obj;
        vyyVar.getClass();
        List list = vyyVar.d;
        Integer num = vyyVar.c;
        aep0 aep0Var = vyyVar.b;
        List list2 = vyyVar.f38272a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = vyy.e;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || aep0Var != null) {
            cldVarA.p(ugi0Var, 1, ydp0.f42450a, aep0Var);
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
