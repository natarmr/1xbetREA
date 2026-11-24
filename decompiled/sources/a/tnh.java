package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tnh implements unh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rnh f34233a;

    public final boolean equals(Object obj) {
        if (obj instanceof tnh) {
            return this.f34233a == ((tnh) obj).f34233a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34233a.hashCode();
    }

    public final String toString() {
        return "State(value=" + this.f34233a + Separators.RPAREN;
    }
}
