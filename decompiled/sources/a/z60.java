package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class z60 extends d50 {
    public final int b;
    public final int c;
    public final int d;
    public final y60 e;

    public z60(int i, int i2, int i3, y60 y60Var) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = y60Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z60)) {
            return false;
        }
        z60 z60Var = (z60) obj;
        return z60Var.b == this.b && z60Var.c == this.c && z60Var.d == this.d && z60Var.e == this.e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.c);
        sb.append("-byte IV, ");
        sb.append(this.d);
        sb.append("-byte tag, and ");
        return rz4.j(this.b, "-byte key)", sb);
    }
}
