package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b1q0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1q0 f1821a;
    private static final ugi0 descriptor;

    static {
        b1q0 b1q0Var = new b1q0();
        f1821a = b1q0Var;
        zna0 zna0Var = new zna0("org.xplatform.feature.office.test_section.api.domain.models.creds.TestCredModel", b1q0Var, 2);
        zna0Var.j("login", true);
        zna0Var.j(ParameterNames.PASSWORD, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        String strX2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                strX2 = bldVarA.x(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new d1q0(i, strX, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        d1q0 d1q0Var = (d1q0) obj;
        d1q0Var.getClass();
        String str = d1q0Var.b;
        String str2 = d1q0Var.f5322a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str2, "")) {
            cldVarA.z(ugi0Var, 0, str2);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "")) {
            cldVarA.z(ugi0Var, 1, str);
        }
        cldVarA.c(ugi0Var);
    }
}
