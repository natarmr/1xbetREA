package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hdv implements kdv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f12889a;

    public hdv(mdm mdmVar) {
        this.f12889a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hdv) && this.f12889a.equals(((hdv) obj).f12889a);
    }

    public final int hashCode() {
        return this.f12889a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f12889a, Separators.RPAREN);
    }
}
