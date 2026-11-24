package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class esn0 implements fsn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8338a;

    public esn0(int i) {
        this.f8338a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof esn0) && this.f8338a == ((esn0) obj).f8338a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8338a);
    }

    public final String toString() {
        return ua80.e(this.f8338a, "OnSportFilterClick(index=", Separators.RPAREN);
    }
}
