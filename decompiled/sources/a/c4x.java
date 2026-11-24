package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class c4x implements Serializable {
    public static final c4x c = new c4x(0, new long[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f3743a;
    public final int b;

    public c4x(int i, long[] jArr) {
        this.f3743a = jArr;
        this.b = i;
    }

    public final long a(int i) {
        x0x.D(i, this.b);
        return this.f3743a[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c4x) {
            c4x c4xVar = (c4x) obj;
            int i = c4xVar.b;
            int i2 = this.b;
            if (i2 == i) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (a(i3) == c4xVar.a(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i = 0; i < this.b; i++) {
            iHashCode = (iHashCode * 31) + Long.hashCode(this.f3743a[i]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        long[] jArr = this.f3743a;
        sb.append(jArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(jArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
