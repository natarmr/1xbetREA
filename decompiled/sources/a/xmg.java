package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xmg implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xmg f41122a;
    private static final ugi0 descriptor;

    static {
        xmg xmgVar = new xmg();
        f41122a = xmgVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.playerscomposition.dota.CyberDotaPlayersResponse", xmgVar, 18);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("nick", true);
        zna0Var.j("realName", true);
        zna0Var.j("country", true);
        zna0Var.j("logo", true);
        zna0Var.j("logoS3", true);
        zna0Var.j("maps", true);
        zna0Var.j("win_rate", true);
        zna0Var.j("gpm", true);
        zna0Var.j("xpm", true);
        zna0Var.j("kda", true);
        zna0Var.j("captain", true);
        zna0Var.j("position", true);
        zna0Var.j("heroes", true);
        zna0Var.j("flag", true);
        zna0Var.j("flagS3", true);
        zna0Var.j("rankImageS3", true);
        zna0Var.j("rank", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = zmg.s;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        klq klqVar = klq.f18504a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, mrv.j0(klqVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(klqVar), mrv.j0(sm8.f32432a), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[13].getValue()), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Integer num;
        String str;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = zmg.s;
        Boolean bool = null;
        Float f = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Float f2 = null;
        int i2 = 0;
        List list = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num5 = null;
        String str5 = null;
        Integer num6 = null;
        boolean z = true;
        Integer num7 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num = num7;
                    z = false;
                    f = f;
                    num6 = num6;
                    num7 = num;
                    bool = bool;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num7);
                    i2 |= 1;
                    f = f;
                    str5 = str5;
                    num6 = num6;
                    num7 = num;
                    bool = bool;
                    break;
                case 1:
                    str = str5;
                    str6 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str6);
                    i2 |= 2;
                    str7 = str7;
                    str5 = str;
                    num6 = num6;
                    bool = bool;
                    break;
                case 2:
                    str = str5;
                    str7 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str7);
                    i2 |= 4;
                    str5 = str;
                    num6 = num6;
                    bool = bool;
                    break;
                case 3:
                    str = str5;
                    str8 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str8);
                    i2 |= 8;
                    str5 = str;
                    num6 = num6;
                    bool = bool;
                    break;
                case 4:
                    str = str5;
                    str9 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str9);
                    i2 |= 16;
                    str5 = str;
                    num6 = num6;
                    bool = bool;
                    break;
                case 5:
                    bool = bool;
                    num6 = num6;
                    str5 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str5);
                    i2 |= 32;
                    num6 = num6;
                    bool = bool;
                    break;
                case 6:
                    bool = bool;
                    num6 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num6);
                    i2 |= 64;
                    str5 = str5;
                    bool = bool;
                    break;
                case 7:
                    str5 = str5;
                    num6 = num6;
                    f2 = (Float) bldVarA.e(ugi0Var, 7, klq.f18504a, f2);
                    i2 |= 128;
                    str5 = str5;
                    num6 = num6;
                    break;
                case 8:
                    str5 = str5;
                    num6 = num6;
                    num3 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num3);
                    i2 |= 256;
                    str5 = str5;
                    num6 = num6;
                    break;
                case 9:
                    str5 = str5;
                    num6 = num6;
                    num2 = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num2);
                    i2 |= 512;
                    str5 = str5;
                    num6 = num6;
                    break;
                case 10:
                    str5 = str5;
                    num6 = num6;
                    f = (Float) bldVarA.e(ugi0Var, 10, klq.f18504a, f);
                    i2 |= 1024;
                    str5 = str5;
                    num6 = num6;
                    break;
                case 11:
                    str5 = str5;
                    num6 = num6;
                    bool = (Boolean) bldVarA.e(ugi0Var, 11, sm8.f32432a, bool);
                    i2 |= 2048;
                    str5 = str5;
                    num6 = num6;
                    break;
                case 12:
                    str5 = str5;
                    num6 = num6;
                    num4 = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num4);
                    i2 |= 4096;
                    str5 = str5;
                    num6 = num6;
                    break;
                case 13:
                    str5 = str5;
                    num6 = num6;
                    list = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list);
                    i2 |= 8192;
                    str5 = str5;
                    num6 = num6;
                    break;
                case 14:
                    str5 = str5;
                    num6 = num6;
                    str2 = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str2);
                    i2 |= 16384;
                    str5 = str5;
                    num6 = num6;
                    break;
                case 15:
                    str3 = (String) bldVarA.e(ugi0Var, 15, ysm0.f43175a, str3);
                    i = 32768;
                    i2 |= i;
                    str5 = str5;
                    num6 = num6;
                    break;
                case 16:
                    str4 = (String) bldVarA.e(ugi0Var, 16, ysm0.f43175a, str4);
                    i = 65536;
                    i2 |= i;
                    str5 = str5;
                    num6 = num6;
                    break;
                case 17:
                    num5 = (Integer) bldVarA.e(ugi0Var, 17, okx.f25427a, num5);
                    i = 131072;
                    i2 |= i;
                    str5 = str5;
                    num6 = num6;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool2 = bool;
        Integer num8 = num6;
        bldVarA.c(ugi0Var);
        return new zmg(i2, num7, str6, str7, str8, str9, str5, num8, f2, num3, num2, f, bool2, num4, list, str2, str3, str4, num5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zmg zmgVar = (zmg) obj;
        zmgVar.getClass();
        Integer num = zmgVar.r;
        String str = zmgVar.q;
        String str2 = zmgVar.p;
        String str3 = zmgVar.o;
        List list = zmgVar.n;
        Integer num2 = zmgVar.m;
        Boolean bool = zmgVar.l;
        Float f = zmgVar.k;
        Integer num3 = zmgVar.j;
        Integer num4 = zmgVar.i;
        Float f2 = zmgVar.h;
        Integer num5 = zmgVar.g;
        String str4 = zmgVar.f;
        String str5 = zmgVar.e;
        String str6 = zmgVar.d;
        String str7 = zmgVar.c;
        String str8 = zmgVar.b;
        Integer num6 = zmgVar.f44625a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = zmg.s;
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || f2 != null) {
            cldVarA.p(ugi0Var, 7, klq.f18504a, f2);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 10, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 11, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num2 != 0) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || list != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 14, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 15, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 16, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 17, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
