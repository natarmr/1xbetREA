package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uf0 f35555a;
    private static final ugi0 descriptor;

    static {
        uf0 uf0Var = new uf0();
        f35555a = uf0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.category.data.models.AggregatorCategoriesResponse", uf0Var, 3);
        zna0Var.j("categoriesList", true);
        zna0Var.j("ErrorId", true);
        zna0Var.j("Message", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) wf0.d[0].getValue()), okx.f25427a, mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = wf0.d;
        boolean z = true;
        int i = 0;
        int iJ = 0;
        List list = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new wf0(i, iJ, str, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wf0 wf0Var = (wf0) obj;
        wf0Var.getClass();
        String str = wf0Var.c;
        int i = wf0Var.b;
        List list = wf0Var.f39044a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = wf0.d;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || i != 0) {
            cldVarA.i(1, i, ugi0Var);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
