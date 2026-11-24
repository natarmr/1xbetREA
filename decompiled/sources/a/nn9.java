package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nn9 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nn9 f23810a;
    private static final ugi0 descriptor;

    static {
        nn9 nn9Var = new nn9();
        f23810a = nn9Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.championships.universal.data.model.calendar_tournament.CalendarTournamentResponse", nn9Var, 22);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("subSportId", true);
        zna0Var.j("feedId", true);
        zna0Var.j("globalId", true);
        zna0Var.j("name", true);
        zna0Var.j("description", true);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("location", true);
        zna0Var.j("prizePool", true);
        zna0Var.j("prizeDistribution", true);
        zna0Var.j("tier", true);
        zna0Var.j("teams", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("beginAt", true);
        zna0Var.j("endAt", true);
        zna0Var.j("beginAtStamp", true);
        zna0Var.j("endAtStamp", true);
        zna0Var.j("stages", true);
        zna0Var.j("lngSideLeft", true);
        zna0Var.j("swissGroupsDisplay", true);
        zna0Var.j("locationImageS3", true);
        zna0Var.j("dotaHeroes", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = pn9.w;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        jiy jiyVarJ3 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[9].getValue()), mrv.j0(okx.f25427a), mrv.j0((jiy) a8zVarArr[11].getValue()), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[17].getValue()), mrv.j0(sm8.f32432a), mrv.j0((jiy) a8zVarArr[19].getValue()), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[21].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        List list;
        int i;
        Long l;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = pn9.w;
        List list2 = null;
        Integer num = null;
        List list3 = null;
        List list4 = null;
        String str = null;
        String str2 = null;
        int i2 = 0;
        String str3 = null;
        String str4 = null;
        Long l2 = null;
        Long l3 = null;
        List list5 = null;
        Boolean bool = null;
        List list6 = null;
        boolean z = true;
        Long l4 = null;
        Long l5 = null;
        Long l6 = null;
        Long l7 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Long l8 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l4;
                    z = false;
                    list3 = list3;
                    l4 = l;
                    list2 = list2;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l4);
                    i2 |= 1;
                    l5 = l5;
                    list3 = list3;
                    num = num;
                    l4 = l;
                    list2 = list2;
                    break;
                case 1:
                    list = list3;
                    l5 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l5);
                    i2 |= 2;
                    l6 = l6;
                    list3 = list;
                    list2 = list2;
                    num = num;
                    break;
                case 2:
                    list = list3;
                    l6 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l6);
                    i2 |= 4;
                    list3 = list;
                    list2 = list2;
                    num = num;
                    break;
                case 3:
                    list = list3;
                    l7 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l7);
                    i2 |= 8;
                    list3 = list;
                    list2 = list2;
                    num = num;
                    break;
                case 4:
                    list = list3;
                    str5 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str5);
                    i2 |= 16;
                    list3 = list;
                    list2 = list2;
                    num = num;
                    break;
                case 5:
                    list = list3;
                    str6 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str6);
                    i2 |= 32;
                    list3 = list;
                    list2 = list2;
                    num = num;
                    break;
                case 6:
                    list = list3;
                    str7 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str7);
                    i2 |= 64;
                    list3 = list;
                    list2 = list2;
                    num = num;
                    break;
                case 7:
                    list = list3;
                    str8 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str8);
                    i2 |= 128;
                    list3 = list;
                    list2 = list2;
                    num = num;
                    break;
                case 8:
                    list = list3;
                    l8 = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l8);
                    i2 |= 256;
                    list3 = list;
                    list2 = list2;
                    num = num;
                    break;
                case 9:
                    list2 = list2;
                    num = num;
                    list3 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list3);
                    i2 |= 512;
                    list2 = list2;
                    num = num;
                    break;
                case 10:
                    list2 = list2;
                    num = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num);
                    i2 |= 1024;
                    list3 = list3;
                    list2 = list2;
                    break;
                case 11:
                    num = num;
                    list3 = list3;
                    list2 = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list2);
                    i2 |= 2048;
                    list3 = list3;
                    num = num;
                    break;
                case 12:
                    num = num;
                    list3 = list3;
                    str = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str);
                    i2 |= 4096;
                    list3 = list3;
                    num = num;
                    break;
                case 13:
                    num = num;
                    list3 = list3;
                    str3 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str3);
                    i2 |= 8192;
                    list3 = list3;
                    num = num;
                    break;
                case 14:
                    num = num;
                    list3 = list3;
                    str4 = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str4);
                    i2 |= 16384;
                    list3 = list3;
                    num = num;
                    break;
                case 15:
                    l2 = (Long) bldVarA.e(ugi0Var, 15, s710.f31729a, l2);
                    i = 32768;
                    i2 |= i;
                    list3 = list3;
                    num = num;
                    break;
                case 16:
                    l3 = (Long) bldVarA.e(ugi0Var, 16, s710.f31729a, l3);
                    i = 65536;
                    i2 |= i;
                    list3 = list3;
                    num = num;
                    break;
                case 17:
                    list5 = (List) bldVarA.e(ugi0Var, 17, (jiy) a8zVarArr[17].getValue(), list5);
                    i = 131072;
                    i2 |= i;
                    list3 = list3;
                    num = num;
                    break;
                case 18:
                    bool = (Boolean) bldVarA.e(ugi0Var, 18, sm8.f32432a, bool);
                    i = 262144;
                    i2 |= i;
                    list3 = list3;
                    num = num;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    list6 = (List) bldVarA.e(ugi0Var, 19, (jiy) a8zVarArr[19].getValue(), list6);
                    i = 524288;
                    i2 |= i;
                    list3 = list3;
                    num = num;
                    break;
                case 20:
                    str2 = (String) bldVarA.e(ugi0Var, 20, ysm0.f43175a, str2);
                    i = 1048576;
                    i2 |= i;
                    list3 = list3;
                    num = num;
                    break;
                case 21:
                    list4 = (List) bldVarA.e(ugi0Var, 21, (jiy) a8zVarArr[21].getValue(), list4);
                    i = 2097152;
                    i2 |= i;
                    list3 = list3;
                    num = num;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list7 = list2;
        List list8 = list3;
        Long l9 = l4;
        Long l10 = l5;
        Long l11 = l6;
        bldVarA.c(ugi0Var);
        List list9 = list6;
        return new pn9(i2, l9, l10, l11, l7, str5, str6, str7, str8, l8, list8, num, list7, str, str3, str4, l2, l3, list5, bool, list9, str2, list4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pn9 pn9Var = (pn9) obj;
        pn9Var.getClass();
        List list = pn9Var.v;
        String str = pn9Var.u;
        List list2 = pn9Var.t;
        Boolean bool = pn9Var.s;
        List list3 = pn9Var.r;
        Long l = pn9Var.q;
        Long l2 = pn9Var.p;
        String str2 = pn9Var.o;
        String str3 = pn9Var.n;
        String str4 = pn9Var.m;
        List list4 = pn9Var.l;
        Integer num = pn9Var.k;
        List list5 = pn9Var.j;
        Long l3 = pn9Var.i;
        String str5 = pn9Var.h;
        String str6 = pn9Var.g;
        String str7 = pn9Var.f;
        String str8 = pn9Var.e;
        Long l4 = pn9Var.d;
        Long l5 = pn9Var.c;
        Long l6 = pn9Var.b;
        Long l7 = pn9Var.f27276a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = pn9.w;
        if (cldVarA.u(ugi0Var) || l7 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l7);
        }
        if (cldVarA.u(ugi0Var) || l6 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l6);
        }
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || list5 != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list5);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || str4 != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 14, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 15, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 16, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 17, (jiy) a8zVarArr[17].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 18, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 19, (jiy) a8zVarArr[19].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 20, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 21, (jiy) a8zVarArr[21].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
