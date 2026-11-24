package kotlin.ranges;

import a.g8x;
import a.jf4;
import a.jkx;
import a.khy;
import a.kkx;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Iterable, khy {
    public static final jkx d = new jkx(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46068a;
    public final int b;
    public final int c;

    public a(int i, int i2, int i3) {
        if (i3 == 0) {
            jf4.o("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            jf4.o("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f46068a = i;
        this.b = g8x.J(i, i2, i3);
        this.c = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f46068a == aVar.f46068a && this.b == aVar.b && this.c == aVar.c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f46068a * 31) + this.b) * 31) + this.c;
    }

    public boolean isEmpty() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.f46068a;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new kkx(this.f46068a, this.b, this.c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.f46068a;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
