package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class vq5 implements wq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37839a;

    public vq5(int i) {
        this.f37839a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vq5) && this.f37839a == ((vq5) obj).f37839a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37839a);
    }

    public final String toString() {
        return ua80.e(this.f37839a, "SaveSeenBanner(bannerId=", Separators.RPAREN);
    }
}
