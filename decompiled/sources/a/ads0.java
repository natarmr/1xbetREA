package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ads0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2n f695a;

    public ads0(a2n a2nVar) {
        this.f695a = a2nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ads0) && this.f695a.equals(((ads0) obj).f695a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f695a.getKey();
    }

    public final int hashCode() {
        return this.f695a.hashCode();
    }

    public final String toString() {
        return "TrackedGameUiItem(model=" + this.f695a + Separators.RPAREN;
    }
}
