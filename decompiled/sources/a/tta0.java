package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tta0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tta0 f34502a;
    private static final ugi0 descriptor;

    static {
        tta0 tta0Var = new tta0();
        f34502a = tta0Var;
        zna0 zna0Var = new zna0("org.xplatform.polybet.impl.data.models.PolybetRulesResponse", tta0Var, 3);
        zna0Var.j("versId", true);
        zna0Var.j("langId", true);
        zna0Var.j(ParameterNames.TEXT, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new vta0(i, l, l2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vta0 vta0Var = (vta0) obj;
        vta0Var.getClass();
        String str = vta0Var.c;
        Long l = vta0Var.b;
        Long l2 = vta0Var.f37997a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
