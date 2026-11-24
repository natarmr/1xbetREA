package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class d1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5321a;
    public final int b;

    public d1q(boolean z, int i) {
        this.f5321a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1q)) {
            return false;
        }
        d1q d1qVar = (d1q) obj;
        return this.f5321a == d1qVar.f5321a && this.b == d1qVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.f5321a) * 31);
    }

    public final String toString() {
        return "Citizenship(isRequired=" + this.f5321a + ", id=" + this.b + Separators.RPAREN;
    }
}
