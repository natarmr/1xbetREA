package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class opr0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final opr0 f25657a;
    private static final ugi0 descriptor;

    static {
        opr0 opr0Var = new opr0();
        f25657a = opr0Var;
        zna0 zna0Var = new zna0("org.xplatform.toto_jackpot.impl.data.model.TotoJackpotBetRequest", opr0Var, 5);
        zna0Var.j("AccountId", false);
        zna0Var.j("JackpotTypeId", false);
        zna0Var.j("TiragNumber", false);
        zna0Var.j("ArrayBet", false);
        zna0Var.j("BetSum", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = qpr0.f;
        s710 s710Var = s710.f31729a;
        return new jiy[]{s710Var, okx.f25427a, s710Var, a8zVarArr[3].getValue(), tbl.f33669a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = qpr0.f;
        int i = 0;
        int iJ = 0;
        long jR = 0;
        long jR2 = 0;
        List list = null;
        double dT = 0.0d;
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
                jR2 = bldVarA.r(ugi0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                list = (List) bldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                dT = bldVarA.t(ugi0Var, 4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new qpr0(i, jR, iJ, jR2, list, dT);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qpr0 qpr0Var = (qpr0) obj;
        qpr0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = qpr0.f;
        cldVarA.n(ugi0Var, 0, qpr0Var.f29134a);
        cldVarA.i(1, qpr0Var.b, ugi0Var);
        cldVarA.n(ugi0Var, 2, qpr0Var.c);
        cldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), qpr0Var.d);
        cldVarA.j(ugi0Var, 4, qpr0Var.e);
        cldVarA.c(ugi0Var);
    }
}
