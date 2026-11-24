package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w1h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w1h f38398a;
    private static final ugi0 descriptor;

    static {
        w1h w1hVar = new w1h();
        f38398a = w1hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.lastmatches.CyberLastMatchesInfoResponse", w1hVar, 6);
        zna0Var.j("score1", true);
        zna0Var.j("score2", true);
        zna0Var.j("dateStart", true);
        zna0Var.j("periods", true);
        zna0Var.j("tournamentTitle", true);
        zna0Var.j("champId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = y1h.g;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(okxVar);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0(ysm0.f43175a), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = y1h.g;
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        List list = null;
        String str = null;
        Long l2 = null;
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
                    l = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l);
                    i |= 4;
                    break;
                case 3:
                    list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    str = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str);
                    i |= 16;
                    break;
                case 5:
                    l2 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l2);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new y1h(i, num, num2, l, list, str, l2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        y1h y1hVar = (y1h) obj;
        y1hVar.getClass();
        Long l = y1hVar.f;
        String str = y1hVar.e;
        List list = y1hVar.d;
        Long l2 = y1hVar.c;
        Integer num = y1hVar.b;
        Integer num2 = y1hVar.f41854a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = y1h.g;
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
