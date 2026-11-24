package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f6e0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f6e0 f9005a;
    private static final ugi0 descriptor;

    static {
        f6e0 f6e0Var = new f6e0();
        f9005a = f6e0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.rating.impl.rating_statistic.data.model.RatingResponse", f6e0Var, 5);
        zna0Var.j("response", true);
        zna0Var.j("sportId", true);
        zna0Var.j("teams", true);
        zna0Var.j("players", true);
        zna0Var.j("tournaments", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = j6e0.f;
        return new jiy[]{mrv.j0(r9e0.f30076a), mrv.j0(okx.f25427a), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = j6e0.f;
        boolean z = true;
        int i = 0;
        t9e0 t9e0Var = null;
        Integer num = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                t9e0Var = (t9e0) bldVarA.e(ugi0Var, 0, r9e0.f30076a, t9e0Var);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
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
        return new j6e0(i, t9e0Var, num, list, list2, list3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        j6e0 j6e0Var = (j6e0) obj;
        j6e0Var.getClass();
        List list = j6e0Var.e;
        List list2 = j6e0Var.d;
        List list3 = j6e0Var.c;
        Integer num = j6e0Var.b;
        t9e0 t9e0Var = j6e0Var.f15981a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = j6e0.f;
        if (cldVarA.u(ugi0Var) || t9e0Var != null) {
            cldVarA.p(ugi0Var, 0, r9e0.f30076a, t9e0Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
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
