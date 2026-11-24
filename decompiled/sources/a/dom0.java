package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dom0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dom0 f6422a;
    private static final ugi0 descriptor;

    static {
        dom0 dom0Var = new dom0();
        f6422a = dom0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.promo.data.models.responses.StatusResponse", dom0Var, 2);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("description", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(onm0.f25554a), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        nnm0 nnm0Var = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                nnm0Var = (nnm0) bldVarA.e(ugi0Var, 0, onm0.f25554a, nnm0Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new fom0(i, nnm0Var, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fom0 fom0Var = (fom0) obj;
        fom0Var.getClass();
        String str = fom0Var.b;
        nnm0 nnm0Var = fom0Var.f9889a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || nnm0Var != null) {
            cldVarA.p(ugi0Var, 0, onm0.f25554a, nnm0Var);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
