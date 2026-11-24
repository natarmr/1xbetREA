package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class x8r {
    public static final w8r Companion = new w8r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40474a;
    public final int b;
    public final int c;
    public final int d;

    public /* synthetic */ x8r(int i, long j, int i2, int i3, int i4) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, v8r.f37001a.getDescriptor());
            throw null;
        }
        this.f40474a = j;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8r)) {
            return false;
        }
        x8r x8rVar = (x8r) obj;
        return this.f40474a == x8rVar.f40474a && this.b == x8rVar.b && this.c == x8rVar.c && this.d == x8rVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, twn.a(this.b, Long.hashCode(this.f40474a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f40474a, "FruitBlastActionRequest(accountId=", ", actionStep=");
        rw2.s(this.c, this.d, ", row=", ", column=", sbQ);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public x8r(int i, int i2, int i3, long j) {
        this.f40474a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
