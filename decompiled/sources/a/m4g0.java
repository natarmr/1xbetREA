package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m4g0 implements y4g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f21169a;

    public m4g0(mdm mdmVar) {
        this.f21169a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m4g0) && this.f21169a.equals(((m4g0) obj).f21169a);
    }

    public final int hashCode() {
        return this.f21169a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(config=", this.f21169a, Separators.RPAREN);
    }
}
