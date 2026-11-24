package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wd7 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38959a;

    public final boolean equals(Object obj) {
        if (obj instanceof wd7) {
            return Float.compare(this.f38959a, ((wd7) obj).f38959a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38959a);
    }

    public final String toString() {
        return rw2.j(this.f38959a, "Alpha(value=", Separators.RPAREN);
    }
}
