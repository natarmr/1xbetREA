package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kwe implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kwe f18997a;
    private static final ugi0 descriptor;

    static {
        kwe kweVar = new kwe();
        f18997a = kweVar;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.load_coupon.data.model.CouponEventResponse", kweVar, 25);
        zna0Var.j("SportId", true);
        zna0Var.j("Coef", true);
        zna0Var.j("Type", true);
        zna0Var.j("ShortGroupId", true);
        zna0Var.j("Param", true);
        zna0Var.j("Block", true);
        zna0Var.j("PlayerId", true);
        zna0Var.j("PlayerName", true);
        zna0Var.j("PeriodName", true);
        zna0Var.j("SportName", true);
        zna0Var.j("GameId", true);
        zna0Var.j("MainGameId", true);
        zna0Var.j("Opp1", true);
        zna0Var.j("Opp2", true);
        zna0Var.j("Opp1Images", true);
        zna0Var.j("Opp2Images", true);
        zna0Var.j("Start", true);
        zna0Var.j("Kind", true);
        zna0Var.j("GameType", true);
        zna0Var.j("MarketName", true);
        zna0Var.j("Liga", true);
        zna0Var.j("FullName", true);
        zna0Var.j("PlayersDuel", true);
        zna0Var.j("Params", true);
        zna0Var.j("PlayerNames", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = mwe.z;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        tbl tblVar = tbl.f33669a;
        jiy jiyVarJ1 = mrv.j0(tblVar);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        jiy jiyVarJ3 = mrv.j0(s710Var);
        jiy jiyVarJ4 = mrv.j0(tblVar);
        jiy jiyVarJ5 = mrv.j0(sm8.f32432a);
        jiy jiyVarJ6 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[14].getValue()), mrv.j0((jiy) a8zVarArr[15].getValue()), mrv.j0(s710Var), mrv.j0(okx.f25427a), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(iga0.f14728a), mrv.j0((jiy) a8zVarArr[23].getValue()), mrv.j0((jiy) a8zVarArr[24].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        String str;
        int i;
        Long l;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = mwe.z;
        List list = null;
        List list2 = null;
        kga0 kga0Var = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        String str5 = null;
        List list3 = null;
        List list4 = null;
        Long l2 = null;
        Integer num = null;
        String str6 = null;
        String str7 = null;
        boolean z = true;
        Long l3 = null;
        Double d = null;
        Long l4 = null;
        Long l5 = null;
        Double d2 = null;
        Boolean bool = null;
        Long l6 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Long l7 = null;
        Long l8 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l3;
                    z = false;
                    list2 = list2;
                    str5 = str5;
                    l3 = l;
                    list = list;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l3);
                    i2 |= 1;
                    list2 = list2;
                    str3 = str3;
                    str5 = str5;
                    l3 = l;
                    list = list;
                    break;
                case 1:
                    str = str3;
                    d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                    i2 |= 2;
                    l4 = l4;
                    str3 = str;
                    list = list;
                    str5 = str5;
                    break;
                case 2:
                    str = str3;
                    l4 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l4);
                    i2 |= 4;
                    str3 = str;
                    list = list;
                    str5 = str5;
                    break;
                case 3:
                    str = str3;
                    l5 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l5);
                    i2 |= 8;
                    str3 = str;
                    list = list;
                    str5 = str5;
                    break;
                case 4:
                    str = str3;
                    d2 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d2);
                    i2 |= 16;
                    str3 = str;
                    list = list;
                    str5 = str5;
                    break;
                case 5:
                    str = str3;
                    bool = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool);
                    i2 |= 32;
                    str3 = str;
                    list = list;
                    str5 = str5;
                    break;
                case 6:
                    str = str3;
                    l6 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l6);
                    i2 |= 64;
                    str3 = str;
                    list = list;
                    str5 = str5;
                    break;
                case 7:
                    str = str3;
                    str8 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str8);
                    i2 |= 128;
                    str3 = str;
                    list = list;
                    str5 = str5;
                    break;
                case 8:
                    str = str3;
                    str9 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str9);
                    i2 |= 256;
                    str3 = str;
                    list = list;
                    str5 = str5;
                    break;
                case 9:
                    str = str3;
                    str10 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str10);
                    i2 |= 512;
                    str3 = str;
                    list = list;
                    str5 = str5;
                    break;
                case 10:
                    str = str3;
                    l7 = (Long) bldVarA.e(ugi0Var, 10, s710.f31729a, l7);
                    i2 |= 1024;
                    str3 = str;
                    list = list;
                    str5 = str5;
                    break;
                case 11:
                    str = str3;
                    l8 = (Long) bldVarA.e(ugi0Var, 11, s710.f31729a, l8);
                    i2 |= 2048;
                    str3 = str;
                    list = list;
                    str5 = str5;
                    break;
                case 12:
                    list = list;
                    str5 = str5;
                    str3 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str3);
                    i2 |= 4096;
                    list = list;
                    str5 = str5;
                    break;
                case 13:
                    list = list;
                    str5 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str5);
                    i2 |= 8192;
                    str3 = str3;
                    list = list;
                    break;
                case 14:
                    str3 = str3;
                    str5 = str5;
                    list3 = (List) bldVarA.e(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list3);
                    i2 |= 16384;
                    str3 = str3;
                    str5 = str5;
                    break;
                case 15:
                    list4 = (List) bldVarA.e(ugi0Var, 15, (jiy) a8zVarArr[15].getValue(), list4);
                    i = 32768;
                    i2 |= i;
                    str3 = str3;
                    str5 = str5;
                    break;
                case 16:
                    l2 = (Long) bldVarA.e(ugi0Var, 16, s710.f31729a, l2);
                    i = 65536;
                    i2 |= i;
                    str3 = str3;
                    str5 = str5;
                    break;
                case 17:
                    num = (Integer) bldVarA.e(ugi0Var, 17, okx.f25427a, num);
                    i = 131072;
                    i2 |= i;
                    str3 = str3;
                    str5 = str5;
                    break;
                case 18:
                    str6 = (String) bldVarA.e(ugi0Var, 18, ysm0.f43175a, str6);
                    i = 262144;
                    i2 |= i;
                    str3 = str3;
                    str5 = str5;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    str7 = (String) bldVarA.e(ugi0Var, 19, ysm0.f43175a, str7);
                    i = 524288;
                    i2 |= i;
                    str3 = str3;
                    str5 = str5;
                    break;
                case 20:
                    str4 = (String) bldVarA.e(ugi0Var, 20, ysm0.f43175a, str4);
                    i = 1048576;
                    i2 |= i;
                    str3 = str3;
                    str5 = str5;
                    break;
                case 21:
                    str2 = (String) bldVarA.e(ugi0Var, 21, ysm0.f43175a, str2);
                    i = 2097152;
                    i2 |= i;
                    str3 = str3;
                    str5 = str5;
                    break;
                case 22:
                    kga0Var = (kga0) bldVarA.e(ugi0Var, 22, iga0.f14728a, kga0Var);
                    i = 4194304;
                    i2 |= i;
                    str3 = str3;
                    str5 = str5;
                    break;
                case 23:
                    list2 = (List) bldVarA.e(ugi0Var, 23, (jiy) a8zVarArr[23].getValue(), list2);
                    i = 8388608;
                    i2 |= i;
                    str3 = str3;
                    str5 = str5;
                    break;
                case 24:
                    list = (List) bldVarA.e(ugi0Var, 24, (jiy) a8zVarArr[24].getValue(), list);
                    i = 16777216;
                    i2 |= i;
                    str3 = str3;
                    str5 = str5;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list5 = list;
        String str11 = str5;
        Long l9 = l3;
        Double d3 = d;
        Long l10 = l4;
        bldVarA.c(ugi0Var);
        String str12 = str10;
        String str13 = str7;
        return new mwe(i2, l9, d3, l10, l5, d2, bool, l6, str8, str9, str12, l7, l8, str3, str11, list3, list4, l2, num, str6, str13, str4, str2, kga0Var, list2, list5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mwe mweVar = (mwe) obj;
        mweVar.getClass();
        List list = mweVar.y;
        List list2 = mweVar.x;
        kga0 kga0Var = mweVar.w;
        String str = mweVar.v;
        String str2 = mweVar.u;
        String str3 = mweVar.t;
        String str4 = mweVar.s;
        Integer num = mweVar.r;
        Long l = mweVar.q;
        List list3 = mweVar.p;
        List list4 = mweVar.o;
        String str5 = mweVar.n;
        String str6 = mweVar.m;
        Long l2 = mweVar.l;
        Long l3 = mweVar.k;
        String str7 = mweVar.j;
        String str8 = mweVar.i;
        String str9 = mweVar.h;
        Long l4 = mweVar.g;
        Boolean bool = mweVar.f;
        Double d = mweVar.e;
        Long l5 = mweVar.d;
        Long l6 = mweVar.c;
        Double d2 = mweVar.b;
        Long l7 = mweVar.f22499a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = mwe.z;
        if (cldVarA.u(ugi0Var) || l7 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l7);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || l6 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l6);
        }
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 10, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 11, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str6 != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 15, (jiy) a8zVarArr[15].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 16, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 17, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 18, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 19, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 20, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 21, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || kga0Var != null) {
            cldVarA.p(ugi0Var, 22, iga0.f14728a, kga0Var);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 23, (jiy) a8zVarArr[23].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 24, (jiy) a8zVarArr[24].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
