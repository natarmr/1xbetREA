package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dro implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dro f6571a;
    private static final ugi0 descriptor;

    static {
        dro droVar = new dro();
        f6571a = droVar;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.ExpressHighlightRequest.GameRequest", droVar, 5);
        zna0Var.j("SI", false);
        zna0Var.j("MG", false);
        zna0Var.j("KN", false);
        zna0Var.j("SL", false);
        zna0Var.j("GTS", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = fro.f;
        jiy jiyVarJ0 = mrv.j0((jiy) a8zVarArr[3].getValue());
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[4].getValue());
        s710 s710Var = s710.f31729a;
        return new jiy[]{s710Var, s710Var, okx.f25427a, jiyVarJ0, jiyVarJ1};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = fro.f;
        int i = 0;
        int iJ = 0;
        long jR = 0;
        long jR2 = 0;
        List list = null;
        List list2 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                jR2 = bldVarA.r(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                iJ = bldVarA.j(ugi0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                list2 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new fro(i, jR, jR2, iJ, list2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fro froVar = (fro) obj;
        froVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = fro.f;
        cldVarA.n(ugi0Var, 0, froVar.f10028a);
        cldVarA.n(ugi0Var, 1, froVar.b);
        cldVarA.i(2, froVar.c, ugi0Var);
        cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), froVar.d);
        cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), froVar.e);
        cldVarA.c(ugi0Var);
    }
}
