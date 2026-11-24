package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pkb implements qkb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f27128a;

    public pkb(mdm mdmVar) {
        this.f27128a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pkb) && this.f27128a.equals(((pkb) obj).f27128a);
    }

    public final int hashCode() {
        return this.f27128a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f27128a, Separators.RPAREN);
    }
}
