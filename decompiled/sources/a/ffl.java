package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ffl implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ffl f9450a;
    private static final ugi0 descriptor;

    static {
        ffl fflVar = new ffl();
        f9450a = fflVar;
        zna0 zna0Var = new zna0("org.xplatform.dragons_gold.data.models.requests.DragonsGoldCurrentWinRequest", fflVar, 4);
        zna0Var.j("UI", false);
        zna0Var.j("AN", false);
        zna0Var.j("LG", false);
        zna0Var.j("VU", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a, okx.f25427a, ysm0.f43175a, hfl.e[3].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = hfl.e;
        int i = 0;
        int iJ = 0;
        long jR = 0;
        String strX = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                strX = bldVarA.x(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new hfl(i, iJ, jR, strX, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hfl hflVar = (hfl) obj;
        hflVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = hfl.e;
        cldVarA.n(ugi0Var, 0, hflVar.f12979a);
        cldVarA.i(1, hflVar.b, ugi0Var);
        cldVarA.z(ugi0Var, 2, hflVar.c);
        cldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), hflVar.d);
        cldVarA.c(ugi0Var);
    }
}
