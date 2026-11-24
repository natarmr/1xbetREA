package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ag8 {
    public static bg8 a(csr csrVar) {
        uk10 uk10Var;
        csrVar.getClass();
        bsr bsrVar = csrVar.f4905a;
        esr esrVar = bsrVar.f3145a;
        if (esrVar == esr.NOTHING) {
            return null;
        }
        uk10.Companion.getClass();
        switch (sk10.f32326a[esrVar.ordinal()]) {
            case 1:
                uk10Var = uk10.NOTHING;
                break;
            case 2:
                uk10Var = uk10.DOUBLE_BONUS;
                break;
            case 3:
                uk10Var = uk10.RETURN_HALF;
                break;
            case 4:
                uk10Var = uk10.FREE_BET;
                break;
            case 5:
                uk10Var = uk10.FREE_SPIN;
                break;
            case 6:
                uk10Var = uk10.SPECIAL_BONUS;
                break;
            case 7:
                uk10Var = uk10.WILD_FREE_BET;
                break;
            default:
                uk10Var = uk10.NOTHING;
                break;
        }
        double d = bsrVar.c;
        return new bg8(uk10Var, d > 0.0d ? String.valueOf(d) : null);
    }

    public final jiy serializer() {
        return zf8.f44290a;
    }
}
