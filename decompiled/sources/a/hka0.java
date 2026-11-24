package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hka0 implements mka0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13198a;

    public hka0(int i) {
        this.f13198a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hka0) && this.f13198a == ((hka0) obj).f13198a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13198a);
    }

    public final String toString() {
        return ua80.e(this.f13198a, "OnAppBarIconClicked(iconId=", Separators.RPAREN);
    }
}
