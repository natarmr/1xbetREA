package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y92 implements ea2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42224a;

    public y92(String str) {
        this.f42224a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y92) && this.f42224a.equals(((y92) obj).f42224a);
    }

    public final int hashCode() {
        return this.f42224a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnQueryChanged(query=", this.f42224a, Separators.RPAREN);
    }
}
