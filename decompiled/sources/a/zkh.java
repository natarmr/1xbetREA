package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zkh implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zkh f44532a;
    private static final ugi0 descriptor;

    static {
        zkh zkhVar = new zkh();
        f44532a = zkhVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.tournament_bracket.data.model.CyberTournamentBracketResponse", zkhVar, 21);
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
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = blh.v;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        jiy jiyVarJ3 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[9].getValue()), mrv.j0(okx.f25427a), mrv.j0((jiy) a8zVarArr[11].getValue()), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[17].getValue()), mrv.j0(sm8.f32432a), mrv.j0((jiy) a8zVarArr[19].getValue()), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Long l;
        Long l2;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = blh.v;
        List list = null;
        Integer num = null;
        List list2 = null;
        Long l3 = null;
        String str = null;
        String str2 = null;
        int i2 = 0;
        String str3 = null;
        String str4 = null;
        Long l4 = null;
        Long l5 = null;
        List list3 = null;
        Boolean bool = null;
        List list4 = null;
        boolean z = true;
        Long l6 = null;
        Long l7 = null;
        Long l8 = null;
        Long l9 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l6;
                    z = false;
                    num = num;
                    l3 = l3;
                    l6 = l;
                    list = list;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l6);
                    i2 |= 1;
                    num = num;
                    l3 = l3;
                    list2 = list2;
                    l6 = l;
                    list = list;
                    break;
                case 1:
                    l2 = l3;
                    l7 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l7);
                    i2 |= 2;
                    l8 = l8;
                    l3 = l2;
                    list2 = list2;
                    list = list;
                    break;
                case 2:
                    l2 = l3;
                    l8 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l8);
                    i2 |= 4;
                    l3 = l2;
                    list2 = list2;
                    list = list;
                    break;
                case 3:
                    l2 = l3;
                    l9 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l9);
                    i2 |= 8;
                    l3 = l2;
                    list2 = list2;
                    list = list;
                    break;
                case 4:
                    l2 = l3;
                    str5 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str5);
                    i2 |= 16;
                    l3 = l2;
                    list2 = list2;
                    list = list;
                    break;
                case 5:
                    l2 = l3;
                    str6 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str6);
                    i2 |= 32;
                    l3 = l2;
                    list2 = list2;
                    list = list;
                    break;
                case 6:
                    l2 = l3;
                    str7 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str7);
                    i2 |= 64;
                    l3 = l2;
                    list2 = list2;
                    list = list;
                    break;
                case 7:
                    l2 = l3;
                    str8 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str8);
                    i2 |= 128;
                    l3 = l2;
                    list2 = list2;
                    list = list;
                    break;
                case 8:
                    list = list;
                    list2 = list2;
                    l3 = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l3);
                    i2 |= 256;
                    list2 = list2;
                    list = list;
                    break;
                case 9:
                    list = list;
                    list2 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list2);
                    i2 |= 512;
                    l3 = l3;
                    list = list;
                    break;
                case 10:
                    list2 = list2;
                    l3 = l3;
                    num = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num);
                    i2 |= 1024;
                    l3 = l3;
                    list2 = list2;
                    break;
                case 11:
                    list2 = list2;
                    l3 = l3;
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i2 |= 2048;
                    l3 = l3;
                    list2 = list2;
                    break;
                case 12:
                    list2 = list2;
                    l3 = l3;
                    str = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str);
                    i2 |= 4096;
                    l3 = l3;
                    list2 = list2;
                    break;
                case 13:
                    list2 = list2;
                    l3 = l3;
                    str3 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str3);
                    i2 |= 8192;
                    l3 = l3;
                    list2 = list2;
                    break;
                case 14:
                    list2 = list2;
                    l3 = l3;
                    str4 = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str4);
                    i2 |= 16384;
                    l3 = l3;
                    list2 = list2;
                    break;
                case 15:
                    l4 = (Long) bldVarA.e(ugi0Var, 15, s710.f31729a, l4);
                    i = 32768;
                    i2 |= i;
                    l3 = l3;
                    list2 = list2;
                    break;
                case 16:
                    l5 = (Long) bldVarA.e(ugi0Var, 16, s710.f31729a, l5);
                    i = 65536;
                    i2 |= i;
                    l3 = l3;
                    list2 = list2;
                    break;
                case 17:
                    list3 = (List) bldVarA.e(ugi0Var, 17, (jiy) a8zVarArr[17].getValue(), list3);
                    i = 131072;
                    i2 |= i;
                    l3 = l3;
                    list2 = list2;
                    break;
                case 18:
                    bool = (Boolean) bldVarA.e(ugi0Var, 18, sm8.f32432a, bool);
                    i = 262144;
                    i2 |= i;
                    l3 = l3;
                    list2 = list2;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    list4 = (List) bldVarA.e(ugi0Var, 19, (jiy) a8zVarArr[19].getValue(), list4);
                    i = 524288;
                    i2 |= i;
                    l3 = l3;
                    list2 = list2;
                    break;
                case 20:
                    str2 = (String) bldVarA.e(ugi0Var, 20, ysm0.f43175a, str2);
                    i = 1048576;
                    i2 |= i;
                    l3 = l3;
                    list2 = list2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list5 = list;
        Long l10 = l3;
        Long l11 = l6;
        Long l12 = l7;
        Long l13 = l8;
        bldVarA.c(ugi0Var);
        List list6 = list4;
        return new blh(i2, l11, l12, l13, l9, str5, str6, str7, str8, l10, list2, num, list5, str, str3, str4, l4, l5, list3, bool, list6, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        blh blhVar = (blh) obj;
        blhVar.getClass();
        String str = blhVar.u;
        List list = blhVar.t;
        Boolean bool = blhVar.s;
        List list2 = blhVar.r;
        Long l = blhVar.q;
        Long l2 = blhVar.p;
        String str2 = blhVar.o;
        String str3 = blhVar.n;
        String str4 = blhVar.m;
        List list3 = blhVar.l;
        Integer num = blhVar.k;
        List list4 = blhVar.j;
        Long l3 = blhVar.i;
        String str5 = blhVar.h;
        String str6 = blhVar.g;
        String str7 = blhVar.f;
        String str8 = blhVar.e;
        Long l4 = blhVar.d;
        Long l5 = blhVar.c;
        Long l6 = blhVar.b;
        Long l7 = blhVar.f2795a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = blh.v;
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
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list3);
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
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 17, (jiy) a8zVarArr[17].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 18, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 19, (jiy) a8zVarArr[19].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 20, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
