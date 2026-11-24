package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rer0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3n f30350a;

    public rer0(f3n f3nVar) {
        this.f30350a = f3nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rer0) && this.f30350a.equals(((rer0) obj).f30350a);
    }

    public final int hashCode() {
        return this.f30350a.hashCode();
    }

    public final String toString() {
        return "TopSportsUiModel(model=" + this.f30350a + Separators.RPAREN;
    }
}
