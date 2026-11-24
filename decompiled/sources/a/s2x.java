package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s2x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2x f31526a;
    public final int b;

    public s2x(r2x r2xVar, int i) {
        this.f31526a = r2xVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2x)) {
            return false;
        }
        s2x s2xVar = (s2x) obj;
        return this.f31526a.equals(s2xVar.f31526a) && this.b == s2xVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f31526a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.f31526a + ", configFlags=" + this.b + Separators.RPAREN;
    }
}
