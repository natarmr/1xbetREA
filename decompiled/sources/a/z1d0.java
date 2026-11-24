package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z1d0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1d0 f43612a;
    private static final ugi0 descriptor;

    static {
        z1d0 z1d0Var = new z1d0();
        f43612a = z1d0Var;
        zna0 zna0Var = new zna0("org.xplatform.prophylaxis.impl.prophylaxis.data.models.ProphylaxisResponse", z1d0Var, 7);
        zna0Var.j(CommonConstant.ReqAccessTokenParam.STATE_LABEL, true);
        zna0Var.j("notifyState", true);
        zna0Var.j("projects", true);
        zna0Var.j("startedAt", true);
        zna0Var.j("endedAt", true);
        zna0Var.j("notifyStartedAt", true);
        zna0Var.j("notifyEndedAt", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = b2d0.h;
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ0 = mrv.j0(sm8Var);
        jiy jiyVarJ1 = mrv.j0(sm8Var);
        jiy jiyVarJ2 = mrv.j0((jiy) a8zVarArr[2].getValue());
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = b2d0.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        List list = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool);
                    i |= 1;
                    break;
                case 1:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool2);
                    i |= 2;
                    break;
                case 2:
                    list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l);
                    i |= 8;
                    break;
                case 4:
                    l2 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l2);
                    i |= 16;
                    break;
                case 5:
                    l3 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l3);
                    i |= 32;
                    break;
                case 6:
                    l4 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l4);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new b2d0(i, bool, bool2, list, l, l2, l3, l4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        b2d0 b2d0Var = (b2d0) obj;
        b2d0Var.getClass();
        Long l = b2d0Var.g;
        Long l2 = b2d0Var.f;
        Long l3 = b2d0Var.e;
        Long l4 = b2d0Var.d;
        List list = b2d0Var.c;
        Boolean bool = b2d0Var.b;
        Boolean bool2 = b2d0Var.f1847a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = b2d0.h;
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
