package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l6l0 implements m6l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19512a = axq.g();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6l0) && this.f19512a.equals(((l6l0) obj).f19512a);
    }

    @Override // a.a2n
    public final String getKey() {
        return this + this.f19512a;
    }

    public final int hashCode() {
        return this.f19512a.hashCode();
    }

    public final String toString() {
        return kng0.l("Skeleton(id=", this.f19512a, Separators.RPAREN);
    }
}
