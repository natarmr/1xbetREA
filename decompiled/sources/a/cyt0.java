package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cyt0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cyt0 f5195a;
    private static final ugi0 descriptor;

    static {
        cyt0 cyt0Var = new cyt0();
        f5195a = cyt0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.valorant.ValorantPlayerStatisticResponse", cyt0Var, 11);
        zna0Var.j("N", true);
        zna0Var.j("IA", true);
        zna0Var.j("AN", true);
        zna0Var.j(TokenNames.K, true);
        zna0Var.j("A", true);
        zna0Var.j("D", true);
        zna0Var.j("WN", true);
        zna0Var.j(Payload.RESPONSE_OK, true);
        zna0Var.j("OD", true);
        zna0Var.j("MK", true);
        zna0Var.j(TokenNames.F, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(sm8.f32432a);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Integer num = null;
        Integer num2 = null;
        boolean z = true;
        Integer num3 = null;
        int i = 0;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        String str3 = null;
        Integer num7 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    break;
                case 3:
                    num4 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num4);
                    i |= 8;
                    break;
                case 4:
                    num5 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num5);
                    i |= 16;
                    break;
                case 5:
                    num6 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num6);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str3);
                    i |= 64;
                    break;
                case 7:
                    num7 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num7);
                    i |= 128;
                    break;
                case 8:
                    num3 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num3);
                    i |= 256;
                    break;
                case 9:
                    num2 = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num2);
                    i |= 512;
                    break;
                case 10:
                    num = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new eyt0(i, str, bool, str2, num4, num5, num6, str3, num7, num3, num2, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        eyt0 eyt0Var = (eyt0) obj;
        eyt0Var.getClass();
        Integer num = eyt0Var.k;
        Integer num2 = eyt0Var.j;
        Integer num3 = eyt0Var.i;
        Integer num4 = eyt0Var.h;
        String str = eyt0Var.g;
        Integer num5 = eyt0Var.f;
        Integer num6 = eyt0Var.e;
        Integer num7 = eyt0Var.d;
        String str2 = eyt0Var.c;
        Boolean bool = eyt0Var.b;
        String str3 = eyt0Var.f8643a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num7 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num7);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
