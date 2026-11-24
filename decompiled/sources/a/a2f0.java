package a;

import android.gov.nist.javax.sip.stack.SIPServerTransaction;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a2f0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a2f0 f121a;
    private static final ugi0 descriptor;

    static {
        a2f0 a2f0Var = new a2f0();
        f121a = a2f0Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.RegistrationRequest", a2f0Var, 6);
        zna0Var.j("sessionId", false);
        zna0Var.j("projectId", false);
        zna0Var.j("language", false);
        zna0Var.j("userProfile", false);
        zna0Var.j(SIPServerTransaction.CONTENT_TYPE_APPLICATION, false);
        zna0Var.j("rpcProps", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(dig0.f6137a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, ysm0Var, h8f0.f12623a, hr3.f13511a, jiyVarJ0};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        j8f0 j8f0Var = null;
        jr3 jr3Var = null;
        fig0 fig0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strX = bldVarA.x(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strX2 = bldVarA.x(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strX3 = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    j8f0Var = (j8f0) bldVarA.m(ugi0Var, 3, h8f0.f12623a, j8f0Var);
                    i |= 8;
                    break;
                case 4:
                    jr3Var = (jr3) bldVarA.m(ugi0Var, 4, hr3.f13511a, jr3Var);
                    i |= 16;
                    break;
                case 5:
                    fig0Var = (fig0) bldVarA.e(ugi0Var, 5, dig0.f6137a, fig0Var);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new e2f0(i, strX, strX2, strX3, j8f0Var, jr3Var, fig0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        e2f0 e2f0Var = (e2f0) obj;
        e2f0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, e2f0Var.f7082a);
        cldVarA.z(ugi0Var, 1, e2f0Var.b);
        cldVarA.z(ugi0Var, 2, e2f0Var.c);
        cldVarA.m(ugi0Var, 3, h8f0.f12623a, e2f0Var.d);
        cldVarA.m(ugi0Var, 4, hr3.f13511a, e2f0Var.e);
        cldVarA.p(ugi0Var, 5, dig0.f6137a, e2f0Var.f);
        cldVarA.c(ugi0Var);
    }
}
