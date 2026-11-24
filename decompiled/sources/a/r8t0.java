package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class r8t0 implements u8t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30044a;

    public r8t0(int i) {
        this.f30044a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8t0) && this.f30044a == ((r8t0) obj).f30044a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30044a);
    }

    public final String toString() {
        return ua80.e(this.f30044a, "OnSocialMediaClick(socialMediaId=", Separators.RPAREN);
    }
}
