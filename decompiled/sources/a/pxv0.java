package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pxv0 implements rxv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27775a;

    public pxv0(float f) {
        this.f27775a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pxv0) && Float.compare(this.f27775a, ((pxv0) obj).f27775a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27775a);
    }

    public final String toString() {
        return rw2.j(this.f27775a, "Drag(deltaHeightPx=", Separators.RPAREN);
    }
}
