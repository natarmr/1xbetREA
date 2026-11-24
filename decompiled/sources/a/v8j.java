package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v8j implements g9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36986a;

    public final boolean equals(Object obj) {
        if (obj instanceof v8j) {
            return this.f36986a.equals(((v8j) obj).f36986a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36986a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstPlayerNumberOfThrow(value=", this.f36986a, Separators.RPAREN);
    }
}
