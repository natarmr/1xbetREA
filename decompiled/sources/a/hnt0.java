package a;

import com.huawei.hms.push.AttributionReporter;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hnt0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hnt0 f13364a;
    private static final ugi0 descriptor;

    static {
        hnt0 hnt0Var = new hnt0();
        f13364a = hnt0Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.profile.model.UpdateUserDataRequest", hnt0Var, 6);
        zna0Var.j("isNotifyEnabled", false);
        zna0Var.j("isMarketingNotifyEnabled", false);
        zna0Var.j("deviceToken", false);
        zna0Var.j("subscriberType", false);
        zna0Var.j(AttributionReporter.APP_VERSION, false);
        zna0Var.j("projectNumber", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        sm8 sm8Var = sm8.f32432a;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{sm8Var, sm8Var, ysm0Var, okx.f25427a, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        boolean zB = false;
        boolean zB2 = false;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zB = bldVarA.B(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    zB2 = bldVarA.B(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strX = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iJ = bldVarA.j(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strX2 = bldVarA.x(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strX3 = bldVarA.x(ugi0Var, 5);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new jnt0(i, iJ, strX, strX2, strX3, zB, zB2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jnt0 jnt0Var = (jnt0) obj;
        jnt0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.x(ugi0Var, 0, jnt0Var.f16826a);
        cldVarA.x(ugi0Var, 1, jnt0Var.b);
        cldVarA.z(ugi0Var, 2, jnt0Var.c);
        cldVarA.i(3, jnt0Var.d, ugi0Var);
        cldVarA.z(ugi0Var, 4, jnt0Var.e);
        cldVarA.z(ugi0Var, 5, jnt0Var.f);
        cldVarA.c(ugi0Var);
    }
}
