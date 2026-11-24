package a;

import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ji0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ji0 f16552a;
    private static final ugi0 descriptor;

    static {
        ji0 ji0Var = new ji0();
        f16552a = ji0Var;
        zna0 zna0Var = new zna0("org.xplatform.remoteconfig.data.AggregatorConfig", ji0Var, 25);
        zna0Var.j("hasCategoryAggregator", true);
        zna0Var.j("hasHistoryAggregator", true);
        zna0Var.j("hasHistoryHide", true);
        zna0Var.j("hasAggregatorSingleGame", true);
        zna0Var.j("hasPromoAggregator", true);
        zna0Var.j("hasPromoParticipation", true);
        zna0Var.j("hasPromoPoints", true);
        zna0Var.j("hasPromoRecommends", true);
        zna0Var.j("hasPromoRequest", true);
        zna0Var.j("hasPromoShop", true);
        zna0Var.j("hasListPromoPoints", true);
        zna0Var.j("hasListPromoRequest", true);
        zna0Var.j("hasProvidersAggregator", true);
        zna0Var.j("hasAggregatorBanners", true);
        zna0Var.j("hasAggregatorOnboarding", true);
        zna0Var.j("hasAggregatorBonusMessage", true);
        zna0Var.j("hasAggregatorCurrencyConvertToggle", true);
        zna0Var.j("hasAggregatorPlayerTasks", true);
        zna0Var.j("hasAggregatorPlayerTasksHistory", true);
        zna0Var.j("aggregatorPlayerTasksRequestsTimeout", true);
        zna0Var.j("hasAggregatorJackpot", true);
        zna0Var.j("hasSocialsAggregator", true);
        zna0Var.j("aggregatorMethodList", true);
        zna0Var.j("aggregatorMethodSpecialBanners", true);
        zna0Var.j("aggregatorMethodLayouts", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(okx.f25427a), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Boolean bool;
        Boolean bool2;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        int i2 = 0;
        Boolean bool8 = null;
        Boolean bool9 = null;
        Boolean bool10 = null;
        Boolean bool11 = null;
        Boolean bool12 = null;
        Boolean bool13 = null;
        Integer num = null;
        Boolean bool14 = null;
        boolean z = true;
        Boolean bool15 = null;
        Boolean bool16 = null;
        Boolean bool17 = null;
        Boolean bool18 = null;
        Boolean bool19 = null;
        Boolean bool20 = null;
        Boolean bool21 = null;
        Boolean bool22 = null;
        Boolean bool23 = null;
        Boolean bool24 = null;
        Boolean bool25 = null;
        Boolean bool26 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    bool = bool15;
                    z = false;
                    bool4 = bool4;
                    bool8 = bool8;
                    bool15 = bool;
                    bool3 = bool3;
                    break;
                case 0:
                    bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool15);
                    i2 |= 1;
                    bool4 = bool4;
                    bool6 = bool6;
                    bool8 = bool8;
                    bool15 = bool;
                    bool3 = bool3;
                    break;
                case 1:
                    bool2 = bool6;
                    bool16 = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool16);
                    i2 |= 2;
                    bool17 = bool17;
                    bool6 = bool2;
                    bool8 = bool8;
                    bool3 = bool3;
                    break;
                case 2:
                    bool2 = bool6;
                    bool17 = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool17);
                    i2 |= 4;
                    bool6 = bool2;
                    bool8 = bool8;
                    bool3 = bool3;
                    break;
                case 3:
                    bool2 = bool6;
                    bool18 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool18);
                    i2 |= 8;
                    bool6 = bool2;
                    bool8 = bool8;
                    bool3 = bool3;
                    break;
                case 4:
                    bool2 = bool6;
                    bool19 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool19);
                    i2 |= 16;
                    bool6 = bool2;
                    bool8 = bool8;
                    bool3 = bool3;
                    break;
                case 5:
                    bool2 = bool6;
                    bool20 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool20);
                    i2 |= 32;
                    bool6 = bool2;
                    bool8 = bool8;
                    bool3 = bool3;
                    break;
                case 6:
                    bool2 = bool6;
                    bool21 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool21);
                    i2 |= 64;
                    bool6 = bool2;
                    bool8 = bool8;
                    bool3 = bool3;
                    break;
                case 7:
                    bool2 = bool6;
                    bool22 = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool22);
                    i2 |= 128;
                    bool6 = bool2;
                    bool8 = bool8;
                    bool3 = bool3;
                    break;
                case 8:
                    bool2 = bool6;
                    bool23 = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool23);
                    i2 |= 256;
                    bool6 = bool2;
                    bool8 = bool8;
                    bool3 = bool3;
                    break;
                case 9:
                    bool2 = bool6;
                    bool24 = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool24);
                    i2 |= 512;
                    bool6 = bool2;
                    bool8 = bool8;
                    bool3 = bool3;
                    break;
                case 10:
                    bool2 = bool6;
                    bool25 = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool25);
                    i2 |= 1024;
                    bool6 = bool2;
                    bool8 = bool8;
                    bool3 = bool3;
                    break;
                case 11:
                    bool2 = bool6;
                    bool26 = (Boolean) bldVarA.e(ugi0Var, 11, sm8.f32432a, bool26);
                    i2 |= 2048;
                    bool6 = bool2;
                    bool8 = bool8;
                    bool3 = bool3;
                    break;
                case 12:
                    bool3 = bool3;
                    bool8 = bool8;
                    bool6 = (Boolean) bldVarA.e(ugi0Var, 12, sm8.f32432a, bool6);
                    i2 |= 4096;
                    bool8 = bool8;
                    bool3 = bool3;
                    break;
                case 13:
                    bool3 = bool3;
                    bool8 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool8);
                    i2 |= 8192;
                    bool6 = bool6;
                    bool3 = bool3;
                    break;
                case 14:
                    bool6 = bool6;
                    bool8 = bool8;
                    bool9 = (Boolean) bldVarA.e(ugi0Var, 14, sm8.f32432a, bool9);
                    i2 |= 16384;
                    bool6 = bool6;
                    bool8 = bool8;
                    break;
                case 15:
                    bool10 = (Boolean) bldVarA.e(ugi0Var, 15, sm8.f32432a, bool10);
                    i = 32768;
                    i2 |= i;
                    bool6 = bool6;
                    bool8 = bool8;
                    break;
                case 16:
                    bool11 = (Boolean) bldVarA.e(ugi0Var, 16, sm8.f32432a, bool11);
                    i = 65536;
                    i2 |= i;
                    bool6 = bool6;
                    bool8 = bool8;
                    break;
                case 17:
                    bool12 = (Boolean) bldVarA.e(ugi0Var, 17, sm8.f32432a, bool12);
                    i = 131072;
                    i2 |= i;
                    bool6 = bool6;
                    bool8 = bool8;
                    break;
                case 18:
                    bool13 = (Boolean) bldVarA.e(ugi0Var, 18, sm8.f32432a, bool13);
                    i = 262144;
                    i2 |= i;
                    bool6 = bool6;
                    bool8 = bool8;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    num = (Integer) bldVarA.e(ugi0Var, 19, okx.f25427a, num);
                    i = 524288;
                    i2 |= i;
                    bool6 = bool6;
                    bool8 = bool8;
                    break;
                case 20:
                    bool14 = (Boolean) bldVarA.e(ugi0Var, 20, sm8.f32432a, bool14);
                    i = 1048576;
                    i2 |= i;
                    bool6 = bool6;
                    bool8 = bool8;
                    break;
                case 21:
                    bool7 = (Boolean) bldVarA.e(ugi0Var, 21, sm8.f32432a, bool7);
                    i = 2097152;
                    i2 |= i;
                    bool6 = bool6;
                    bool8 = bool8;
                    break;
                case 22:
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 22, sm8.f32432a, bool5);
                    i = 4194304;
                    i2 |= i;
                    bool6 = bool6;
                    bool8 = bool8;
                    break;
                case 23:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 23, sm8.f32432a, bool4);
                    i = 8388608;
                    i2 |= i;
                    bool6 = bool6;
                    bool8 = bool8;
                    break;
                case 24:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 24, sm8.f32432a, bool3);
                    i = 16777216;
                    i2 |= i;
                    bool6 = bool6;
                    bool8 = bool8;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool27 = bool3;
        Boolean bool28 = bool8;
        Boolean bool29 = bool15;
        Boolean bool30 = bool16;
        Boolean bool31 = bool17;
        bldVarA.c(ugi0Var);
        Boolean bool32 = bool24;
        Integer num2 = num;
        Boolean bool33 = bool25;
        Boolean bool34 = bool14;
        return new li0(i2, bool29, bool30, bool31, bool18, bool19, bool20, bool21, bool22, bool23, bool32, bool33, bool26, bool6, bool28, bool9, bool10, bool11, bool12, bool13, num2, bool34, bool7, bool5, bool4, bool27);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        li0 li0Var = (li0) obj;
        li0Var.getClass();
        Boolean bool = li0Var.y;
        Boolean bool2 = li0Var.x;
        Boolean bool3 = li0Var.w;
        Boolean bool4 = li0Var.v;
        Boolean bool5 = li0Var.u;
        Integer num = li0Var.t;
        Boolean bool6 = li0Var.s;
        Boolean bool7 = li0Var.r;
        Boolean bool8 = li0Var.q;
        Boolean bool9 = li0Var.p;
        Boolean bool10 = li0Var.o;
        Boolean bool11 = li0Var.n;
        Boolean bool12 = li0Var.m;
        Boolean bool13 = li0Var.l;
        Boolean bool14 = li0Var.k;
        Boolean bool15 = li0Var.j;
        Boolean bool16 = li0Var.i;
        Boolean bool17 = li0Var.h;
        Boolean bool18 = li0Var.g;
        Boolean bool19 = li0Var.f;
        Boolean bool20 = li0Var.e;
        Boolean bool21 = li0Var.d;
        Boolean bool22 = li0Var.c;
        Boolean bool23 = li0Var.b;
        Boolean bool24 = li0Var.f20082a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || bool24 != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool24);
        }
        if (cldVarA.u(ugi0Var) || bool23 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool23);
        }
        if (cldVarA.u(ugi0Var) || bool22 != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool22);
        }
        if (cldVarA.u(ugi0Var) || bool21 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool21);
        }
        if (cldVarA.u(ugi0Var) || bool20 != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool20);
        }
        if (cldVarA.u(ugi0Var) || bool19 != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool19);
        }
        if (cldVarA.u(ugi0Var) || bool18 != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool18);
        }
        if (cldVarA.u(ugi0Var) || bool17 != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool17);
        }
        if (cldVarA.u(ugi0Var) || bool16 != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool16);
        }
        if (cldVarA.u(ugi0Var) || bool15 != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool15);
        }
        if (cldVarA.u(ugi0Var) || bool14 != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool14);
        }
        if (cldVarA.u(ugi0Var) || bool13 != null) {
            cldVarA.p(ugi0Var, 11, sm8.f32432a, bool13);
        }
        if (cldVarA.u(ugi0Var) || bool12 != 0) {
            cldVarA.p(ugi0Var, 12, sm8.f32432a, bool12);
        }
        if (cldVarA.u(ugi0Var) || bool11 != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool11);
        }
        if (cldVarA.u(ugi0Var) || bool10 != null) {
            cldVarA.p(ugi0Var, 14, sm8.f32432a, bool10);
        }
        if (cldVarA.u(ugi0Var) || bool9 != null) {
            cldVarA.p(ugi0Var, 15, sm8.f32432a, bool9);
        }
        if (cldVarA.u(ugi0Var) || bool8 != null) {
            cldVarA.p(ugi0Var, 16, sm8.f32432a, bool8);
        }
        if (cldVarA.u(ugi0Var) || bool7 != null) {
            cldVarA.p(ugi0Var, 17, sm8.f32432a, bool7);
        }
        if (cldVarA.u(ugi0Var) || bool6 != null) {
            cldVarA.p(ugi0Var, 18, sm8.f32432a, bool6);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 19, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 20, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 21, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 22, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 23, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 24, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
