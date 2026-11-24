package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class e1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7047a;
    public final int b;

    public e1q(boolean z, int i) {
        this.f7047a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1q)) {
            return false;
        }
        e1q e1qVar = (e1q) obj;
        return this.f7047a == e1qVar.f7047a && this.b == e1qVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.f7047a) * 31);
    }

    public final String toString() {
        return "City(isRequired=" + this.f7047a + ", id=" + this.b + Separators.RPAREN;
    }
}
