package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class t420 implements v420 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f33298a;

    public t420(float f) {
        this.f33298a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t420) && Float.compare(this.f33298a, ((t420) obj).f33298a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33298a);
    }

    public final String toString() {
        return rw2.j(this.f33298a, "SliderValueChange(value=", Separators.RPAREN);
    }
}
