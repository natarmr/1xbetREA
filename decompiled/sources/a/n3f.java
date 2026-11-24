package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class n3f implements c4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22846a;
    public final int b;
    public final int c;

    public n3f(int i, int i2, long j) {
        this.f22846a = j;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3f)) {
            return false;
        }
        n3f n3fVar = (n3f) obj;
        return this.f22846a == n3fVar.f22846a && this.b == n3fVar.b && this.c == n3fVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Long.hashCode(this.f22846a) * 31, 31);
    }

    public final String toString() {
        return vqd.p(brm0.q(this.b, this.f22846a, "ShowDeleteEventDialog(eventEntityId=", ", titleResId="), ", messageResId=", this.c, Separators.RPAREN);
    }
}
