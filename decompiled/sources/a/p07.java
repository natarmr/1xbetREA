package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class p07 implements q07 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26135a;

    public final boolean equals(Object obj) {
        if (obj instanceof p07) {
            return Float.compare(this.f26135a, ((p07) obj).f26135a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26135a);
    }

    public final String toString() {
        return rw2.j(this.f26135a, "RotationValue(value=", Separators.RPAREN);
    }
}
