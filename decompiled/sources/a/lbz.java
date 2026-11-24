package a;

import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class lbz implements l7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f19774a;
    public final short b;
    public final pz40 c;
    public int d;

    /* JADX WARN: Multi-variable type inference failed */
    public lbz(int i, int i2, int i3) {
        this.f19774a = i2;
        this.b = i3;
        int i4 = (i / i2) * i2;
        this.c = androidx.compose.runtime.e.d(l1e0.o(Math.max(i4 - i3, 0), i4 + i2 + i3), rek0.c);
        this.d = i;
    }

    public final void b(int i) {
        if (i != this.d) {
            this.d = i;
            byte b = this.f19774a;
            int i2 = (i / b) * b;
            short s = this.b;
            ((hgk0) this.c).setValue(l1e0.o(Math.max(i2 - s, 0), i2 + b + s));
        }
    }

    @Override // a.l7m0
    public final Object getValue() {
        return (IntRange) ((hgk0) this.c).getValue();
    }
}
