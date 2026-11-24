package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yqo implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yqo f43084a;
    private static final ugi0 descriptor;

    static {
        yqo yqoVar = new yqo();
        f43084a = yqoVar;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.ExpressHighlightRequest", yqoVar, 4);
        zna0Var.j("Lng", false);
        zna0Var.j("Partner", false);
        zna0Var.j("ET", false);
        zna0Var.j("G", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = mro.e;
        return new jiy[]{mrv.j0(ysm0.f43175a), okx.f25427a, mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = mro.e;
        boolean z = true;
        int i = 0;
        int iJ = 0;
        String str = null;
        List list = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new mro(i, str, iJ, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mro mroVar = (mro) obj;
        mroVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = mro.e;
        cldVarA.p(ugi0Var, 0, ysm0.f43175a, mroVar.f22283a);
        cldVarA.i(1, mroVar.b, ugi0Var);
        cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), mroVar.c);
        cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), mroVar.d);
        cldVarA.c(ugi0Var);
    }
}
