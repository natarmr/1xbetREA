package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lyf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lyf f20859a;
    private static final ugi0 descriptor;

    static {
        lyf lyfVar = new lyf();
        f20859a = lyfVar;
        zna0 zna0Var = new zna0("org.xplatform.customer_io.impl.data.CustomerIODevice", lyfVar, 3);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("platform", true);
        zna0Var.j("last_used", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Long l = null;
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
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                l = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new nyf(i, l, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nyf nyfVar = (nyf) obj;
        nyfVar.getClass();
        Long l = nyfVar.c;
        String str = nyfVar.b;
        String str2 = nyfVar.f24327a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
