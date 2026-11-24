package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hdu0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hdu0 f12888a;
    private static final ugi0 descriptor;

    static {
        hdu0 hdu0Var = new hdu0();
        f12888a = hdu0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.victory_formula.VictoryFormulaLiveResponse", hdu0Var, 7);
        zna0Var.j("P1", true);
        zna0Var.j("P2", true);
        zna0Var.j("F1", true);
        zna0Var.j("F2", true);
        zna0Var.j("RG", true);
        zna0Var.j("TS", true);
        zna0Var.j("TD", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = jdu0.h;
        jiy jiyVarJ0 = mrv.j0((jiy) a8zVarArr[0].getValue());
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710.f31729a), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = jdu0.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Long l = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
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
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l);
                    i |= 32;
                    break;
                case 6:
                    num = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new jdu0(i, list, list2, str, str2, str3, l, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jdu0 jdu0Var = (jdu0) obj;
        jdu0Var.getClass();
        Integer num = jdu0Var.g;
        Long l = jdu0Var.f;
        String str = jdu0Var.e;
        String str2 = jdu0Var.d;
        String str3 = jdu0Var.c;
        List list = jdu0Var.b;
        List list2 = jdu0Var.f16346a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = jdu0.h;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
