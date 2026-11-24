package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l0m0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0m0 f19210a;
    private static final ugi0 descriptor;

    static {
        l0m0 l0m0Var = new l0m0();
        f19210a = l0m0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.stage.impl.stage_net.data.models.StageNetCellResponse", l0m0Var, 3);
        zna0Var.j("title", true);
        zna0Var.j("cells", true);
        zna0Var.j("logo", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = n0m0.d;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = n0m0.d;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new n0m0(i, str, str2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        n0m0 n0m0Var = (n0m0) obj;
        n0m0Var.getClass();
        String str = n0m0Var.c;
        List list = n0m0Var.b;
        String str2 = n0m0Var.f22706a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = n0m0.d;
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
