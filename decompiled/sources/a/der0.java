package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class der0 implements eer0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d5l0 f5963a;

    public der0(d5l0 d5l0Var) {
        this.f5963a = d5l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof der0) && this.f5963a.equals(((der0) obj).f5963a);
    }

    public final int hashCode() {
        return this.f5963a.f5512a.hashCode();
    }

    public final String toString() {
        return "SendPopularSportSideEffect(internalEffect=" + this.f5963a + Separators.RPAREN;
    }
}
