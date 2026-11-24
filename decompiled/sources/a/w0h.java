package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w0h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0h f38348a;
    private static final ugi0 descriptor;

    static {
        w0h w0hVar = new w0h();
        f38348a = w0hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.lastmatches.CyberHeadToHeadResponse", w0hVar, 8);
        zna0Var.j("team1WinCount", true);
        zna0Var.j("team2WinCount", true);
        zna0Var.j("overTimesCount", true);
        zna0Var.j("games", true);
        zna0Var.j("team1Games", true);
        zna0Var.j("team2Games", true);
        zna0Var.j("team1FutureGames", true);
        zna0Var.j("team2FutureGames", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = y0h.i;
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0((jiy) a8zVarArr[4].getValue()), mrv.j0((jiy) a8zVarArr[5].getValue()), mrv.j0((jiy) a8zVarArr[6].getValue()), mrv.j0((jiy) a8zVarArr[7].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = y0h.i;
        Object obj = null;
        boolean z = true;
        List list = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                    i |= 2;
                    break;
                case 2:
                    num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
                    i |= 8;
                    break;
                case 4:
                    list3 = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list3);
                    i |= 16;
                    break;
                case 5:
                    list4 = (List) bldVarA.e(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list4);
                    i |= 32;
                    break;
                case 6:
                    list5 = (List) bldVarA.e(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list5);
                    i |= 64;
                    break;
                case 7:
                    list = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new y0h(i, num, num2, num3, list2, list3, list4, list5, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        y0h y0hVar = (y0h) obj;
        y0hVar.getClass();
        List list = y0hVar.h;
        List list2 = y0hVar.g;
        List list3 = y0hVar.f;
        List list4 = y0hVar.e;
        List list5 = y0hVar.d;
        Integer num = y0hVar.c;
        Integer num2 = y0hVar.b;
        Integer num3 = y0hVar.f41804a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = y0h.i;
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list5 != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list5);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
