package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class te9 implements xe9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33808a;

    public te9(int i) {
        this.f33808a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te9) && this.f33808a == ((te9) obj).f33808a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33808a);
    }

    public final String toString() {
        return ua80.e(this.f33808a, "IconRectangle(iconResId=", Separators.RPAREN);
    }
}
