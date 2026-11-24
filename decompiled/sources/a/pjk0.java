package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pjk0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pjk0 f27096a;
    private static final ugi0 descriptor;

    static {
        pjk0 pjk0Var = new pjk0();
        f27096a = pjk0Var;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.socket.SocketAuthorizationRequest", pjk0Var, 3);
        zna0Var.j(ParameterNames.ID, false);
        zna0Var.j("rt", false);
        zna0Var.j("pl", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, rjk0.f30599a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        String strX2 = null;
        tjk0 tjk0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX2 = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                tjk0Var = (tjk0) bldVarA.m(ugi0Var, 2, rjk0.f30599a, tjk0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new ujk0(i, strX, strX2, tjk0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ujk0 ujk0Var = (ujk0) obj;
        ujk0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, ujk0Var.f35786a);
        cldVarA.z(ugi0Var, 1, ujk0Var.b);
        cldVarA.m(ugi0Var, 2, rjk0.f30599a, ujk0Var.c);
        cldVarA.c(ugi0Var);
    }
}
