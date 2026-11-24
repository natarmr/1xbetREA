package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class hk extends ik {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13184a;

    public hk(int i) {
        this.f13184a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hk) && this.f13184a == ((hk) obj).f13184a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13184a);
    }

    public final String toString() {
        return ua80.e(this.f13184a, "ImageIdChange(imageId=", Separators.RPAREN);
    }
}
