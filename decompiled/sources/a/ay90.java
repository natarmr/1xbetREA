package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ay90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1661a;
    public final boolean b;

    public ay90(int i, boolean z) {
        this.f1661a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay90)) {
            return false;
        }
        ay90 ay90Var = (ay90) obj;
        return this.f1661a == ay90Var.f1661a && this.b == ay90Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f1661a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f1661a, "PlaybackRecoveryAttempt(number=", ", immediate=", Separators.RPAREN, this.b);
    }
}
