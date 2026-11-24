package a;

/* JADX INFO: loaded from: classes2.dex */
public final class rg40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hm40 f30415a;
    public final int b;
    public final int c;
    public final int d;
    public final rg40 e;
    public final int f;

    public rg40(qo8 qo8Var, hm40 hm40Var, int i, int i2, int i3, rg40 rg40Var, ubu0 ubu0Var) {
        this.f30415a = hm40Var;
        this.b = i;
        hm40 hm40Var2 = hm40.BYTE;
        int i4 = (hm40Var == hm40Var2 || rg40Var == null) ? i2 : rg40Var.c;
        this.c = i4;
        this.d = i3;
        this.e = rg40Var;
        boolean z = false;
        int iA = rg40Var != null ? rg40Var.f : 0;
        if ((hm40Var == hm40Var2 && rg40Var == null && i4 != 0) || (rg40Var != null && i4 != rg40Var.c)) {
            z = true;
        }
        iA = (rg40Var == null || hm40Var != rg40Var.f30415a || z) ? iA + hm40Var.a(ubu0Var) + 4 : iA;
        int iOrdinal = hm40Var.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                iA += i3 != 1 ? 11 : 6;
            } else if (iOrdinal == 4) {
                iA += ((String) qo8Var.d).substring(i, i3 + i).getBytes(((rgn) qo8Var.e).f30446a[i2].charset()).length * 8;
                if (z) {
                    iA += 12;
                }
            } else if (iOrdinal == 6) {
                iA += 13;
            }
        } else {
            iA += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
        }
        this.f = iA;
    }
}
