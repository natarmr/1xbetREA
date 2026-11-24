package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jpw extends lpw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qpw f16921a;
    public final int b;

    public jpw(qpw qpwVar, int i) {
        this.f16921a = qpwVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpw)) {
            return false;
        }
        jpw jpwVar = (jpw) obj;
        return this.f16921a.equals(jpwVar.f16921a) && this.b == jpwVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f16921a.hashCode() * 31);
    }

    public final String toString() {
        return "Data(horsesModel=" + this.f16921a + ", sportId=" + this.b + Separators.RPAREN;
    }
}
