package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dkk0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dkk0 f6235a;
    private static final ugi0 descriptor;

    static {
        dkk0 dkk0Var = new dkk0();
        f6235a = dkk0Var;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.socket.SocketResponse", dkk0Var, 4);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("ci", true);
        zna0Var.j("rt", true);
        zna0Var.j("pl", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(fkk0.f9698a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        hkk0 hkk0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            } else if (iF == 2) {
                str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                hkk0Var = (hkk0) bldVarA.e(ugi0Var, 3, fkk0.f9698a, hkk0Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new ikk0(i, str, str2, str3, hkk0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ikk0 ikk0Var = (ikk0) obj;
        ikk0Var.getClass();
        hkk0 hkk0Var = ikk0Var.d;
        String str = ikk0Var.c;
        String str2 = ikk0Var.b;
        String str3 = ikk0Var.f14931a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || hkk0Var != null) {
            cldVarA.p(ugi0Var, 3, fkk0.f9698a, hkk0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
