package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o9f0 implements s9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24877a;

    public o9f0(int i) {
        this.f24877a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o9f0) && this.f24877a == ((o9f0) obj).f24877a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24877a);
    }

    public final String toString() {
        return ua80.e(this.f24877a, "OnSocialSectionItemClick(socialId=", Separators.RPAREN);
    }
}
