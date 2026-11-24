package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class p020 implements r020 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eb10 f26127a;

    public p020(eb10 eb10Var) {
        this.f26127a = eb10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p020) && this.f26127a.equals(((p020) obj).f26127a);
    }

    public final int hashCode() {
        return this.f26127a.f7497a.hashCode();
    }

    public final String toString() {
        return "Error(lottieConfig=" + this.f26127a + Separators.RPAREN;
    }
}
