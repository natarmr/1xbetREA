package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class juv0 implements kuv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17179a;

    public juv0(float f) {
        this.f17179a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof juv0) && Float.compare(this.f17179a, ((juv0) obj).f17179a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17179a);
    }

    public final String toString() {
        return rw2.j(this.f17179a, "Settle(velocityPxPerSec=", Separators.RPAREN);
    }
}
