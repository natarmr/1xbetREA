package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fgo implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fgo f9501a;
    private static final ugi0 descriptor;

    static {
        fgo fgoVar = new fgo();
        f9501a = fgoVar;
        zna0 zna0Var = new zna0("org.xplatform.swipex.impl.data.model.EventResponse", fgoVar, 10);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("blocked", true);
        zna0Var.j("player", true);
        zna0Var.j("parameter", true);
        zna0Var.j("cf", true);
        zna0Var.j("cfView", true);
        zna0Var.j("isCenter", true);
        zna0Var.j("group", true);
        zna0Var.j("smallGroup", true);
        zna0Var.j("eventParams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ1 = mrv.j0(sm8Var);
        jiy jiyVarJ2 = mrv.j0(q9a0.f28338a);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(ysm0.f43175a), mrv.j0(sm8Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(efo.f7727a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        kfo kfoVar = null;
        boolean z = true;
        Integer num = null;
        int i = 0;
        Integer num2 = null;
        Boolean bool = null;
        jaa0 jaa0Var = null;
        Double d = null;
        Double d2 = null;
        String str = null;
        Boolean bool2 = null;
        Integer num3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num2 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num2);
                    i |= 1;
                    break;
                case 1:
                    bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                    i |= 2;
                    break;
                case 2:
                    jaa0Var = (jaa0) bldVarA.e(ugi0Var, 2, q9a0.f28338a, jaa0Var);
                    i |= 4;
                    break;
                case 3:
                    d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                    i |= 8;
                    break;
                case 4:
                    d2 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d2);
                    i |= 16;
                    break;
                case 5:
                    str = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str);
                    i |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool2);
                    i |= 64;
                    break;
                case 7:
                    num3 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num3);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i |= 256;
                    break;
                case 9:
                    kfoVar = (kfo) bldVarA.e(ugi0Var, 9, efo.f7727a, kfoVar);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new aho(i, num2, bool, jaa0Var, d, d2, str, bool2, num3, num, kfoVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        aho ahoVar = (aho) obj;
        ahoVar.getClass();
        kfo kfoVar = ahoVar.j;
        Integer num = ahoVar.i;
        Integer num2 = ahoVar.h;
        Boolean bool = ahoVar.g;
        String str = ahoVar.f;
        Double d = ahoVar.e;
        Double d2 = ahoVar.d;
        jaa0 jaa0Var = ahoVar.c;
        Boolean bool2 = ahoVar.b;
        Integer num3 = ahoVar.f883a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || jaa0Var != null) {
            cldVarA.p(ugi0Var, 2, q9a0.f28338a, jaa0Var);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || kfoVar != null) {
            cldVarA.p(ugi0Var, 9, efo.f7727a, kfoVar);
        }
        cldVarA.c(ugi0Var);
    }
}
