package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o2w0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o2w0 f24551a;
    private static final ugi0 descriptor;

    static {
        o2w0 o2w0Var = new o2w0();
        f24551a = o2w0Var;
        zna0 zna0Var = new zna0("org.xplatform.social.impl.socials.yandex.YandexLoginResponse", o2w0Var, 4);
        zna0Var.j("first_name", true);
        zna0Var.j("last_name", true);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("default_email", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, ysm0Var, ysm0Var};
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
        String strX4 = null;
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
            } else if (iF == 2) {
                strX3 = bldVarA.x(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                strX4 = bldVarA.x(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new q2w0(i, strX, strX2, strX3, strX4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        q2w0 q2w0Var = (q2w0) obj;
        q2w0Var.getClass();
        String str = q2w0Var.d;
        String str2 = q2w0Var.c;
        String str3 = q2w0Var.b;
        String str4 = q2w0Var.f28022a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str4, "")) {
            cldVarA.z(ugi0Var, 0, str4);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str3, "")) {
            cldVarA.z(ugi0Var, 1, str3);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str2, "")) {
            cldVarA.z(ugi0Var, 2, str2);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "")) {
            cldVarA.z(ugi0Var, 3, str);
        }
        cldVarA.c(ugi0Var);
    }
}
