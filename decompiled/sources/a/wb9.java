package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wb9 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wb9 f38864a;
    private static final ugi0 descriptor;

    static {
        wb9 wb9Var = new wb9();
        f38864a = wb9Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.make_bet.data.model.BuilderCouponRequest", wb9Var, 3);
        zna0Var.j("G", false);
        zna0Var.j(TokenNames.I, false);
        zna0Var.j("SportId", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{yb9.d[0].getValue(), s710Var, s710Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = yb9.d;
        int i = 0;
        List list = null;
        long jR = 0;
        long jR2 = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                jR = bldVarA.r(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                jR2 = bldVarA.r(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new yb9(i, list, jR, jR2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        yb9 yb9Var = (yb9) obj;
        yb9Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) yb9.d[0].getValue(), yb9Var.f42331a);
        cldVarA.n(ugi0Var, 1, yb9Var.b);
        cldVarA.n(ugi0Var, 2, yb9Var.c);
        cldVarA.c(ugi0Var);
    }
}
