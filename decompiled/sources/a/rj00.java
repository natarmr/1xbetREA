package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rj00 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rj00 f30568a;
    private static final ugi0 descriptor;

    static {
        rj00 rj00Var = new rj00();
        f30568a = rj00Var;
        zna0 zna0Var = new zna0("org.xplatform.swipex.impl.data.model.LiveGameEventResponse", rj00Var, 7);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("player", true);
        zna0Var.j("cf", true);
        zna0Var.j("cfView", true);
        zna0Var.j("isCenter", true);
        zna0Var.j("blocked", true);
        zna0Var.j("parameter", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(okx.f25427a);
        jiy jiyVarJ1 = mrv.j0(q9a0.f28338a);
        tbl tblVar = tbl.f33669a;
        jiy jiyVarJ2 = mrv.j0(tblVar);
        jiy jiyVarJ3 = mrv.j0(ysm0.f43175a);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(tblVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        jaa0 jaa0Var = null;
        Double d = null;
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Double d2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    jaa0Var = (jaa0) bldVarA.e(ugi0Var, 1, q9a0.f28338a, jaa0Var);
                    i |= 2;
                    break;
                case 2:
                    d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                    i |= 4;
                    break;
                case 3:
                    str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool);
                    i |= 16;
                    break;
                case 5:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool2);
                    i |= 32;
                    break;
                case 6:
                    d2 = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d2);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new tj00(i, num, jaa0Var, d, str, bool, bool2, d2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tj00 tj00Var = (tj00) obj;
        tj00Var.getClass();
        Double d = tj00Var.g;
        Boolean bool = tj00Var.f;
        Boolean bool2 = tj00Var.e;
        String str = tj00Var.d;
        Double d2 = tj00Var.c;
        jaa0 jaa0Var = tj00Var.b;
        Integer num = tj00Var.f34030a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || jaa0Var != null) {
            cldVarA.p(ugi0Var, 1, q9a0.f28338a, jaa0Var);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 6, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
