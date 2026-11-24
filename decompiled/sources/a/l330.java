package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l330 implements p330 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19340a;

    public l330(float f) {
        this.f19340a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l330) && Float.compare(this.f19340a, ((l330) obj).f19340a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19340a);
    }

    public final String toString() {
        return rw2.j(this.f19340a, "OnMarketSizeChanged(value=", Separators.RPAREN);
    }
}
