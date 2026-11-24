package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pue0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pue0 f27613a;
    private static final ugi0 descriptor;

    static {
        pue0 pue0Var = new pue0();
        f27613a = pue0Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.domain.registration.RegistrationChoice", pue0Var, 8);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j(ParameterNames.TEXT, true);
        zna0Var.j("isChoice", true);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("top", true);
        zna0Var.j("title", true);
        zna0Var.j("image", true);
        zna0Var.j("available", true);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = rue0.i;
        ysm0 ysm0Var = ysm0.f43175a;
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{s710.f31729a, ysm0Var, sm8Var, a8zVarArr[3].getValue(), sm8Var, sm8Var, ysm0Var, sm8Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = rue0.i;
        int i = 0;
        boolean zB = false;
        boolean zB2 = false;
        boolean zB3 = false;
        boolean zB4 = false;
        long jR = 0;
        String strX = null;
        uue0 uue0Var = null;
        String strX2 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jR = bldVarA.r(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strX = bldVarA.x(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    zB = bldVarA.B(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    uue0Var = (uue0) bldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), uue0Var);
                    i |= 8;
                    break;
                case 4:
                    zB2 = bldVarA.B(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    zB3 = bldVarA.B(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strX2 = bldVarA.x(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    zB4 = bldVarA.B(ugi0Var, 7);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new rue0(i, jR, strX, zB, uue0Var, zB2, zB3, strX2, zB4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rue0 rue0Var = (rue0) obj;
        rue0Var.getClass();
        boolean z = rue0Var.h;
        String str = rue0Var.g;
        boolean z2 = rue0Var.f;
        boolean z3 = rue0Var.e;
        uue0 uue0Var = rue0Var.d;
        boolean z4 = rue0Var.c;
        String str2 = rue0Var.b;
        long j = rue0Var.f31124a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = rue0.i;
        if (cldVarA.u(ugi0Var) || j != 0) {
            cldVarA.n(ugi0Var, 0, j);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str2, "")) {
            cldVarA.z(ugi0Var, 1, str2);
        }
        if (cldVarA.u(ugi0Var) || z4) {
            cldVarA.x(ugi0Var, 2, z4);
        }
        if (cldVarA.u(ugi0Var) || uue0Var != uue0.d) {
            cldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), uue0Var);
        }
        if (cldVarA.u(ugi0Var) || z3) {
            cldVarA.x(ugi0Var, 4, z3);
        }
        if (cldVarA.u(ugi0Var) || z2) {
            cldVarA.x(ugi0Var, 5, z2);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "")) {
            cldVarA.z(ugi0Var, 6, str);
        }
        if (cldVarA.u(ugi0Var) || !z) {
            cldVarA.x(ugi0Var, 7, z);
        }
        cldVarA.c(ugi0Var);
    }
}
