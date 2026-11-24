package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bn4 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bn4 f2863a;
    private static final ugi0 descriptor;

    static {
        bn4 bn4Var = new bn4();
        f2863a = bn4Var;
        zna0 zna0Var = new zna0("org.xplatform.registration.core.data.models.register_responses.AuthRegisterResponse", bn4Var, 4);
        zna0Var.j("Auth", true);
        zna0Var.j("CodeTypes", true);
        zna0Var.j("CodeTypesRepeat", true);
        zna0Var.j("Form", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = dn4.e;
        return new jiy[]{mrv.j0(n94.f23120a), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0(tvq.f34613a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = dn4.e;
        boolean z = true;
        int i = 0;
        p94 p94Var = null;
        List list = null;
        List list2 = null;
        vvq vvqVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                p94Var = (p94) bldVarA.e(ugi0Var, 0, n94.f23120a, p94Var);
                i |= 1;
            } else if (iF == 1) {
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            } else if (iF == 2) {
                list2 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                vvqVar = (vvq) bldVarA.e(ugi0Var, 3, tvq.f34613a, vvqVar);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new dn4(i, p94Var, list, list2, vvqVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dn4 dn4Var = (dn4) obj;
        dn4Var.getClass();
        vvq vvqVar = dn4Var.d;
        List list = dn4Var.c;
        List list2 = dn4Var.b;
        p94 p94Var = dn4Var.f6349a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = dn4.e;
        if (cldVarA.u(ugi0Var) || p94Var != null) {
            cldVarA.p(ugi0Var, 0, n94.f23120a, p94Var);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || vvqVar != null) {
            cldVarA.p(ugi0Var, 3, tvq.f34613a, vvqVar);
        }
        cldVarA.c(ugi0Var);
    }
}
