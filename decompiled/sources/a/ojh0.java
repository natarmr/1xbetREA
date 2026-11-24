package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ojh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25360a;

    public final boolean equals(Object obj) {
        if (obj instanceof ojh0) {
            return this.f25360a == ((ojh0) obj).f25360a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25360a);
    }

    public final String toString() {
        return ua80.e(this.f25360a, "OnSeasonClick(season=", Separators.RPAREN);
    }
}
