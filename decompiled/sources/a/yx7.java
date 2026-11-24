package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class yx7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f43406a;

    public yx7(float f) {
        this.f43406a = f;
    }

    public final int a(int i, int i2) {
        return Math.round((1.0f + this.f43406a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yx7) && Float.compare(this.f43406a, ((yx7) obj).f43406a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f43406a);
    }

    public final String toString() {
        return rw2.j(this.f43406a, "Vertical(bias=", Separators.RPAREN);
    }
}
