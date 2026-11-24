package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fi10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fi10 f9566a;
    private static final ugi0 descriptor;

    static {
        fi10 fi10Var = new fi10();
        f9566a = fi10Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.loyalty_program.impl.data.models.LoyaltyProgramLevelInfoResponse", fi10Var, 12);
        zna0Var.j("number", true);
        zna0Var.j("isLast", true);
        zna0Var.j("iconUrl", true);
        zna0Var.j("name", true);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("interval", true);
        zna0Var.j("pointsPerBet", true);
        zna0Var.j("betValue", true);
        zna0Var.j("maxPoints", true);
        zna0Var.j("minPoints", true);
        zna0Var.j("percent", true);
        zna0Var.j("bonusPoints", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(sm8.f32432a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(tbl.f33669a), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Integer num = null;
        String str = null;
        Integer num2 = null;
        boolean z = true;
        Integer num3 = null;
        int i = 0;
        Integer num4 = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num5 = null;
        Double d = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    num = num;
                    break;
                case 0:
                    num4 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num4);
                    i |= 1;
                    z = z;
                    num = num;
                    break;
                case 1:
                    bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                    i |= 2;
                    z = z;
                    num4 = num4;
                    break;
                case 2:
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    z = z;
                    num4 = num4;
                    break;
                case 3:
                    str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                    i |= 8;
                    z = z;
                    num4 = num4;
                    break;
                case 4:
                    str4 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str4);
                    i |= 16;
                    z = z;
                    num4 = num4;
                    break;
                case 5:
                    str5 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str5);
                    i |= 32;
                    z = z;
                    num4 = num4;
                    break;
                case 6:
                    num5 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num5);
                    i |= 64;
                    z = z;
                    num4 = num4;
                    break;
                case 7:
                    d = (Double) bldVarA.e(ugi0Var, 7, tbl.f33669a, d);
                    i |= 128;
                    z = z;
                    num4 = num4;
                    break;
                case 8:
                    num3 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num3);
                    i |= 256;
                    z = z;
                    num4 = num4;
                    break;
                case 9:
                    num2 = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num2);
                    i |= 512;
                    z = z;
                    num4 = num4;
                    break;
                case 10:
                    str = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str);
                    i |= 1024;
                    z = z;
                    num4 = num4;
                    break;
                case 11:
                    num = (Integer) bldVarA.e(ugi0Var, 11, okx.f25427a, num);
                    i |= 2048;
                    z = z;
                    num4 = num4;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new hi10(i, num4, bool, str2, str3, str4, str5, num5, d, num3, num2, str, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hi10 hi10Var = (hi10) obj;
        hi10Var.getClass();
        Integer num = hi10Var.l;
        String str = hi10Var.k;
        Integer num2 = hi10Var.j;
        Integer num3 = hi10Var.i;
        Double d = hi10Var.h;
        Integer num4 = hi10Var.g;
        String str2 = hi10Var.f;
        String str3 = hi10Var.e;
        String str4 = hi10Var.d;
        String str5 = hi10Var.c;
        Boolean bool = hi10Var.b;
        Integer num5 = hi10Var.f13092a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 7, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 11, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
