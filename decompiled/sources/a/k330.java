package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class k330 implements p330 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17600a;

    public k330(float f) {
        this.f17600a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k330) && Float.compare(this.f17600a, ((k330) obj).f17600a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17600a);
    }

    public final String toString() {
        return rw2.j(this.f17600a, "OnHeaderSizeChanged(value=", Separators.RPAREN);
    }
}
