package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qk10 {
    public static csr a(rk10 rk10Var) {
        esr esrVar;
        dsr dsrVar;
        rk10Var.getClass();
        uk10 uk10Var = rk10Var.f30625a;
        int i = uk10Var == null ? -1 : pk10.f27115a[uk10Var.ordinal()];
        if (i == 1) {
            esrVar = esr.DOUBLE_BONUS;
        } else if (i == 2) {
            esrVar = esr.RETURN_HALF;
        } else if (i == 3) {
            esrVar = esr.FREE_BET;
        } else if (i != 4) {
            esrVar = i != 5 ? esr.NOTHING : esr.SPECIAL_BONUS;
        } else {
            esrVar = esr.FREE_SPIN;
        }
        long j = rk10Var.c;
        Double d = rk10Var.g;
        bsr bsrVar = new bsr(esrVar, j, d != null ? d.doubleValue() : 0.0d);
        String str = rk10Var.b;
        if (str == null) {
            str = "";
        }
        de8 de8Var = rk10Var.d;
        int i2 = de8Var != null ? pk10.b[de8Var.ordinal()] : -1;
        if (i2 != 1) {
            dsrVar = i2 != 2 ? dsr.b : dsr.d;
        } else {
            dsrVar = dsr.c;
        }
        return new csr(bsrVar, str, dsrVar, rk10Var.e);
    }

    public final jiy serializer() {
        return ok10.f25385a;
    }
}
