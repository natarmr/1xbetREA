package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h8f0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h8f0 f12623a;
    private static final ugi0 descriptor;

    static {
        h8f0 h8f0Var = new h8f0();
        f12623a = h8f0Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.RegistrationUser", h8f0Var, 4);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("address", true);
        zna0Var.j("phone", true);
        zna0Var.j("token", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(t20.f33194a), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        v20 v20Var = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                v20Var = (v20) bldVarA.e(ugi0Var, 1, t20.f33194a, v20Var);
                i |= 2;
            } else if (iF == 2) {
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new j8f0(i, str, v20Var, str2, str3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        j8f0 j8f0Var = (j8f0) obj;
        j8f0Var.getClass();
        String str = j8f0Var.d;
        String str2 = j8f0Var.c;
        v20 v20Var = j8f0Var.b;
        String str3 = j8f0Var.f16081a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || v20Var != null) {
            cldVarA.p(ugi0Var, 1, t20.f33194a, v20Var);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
