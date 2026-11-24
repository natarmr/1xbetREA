package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class b9e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f2205a;

    public b9e0(imm immVar) {
        this.f2205a = immVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9e0) && this.f2205a.equals(((b9e0) obj).f2205a);
    }

    public final int hashCode() {
        return this.f2205a.hashCode();
    }

    public final String toString() {
        return rz4.k(this.f2205a, "RatingToolbarUiModel(navigationBarUiModel=", Separators.RPAREN);
    }
}
