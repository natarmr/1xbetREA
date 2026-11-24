package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jap0 implements map0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16202a;

    public jap0(int i) {
        this.f16202a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jap0) && this.f16202a == ((jap0) obj).f16202a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16202a);
    }

    public final String toString() {
        return ua80.e(this.f16202a, "OnCalendarClick(index=", Separators.RPAREN);
    }
}
