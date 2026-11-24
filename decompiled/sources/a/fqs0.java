package a;

import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class fqs0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9990a;
    public final int b;
    public final sgi0 c;

    public fqs0(int i, int i2, sgi0 sgi0Var) {
        this.f9990a = i;
        this.b = i2;
        this.c = sgi0Var;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fqs0 fqs0Var) {
        fqs0Var.getClass();
        int i = fqs0Var.f9990a;
        int i2 = this.f9990a;
        if (i2 != i) {
            return i2 - i;
        }
        if (c() != fqs0Var.c()) {
            return c() ? 1 : -1;
        }
        IntRange intRange = this.c.f32162a;
        int i3 = intRange.f46068a + intRange.b;
        IntRange intRange2 = fqs0Var.c.f32162a;
        int i4 = i3 - (intRange2.f46068a + intRange2.b);
        if (i4 != 0) {
            return (b() || fqs0Var.b()) ? i4 : -i4;
        }
        int i5 = this.b - fqs0Var.b;
        return c() ? -i5 : i5;
    }

    public final boolean b() {
        IntRange intRange = this.c.f32162a;
        return intRange.f46068a == intRange.b;
    }

    public final boolean c() {
        return this.c.f32162a.b != this.f9990a;
    }

    public final String toString() {
        return (c() ? "Open" : "Close") + ": " + this.f9990a + " (" + this.c + ')';
    }
}
