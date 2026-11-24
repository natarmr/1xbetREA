package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class l4g0 implements x4g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f19404a;

    public l4g0(mdm mdmVar) {
        this.f19404a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l4g0) && this.f19404a.equals(((l4g0) obj).f19404a);
    }

    public final int hashCode() {
        return this.f19404a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(config=", this.f19404a, Separators.RPAREN);
    }
}
