package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class y320 implements a420 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f41930a;

    public y320(float f) {
        this.f41930a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y320) && Float.compare(this.f41930a, ((y320) obj).f41930a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f41930a);
    }

    public final String toString() {
        return rw2.j(this.f41930a, "SliderValueChange(value=", Separators.RPAREN);
    }
}
