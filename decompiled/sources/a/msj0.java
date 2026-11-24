package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class msj0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final msj0 f22323a;
    private static final ugi0 descriptor;

    static {
        msj0 msj0Var = new msj0();
        f22323a = msj0Var;
        zna0 zna0Var = new zna0("org.xplatform.promo.impl.promocodes.data.models.ShowCasePromoRequest", msj0Var, 3);
        zna0Var.j(ParameterNames.ID, false);
        zna0Var.j(Payload.TYPE, false);
        zna0Var.j("amount", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{s710.f31729a, okxVar, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        long jR = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                iJ2 = bldVarA.j(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new osj0(i, iJ, iJ2, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        osj0 osj0Var = (osj0) obj;
        osj0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, osj0Var.f25785a);
        cldVarA.i(1, osj0Var.b, ugi0Var);
        cldVarA.i(2, osj0Var.c, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
