package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class r4f0 implements t4f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29831a;

    public r4f0(int i) {
        this.f29831a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r4f0) && this.f29831a == ((r4f0) obj).f29831a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29831a);
    }

    public final String toString() {
        return ua80.e(this.f29831a, "ShowSocialForm(social=", Separators.RPAREN);
    }
}
