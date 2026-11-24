package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class g2q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10572a;
    public final int b;

    public g2q(boolean z, int i) {
        this.f10572a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2q)) {
            return false;
        }
        g2q g2qVar = (g2q) obj;
        return this.f10572a == g2qVar.f10572a && this.b == g2qVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.f10572a) * 31);
    }

    public final String toString() {
        return "Sex(isRequired=" + this.f10572a + ", typeId=" + this.b + Separators.RPAREN;
    }
}
