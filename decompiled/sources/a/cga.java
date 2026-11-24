package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cga implements fga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4302a = axq.g();

    public cga() {
        e9l0 e9l0Var = e9l0.f7428a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cga) && this.f4302a.equals(((cga) obj).f4302a);
    }

    @Override // a.fga
    public final h9l0 f() {
        return e9l0.f7428a;
    }

    @Override // a.a2n
    public final String getKey() {
        return this + this.f4302a;
    }

    public final int hashCode() {
        return this.f4302a.hashCode();
    }

    public final String toString() {
        return kng0.l("LargeCardWatermark(id=", this.f4302a, Separators.RPAREN);
    }
}
