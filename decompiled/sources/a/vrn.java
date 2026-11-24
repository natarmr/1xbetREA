package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vrn implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vrn f37907a;
    private static final ugi0 descriptor;

    static {
        vrn vrnVar = new vrn();
        f37907a = vrnVar;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.core.data.models.response.ElevateInfoResponse", vrnVar, 5);
        zna0Var.j("Param", true);
        zna0Var.j("Sum", true);
        zna0Var.j("Type", true);
        zna0Var.j("Params", true);
        zna0Var.j("PlayerNames", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = zrn.f;
        tbl tblVar = tbl.f33669a;
        return new jiy[]{mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(okx.f25427a), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = zrn.f;
        boolean z = true;
        int i = 0;
        Double d = null;
        Double d2 = null;
        Integer num = null;
        List list = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                i |= 1;
            } else if (iF == 1) {
                d2 = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d2);
                i |= 2;
            } else if (iF == 2) {
                num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                i |= 4;
            } else if (iF == 3) {
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list2);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new zrn(i, d, d2, num, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zrn zrnVar = (zrn) obj;
        zrnVar.getClass();
        List list = zrnVar.e;
        List list2 = zrnVar.d;
        Integer num = zrnVar.c;
        Double d = zrnVar.b;
        Double d2 = zrnVar.f44863a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = zrn.f;
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
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
