package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qxv0 implements rxv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f29508a;

    public qxv0(float f) {
        this.f29508a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxv0) && Float.compare(this.f29508a, ((qxv0) obj).f29508a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f29508a);
    }

    public final String toString() {
        return rw2.j(this.f29508a, "Settle(velocity=", Separators.RPAREN);
    }
}
