package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class o020 implements r020 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eb10 f24401a;

    public o020(eb10 eb10Var) {
        this.f24401a = eb10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o020) && this.f24401a.equals(((o020) obj).f24401a);
    }

    public final int hashCode() {
        return this.f24401a.f7497a.hashCode();
    }

    public final String toString() {
        return "Empty(lottieConfig=" + this.f24401a + Separators.RPAREN;
    }
}
