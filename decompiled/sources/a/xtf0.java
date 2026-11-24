package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xtf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xtf0 f41464a;
    private static final ugi0 descriptor;

    static {
        xtf0 xtf0Var = new xtf0();
        f41464a = xtf0Var;
        zna0 zna0Var = new zna0("org.xplatform.remoteconfig.data.ResponsibleConfig", xtf0Var, 9);
        zna0Var.j("hasResponsibleRules", true);
        zna0Var.j("hasResponsibleRegistration", true);
        zna0Var.j("hasResponsibleBlockUser", true);
        zna0Var.j("linkToResponsible", true);
        zna0Var.j("hasResponsibleTop", true);
        zna0Var.j("hasResponsibleInfo", true);
        zna0Var.j("hasResponsiblePersonalData", true);
        zna0Var.j("hasResponsibleAccountManagement", true);
        zna0Var.j("hasResponsibleBottomPopular", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(ysm0.f43175a), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ?? r1;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool);
                    i |= 1;
                    break;
                case 1:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool2);
                    i |= 2;
                    break;
                case 2:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool3);
                    i |= 4;
                    break;
                case 3:
                    str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                    i |= 8;
                    break;
                case 4:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool4);
                    i |= 16;
                    break;
                case 5:
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool5);
                    i |= 32;
                    break;
                case 6:
                    bool6 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool6);
                    i |= 64;
                    break;
                case 7:
                    bool7 = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool7);
                    i |= 128;
                    break;
                case 8:
                    bool8 = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool8);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        ztf0 ztf0Var = new ztf0();
        if ((i & 1) == 0) {
            r1 = 0;
            ztf0Var.f44957a = null;
        } else {
            r1 = 0;
            ztf0Var.f44957a = bool;
        }
        if ((i & 2) == 0) {
            ztf0Var.b = r1;
        } else {
            ztf0Var.b = bool2;
        }
        if ((i & 4) == 0) {
            ztf0Var.c = r1;
        } else {
            ztf0Var.c = bool3;
        }
        if ((i & 8) == 0) {
            ztf0Var.d = r1;
        } else {
            ztf0Var.d = str;
        }
        if ((i & 16) == 0) {
            ztf0Var.e = r1;
        } else {
            ztf0Var.e = bool4;
        }
        if ((i & 32) == 0) {
            ztf0Var.f = r1;
        } else {
            ztf0Var.f = bool5;
        }
        if ((i & 64) == 0) {
            ztf0Var.g = r1;
        } else {
            ztf0Var.g = bool6;
        }
        if ((i & 128) == 0) {
            ztf0Var.h = r1;
        } else {
            ztf0Var.h = bool7;
        }
        if ((i & 256) == 0) {
            ztf0Var.i = r1;
            return ztf0Var;
        }
        ztf0Var.i = bool8;
        return ztf0Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ztf0 ztf0Var = (ztf0) obj;
        ztf0Var.getClass();
        Boolean bool = ztf0Var.i;
        Boolean bool2 = ztf0Var.h;
        Boolean bool3 = ztf0Var.g;
        Boolean bool4 = ztf0Var.f;
        Boolean bool5 = ztf0Var.e;
        String str = ztf0Var.d;
        Boolean bool6 = ztf0Var.c;
        Boolean bool7 = ztf0Var.b;
        Boolean bool8 = ztf0Var.f44957a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || bool8 != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool8);
        }
        if (cldVarA.u(ugi0Var) || bool7 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool7);
        }
        if (cldVarA.u(ugi0Var) || bool6 != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool6);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
