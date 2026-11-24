package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class d900 implements hsq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5676a;

    public d900(float f) {
        this.f5676a = f;
    }

    @Override // a.hsq
    public final float a(float f) {
        return f / this.f5676a;
    }

    @Override // a.hsq
    public final float b(float f) {
        return f * this.f5676a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d900) && Float.compare(this.f5676a, ((d900) obj).f5676a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5676a);
    }

    public final String toString() {
        return rw2.j(this.f5676a, "LinearFontScaleConverter(fontScale=", Separators.RPAREN);
    }
}
