package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g4h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g4h f10666a;
    private static final ugi0 descriptor;

    static {
        g4h g4hVar = new g4h();
        f10666a = g4hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.playerscomposition.lol.CyberLolPlayersResponse", g4hVar, 17);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("name", true);
        zna0Var.j("realName", true);
        zna0Var.j("country", true);
        zna0Var.j("countryImageS3", true);
        zna0Var.j("role", true);
        zna0Var.j("kda", true);
        zna0Var.j("kp", true);
        zna0Var.j("vspm", true);
        zna0Var.j("dmg", true);
        zna0Var.j("gold", true);
        zna0Var.j("image", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("wins", true);
        zna0Var.j("loses", true);
        zna0Var.j("heroes", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = i4h.r;
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0(ysm0Var);
        klq klqVar = klq.f18504a;
        jiy jiyVarJ7 = mrv.j0(klqVar);
        jiy jiyVarJ8 = mrv.j0(klqVar);
        jiy jiyVarJ9 = mrv.j0(klqVar);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[16].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        String str;
        int i;
        Long l;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = i4h.r;
        Integer num = null;
        Integer num2 = null;
        Float f = null;
        Float f2 = null;
        String str2 = null;
        Float f3 = null;
        int i2 = 0;
        String str3 = null;
        Integer num3 = null;
        Integer num4 = null;
        List list = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        boolean z = true;
        Long l2 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l2;
                    z = false;
                    num2 = num2;
                    str5 = str5;
                    l2 = l;
                    num = num;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l2);
                    i2 |= 1;
                    num2 = num2;
                    str4 = str4;
                    str5 = str5;
                    l2 = l;
                    num = num;
                    break;
                case 1:
                    str = str4;
                    str7 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str7);
                    i2 |= 2;
                    str8 = str8;
                    str4 = str;
                    num = num;
                    str5 = str5;
                    break;
                case 2:
                    str = str4;
                    str8 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str8);
                    i2 |= 4;
                    str4 = str;
                    num = num;
                    str5 = str5;
                    break;
                case 3:
                    str = str4;
                    str9 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str9);
                    i2 |= 8;
                    str4 = str;
                    num = num;
                    str5 = str5;
                    break;
                case 4:
                    num = num;
                    str5 = str5;
                    str4 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str4);
                    i2 |= 16;
                    num = num;
                    str5 = str5;
                    break;
                case 5:
                    num = num;
                    str5 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str5);
                    i2 |= 32;
                    str4 = str4;
                    num = num;
                    break;
                case 6:
                    str4 = str4;
                    str5 = str5;
                    str6 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str6);
                    i2 |= 64;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 7:
                    str4 = str4;
                    str5 = str5;
                    f3 = (Float) bldVarA.e(ugi0Var, 7, klq.f18504a, f3);
                    i2 |= 128;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 8:
                    str4 = str4;
                    str5 = str5;
                    f2 = (Float) bldVarA.e(ugi0Var, 8, klq.f18504a, f2);
                    i2 |= 256;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 9:
                    str4 = str4;
                    str5 = str5;
                    f = (Float) bldVarA.e(ugi0Var, 9, klq.f18504a, f);
                    i2 |= 512;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 10:
                    str4 = str4;
                    str5 = str5;
                    num2 = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num2);
                    i2 |= 1024;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 11:
                    str4 = str4;
                    str5 = str5;
                    num = (Integer) bldVarA.e(ugi0Var, 11, okx.f25427a, num);
                    i2 |= 2048;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 12:
                    str4 = str4;
                    str5 = str5;
                    str2 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str2);
                    i2 |= 4096;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 13:
                    str4 = str4;
                    str5 = str5;
                    str3 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str3);
                    i2 |= 8192;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 14:
                    str4 = str4;
                    str5 = str5;
                    num3 = (Integer) bldVarA.e(ugi0Var, 14, okx.f25427a, num3);
                    i2 |= 16384;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 15:
                    num4 = (Integer) bldVarA.e(ugi0Var, 15, okx.f25427a, num4);
                    i = 32768;
                    i2 |= i;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 16:
                    list = (List) bldVarA.e(ugi0Var, 16, (jiy) a8zVarArr[16].getValue(), list);
                    i = 65536;
                    i2 |= i;
                    str4 = str4;
                    str5 = str5;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Integer num5 = num;
        String str10 = str5;
        bldVarA.c(ugi0Var);
        return new i4h(i2, l2, str7, str8, str9, str4, str10, str6, f3, f2, f, num2, num5, str2, str3, num3, num4, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        i4h i4hVar = (i4h) obj;
        i4hVar.getClass();
        List list = i4hVar.q;
        Integer num = i4hVar.p;
        Integer num2 = i4hVar.o;
        String str = i4hVar.n;
        String str2 = i4hVar.m;
        Integer num3 = i4hVar.l;
        Integer num4 = i4hVar.k;
        Float f = i4hVar.j;
        Float f2 = i4hVar.i;
        Float f3 = i4hVar.h;
        String str3 = i4hVar.g;
        String str4 = i4hVar.f;
        String str5 = i4hVar.e;
        String str6 = i4hVar.d;
        String str7 = i4hVar.c;
        String str8 = i4hVar.b;
        Long l = i4hVar.f14145a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = i4h.r;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
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
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || f3 != null) {
            cldVarA.p(ugi0Var, 7, klq.f18504a, f3);
        }
        if (cldVarA.u(ugi0Var) || f2 != null) {
            cldVarA.p(ugi0Var, 8, klq.f18504a, f2);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 9, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 11, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str2 != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 14, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 15, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 16, (jiy) a8zVarArr[16].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
