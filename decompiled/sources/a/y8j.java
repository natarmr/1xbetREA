package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class y8j implements g9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42197a;

    public final boolean equals(Object obj) {
        if (obj instanceof y8j) {
            return this.f42197a.equals(((y8j) obj).f42197a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42197a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstPlayerTotal(value=", this.f42197a, Separators.RPAREN);
    }
}
