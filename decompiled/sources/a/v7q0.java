package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v7q0 implements w7q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36942a;

    public final boolean equals(Object obj) {
        if (obj instanceof v7q0) {
            return this.f36942a.equals(((v7q0) obj).f36942a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36942a.hashCode();
    }

    public final String toString() {
        return kng0.l("Text(value=", this.f36942a, Separators.RPAREN);
    }
}
