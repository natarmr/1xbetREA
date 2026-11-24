package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j7u0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j7u0 f16058a;
    private static final ugi0 descriptor;

    static {
        j7u0 j7u0Var = new j7u0();
        f16058a = j7u0Var;
        zna0 zna0Var = new zna0("org.xplatform.remoteconfig.data.VerificationConfig", j7u0Var, 10);
        zna0Var.j("isNeedVerification", true);
        zna0Var.j("BlockDepositVerification", true);
        zna0Var.j("BlockWithdrawVerification", true);
        zna0Var.j("hasBlockAuthVerification", true);
        zna0Var.j("hasVerificationNeedBottom", true);
        zna0Var.j("isNeedCheckLimitsForNewsNotification", true);
        zna0Var.j("isNeedCheckLimitForPushSend", true);
        zna0Var.j("isNeedCheckEnabledPushForCustomerIO", true);
        zna0Var.j("isNeedSendPushAttributeToCustomerIO", true);
        zna0Var.j("redirectToVerificationAfterLogin", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Boolean bool;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Boolean bool2 = null;
        boolean z = true;
        int i = 0;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        Boolean bool10 = null;
        Boolean bool11 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool3);
                    i |= 1;
                    break;
                case 1:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool4);
                    i |= 2;
                    break;
                case 2:
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool5);
                    i |= 4;
                    break;
                case 3:
                    bool6 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool6);
                    i |= 8;
                    break;
                case 4:
                    bool7 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool7);
                    i |= 16;
                    break;
                case 5:
                    bool8 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool8);
                    i |= 32;
                    break;
                case 6:
                    bool9 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool9);
                    i |= 64;
                    break;
                case 7:
                    bool10 = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool10);
                    i |= 128;
                    break;
                case 8:
                    bool11 = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool11);
                    i |= 256;
                    break;
                case 9:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool2);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        l7u0 l7u0Var = new l7u0();
        if ((i & 1) == 0) {
            bool = null;
            l7u0Var.f19577a = null;
        } else {
            bool = null;
            l7u0Var.f19577a = bool3;
        }
        if ((i & 2) == 0) {
            l7u0Var.b = bool;
        } else {
            l7u0Var.b = bool4;
        }
        if ((i & 4) == 0) {
            l7u0Var.c = bool;
        } else {
            l7u0Var.c = bool5;
        }
        if ((i & 8) == 0) {
            l7u0Var.d = bool;
        } else {
            l7u0Var.d = bool6;
        }
        if ((i & 16) == 0) {
            l7u0Var.e = bool;
        } else {
            l7u0Var.e = bool7;
        }
        if ((i & 32) == 0) {
            l7u0Var.f = bool;
        } else {
            l7u0Var.f = bool8;
        }
        if ((i & 64) == 0) {
            l7u0Var.g = bool;
        } else {
            l7u0Var.g = bool9;
        }
        if ((i & 128) == 0) {
            l7u0Var.h = bool;
        } else {
            l7u0Var.h = bool10;
        }
        if ((i & 256) == 0) {
            l7u0Var.i = bool;
        } else {
            l7u0Var.i = bool11;
        }
        if ((i & 512) == 0) {
            l7u0Var.j = bool;
            return l7u0Var;
        }
        l7u0Var.j = bool2;
        return l7u0Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        l7u0 l7u0Var = (l7u0) obj;
        l7u0Var.getClass();
        Boolean bool = l7u0Var.j;
        Boolean bool2 = l7u0Var.i;
        Boolean bool3 = l7u0Var.h;
        Boolean bool4 = l7u0Var.g;
        Boolean bool5 = l7u0Var.f;
        Boolean bool6 = l7u0Var.e;
        Boolean bool7 = l7u0Var.d;
        Boolean bool8 = l7u0Var.c;
        Boolean bool9 = l7u0Var.b;
        Boolean bool10 = l7u0Var.f19577a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || bool10 != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool10);
        }
        if (cldVarA.u(ugi0Var) || bool9 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool9);
        }
        if (cldVarA.u(ugi0Var) || bool8 != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool8);
        }
        if (cldVarA.u(ugi0Var) || bool7 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool7);
        }
        if (cldVarA.u(ugi0Var) || bool6 != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool6);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
