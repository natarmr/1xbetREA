package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dgo implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dgo f6051a;
    private static final ugi0 descriptor;

    static {
        dgo dgoVar = new dgo();
        f6051a = dgoVar;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.common.models.EventResponse", dgoVar, 8);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("blocked", true);
        zna0Var.j("player", true);
        zna0Var.j("parameter", true);
        zna0Var.j("cf", true);
        zna0Var.j("cfView", true);
        zna0Var.j("isCenter", true);
        zna0Var.j("eventParams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ1 = mrv.j0(sm8Var);
        jiy jiyVarJ2 = mrv.j0(r9a0.f30070a);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(ysm0.f43175a), mrv.j0(sm8Var), mrv.j0(ogo.f25231a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        Boolean bool = null;
        kaa0 kaa0Var = null;
        Double d = null;
        Double d2 = null;
        String str = null;
        Boolean bool2 = null;
        sgo sgoVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                    i |= 2;
                    break;
                case 2:
                    kaa0Var = (kaa0) bldVarA.e(ugi0Var, 2, r9a0.f30070a, kaa0Var);
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
                    sgoVar = (sgo) bldVarA.e(ugi0Var, 7, ogo.f25231a, sgoVar);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new ygo(i, l, bool, kaa0Var, d, d2, str, bool2, sgoVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ygo ygoVar = (ygo) obj;
        ygoVar.getClass();
        sgo sgoVar = ygoVar.h;
        Boolean bool = ygoVar.g;
        String str = ygoVar.f;
        Double d = ygoVar.e;
        Double d2 = ygoVar.d;
        kaa0 kaa0Var = ygoVar.c;
        Boolean bool2 = ygoVar.b;
        Long l = ygoVar.f42595a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || kaa0Var != null) {
            cldVarA.p(ugi0Var, 2, r9a0.f30070a, kaa0Var);
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
        if (cldVarA.u(ugi0Var) || sgoVar != null) {
            cldVarA.p(ugi0Var, 7, ogo.f25231a, sgoVar);
        }
        cldVarA.c(ugi0Var);
    }
}
