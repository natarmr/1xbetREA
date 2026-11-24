package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pov implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pov f27346a;
    private static final ugi0 descriptor;

    static {
        pov povVar = new pov();
        f27346a = povVar;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.HeadToHeadResponse", povVar, 2);
        zna0Var.j("teams", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) rpv.c[0].getValue()), mrv.j0(tov.f34302a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = rpv.c;
        boolean z = true;
        int i = 0;
        List list = null;
        dpv dpvVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                dpvVar = (dpv) bldVarA.e(ugi0Var, 1, tov.f34302a, dpvVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new rpv(i, list, dpvVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rpv rpvVar = (rpv) obj;
        rpvVar.getClass();
        dpv dpvVar = rpvVar.b;
        List list = rpvVar.f30903a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = rpv.c;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || dpvVar != null) {
            cldVarA.p(ugi0Var, 1, tov.f34302a, dpvVar);
        }
        cldVarA.c(ugi0Var);
    }
}
