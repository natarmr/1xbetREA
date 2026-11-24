package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class o3f implements c4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24581a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;

    public o3f(int i, int i2, int i3, long j, boolean z) {
        this.f24581a = j;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3f)) {
            return false;
        }
        o3f o3fVar = (o3f) obj;
        return this.f24581a == o3fVar.f24581a && this.b == o3fVar.b && this.c == o3fVar.c && this.d == o3fVar.d && this.e == o3fVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.a(this.d, brm0.e(twn.a(this.b, Long.hashCode(this.f24581a) * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f24581a, "ShowDeleteEventFromBlockDialog(eventEntityId=", ", blockId=");
        cs0.v(this.d, ", needRemoveBlock=", ", titleResId=", sbQ, this.c);
        return vqd.p(sbQ, ", messageResId=", this.e, Separators.RPAREN);
    }
}
