package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42320a;

    public yb1(boolean z) {
        this.f42320a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yb1) && this.f42320a == ((yb1) obj).f42320a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42320a);
    }

    public final String toString() {
        return defpackage.c.d("AggregatorPreloadGameUiState(loading=", Separators.RPAREN, this.f42320a);
    }
}
