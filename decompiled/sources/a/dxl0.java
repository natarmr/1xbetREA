package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dxl0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dxl0 f6852a;
    private static final ugi0 descriptor;

    static {
        dxl0 dxl0Var = new dxl0();
        f6852a = dxl0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.stadium.impl.core.data.models.StadiumResponse", dxl0Var, 5);
        zna0Var.j("sportId", true);
        zna0Var.j("teams", true);
        zna0Var.j("players", true);
        zna0Var.j("subSportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = jxl0.f;
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0(okxVar), mrv.j0(cwl0.f5087a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = jxl0.f;
        boolean z = true;
        int i = 0;
        Integer num = null;
        List list = null;
        List list2 = null;
        Integer num2 = null;
        lwl0 lwl0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            } else if (iF == 2) {
                list2 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list2);
                i |= 4;
            } else if (iF == 3) {
                num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                lwl0Var = (lwl0) bldVarA.e(ugi0Var, 4, cwl0.f5087a, lwl0Var);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new jxl0(i, num, list, list2, num2, lwl0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jxl0 jxl0Var = (jxl0) obj;
        jxl0Var.getClass();
        lwl0 lwl0Var = jxl0Var.e;
        Integer num = jxl0Var.d;
        List list = jxl0Var.c;
        List list2 = jxl0Var.b;
        Integer num2 = jxl0Var.f17312a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = jxl0.f;
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || lwl0Var != null) {
            cldVarA.p(ugi0Var, 4, cwl0.f5087a, lwl0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
