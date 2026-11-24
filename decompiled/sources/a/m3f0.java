package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m3f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21113a;

    public m3f0(int i) {
        this.f21113a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m3f0) && this.f21113a == ((m3f0) obj).f21113a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21113a);
    }

    public final String toString() {
        return ua80.e(this.f21113a, "OnTabClick(position=", Separators.RPAREN);
    }
}
