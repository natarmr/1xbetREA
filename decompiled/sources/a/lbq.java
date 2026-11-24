package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lbq implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lbq f19763a;
    private static final ugi0 descriptor;

    static {
        lbq lbqVar = new lbq();
        f19763a = lbqVar;
        zna0 zna0Var = new zna0("org.xplatform.feature.fin_bet.impl.data.model.FinanceBetRequest", lbqVar, 16);
        zna0Var.j("Summ", false);
        zna0Var.j("Events", false);
        zna0Var.j("Source", false);
        zna0Var.j("partner", false);
        zna0Var.j("Vid", false);
        zna0Var.j("Lng", false);
        zna0Var.j("CheckCf", false);
        zna0Var.j("promo", false);
        zna0Var.j("UserId", false);
        zna0Var.j("UserIdBonus", false);
        zna0Var.j("AppGuid", false);
        zna0Var.j("CfView", false);
        zna0Var.j("ApprovedBet", false);
        zna0Var.j("notWait", false);
        zna0Var.j("OneClickBet", false);
        zna0Var.j("specialTypes", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = nbq.q;
        jiy jiyVarJ0 = mrv.j0(tbl.f33669a);
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        okx okxVar = okx.f25427a;
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ8 = mrv.j0(s710Var);
        jiy jiyVarJ9 = mrv.j0(s710Var);
        jiy jiyVarJ10 = mrv.j0(ysm0Var);
        jiy jiyVarJ11 = mrv.j0(okxVar);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, mrv.j0(sm8Var), mrv.j0(sm8Var), okxVar, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Double d;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = nbq.q;
        Integer num = null;
        String str = null;
        Long l = null;
        Long l2 = null;
        Boolean bool = null;
        String str2 = null;
        int i = 0;
        Boolean bool2 = null;
        List list = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str3 = null;
        Integer num5 = null;
        int i2 = 1;
        boolean z = true;
        Double d2 = null;
        int iJ = 0;
        int iJ2 = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    d = d2;
                    z = false;
                    str = str;
                    num2 = num2;
                    i2 = 1;
                    d2 = d;
                    num = num;
                    break;
                case 0:
                    d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d2);
                    i |= 1;
                    list = list;
                    str = str;
                    num2 = num2;
                    i2 = 1;
                    d2 = d;
                    num = num;
                    break;
                case 1:
                    num = num;
                    list = (List) bldVarA.e(ugi0Var, i2, (jiy) a8zVarArr[i2].getValue(), list);
                    i |= 2;
                    num2 = num2;
                    num = num;
                    break;
                case 2:
                    num = num;
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i |= 4;
                    list = list;
                    num = num;
                    break;
                case 3:
                    num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                    i |= 8;
                    list = list;
                    num2 = num2;
                    break;
                case 4:
                    num4 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num4);
                    i |= 16;
                    list = list;
                    num2 = num2;
                    break;
                case 5:
                    str3 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str3);
                    i |= 32;
                    list = list;
                    num2 = num2;
                    break;
                case 6:
                    num5 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num5);
                    i |= 64;
                    list = list;
                    num2 = num2;
                    break;
                case 7:
                    str2 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str2);
                    i |= 128;
                    list = list;
                    num2 = num2;
                    break;
                case 8:
                    l2 = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l2);
                    i |= 256;
                    list = list;
                    num2 = num2;
                    break;
                case 9:
                    l = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l);
                    i |= 512;
                    list = list;
                    num2 = num2;
                    break;
                case 10:
                    str = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str);
                    i |= 1024;
                    list = list;
                    num2 = num2;
                    break;
                case 11:
                    num = (Integer) bldVarA.e(ugi0Var, 11, okx.f25427a, num);
                    i |= 2048;
                    list = list;
                    num2 = num2;
                    break;
                case 12:
                    bool = (Boolean) bldVarA.e(ugi0Var, 12, sm8.f32432a, bool);
                    i |= 4096;
                    list = list;
                    num2 = num2;
                    break;
                case 13:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool2);
                    i |= 8192;
                    list = list;
                    num2 = num2;
                    break;
                case 14:
                    iJ = bldVarA.j(ugi0Var, 14);
                    i |= 16384;
                    list = list;
                    break;
                case 15:
                    iJ2 = bldVarA.j(ugi0Var, 15);
                    i |= 32768;
                    list = list;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Integer num6 = num;
        Double d3 = d2;
        bldVarA.c(ugi0Var);
        return new nbq(i, d3, list, num2, num3, num4, str3, num5, str2, l2, l, str, num6, bool, bool2, iJ, iJ2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nbq nbqVar = (nbq) obj;
        nbqVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = nbq.q;
        cldVarA.p(ugi0Var, 0, tbl.f33669a, nbqVar.f23254a);
        cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), nbqVar.b);
        okx okxVar = okx.f25427a;
        cldVarA.p(ugi0Var, 2, okxVar, nbqVar.c);
        cldVarA.p(ugi0Var, 3, okxVar, nbqVar.d);
        cldVarA.p(ugi0Var, 4, okxVar, nbqVar.e);
        ysm0 ysm0Var = ysm0.f43175a;
        cldVarA.p(ugi0Var, 5, ysm0Var, nbqVar.f);
        cldVarA.p(ugi0Var, 6, okxVar, nbqVar.g);
        cldVarA.p(ugi0Var, 7, ysm0Var, nbqVar.h);
        s710 s710Var = s710.f31729a;
        cldVarA.p(ugi0Var, 8, s710Var, nbqVar.i);
        cldVarA.p(ugi0Var, 9, s710Var, nbqVar.j);
        cldVarA.p(ugi0Var, 10, ysm0Var, nbqVar.k);
        cldVarA.p(ugi0Var, 11, okxVar, nbqVar.l);
        sm8 sm8Var = sm8.f32432a;
        cldVarA.p(ugi0Var, 12, sm8Var, nbqVar.m);
        cldVarA.p(ugi0Var, 13, sm8Var, nbqVar.n);
        cldVarA.i(14, nbqVar.o, ugi0Var);
        cldVarA.i(15, nbqVar.p, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
