package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class c420 implements l520 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3705a;

    public c420(float f) {
        this.f3705a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c420) && Float.compare(this.f3705a, ((c420) obj).f3705a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3705a);
    }

    public final String toString() {
        return rw2.j(this.f3705a, "OnBottomSheetOffsetChanged(offset=", Separators.RPAREN);
    }
}
