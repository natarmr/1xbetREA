package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tov implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tov f34302a;
    private static final ugi0 descriptor;

    static {
        tov tovVar = new tov();
        f34302a = tovVar;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.HeadToHeadResponse.Statistic", tovVar, 5);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j("team1Games", true);
        zna0Var.j("team2Games", true);
        zna0Var.j("games", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = dpv.f;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = dpv.f;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
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
            } else if (iF == 2) {
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            } else if (iF == 3) {
                list2 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                list3 = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list3);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new dpv(i, str, str2, list, list2, list3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dpv dpvVar = (dpv) obj;
        dpvVar.getClass();
        List list = dpvVar.e;
        List list2 = dpvVar.d;
        List list3 = dpvVar.c;
        String str = dpvVar.b;
        String str2 = dpvVar.f6483a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = dpv.f;
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
