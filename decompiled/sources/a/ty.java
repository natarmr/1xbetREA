package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34727a;
    public final int b;
    public final int c;

    public ty(int i, int i2, int i3) {
        this.f34727a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty)) {
            return false;
        }
        ty tyVar = (ty) obj;
        return this.f34727a == tyVar.f34727a && this.b == tyVar.b && this.c == tyVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f34727a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("AdditionalInfoUiModel(redCards=", this.f34727a, ", yellowCards=", ", corners=", this.b));
    }
}
