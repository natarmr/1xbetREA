package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z8j implements g9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f9a0 f43969a;

    public final boolean equals(Object obj) {
        if (obj instanceof z8j) {
            return this.f43969a == ((z8j) obj).f43969a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f43969a.hashCode();
    }

    public final String toString() {
        return "Move(value=" + this.f43969a + Separators.RPAREN;
    }
}
