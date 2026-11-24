package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fml0 implements iml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9789a = axq.g();

    public fml0() {
        bol0 bol0Var = bol0.f2939a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fml0) && this.f9789a.equals(((fml0) obj).f9789a);
    }

    @Override // a.iml0
    public final eol0 f() {
        return bol0.f2939a;
    }

    @Override // a.a2n
    public final String getKey() {
        return this + this.f9789a;
    }

    public final int hashCode() {
        return this.f9789a.hashCode();
    }

    public final String toString() {
        return kng0.l("LargeCardWatermark(id=", this.f9789a, Separators.RPAREN);
    }
}
