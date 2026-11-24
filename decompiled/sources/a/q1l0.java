package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q1l0 implements u1l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27960a;

    public q1l0(int i) {
        this.f27960a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1l0) && this.f27960a == ((q1l0) obj).f27960a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27960a);
    }

    public final String toString() {
        return ua80.e(this.f27960a, "ActionIcon(iconResId=", Separators.RPAREN);
    }
}
