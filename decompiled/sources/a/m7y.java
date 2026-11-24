package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m7y implements o7y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0y f21342a;

    public m7y(q0y q0yVar) {
        this.f21342a = q0yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7y) && this.f21342a == ((m7y) obj).f21342a;
    }

    public final int hashCode() {
        return this.f21342a.hashCode();
    }

    public final String toString() {
        return "Error(type=" + this.f21342a + Separators.RPAREN;
    }
}
