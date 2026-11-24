package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kqf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kqf f18721a;
    private static final ugi0 descriptor;

    static {
        kqf kqfVar = new kqf();
        f18721a = kqfVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.cs2.Cs2PlayerStatisticResponse", kqfVar, 17);
        zna0Var.j("N", true);
        zna0Var.j(TokenNames.M, true);
        zna0Var.j(TokenNames.K, true);
        zna0Var.j("A", true);
        zna0Var.j("D", true);
        zna0Var.j(TokenNames.R, true);
        zna0Var.j("HP", true);
        zna0Var.j("HM", true);
        zna0Var.j("KV", true);
        zna0Var.j("DK", true);
        zna0Var.j("WP", true);
        zna0Var.j("BO", true);
        zna0Var.j("Al", true);
        zna0Var.j("GR", true);
        zna0Var.j("PX", true);
        zna0Var.j("PY", true);
        zna0Var.j("PZ", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = mqf.r;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        klq klqVar = klq.f18504a;
        jiy jiyVarJ1 = mrv.j0(klqVar);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(klqVar);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0((jiy) a8zVarArr[13].getValue()), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        String str;
        Integer num;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = mqf.r;
        Boolean bool = null;
        String str2 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        int i2 = 0;
        Map map = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Float f = null;
        Integer num6 = null;
        boolean z = true;
        String str3 = null;
        Float f2 = null;
        Integer num7 = null;
        Integer num8 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str3;
                    z = false;
                    str2 = str2;
                    f = f;
                    str3 = str;
                    bool = bool;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str3);
                    i2 |= 1;
                    str2 = str2;
                    num5 = num5;
                    f = f;
                    str3 = str;
                    bool = bool;
                    break;
                case 1:
                    num = num5;
                    f2 = (Float) bldVarA.e(ugi0Var, 1, klq.f18504a, f2);
                    i2 |= 2;
                    num7 = num7;
                    num5 = num;
                    f = f;
                    bool = bool;
                    break;
                case 2:
                    num = num5;
                    num7 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num7);
                    i2 |= 4;
                    num5 = num;
                    f = f;
                    bool = bool;
                    break;
                case 3:
                    num = num5;
                    num8 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num8);
                    i2 |= 8;
                    num5 = num;
                    f = f;
                    bool = bool;
                    break;
                case 4:
                    bool = bool;
                    f = f;
                    num5 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num5);
                    i2 |= 16;
                    f = f;
                    bool = bool;
                    break;
                case 5:
                    bool = bool;
                    f = (Float) bldVarA.e(ugi0Var, 5, klq.f18504a, f);
                    i2 |= 32;
                    num5 = num5;
                    bool = bool;
                    break;
                case 6:
                    num5 = num5;
                    f = f;
                    num6 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num6);
                    i2 |= 64;
                    num5 = num5;
                    f = f;
                    break;
                case 7:
                    num5 = num5;
                    f = f;
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool5);
                    i2 |= 128;
                    num5 = num5;
                    f = f;
                    break;
                case 8:
                    num5 = num5;
                    f = f;
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool3);
                    i2 |= 256;
                    num5 = num5;
                    f = f;
                    break;
                case 9:
                    num5 = num5;
                    f = f;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool2);
                    i2 |= 512;
                    num5 = num5;
                    f = f;
                    break;
                case 10:
                    num5 = num5;
                    f = f;
                    str2 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str2);
                    i2 |= 1024;
                    num5 = num5;
                    f = f;
                    break;
                case 11:
                    num5 = num5;
                    f = f;
                    bool = (Boolean) bldVarA.e(ugi0Var, 11, sm8.f32432a, bool);
                    i2 |= 2048;
                    num5 = num5;
                    f = f;
                    break;
                case 12:
                    num5 = num5;
                    f = f;
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 12, sm8.f32432a, bool4);
                    i2 |= 4096;
                    num5 = num5;
                    f = f;
                    break;
                case 13:
                    num5 = num5;
                    f = f;
                    map = (Map) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), map);
                    i2 |= 8192;
                    num5 = num5;
                    f = f;
                    break;
                case 14:
                    num5 = num5;
                    f = f;
                    num2 = (Integer) bldVarA.e(ugi0Var, 14, okx.f25427a, num2);
                    i2 |= 16384;
                    num5 = num5;
                    f = f;
                    break;
                case 15:
                    num3 = (Integer) bldVarA.e(ugi0Var, 15, okx.f25427a, num3);
                    i = 32768;
                    i2 |= i;
                    num5 = num5;
                    f = f;
                    break;
                case 16:
                    num4 = (Integer) bldVarA.e(ugi0Var, 16, okx.f25427a, num4);
                    i = 65536;
                    i2 |= i;
                    num5 = num5;
                    f = f;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool6 = bool;
        Float f3 = f;
        bldVarA.c(ugi0Var);
        return new mqf(i2, str3, f2, num7, num8, num5, f3, num6, bool5, bool3, bool2, str2, bool6, bool4, map, num2, num3, num4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mqf mqfVar = (mqf) obj;
        mqfVar.getClass();
        Integer num = mqfVar.q;
        Integer num2 = mqfVar.p;
        Integer num3 = mqfVar.o;
        Map map = mqfVar.n;
        Boolean bool = mqfVar.m;
        Boolean bool2 = mqfVar.l;
        String str = mqfVar.k;
        Boolean bool3 = mqfVar.j;
        Boolean bool4 = mqfVar.i;
        Boolean bool5 = mqfVar.h;
        Integer num4 = mqfVar.g;
        Float f = mqfVar.f;
        Integer num5 = mqfVar.e;
        Integer num6 = mqfVar.d;
        Integer num7 = mqfVar.c;
        Float f2 = mqfVar.b;
        String str2 = mqfVar.f22222a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = mqf.r;
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || f2 != null) {
            cldVarA.p(ugi0Var, 1, klq.f18504a, f2);
        }
        if (cldVarA.u(ugi0Var) || num7 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num7);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 5, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 11, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != 0) {
            cldVarA.p(ugi0Var, 12, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || map != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 14, okx.f25427a, num3);
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
