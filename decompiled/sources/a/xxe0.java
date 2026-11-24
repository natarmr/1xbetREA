package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xxe0 implements zxe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41655a;

    public xxe0(int i) {
        this.f41655a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xxe0) && this.f41655a == ((xxe0) obj).f41655a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41655a);
    }

    public final String toString() {
        return ua80.e(this.f41655a, "ShowSocialForm(social=", Separators.RPAREN);
    }
}
