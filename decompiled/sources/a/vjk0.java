package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vjk0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vjk0 f37532a;
    private static final ugi0 descriptor;

    static {
        vjk0 vjk0Var = new vjk0();
        f37532a = vjk0Var;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.socket.SocketAuthorizationWithTokenRequest", vjk0Var, 3);
        zna0Var.j(ParameterNames.ID, false);
        zna0Var.j("rt", false);
        zna0Var.j("pl", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, xjk0.f40989a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        String strX2 = null;
        zjk0 zjk0Var = null;
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
                zjk0Var = (zjk0) bldVarA.m(ugi0Var, 2, xjk0.f40989a, zjk0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new akk0(i, strX, strX2, zjk0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        akk0 akk0Var = (akk0) obj;
        akk0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, akk0Var.f1026a);
        cldVarA.z(ugi0Var, 1, akk0Var.b);
        cldVarA.m(ugi0Var, 2, xjk0.f40989a, akk0Var.c);
        cldVarA.c(ugi0Var);
    }
}
