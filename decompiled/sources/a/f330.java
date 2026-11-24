package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class f330 implements p330 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8842a;

    public f330(float f) {
        this.f8842a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f330) && Float.compare(this.f8842a, ((f330) obj).f8842a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8842a);
    }

    public final String toString() {
        return rw2.j(this.f8842a, "OnCoefficientSizeChanged(value=", Separators.RPAREN);
    }
}
