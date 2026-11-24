package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dml0 implements iml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6326a = axq.g();

    public dml0() {
        znl0 znl0Var = znl0.f44682a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dml0) && this.f6326a.equals(((dml0) obj).f6326a);
    }

    @Override // a.iml0
    public final eol0 f() {
        return znl0.f44682a;
    }

    @Override // a.a2n
    public final String getKey() {
        return this + this.f6326a;
    }

    public final int hashCode() {
        return this.f6326a.hashCode();
    }

    public final String toString() {
        return kng0.l("LargeCardLargeSportIcon(id=", this.f6326a, Separators.RPAREN);
    }
}
