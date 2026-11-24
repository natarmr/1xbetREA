package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f22 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f22 f8793a;
    private static final ugi0 descriptor;

    static {
        f22 f22Var = new f22();
        f8793a = f22Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.team.impl.team_characterstic_statistic.data.models.AllCharacteristicModelResponse", f22Var, 3);
        zna0Var.j("response", true);
        zna0Var.j("sportId", true);
        zna0Var.j("teams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(dpp0.f6479a), mrv.j0(okx.f25427a), mrv.j0((jiy) h22.d[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = h22.d;
        boolean z = true;
        int i = 0;
        fpp0 fpp0Var = null;
        Integer num = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                fpp0Var = (fpp0) bldVarA.e(ugi0Var, 0, dpp0.f6479a, fpp0Var);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new h22(i, fpp0Var, num, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        h22 h22Var = (h22) obj;
        h22Var.getClass();
        List list = h22Var.c;
        Integer num = h22Var.b;
        fpp0 fpp0Var = h22Var.f12311a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = h22.d;
        if (cldVarA.u(ugi0Var) || fpp0Var != null) {
            cldVarA.p(ugi0Var, 0, dpp0.f6479a, fpp0Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
