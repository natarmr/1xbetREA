package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.support.feature.result.CommonConstant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class okt implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final okt f25421a;
    private static final ugi0 descriptor;

    static {
        okt oktVar = new okt();
        f25421a = oktVar;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.domain.entity.geo.GeoCountry", oktVar, 8);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("phoneCode", true);
        zna0Var.j(CommonConstant.KEY_COUNTRY_CODE, true);
        zna0Var.j("currencyId", true);
        zna0Var.j("countryImage", true);
        zna0Var.j("top", true);
        zna0Var.j("phoneMask", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{okx.f25427a, ysm0Var, ysm0Var, ysm0Var, s710.f31729a, ysm0Var, sm8.f32432a, zl90.f44570a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        int i = 0;
        int iJ = 0;
        boolean zB = false;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        long jR = 0;
        boolean z = true;
        cm90 cm90Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iJ = bldVarA.j(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strX = bldVarA.x(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strX2 = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strX3 = bldVarA.x(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    jR = bldVarA.r(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strX4 = bldVarA.x(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    zB = bldVarA.B(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    cm90Var = (cm90) bldVarA.m(ugi0Var, 7, zl90.f44570a, cm90Var);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new qkt(i, iJ, strX, strX2, strX3, jR, strX4, zB, cm90Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qkt qktVar = (qkt) obj;
        qktVar.getClass();
        cm90 cm90Var = qktVar.h;
        boolean z = qktVar.g;
        String str = qktVar.f;
        long j = qktVar.e;
        String str2 = qktVar.d;
        String str3 = qktVar.c;
        String str4 = qktVar.b;
        int i = qktVar.f28902a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || i != 0) {
            cldVarA.i(0, i, ugi0Var);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str4, "")) {
            cldVarA.z(ugi0Var, 1, str4);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str3, "")) {
            cldVarA.z(ugi0Var, 2, str3);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str2, "")) {
            cldVarA.z(ugi0Var, 3, str2);
        }
        if (cldVarA.u(ugi0Var) || j != 0) {
            cldVarA.n(ugi0Var, 4, j);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "")) {
            cldVarA.z(ugi0Var, 5, str);
        }
        if (cldVarA.u(ugi0Var) || z) {
            cldVarA.x(ugi0Var, 6, z);
        }
        if (cldVarA.u(ugi0Var)) {
            cldVarA.m(ugi0Var, 7, zl90.f44570a, cm90Var);
        } else {
            cm90.Companion.getClass();
            if (!Intrinsics.d(cm90Var, am90.a())) {
                cldVarA.m(ugi0Var, 7, zl90.f44570a, cm90Var);
            }
        }
        cldVarA.c(ugi0Var);
    }
}
