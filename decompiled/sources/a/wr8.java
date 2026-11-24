package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wr8 implements xr8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f39627a;

    public wr8(float f) {
        this.f39627a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wr8) && Float.compare(this.f39627a, ((wr8) obj).f39627a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39627a);
    }

    public final String toString() {
        return rw2.j(this.f39627a, "Fixed(value=", Separators.RPAREN);
    }
}
