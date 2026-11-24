package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class me40 implements ef40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vbj f21627a;

    public me40(vbj vbjVar) {
        this.f21627a = vbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof me40) && this.f21627a.equals(((me40) obj).f21627a);
    }

    @Override // a.ef40
    public final String getKey() {
        return ohs0.n(sre0.f32672a.b(me40.class).J(), "_false");
    }

    @Override // a.ef40
    public final vbj getState() {
        return this.f21627a;
    }

    public final int hashCode() {
        return this.f21627a.hashCode() + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return "Banners(withHeader=false, state=" + this.f21627a + Separators.RPAREN;
    }
}
