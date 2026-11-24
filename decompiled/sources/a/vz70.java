package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class vz70 extends mjq {
    public static final vz70 e;
    public static final vz70 f;
    public static final vz70 g;
    public static final vz70 h;
    public final /* synthetic */ byte d;

    static {
        int i = 1;
        e = new vz70(i, 2, (byte) 0);
        int i2 = 1;
        f = new vz70(i2, i2, (byte) 1);
        g = new vz70(i, 2, (byte) 2);
        int i3 = 1;
        h = new vz70(i3, i3, (byte) 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vz70(int i, int i2, byte b) {
        super(i, i2, (byte) 2);
        this.d = b;
    }

    @Override // a.mjq
    public final void d(hu5 hu5Var, bv3 bv3Var, t9k0 t9k0Var, pwi pwiVar, s080 s080Var) {
        switch (this.d) {
            case 0:
                Object objInvoke = ((Function0) hu5Var.g(0)).invoke();
                bet betVar = (bet) hu5Var.g(1);
                int iF = hu5Var.f(0);
                betVar.getClass();
                t9k0Var.W(t9k0Var.c(betVar), objInvoke);
                bv3Var.d(iF, objInvoke);
                bv3Var.i(objInvoke);
                break;
            case 1:
                bet betVar2 = (bet) hu5Var.g(0);
                int iF2 = hu5Var.f(0);
                bv3Var.l();
                betVar2.getClass();
                bv3Var.h(iF2, t9k0Var.D(t9k0Var.c(betVar2)));
                break;
            case 2:
                Object objG = hu5Var.g(0);
                bet betVar3 = (bet) hu5Var.g(1);
                int iF3 = hu5Var.f(0);
                if (objG instanceof jet) {
                    jet jetVar = (jet) objG;
                    ((xz40) pwiVar.g).b(jetVar);
                    ((iz40) pwiVar.c).a(jetVar);
                }
                Object objL = t9k0Var.L(t9k0Var.c(betVar3), iF3, objG);
                if (objL instanceof jet) {
                    pwiVar.g((jet) objL);
                } else if (objL instanceof yfe0) {
                    ((yfe0) objL).c();
                }
                break;
            default:
                Object objG2 = hu5Var.g(0);
                int iF4 = hu5Var.f(0);
                if (objG2 instanceof jet) {
                    jet jetVar2 = (jet) objG2;
                    ((xz40) pwiVar.g).b(jetVar2);
                    ((iz40) pwiVar.c).a(jetVar2);
                }
                Object objL2 = t9k0Var.L(t9k0Var.t, iF4, objG2);
                if (objL2 instanceof jet) {
                    pwiVar.g((jet) objL2);
                } else if (objL2 instanceof yfe0) {
                    ((yfe0) objL2).c();
                }
                break;
        }
    }

    @Override // a.mjq
    public bet f(hu5 hu5Var) {
        switch (this.d) {
            case 0:
                return (bet) hu5Var.g(1);
            case 1:
                return (bet) hu5Var.g(0);
            default:
                return super.f(hu5Var);
        }
    }
}
