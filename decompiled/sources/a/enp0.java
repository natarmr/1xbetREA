package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class enp0 implements fnp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8106a;

    public enp0(int i) {
        this.f8106a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof enp0) && this.f8106a == ((enp0) obj).f8106a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8106a);
    }

    public final String toString() {
        return ua80.e(this.f8106a, "OnTabSelected(tabIndex=", Separators.RPAREN);
    }
}
