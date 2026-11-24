package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class i70 extends d50 {
    public final int b;
    public final h70 c;

    public i70(int i, h70 h70Var) {
        this.b = i;
        this.c = h70Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i70)) {
            return false;
        }
        i70 i70Var = (i70) obj;
        return i70Var.b == this.b && i70Var.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.c);
        sb.append(", ");
        return rz4.j(this.b, "-byte key)", sb);
    }
}
