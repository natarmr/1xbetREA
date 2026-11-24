package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ydp0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ydp0 f42450a;
    private static final ugi0 descriptor;

    static {
        ydp0 ydp0Var = new ydp0();
        f42450a = ydp0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.lastgames.data.model.TeamGames", ydp0Var, 10);
        zna0Var.j("drowCount", true);
        zna0Var.j("games", true);
        zna0Var.j("team1FutureGames", true);
        zna0Var.j("team1Games", true);
        zna0Var.j("team2FutureGames", true);
        zna0Var.j("team2Games", true);
        zna0Var.j("teamStat1", true);
        zna0Var.j("teamStat2", true);
        zna0Var.j("winCount1", true);
        zna0Var.j("winCount2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = aep0.k;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        jiy jiyVarJ2 = mrv.j0((jiy) a8zVarArr[2].getValue());
        jiy jiyVarJ3 = mrv.j0((jiy) a8zVarArr[3].getValue());
        jiy jiyVarJ4 = mrv.j0((jiy) a8zVarArr[4].getValue());
        jiy jiyVarJ5 = mrv.j0((jiy) a8zVarArr[5].getValue());
        alp0 alp0Var = alp0.f1080a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(alp0Var), mrv.j0(alp0Var), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = aep0.k;
        Integer num = null;
        Integer num2 = null;
        boolean z = true;
        clp0 clp0Var = null;
        int i = 0;
        Integer num3 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        clp0 clp0Var2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    num3 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num3);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    list2 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list2);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    list3 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list3);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    list4 = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list4);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    list5 = (List) bldVarA.e(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list5);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    clp0Var2 = (clp0) bldVarA.e(ugi0Var, 6, alp0.f1080a, clp0Var2);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    clp0Var = (clp0) bldVarA.e(ugi0Var, 7, alp0.f1080a, clp0Var);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    num2 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num2);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    num = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
        }
        bldVarA.c(ugi0Var);
        return new aep0(i, num3, list, list2, list3, list4, list5, clp0Var2, clp0Var, num2, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        aep0 aep0Var = (aep0) obj;
        aep0Var.getClass();
        Integer num = aep0Var.j;
        Integer num2 = aep0Var.i;
        clp0 clp0Var = aep0Var.h;
        clp0 clp0Var2 = aep0Var.g;
        List list = aep0Var.f;
        List list2 = aep0Var.e;
        List list3 = aep0Var.d;
        List list4 = aep0Var.c;
        List list5 = aep0Var.b;
        Integer num3 = aep0Var.f740a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = aep0.k;
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || list5 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list5);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || clp0Var2 != null) {
            cldVarA.p(ugi0Var, 6, alp0.f1080a, clp0Var2);
        }
        if (cldVarA.u(ugi0Var) || clp0Var != null) {
            cldVarA.p(ugi0Var, 7, alp0.f1080a, clp0Var);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
