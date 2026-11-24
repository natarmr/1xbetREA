package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l9h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9h f19651a;
    private static final ugi0 descriptor;

    static {
        l9h l9hVar = new l9h();
        f19651a = l9hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.mlbb.CyberMlbbHeroResponse", l9hVar, 10);
        zna0Var.j("HI", true);
        zna0Var.j("HN", true);
        zna0Var.j("RT", true);
        zna0Var.j("PX", true);
        zna0Var.j("PY", true);
        zna0Var.j("PN", true);
        zna0Var.j("LVL", true);
        zna0Var.j("GL", true);
        zna0Var.j("HS", true);
        zna0Var.j("IT", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = n9h.k;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(klq.f18504a), mrv.j0(o9h.f24879a), mrv.j0((jiy) a8zVarArr[9].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = n9h.k;
        List list = null;
        q9h q9hVar = null;
        boolean z = true;
        Float f = null;
        int i = 0;
        Long l = null;
        String str = null;
        Long l2 = null;
        Integer num = null;
        Integer num2 = null;
        String str2 = null;
        Integer num3 = null;
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
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    break;
                case 2:
                    l2 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l2);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num2);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str2);
                    i |= 32;
                    break;
                case 6:
                    num3 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num3);
                    i |= 64;
                    break;
                case 7:
                    f = (Float) bldVarA.e(ugi0Var, 7, klq.f18504a, f);
                    i |= 128;
                    break;
                case 8:
                    q9hVar = (q9h) bldVarA.e(ugi0Var, 8, o9h.f24879a, q9hVar);
                    i |= 256;
                    break;
                case 9:
                    list = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr = a8zVarArr;
        }
        bldVarA.c(ugi0Var);
        return new n9h(i, l, str, l2, num, num2, str2, num3, f, q9hVar, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        n9h n9hVar = (n9h) obj;
        n9hVar.getClass();
        List list = n9hVar.j;
        q9h q9hVar = n9hVar.i;
        Float f = n9hVar.h;
        Integer num = n9hVar.g;
        String str = n9hVar.f;
        Integer num2 = n9hVar.e;
        Integer num3 = n9hVar.d;
        Long l = n9hVar.c;
        String str2 = n9hVar.b;
        Long l2 = n9hVar.f23138a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = n9h.k;
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 7, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || q9hVar != null) {
            cldVarA.p(ugi0Var, 8, o9h.f24879a, q9hVar);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
