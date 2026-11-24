package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xmo0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xmo0 f41138a;
    private static final ugi0 descriptor;

    static {
        xmo0 xmo0Var = new xmo0();
        f41138a = xmo0Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.zip.data.model.TabloStatItemResponse", xmo0Var, 4);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("s1", true);
        zna0Var.j("s2", true);
        zna0Var.j("name", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(c7m0.f3872a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        b7m0 b7m0Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                b7m0Var = (b7m0) bldVarA.e(ugi0Var, 0, c7m0.f3872a, b7m0Var);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
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
        return new zmo0(i, b7m0Var, str, str2, str3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zmo0 zmo0Var = (zmo0) obj;
        zmo0Var.getClass();
        String str = zmo0Var.d;
        String str2 = zmo0Var.c;
        String str3 = zmo0Var.b;
        b7m0 b7m0Var = zmo0Var.f44636a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || b7m0Var != null) {
            cldVarA.p(ugi0Var, 0, c7m0.f3872a, b7m0Var);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
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
