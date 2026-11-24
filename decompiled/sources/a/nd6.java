package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nd6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nd6 f23325a;
    private static final ugi0 descriptor;

    static {
        nd6 nd6Var = new nd6();
        f23325a = nd6Var;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.alternative_info.data.BetAlternativeInfoResponse", nd6Var, 17);
        zna0Var.j("Sport", true);
        zna0Var.j("ChampId", true);
        zna0Var.j("GlobalChampId", true);
        zna0Var.j("GameId", true);
        zna0Var.j("ChampImage", true);
        zna0Var.j("ChampName", true);
        zna0Var.j("GameName", true);
        zna0Var.j("Opp1Id", true);
        zna0Var.j("Opp1Images", true);
        zna0Var.j("Opp1Name", true);
        zna0Var.j("Opp2Id", true);
        zna0Var.j("Opp2Images", true);
        zna0Var.j("Opp2Name", true);
        zna0Var.j("IsFinished", true);
        zna0Var.j("Score", true);
        zna0Var.j("OppNumber", true);
        zna0Var.j("TeamNumber", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = pd6.r;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        jiy jiyVarJ3 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0(ysm0Var);
        jiy jiyVarJ7 = mrv.j0(s710Var);
        jiy jiyVarJ8 = mrv.j0((jiy) a8zVarArr[8].getValue());
        jiy jiyVarJ9 = mrv.j0(ysm0Var);
        jiy jiyVarJ10 = mrv.j0(s710Var);
        jiy jiyVarJ11 = mrv.j0((jiy) a8zVarArr[11].getValue());
        jiy jiyVarJ12 = mrv.j0(ysm0Var);
        jiy jiyVarJ13 = mrv.j0(sm8.f32432a);
        jiy jiyVarJ14 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, jiyVarJ14, mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Long l;
        String str;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = pd6.r;
        List list = null;
        Long l2 = null;
        String str2 = null;
        List list2 = null;
        String str3 = null;
        Long l3 = null;
        int i2 = 0;
        Boolean bool = null;
        String str4 = null;
        Integer num = null;
        Integer num2 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z = true;
        Long l4 = null;
        Long l5 = null;
        Long l6 = null;
        Long l7 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l4;
                    z = false;
                    l2 = l2;
                    str6 = str6;
                    l4 = l;
                    list = list;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l4);
                    i2 |= 1;
                    l2 = l2;
                    str5 = str5;
                    str6 = str6;
                    l4 = l;
                    list = list;
                    break;
                case 1:
                    str = str5;
                    l5 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l5);
                    i2 |= 2;
                    l6 = l6;
                    str5 = str;
                    str6 = str6;
                    list = list;
                    break;
                case 2:
                    str = str5;
                    l6 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l6);
                    i2 |= 4;
                    str5 = str;
                    str6 = str6;
                    list = list;
                    break;
                case 3:
                    str = str5;
                    l7 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l7);
                    i2 |= 8;
                    str5 = str;
                    str6 = str6;
                    list = list;
                    break;
                case 4:
                    list = list;
                    str6 = str6;
                    str5 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str5);
                    i2 |= 16;
                    str6 = str6;
                    list = list;
                    break;
                case 5:
                    list = list;
                    str6 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str6);
                    i2 |= 32;
                    str5 = str5;
                    list = list;
                    break;
                case 6:
                    str5 = str5;
                    str6 = str6;
                    str7 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str7);
                    i2 |= 64;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 7:
                    str5 = str5;
                    str6 = str6;
                    l3 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l3);
                    i2 |= 128;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 8:
                    str5 = str5;
                    str6 = str6;
                    list2 = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list2);
                    i2 |= 256;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 9:
                    str5 = str5;
                    str6 = str6;
                    str2 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str2);
                    i2 |= 512;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 10:
                    str5 = str5;
                    str6 = str6;
                    l2 = (Long) bldVarA.e(ugi0Var, 10, s710.f31729a, l2);
                    i2 |= 1024;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 11:
                    str5 = str5;
                    str6 = str6;
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i2 |= 2048;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 12:
                    str5 = str5;
                    str6 = str6;
                    str3 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str3);
                    i2 |= 4096;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 13:
                    str5 = str5;
                    str6 = str6;
                    bool = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool);
                    i2 |= 8192;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 14:
                    str5 = str5;
                    str6 = str6;
                    str4 = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str4);
                    i2 |= 16384;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 15:
                    num = (Integer) bldVarA.e(ugi0Var, 15, okx.f25427a, num);
                    i = 32768;
                    i2 |= i;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 16:
                    num2 = (Integer) bldVarA.e(ugi0Var, 16, okx.f25427a, num2);
                    i = 65536;
                    i2 |= i;
                    str5 = str5;
                    str6 = str6;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list3 = list;
        String str8 = str6;
        bldVarA.c(ugi0Var);
        return new pd6(i2, l4, l5, l6, l7, str5, str8, str7, l3, list2, str2, l2, list3, str3, bool, str4, num, num2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pd6 pd6Var = (pd6) obj;
        pd6Var.getClass();
        Integer num = pd6Var.q;
        Integer num2 = pd6Var.p;
        String str = pd6Var.o;
        Boolean bool = pd6Var.n;
        String str2 = pd6Var.m;
        List list = pd6Var.l;
        Long l = pd6Var.k;
        String str3 = pd6Var.j;
        List list2 = pd6Var.i;
        Long l2 = pd6Var.h;
        String str4 = pd6Var.g;
        String str5 = pd6Var.f;
        String str6 = pd6Var.e;
        Long l3 = pd6Var.d;
        Long l4 = pd6Var.c;
        Long l5 = pd6Var.b;
        Long l6 = pd6Var.f26793a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = pd6.r;
        if (cldVarA.u(ugi0Var) || l6 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l6);
        }
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 10, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str2 != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || bool != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 14, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 15, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 16, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
