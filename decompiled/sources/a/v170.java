package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v170 implements y170 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f36616a;

    public v170(mdm mdmVar) {
        this.f36616a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v170) && this.f36616a.equals(((v170) obj).f36616a);
    }

    public final int hashCode() {
        return this.f36616a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f36616a, Separators.RPAREN);
    }
}
