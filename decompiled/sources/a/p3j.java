package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class p3j implements z3j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26302a;

    public p3j(int i) {
        this.f26302a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p3j) && this.f26302a == ((p3j) obj).f26302a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26302a);
    }

    public final String toString() {
        return ua80.e(this.f26302a, "OnActiveItemChanged(position=", Separators.RPAREN);
    }
}
