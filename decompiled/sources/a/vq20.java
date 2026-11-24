package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vq20 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vq20 f37834a;
    private static final ugi0 descriptor;

    static {
        vq20 vq20Var = new vq20();
        f37834a = vq20Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.marble_games.MarbleGamesResponse", vq20Var, 7);
        zna0Var.j("Opp1Id", true);
        zna0Var.j("Opp2Id", true);
        zna0Var.j("Opp1Name", true);
        zna0Var.j("Opp2Name", true);
        zna0Var.j("Opp1Images", true);
        zna0Var.j("Opp2Images", true);
        zna0Var.j("PeriodScores", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = xq20.h;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[4].getValue()), mrv.j0((jiy) a8zVarArr[5].getValue()), mrv.j0((jiy) a8zVarArr[6].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = xq20.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    break;
                case 2:
                    str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                    i |= 8;
                    break;
                case 4:
                    list = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) bldVarA.e(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    list3 = (List) bldVarA.e(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list3);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new xq20(i, l, l2, str, str2, list, list2, list3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xq20 xq20Var = (xq20) obj;
        xq20Var.getClass();
        List list = xq20Var.g;
        List list2 = xq20Var.f;
        List list3 = xq20Var.e;
        String str = xq20Var.d;
        String str2 = xq20Var.c;
        Long l = xq20Var.b;
        Long l2 = xq20Var.f41294a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = xq20.h;
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
