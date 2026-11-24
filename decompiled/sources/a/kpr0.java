package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kpr0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kpr0 f18688a;
    private static final ugi0 descriptor;

    static {
        kpr0 kpr0Var = new kpr0();
        f18688a = kpr0Var;
        zna0 zna0Var = new zna0("org.xplatform.toto_jackpot.impl.data.model.TotoJackpotBetGameOutcomeRequest", kpr0Var, 2);
        zna0Var.j("GameId", false);
        zna0Var.j("Outcome", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{okx.f25427a, mpr0.c[1].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = mpr0.c;
        boolean z = true;
        int i = 0;
        int iJ = 0;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new mpr0(i, iJ, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mpr0 mpr0Var = (mpr0) obj;
        mpr0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = mpr0.c;
        cldVarA.i(0, mpr0Var.f22191a, ugi0Var);
        cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), mpr0Var.b);
        cldVarA.c(ugi0Var);
    }
}
