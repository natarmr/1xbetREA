package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j0z implements l0z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15704a;

    public j0z(int i) {
        this.f15704a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0z) && this.f15704a == ((j0z) obj).f15704a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15704a);
    }

    public final String toString() {
        return ua80.e(this.f15704a, "OnTabChanged(tab=", Separators.RPAREN);
    }
}
