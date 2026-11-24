package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class j56 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15918a;

    public /* synthetic */ j56(float f) {
        this.f15918a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j56) {
            return Float.compare(this.f15918a, ((j56) obj).f15918a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15918a);
    }

    public final String toString() {
        return rw2.j(this.f15918a, "BaselineShift(multiplier=", Separators.RPAREN);
    }
}
