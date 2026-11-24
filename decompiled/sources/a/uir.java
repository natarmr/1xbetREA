package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uir implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uir f35746a;
    private static final ugi0 descriptor;

    static {
        uir uirVar = new uir();
        f35746a = uirVar;
        zna0 zna0Var = new zna0("org.xplatform.web.impl.domain.models.gp_web_app.GPWebAppParams", uirVar, 4);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("category", true);
        zna0Var.j("bonus", true);
        zna0Var.j("demo", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(ysm0.f43175a), mrv.j0(nir.f23603a), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        pir pirVar = null;
        Integer num2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                pirVar = (pir) bldVarA.e(ugi0Var, 2, nir.f23603a, pirVar);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new wir(i, num, str, pirVar, num2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wir wirVar = (wir) obj;
        wirVar.getClass();
        Integer num = wirVar.d;
        pir pirVar = wirVar.c;
        String str = wirVar.b;
        Integer num2 = wirVar.f39231a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || pirVar != null) {
            cldVarA.p(ugi0Var, 2, nir.f23603a, pirVar);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
