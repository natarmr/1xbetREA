package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fub extends fxw implements eub {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final fxw[] g;

    public fub(String str, int i, int i2, long j, long j2, fxw[] fxwVarArr) {
        String str2;
        super("CHAP");
        x0x.A(i <= i2);
        this.b = str;
        this.c = i;
        this.d = i2;
        int length = fxwVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                str2 = null;
                break;
            }
            fxw fxwVar = fxwVarArr[i3];
            if (fxwVar instanceof h8q0) {
                h8q0 h8q0Var = (h8q0) fxwVar;
                b4x b4xVar = h8q0Var.c;
                if (h8q0Var.f10332a.equals("TIT2") && !b4xVar.isEmpty()) {
                    str2 = (String) b4xVar.get(0);
                    break;
                }
            }
            i3++;
        }
        if (str2 != null) {
            new uty(null, str2);
        }
        this.e = j;
        this.f = j2;
        this.g = fxwVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fub.class != obj.getClass()) {
            return false;
        }
        fub fubVar = (fub) obj;
        return this.c == fubVar.c && this.d == fubVar.d && this.e == fubVar.e && this.f == fubVar.f && this.b.equals(fubVar.b) && Arrays.equals(this.g, fubVar.g);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
