package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class wyw implements xyw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39993a;

    public /* synthetic */ wyw(int i) {
        this.f39993a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wyw) {
            return this.f39993a == ((wyw) obj).f39993a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39993a);
    }

    public final String toString() {
        return ua80.e(this.f39993a, "ResImage(value=", Separators.RPAREN);
    }
}
