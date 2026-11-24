package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class x2f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final igt f40164a;

    public x2f0(igt igtVar) {
        this.f40164a = igtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x2f0) && this.f40164a == ((x2f0) obj).f40164a;
    }

    public final int hashCode() {
        return this.f40164a.hashCode();
    }

    public final String toString() {
        return "OnGenderFieldClick(genderType=" + this.f40164a + Separators.RPAREN;
    }
}
