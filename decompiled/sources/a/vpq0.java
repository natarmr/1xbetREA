package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vpq0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vpq0 f37818a;
    private static final ugi0 descriptor;

    static {
        vpq0 vpq0Var = new vpq0();
        f37818a = vpq0Var;
        zna0 zna0Var = new zna0("org.xplatform.toto_bet.tirage_parameters.data.model.TirageGameResponse", vpq0Var, 12);
        zna0Var.j("GameNumber", true);
        zna0Var.j("StartDate", true);
        zna0Var.j("Score", true);
        zna0Var.j("SportId", true);
        zna0Var.j("Opponent1Name", true);
        zna0Var.j("Opponent2Name", true);
        zna0Var.j("OpponentImg1", true);
        zna0Var.j("OpponentImg2", true);
        zna0Var.j("Period", true);
        zna0Var.j("EventResults", true);
        zna0Var.j("Total", true);
        zna0Var.j("BetsPercents", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = xpq0.m;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ1 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(tbl.f33669a), mrv.j0((jiy) a8zVarArr[11].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = xpq0.m;
        List list = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        boolean z = true;
        String str = null;
        int i = 0;
        Integer num3 = null;
        Long l = null;
        String str2 = null;
        Long l2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    list = list;
                    break;
                case 0:
                    num3 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num3);
                    i |= 1;
                    z = z;
                    list = list;
                    break;
                case 1:
                    l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                    i |= 2;
                    z = z;
                    num3 = num3;
                    break;
                case 2:
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    z = z;
                    num3 = num3;
                    break;
                case 3:
                    l2 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l2);
                    i |= 8;
                    z = z;
                    num3 = num3;
                    break;
                case 4:
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i |= 16;
                    z = z;
                    num3 = num3;
                    break;
                case 5:
                    str4 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str4);
                    i |= 32;
                    z = z;
                    num3 = num3;
                    break;
                case 6:
                    str5 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str5);
                    i |= 64;
                    z = z;
                    num3 = num3;
                    break;
                case 7:
                    str = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str);
                    i |= 128;
                    z = z;
                    num3 = num3;
                    break;
                case 8:
                    num2 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num2);
                    i |= 256;
                    z = z;
                    num3 = num3;
                    break;
                case 9:
                    num = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num);
                    i |= 512;
                    z = z;
                    num3 = num3;
                    break;
                case 10:
                    d = (Double) bldVarA.e(ugi0Var, 10, tbl.f33669a, d);
                    i |= 1024;
                    z = z;
                    num3 = num3;
                    break;
                case 11:
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i |= 2048;
                    z = z;
                    num3 = num3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new xpq0(i, num3, l, str2, l2, str3, str4, str5, str, num2, num, d, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xpq0 xpq0Var = (xpq0) obj;
        xpq0Var.getClass();
        List list = xpq0Var.l;
        Double d = xpq0Var.k;
        Integer num = xpq0Var.j;
        Integer num2 = xpq0Var.i;
        String str = xpq0Var.h;
        String str2 = xpq0Var.g;
        String str3 = xpq0Var.f;
        String str4 = xpq0Var.e;
        Long l = xpq0Var.d;
        String str5 = xpq0Var.c;
        Long l2 = xpq0Var.b;
        Integer num3 = xpq0Var.f41281a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = xpq0.m;
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 10, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
