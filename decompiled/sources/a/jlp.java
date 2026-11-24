package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jlp implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16728a;
    public final int b;

    public jlp(boolean z, int i) {
        this.f16728a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlp)) {
            return false;
        }
        jlp jlpVar = (jlp) obj;
        return this.f16728a == jlpVar.f16728a && this.b == jlpVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.f16728a) * 31);
    }

    public final String toString() {
        return "Favorite(value=" + this.f16728a + ", iconRes=" + this.b + Separators.RPAREN;
    }
}
