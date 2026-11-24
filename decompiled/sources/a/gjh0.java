package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gjh0 implements hjh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11396a;

    public gjh0(int i) {
        this.f11396a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gjh0) && this.f11396a == ((gjh0) obj).f11396a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11396a);
    }

    public final String toString() {
        return ua80.e(this.f11396a, "OnSeasonClick(season=", Separators.RPAREN);
    }
}
