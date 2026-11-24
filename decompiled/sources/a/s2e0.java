package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s2e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31497a;

    public s2e0(String str) {
        this.f31497a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2e0) && this.f31497a.equals(((s2e0) obj).f31497a);
    }

    public final int hashCode() {
        return this.f31497a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenStore(storeLink=", this.f31497a, Separators.RPAREN);
    }
}
