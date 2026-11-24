package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class u320 implements a420 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f34976a;

    public u320(float f) {
        this.f34976a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u320) && Float.compare(this.f34976a, ((u320) obj).f34976a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34976a);
    }

    public final String toString() {
        return rw2.j(this.f34976a, "SliderValueChange(value=", Separators.RPAREN);
    }
}
