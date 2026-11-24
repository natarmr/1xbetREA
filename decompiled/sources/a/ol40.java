package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ol40 extends fxw {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public ol40(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ol40.class != obj.getClass()) {
            return false;
        }
        ol40 ol40Var = (ol40) obj;
        return this.b == ol40Var.b && this.c == ol40Var.c && this.d == ol40Var.d && Arrays.equals(this.e, ol40Var.e) && Arrays.equals(this.f, ol40Var.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
