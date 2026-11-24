package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iwi0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iwi0 f15492a;
    private static final ugi0 descriptor;

    static {
        iwi0 iwi0Var = new iwi0();
        f15492a = iwi0Var;
        zna0 zna0Var = new zna0("org.xplatform.config.data.models.Settings", iwi0Var, 5);
        zna0Var.j("OthersMenu", true);
        zna0Var.j("WhiteListCountries", true);
        zna0Var.j("BlackListCountries", true);
        zna0Var.j("OnboardingSections", true);
        zna0Var.j("HiddenCountriesInProfile", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = kwi0.f;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = kwi0.f;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
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
                list3 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list3);
                i |= 4;
            } else if (iF == 3) {
                list4 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list4);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                list5 = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list5);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new kwi0(i, list, list2, list3, list4, list5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kwi0 kwi0Var = (kwi0) obj;
        kwi0Var.getClass();
        List list = kwi0Var.e;
        List list2 = kwi0Var.d;
        List list3 = kwi0Var.c;
        List list4 = kwi0Var.b;
        List list5 = kwi0Var.f19004a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = kwi0.f;
        if (cldVarA.u(ugi0Var) || list5 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list5);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list4);
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
