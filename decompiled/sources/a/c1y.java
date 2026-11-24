package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class c1y implements d1y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3598a;

    public c1y(float f) {
        this.f3598a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1y) && Float.compare(this.f3598a, ((c1y) obj).f3598a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3598a);
    }

    public final String toString() {
        return rw2.j(this.f3598a, "OnSliderValueChange(value=", Separators.RPAREN);
    }
}
