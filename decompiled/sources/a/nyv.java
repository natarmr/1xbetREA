package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nyv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r21 f24347a;

    public nyv(r21 r21Var) {
        this.f24347a = r21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nyv) && this.f24347a == ((nyv) obj).f24347a;
    }

    public final int hashCode() {
        return this.f24347a.hashCode();
    }

    public final String toString() {
        return "SelectedBetType(betType=" + this.f24347a + Separators.RPAREN;
    }
}
