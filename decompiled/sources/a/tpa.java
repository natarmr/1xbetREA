package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tpa extends dqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bex f34321a;

    public tpa(bex bexVar) {
        this.f34321a = bexVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tpa) && this.f34321a == ((tpa) obj).f34321a;
    }

    public final int hashCode() {
        return this.f34321a.hashCode();
    }

    public final String toString() {
        return "InningStateChanged(inningState=" + this.f34321a + Separators.RPAREN;
    }
}
