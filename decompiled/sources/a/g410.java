package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g410 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g410 f10640a;
    private static final ugi0 descriptor;

    static {
        g410 g410Var = new g410();
        f10640a = g410Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.lol.impl.data.model.matches.LolStatisticMatchesMatchResponse", g410Var, 8);
        zna0Var.j("blueTeam", true);
        zna0Var.j("redTeam", true);
        zna0Var.j("durationSeconds", true);
        zna0Var.j("startedAt", true);
        zna0Var.j("startedAtStamp", true);
        zna0Var.j("networthGraph", true);
        zna0Var.j("expGraph", true);
        zna0Var.j("objectKills", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = i410.i;
        l510 l510Var = l510.f19435a;
        return new jiy[]{mrv.j0(l510Var), mrv.j0(l510Var), mrv.j0(okx.f25427a), mrv.j0(ysm0.f43175a), mrv.j0(s710.f31729a), mrv.j0((jiy) a8zVarArr[5].getValue()), mrv.j0((jiy) a8zVarArr[6].getValue()), mrv.j0((jiy) a8zVarArr[7].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = i410.i;
        Object obj = null;
        boolean z = true;
        List list = null;
        n510 n510Var = null;
        n510 n510Var2 = null;
        Integer num = null;
        String str = null;
        Long l = null;
        List list2 = null;
        List list3 = null;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    n510Var = (n510) bldVarA.e(ugi0Var, 0, l510.f19435a, n510Var);
                    i |= 1;
                    break;
                case 1:
                    n510Var2 = (n510) bldVarA.e(ugi0Var, 1, l510.f19435a, n510Var2);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                    i |= 4;
                    break;
                case 3:
                    str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                    i |= 8;
                    break;
                case 4:
                    l = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l);
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
        return new i410(i, n510Var, n510Var2, num, str, l, list2, list3, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        i410 i410Var = (i410) obj;
        i410Var.getClass();
        List list = i410Var.h;
        List list2 = i410Var.g;
        List list3 = i410Var.f;
        Long l = i410Var.e;
        String str = i410Var.d;
        Integer num = i410Var.c;
        n510 n510Var = i410Var.b;
        n510 n510Var2 = i410Var.f14123a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = i410.i;
        if (cldVarA.u(ugi0Var) || n510Var2 != null) {
            cldVarA.p(ugi0Var, 0, l510.f19435a, n510Var2);
        }
        if (cldVarA.u(ugi0Var) || n510Var != null) {
            cldVarA.p(ugi0Var, 1, l510.f19435a, n510Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
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
