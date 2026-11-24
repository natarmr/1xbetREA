package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t410 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t410 f33297a;
    private static final ugi0 descriptor;

    static {
        t410 t410Var = new t410();
        f33297a = t410Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.lol.impl.data.model.matches.LolStatisticMatchesMatchTeamPlayerResponse", t410Var, 18);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("heroName", true);
        zna0Var.j("heroImageS3", true);
        zna0Var.j("position", true);
        zna0Var.j("level", true);
        zna0Var.j("kills", true);
        zna0Var.j("deaths", true);
        zna0Var.j("assists", true);
        zna0Var.j("totalDamageDealt", true);
        zna0Var.j("totalDamageTaken", true);
        zna0Var.j("minionsKilled", true);
        zna0Var.j("spells", true);
        zna0Var.j("items", true);
        zna0Var.j("trinket", true);
        zna0Var.j("primaryRunes", true);
        zna0Var.j("subRunes", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = v410.s;
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(okxVar);
        jiy jiyVarJ8 = mrv.j0(okxVar);
        jiy jiyVarJ9 = mrv.j0(okxVar);
        jiy jiyVarJ10 = mrv.j0(okxVar);
        jiy jiyVarJ11 = mrv.j0(okxVar);
        jiy jiyVarJ12 = mrv.j0(okxVar);
        jiy jiyVarJ13 = mrv.j0((jiy) a8zVarArr[13].getValue());
        jiy jiyVarJ14 = mrv.j0((jiy) a8zVarArr[14].getValue());
        jiy jiyVarJ15 = mrv.j0(i510.f14171a);
        a510 a510Var = a510.f247a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, jiyVarJ14, jiyVarJ15, mrv.j0(a510Var), mrv.j0(a510Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Long l;
        String str;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = v410.s;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        int i2 = 0;
        List list = null;
        List list2 = null;
        k510 k510Var = null;
        c510 c510Var = null;
        c510 c510Var2 = null;
        String str2 = null;
        Integer num7 = null;
        boolean z = true;
        Long l2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l2;
                    z = false;
                    num2 = num2;
                    num7 = num7;
                    l2 = l;
                    num = num;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l2);
                    i2 |= 1;
                    num2 = num2;
                    str2 = str2;
                    num7 = num7;
                    l2 = l;
                    num = num;
                    break;
                case 1:
                    str = str2;
                    str3 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str3);
                    i2 |= 2;
                    str4 = str4;
                    str2 = str;
                    num7 = num7;
                    num = num;
                    break;
                case 2:
                    str = str2;
                    str4 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str4);
                    i2 |= 4;
                    str2 = str;
                    num7 = num7;
                    num = num;
                    break;
                case 3:
                    str = str2;
                    str5 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str5);
                    i2 |= 8;
                    str2 = str;
                    num7 = num7;
                    num = num;
                    break;
                case 4:
                    str = str2;
                    str6 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str6);
                    i2 |= 16;
                    str2 = str;
                    num7 = num7;
                    num = num;
                    break;
                case 5:
                    num = num;
                    num7 = num7;
                    str2 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str2);
                    i2 |= 32;
                    num7 = num7;
                    num = num;
                    break;
                case 6:
                    num = num;
                    num7 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num7);
                    i2 |= 64;
                    str2 = str2;
                    num = num;
                    break;
                case 7:
                    str2 = str2;
                    num7 = num7;
                    num6 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num6);
                    i2 |= 128;
                    str2 = str2;
                    num7 = num7;
                    break;
                case 8:
                    str2 = str2;
                    num7 = num7;
                    num4 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num4);
                    i2 |= 256;
                    str2 = str2;
                    num7 = num7;
                    break;
                case 9:
                    str2 = str2;
                    num7 = num7;
                    num3 = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num3);
                    i2 |= 512;
                    str2 = str2;
                    num7 = num7;
                    break;
                case 10:
                    str2 = str2;
                    num7 = num7;
                    num2 = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num2);
                    i2 |= 1024;
                    str2 = str2;
                    num7 = num7;
                    break;
                case 11:
                    str2 = str2;
                    num7 = num7;
                    num = (Integer) bldVarA.e(ugi0Var, 11, okx.f25427a, num);
                    i2 |= 2048;
                    str2 = str2;
                    num7 = num7;
                    break;
                case 12:
                    str2 = str2;
                    num7 = num7;
                    num5 = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num5);
                    i2 |= 4096;
                    str2 = str2;
                    num7 = num7;
                    break;
                case 13:
                    str2 = str2;
                    num7 = num7;
                    list = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list);
                    i2 |= 8192;
                    str2 = str2;
                    num7 = num7;
                    break;
                case 14:
                    str2 = str2;
                    num7 = num7;
                    list2 = (List) bldVarA.e(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list2);
                    i2 |= 16384;
                    str2 = str2;
                    num7 = num7;
                    break;
                case 15:
                    k510Var = (k510) bldVarA.e(ugi0Var, 15, i510.f14171a, k510Var);
                    i = 32768;
                    i2 |= i;
                    str2 = str2;
                    num7 = num7;
                    break;
                case 16:
                    c510Var = (c510) bldVarA.e(ugi0Var, 16, a510.f247a, c510Var);
                    i = 65536;
                    i2 |= i;
                    str2 = str2;
                    num7 = num7;
                    break;
                case 17:
                    c510Var2 = (c510) bldVarA.e(ugi0Var, 17, a510.f247a, c510Var2);
                    i = 131072;
                    i2 |= i;
                    str2 = str2;
                    num7 = num7;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Integer num8 = num;
        Integer num9 = num7;
        bldVarA.c(ugi0Var);
        return new v410(i2, l2, str3, str4, str5, str6, str2, num9, num6, num4, num3, num2, num8, num5, list, list2, k510Var, c510Var, c510Var2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        v410 v410Var = (v410) obj;
        v410Var.getClass();
        c510 c510Var = v410Var.r;
        c510 c510Var2 = v410Var.q;
        k510 k510Var = v410Var.p;
        List list = v410Var.o;
        List list2 = v410Var.n;
        Integer num = v410Var.m;
        Integer num2 = v410Var.l;
        Integer num3 = v410Var.k;
        Integer num4 = v410Var.j;
        Integer num5 = v410Var.i;
        Integer num6 = v410Var.h;
        Integer num7 = v410Var.g;
        String str = v410Var.f;
        String str2 = v410Var.e;
        String str3 = v410Var.d;
        String str4 = v410Var.c;
        String str5 = v410Var.b;
        Long l = v410Var.f36757a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = v410.s;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num7 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num7);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 11, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != 0) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list2 != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || k510Var != null) {
            cldVarA.p(ugi0Var, 15, i510.f14171a, k510Var);
        }
        if (cldVarA.u(ugi0Var) || c510Var2 != null) {
            cldVarA.p(ugi0Var, 16, a510.f247a, c510Var2);
        }
        if (cldVarA.u(ugi0Var) || c510Var != null) {
            cldVarA.p(ugi0Var, 17, a510.f247a, c510Var);
        }
        cldVarA.c(ugi0Var);
    }
}
