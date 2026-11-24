package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l510 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l510 f19435a;
    private static final ugi0 descriptor;

    static {
        l510 l510Var = new l510();
        f19435a = l510Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.lol.impl.data.model.matches.LolStatisticMatchesMatchTeamResponse", l510Var, 18);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("feedId", true);
        zna0Var.j("name", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("isWinner", true);
        zna0Var.j("side", true);
        zna0Var.j("kills", true);
        zna0Var.j("deaths", true);
        zna0Var.j("assists", true);
        zna0Var.j("elderDrakeKills", true);
        zna0Var.j("towerKills", true);
        zna0Var.j("inhibitorKills", true);
        zna0Var.j("heraldKills", true);
        zna0Var.j("baronKills", true);
        zna0Var.j("dragonKills", true);
        zna0Var.j("goldEarned", true);
        zna0Var.j("bans", true);
        zna0Var.j("players", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = n510.s;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(sm8.f32432a);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[16].getValue()), mrv.j0((jiy) a8zVarArr[17].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        String str;
        int i;
        Long l;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = n510.s;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        int i2 = 0;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        List list = null;
        List list2 = null;
        String str2 = null;
        Integer num10 = null;
        boolean z = true;
        Long l2 = null;
        Long l3 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l2;
                    z = false;
                    num2 = num2;
                    num10 = num10;
                    l2 = l;
                    num = num;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l2);
                    i2 |= 1;
                    num2 = num2;
                    str2 = str2;
                    num10 = num10;
                    l2 = l;
                    num = num;
                    break;
                case 1:
                    str = str2;
                    l3 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l3);
                    i2 |= 2;
                    str3 = str3;
                    str2 = str;
                    num = num;
                    num10 = num10;
                    break;
                case 2:
                    str = str2;
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i2 |= 4;
                    str2 = str;
                    num = num;
                    num10 = num10;
                    break;
                case 3:
                    str = str2;
                    str4 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str4);
                    i2 |= 8;
                    str2 = str;
                    num = num;
                    num10 = num10;
                    break;
                case 4:
                    str = str2;
                    bool = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool);
                    i2 |= 16;
                    str2 = str;
                    num = num;
                    num10 = num10;
                    break;
                case 5:
                    num = num;
                    num10 = num10;
                    str2 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str2);
                    i2 |= 32;
                    num = num;
                    num10 = num10;
                    break;
                case 6:
                    num = num;
                    num10 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num10);
                    i2 |= 64;
                    str2 = str2;
                    num = num;
                    break;
                case 7:
                    str2 = str2;
                    num10 = num10;
                    num6 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num6);
                    i2 |= 128;
                    str2 = str2;
                    num10 = num10;
                    break;
                case 8:
                    str2 = str2;
                    num10 = num10;
                    num4 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num4);
                    i2 |= 256;
                    str2 = str2;
                    num10 = num10;
                    break;
                case 9:
                    str2 = str2;
                    num10 = num10;
                    num3 = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num3);
                    i2 |= 512;
                    str2 = str2;
                    num10 = num10;
                    break;
                case 10:
                    str2 = str2;
                    num10 = num10;
                    num2 = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num2);
                    i2 |= 1024;
                    str2 = str2;
                    num10 = num10;
                    break;
                case 11:
                    str2 = str2;
                    num10 = num10;
                    num = (Integer) bldVarA.e(ugi0Var, 11, okx.f25427a, num);
                    i2 |= 2048;
                    str2 = str2;
                    num10 = num10;
                    break;
                case 12:
                    str2 = str2;
                    num10 = num10;
                    num5 = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num5);
                    i2 |= 4096;
                    str2 = str2;
                    num10 = num10;
                    break;
                case 13:
                    str2 = str2;
                    num10 = num10;
                    num7 = (Integer) bldVarA.e(ugi0Var, 13, okx.f25427a, num7);
                    i2 |= 8192;
                    str2 = str2;
                    num10 = num10;
                    break;
                case 14:
                    str2 = str2;
                    num10 = num10;
                    num8 = (Integer) bldVarA.e(ugi0Var, 14, okx.f25427a, num8);
                    i2 |= 16384;
                    str2 = str2;
                    num10 = num10;
                    break;
                case 15:
                    num9 = (Integer) bldVarA.e(ugi0Var, 15, okx.f25427a, num9);
                    i = 32768;
                    i2 |= i;
                    str2 = str2;
                    num10 = num10;
                    break;
                case 16:
                    list = (List) bldVarA.e(ugi0Var, 16, (jiy) a8zVarArr[16].getValue(), list);
                    i = 65536;
                    i2 |= i;
                    str2 = str2;
                    num10 = num10;
                    break;
                case 17:
                    list2 = (List) bldVarA.e(ugi0Var, 17, (jiy) a8zVarArr[17].getValue(), list2);
                    i = 131072;
                    i2 |= i;
                    str2 = str2;
                    num10 = num10;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Integer num11 = num;
        Integer num12 = num10;
        bldVarA.c(ugi0Var);
        return new n510(i2, l2, l3, str3, str4, bool, str2, num12, num6, num4, num3, num2, num11, num5, num7, num8, num9, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        n510 n510Var = (n510) obj;
        n510Var.getClass();
        List list = n510Var.r;
        List list2 = n510Var.q;
        Integer num = n510Var.p;
        Integer num2 = n510Var.o;
        Integer num3 = n510Var.n;
        Integer num4 = n510Var.m;
        Integer num5 = n510Var.l;
        Integer num6 = n510Var.k;
        Integer num7 = n510Var.j;
        Integer num8 = n510Var.i;
        Integer num9 = n510Var.h;
        Integer num10 = n510Var.g;
        String str = n510Var.f;
        Boolean bool = n510Var.e;
        String str2 = n510Var.d;
        String str3 = n510Var.c;
        Long l = n510Var.b;
        Long l2 = n510Var.f22921a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = n510.s;
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num10 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num10);
        }
        if (cldVarA.u(ugi0Var) || num9 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num9);
        }
        if (cldVarA.u(ugi0Var) || num8 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num8);
        }
        if (cldVarA.u(ugi0Var) || num7 != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num7);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 11, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != 0) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != 0) {
            cldVarA.p(ugi0Var, 13, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 14, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 15, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 16, (jiy) a8zVarArr[16].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 17, (jiy) a8zVarArr[17].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
