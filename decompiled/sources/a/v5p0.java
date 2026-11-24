package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v5p0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v5p0 f36836a;
    private static final ugi0 descriptor;

    static {
        v5p0 v5p0Var = new v5p0();
        f36836a = v5p0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.team.impl.team_characterstic_statistic.data.models.TeamCharacteristicsModelResponse", v5p0Var, 4);
        zna0Var.j("strengths", true);
        zna0Var.j("style", true);
        zna0Var.j("team", true);
        zna0Var.j("weaknesses", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = x5p0.e;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0(ysm0.f43175a), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = x5p0.e;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                list2 = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
                i |= 2;
            } else if (iF == 2) {
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list3 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new x5p0(i, str, list, list2, list3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        x5p0 x5p0Var = (x5p0) obj;
        x5p0Var.getClass();
        List list = x5p0Var.d;
        String str = x5p0Var.c;
        List list2 = x5p0Var.b;
        List list3 = x5p0Var.f40329a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = x5p0.e;
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
