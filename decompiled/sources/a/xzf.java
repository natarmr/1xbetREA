package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xzf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xzf f41751a;
    private static final ugi0 descriptor;

    static {
        xzf xzfVar = new xzf();
        f41751a = xzfVar;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.currency.CutCurrencyResponse", xzfVar, 2);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("isTop", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new zzf(i, bool, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zzf zzfVar = (zzf) obj;
        zzfVar.getClass();
        Boolean bool = zzfVar.b;
        Long l = zzfVar.f45251a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
