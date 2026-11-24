package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u3h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3h f34997a;
    private static final ugi0 descriptor;

    static {
        u3h u3hVar = new u3h();
        f34997a = u3hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.lol.CyberLolHeroesStatisticsResponse", u3hVar, 9);
        zna0Var.j("HI", true);
        zna0Var.j("LVL", true);
        zna0Var.j("HN", true);
        zna0Var.j("PN", true);
        zna0Var.j("RT", true);
        zna0Var.j("PX", true);
        zna0Var.j("PY", true);
        zna0Var.j("IT", true);
        zna0Var.j("HS", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = w3h.j;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[7].getValue()), mrv.j0(r3h.f29788a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = w3h.j;
        t3h t3hVar = null;
        boolean z = true;
        List list = null;
        int i = 0;
        Long l = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        Long l2 = null;
        Integer num2 = null;
        Integer num3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
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
                    l2 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l2);
                    i |= 16;
                    break;
                case 5:
                    num2 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num2);
                    i |= 32;
                    break;
                case 6:
                    num3 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num3);
                    i |= 64;
                    break;
                case 7:
                    list = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    t3hVar = (t3h) bldVarA.e(ugi0Var, 8, r3h.f29788a, t3hVar);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new w3h(i, l, num, str, str2, l2, num2, num3, list, t3hVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        w3h w3hVar = (w3h) obj;
        w3hVar.getClass();
        t3h t3hVar = w3hVar.i;
        List list = w3hVar.h;
        Integer num = w3hVar.g;
        Integer num2 = w3hVar.f;
        Long l = w3hVar.e;
        String str = w3hVar.d;
        String str2 = w3hVar.c;
        Integer num3 = w3hVar.b;
        Long l2 = w3hVar.f38502a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = w3h.j;
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || t3hVar != null) {
            cldVarA.p(ugi0Var, 8, r3h.f29788a, t3hVar);
        }
        cldVarA.c(ugi0Var);
    }
}
