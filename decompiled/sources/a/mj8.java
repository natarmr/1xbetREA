package a;

/* JADX INFO: loaded from: classes3.dex */
public final class mj8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r9u f21883a;

    public mj8(r9u r9uVar, byte b) {
        switch (b) {
            case 1:
                this.f21883a = r9uVar;
                break;
            case 2:
                r9uVar.getClass();
                this.f21883a = r9uVar;
                break;
            default:
                r9uVar.getClass();
                this.f21883a = r9uVar;
                break;
        }
    }

    public void a(udl0 udl0Var, fet fetVar, int i) {
        int i2;
        udl0 udl0Var2;
        fet fetVar2;
        fetVar.g0(1608529422);
        if ((i & 6) == 0) {
            i2 = (fetVar.e(udl0Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(this) : fetVar.i(this) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                ygp ygpVar = ygp.o1;
                r9u r9uVar = this.f21883a;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                objP = Boolean.valueOf(j1q0Var.f15748a.d(ygpVar));
                fetVar.o0(objP);
            }
            udl0Var2 = udl0Var;
            fetVar2 = fetVar;
            tfx.e(null, udl0Var2, ((Boolean) objP).booleanValue(), fetVar2, ((i2 << 3) & 112) | 384, 1);
        } else {
            udl0Var2 = udl0Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(this, udl0Var2, i, (byte) 15);
        }
    }

    public org.xplatform.toto_bet.core.navigation.a b() {
        return new org.xplatform.toto_bet.core.navigation.a(this.f21883a);
    }
}
