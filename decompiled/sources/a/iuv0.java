package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class iuv0 implements kuv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15416a;

    public iuv0(float f) {
        this.f15416a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iuv0) && Float.compare(this.f15416a, ((iuv0) obj).f15416a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15416a);
    }

    public final String toString() {
        return rw2.j(this.f15416a, "Drag(deltaPx=", Separators.RPAREN);
    }
}
