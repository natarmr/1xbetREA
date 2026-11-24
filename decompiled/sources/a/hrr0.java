package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hrr0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hrr0 f13546a;
    private static final ugi0 descriptor;

    static {
        hrr0 hrr0Var = new hrr0();
        f13546a = hrr0Var;
        zna0 zna0Var = new zna0("org.xplatform.toto_jackpot.impl.data.model.TotoJackpotTiragGameResponse", hrr0Var, 19);
        zna0Var.j("GameNumber", true);
        zna0Var.j("StartDate", true);
        zna0Var.j("ChampInfo", true);
        zna0Var.j("GameName", true);
        zna0Var.j("Score", true);
        zna0Var.j("SportId", true);
        zna0Var.j("BukGameId", true);
        zna0Var.j("Opponent1Name", true);
        zna0Var.j("Opponent2Name", true);
        zna0Var.j("Period", true);
        zna0Var.j("PeriodString", true);
        zna0Var.j("BetsPercents", true);
        zna0Var.j("Opponent1TranslateId", true);
        zna0Var.j("Opponent2TranslateId", true);
        zna0Var.j("Opponent1Image", true);
        zna0Var.j("Opponent2Image", true);
        zna0Var.j("OpponentCountryId1", true);
        zna0Var.j("OpponentCountryId2", true);
        zna0Var.j("ConstId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = jrr0.t;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(uqr0.f36132a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[11].getValue()), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Integer num;
        Integer num2;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = jrr0.t;
        List list = null;
        String str = null;
        Integer num3 = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        int i2 = 0;
        Long l2 = null;
        String str4 = null;
        String str5 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        Integer num4 = null;
        boolean z = true;
        Integer num5 = null;
        Long l6 = null;
        wqr0 wqr0Var = null;
        String str6 = null;
        String str7 = null;
        Integer num6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num = num5;
                    z = false;
                    str = str;
                    num4 = num4;
                    num5 = num;
                    list = list;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num5);
                    i2 |= 1;
                    str = str;
                    num4 = num4;
                    str3 = str3;
                    num5 = num;
                    list = list;
                    break;
                case 1:
                    num2 = num4;
                    l6 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l6);
                    i2 |= 2;
                    wqr0Var = wqr0Var;
                    num4 = num2;
                    str3 = str3;
                    list = list;
                    break;
                case 2:
                    num2 = num4;
                    wqr0Var = (wqr0) bldVarA.e(ugi0Var, 2, uqr0.f36132a, wqr0Var);
                    i2 |= 4;
                    num4 = num2;
                    str3 = str3;
                    list = list;
                    break;
                case 3:
                    num2 = num4;
                    str6 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str6);
                    i2 |= 8;
                    num4 = num2;
                    str3 = str3;
                    list = list;
                    break;
                case 4:
                    num2 = num4;
                    str7 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str7);
                    i2 |= 16;
                    num4 = num2;
                    str3 = str3;
                    list = list;
                    break;
                case 5:
                    num2 = num4;
                    num6 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num6);
                    i2 |= 32;
                    num4 = num2;
                    str3 = str3;
                    list = list;
                    break;
                case 6:
                    list = list;
                    str3 = str3;
                    num4 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num4);
                    i2 |= 64;
                    str3 = str3;
                    list = list;
                    break;
                case 7:
                    list = list;
                    str3 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str3);
                    i2 |= 128;
                    num4 = num4;
                    list = list;
                    break;
                case 8:
                    str3 = str3;
                    num4 = num4;
                    str2 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str2);
                    i2 |= 256;
                    num4 = num4;
                    str3 = str3;
                    break;
                case 9:
                    str3 = str3;
                    num4 = num4;
                    num3 = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num3);
                    i2 |= 512;
                    num4 = num4;
                    str3 = str3;
                    break;
                case 10:
                    str3 = str3;
                    num4 = num4;
                    str = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str);
                    i2 |= 1024;
                    num4 = num4;
                    str3 = str3;
                    break;
                case 11:
                    str3 = str3;
                    num4 = num4;
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i2 |= 2048;
                    num4 = num4;
                    str3 = str3;
                    break;
                case 12:
                    str3 = str3;
                    num4 = num4;
                    l = (Long) bldVarA.e(ugi0Var, 12, s710.f31729a, l);
                    i2 |= 4096;
                    num4 = num4;
                    str3 = str3;
                    break;
                case 13:
                    str3 = str3;
                    num4 = num4;
                    l2 = (Long) bldVarA.e(ugi0Var, 13, s710.f31729a, l2);
                    i2 |= 8192;
                    num4 = num4;
                    str3 = str3;
                    break;
                case 14:
                    str3 = str3;
                    num4 = num4;
                    str4 = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str4);
                    i2 |= 16384;
                    num4 = num4;
                    str3 = str3;
                    break;
                case 15:
                    str5 = (String) bldVarA.e(ugi0Var, 15, ysm0.f43175a, str5);
                    i = 32768;
                    i2 |= i;
                    num4 = num4;
                    str3 = str3;
                    break;
                case 16:
                    l3 = (Long) bldVarA.e(ugi0Var, 16, s710.f31729a, l3);
                    i = 65536;
                    i2 |= i;
                    num4 = num4;
                    str3 = str3;
                    break;
                case 17:
                    l4 = (Long) bldVarA.e(ugi0Var, 17, s710.f31729a, l4);
                    i = 131072;
                    i2 |= i;
                    num4 = num4;
                    str3 = str3;
                    break;
                case 18:
                    l5 = (Long) bldVarA.e(ugi0Var, 18, s710.f31729a, l5);
                    i = 262144;
                    i2 |= i;
                    num4 = num4;
                    str3 = str3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list2 = list;
        Integer num7 = num4;
        Integer num8 = num5;
        Long l7 = l6;
        wqr0 wqr0Var2 = wqr0Var;
        bldVarA.c(ugi0Var);
        return new jrr0(i2, num8, l7, wqr0Var2, str6, str7, num6, num7, str3, str2, num3, str, list2, l, l2, str4, str5, l3, l4, l5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jrr0 jrr0Var = (jrr0) obj;
        jrr0Var.getClass();
        Long l = jrr0Var.s;
        Long l2 = jrr0Var.r;
        Long l3 = jrr0Var.q;
        String str = jrr0Var.p;
        String str2 = jrr0Var.o;
        Long l4 = jrr0Var.n;
        Long l5 = jrr0Var.m;
        List list = jrr0Var.l;
        String str3 = jrr0Var.k;
        Integer num = jrr0Var.j;
        String str4 = jrr0Var.i;
        String str5 = jrr0Var.h;
        Integer num2 = jrr0Var.g;
        Integer num3 = jrr0Var.f;
        String str6 = jrr0Var.e;
        String str7 = jrr0Var.d;
        wqr0 wqr0Var = jrr0Var.c;
        Long l6 = jrr0Var.b;
        Integer num4 = jrr0Var.f17018a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = jrr0.t;
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || l6 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l6);
        }
        if (cldVarA.u(ugi0Var) || wqr0Var != null) {
            cldVarA.p(ugi0Var, 2, uqr0.f36132a, wqr0Var);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l5 != 0) {
            cldVarA.p(ugi0Var, 12, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != 0) {
            cldVarA.p(ugi0Var, 13, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 14, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 15, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 16, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 17, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 18, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
