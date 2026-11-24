package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sow implements vow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f32563a;

    public sow(mdm mdmVar) {
        this.f32563a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sow) && this.f32563a.equals(((sow) obj).f32563a);
    }

    public final int hashCode() {
        return this.f32563a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(lottieConfig=", this.f32563a, Separators.RPAREN);
    }
}
