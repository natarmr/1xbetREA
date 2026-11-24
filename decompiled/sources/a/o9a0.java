package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o9a0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o9a0 f24870a;
    private static final ugi0 descriptor;

    static {
        o9a0 o9a0Var = new o9a0();
        f24870a = o9a0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.statistic_core.data.models.PlayerResponse", o9a0Var, 6);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("clId", true);
        zna0Var.j("shortName", true);
        zna0Var.j("country", true);
        zna0Var.j("image", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okx.f25427a), mrv.j0(ysm0Var), mrv.j0(fre.f10015a), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        lre lreVar = null;
        String str4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                    i |= 8;
                    break;
                case 4:
                    lreVar = (lre) bldVarA.e(ugi0Var, 4, fre.f10015a, lreVar);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str4);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new haa0(i, str, str2, num, str3, lreVar, str4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        haa0 haa0Var = (haa0) obj;
        haa0Var.getClass();
        String str = haa0Var.f;
        lre lreVar = haa0Var.e;
        String str2 = haa0Var.d;
        Integer num = haa0Var.c;
        String str3 = haa0Var.b;
        String str4 = haa0Var.f12715a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || lreVar != null) {
            cldVarA.p(ugi0Var, 4, fre.f10015a, lreVar);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
