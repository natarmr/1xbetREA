package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kpk extends lpk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f18680a;

    public kpk(mdm mdmVar) {
        this.f18680a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kpk) && this.f18680a.equals(((kpk) obj).f18680a);
    }

    public final int hashCode() {
        return this.f18680a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f18680a, Separators.RPAREN);
    }
}
