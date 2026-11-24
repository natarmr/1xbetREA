package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class psv implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27532a;
    public final int b;

    public psv(String str, int i) {
        this.f27532a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psv)) {
            return false;
        }
        psv psvVar = (psv) obj;
        return this.f27532a.equals(psvVar.f27532a) && this.b == psvVar.b;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f27532a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f27532a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "HeaderUiModel(key=", this.f27532a, ", title=", Separators.RPAREN);
    }
}
