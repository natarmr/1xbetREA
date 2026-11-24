package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mvp implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3m f22469a;

    public mvp(h3m h3mVar) {
        this.f22469a = h3mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mvp) && this.f22469a.equals(((mvp) obj).f22469a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "BIOGRAPHY";
    }

    public final int hashCode() {
        return this.f22469a.f12392a.hashCode() - 1938756979;
    }

    public final String toString() {
        return "FighterBiographyUiModel(key=BIOGRAPHY, biography=" + this.f22469a + Separators.RPAREN;
    }
}
