package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jbf0 implements lbf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16238a;

    public jbf0(int i) {
        this.f16238a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jbf0) && this.f16238a == ((jbf0) obj).f16238a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16238a);
    }

    public final String toString() {
        return ua80.e(this.f16238a, "ShowSocialForm(social=", Separators.RPAREN);
    }
}
