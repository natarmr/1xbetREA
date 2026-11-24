package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t9v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f33587a;
    public final float b;
    public final int c;

    public t9v(float f, float f2, int i) {
        this.f33587a = f;
        this.b = f2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9v)) {
            return false;
        }
        t9v t9vVar = (t9v) obj;
        return Float.compare(this.f33587a, t9vVar.f33587a) == 0 && Float.compare(this.b, t9vVar.b) == 0 && this.c == t9vVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + defpackage.c.a(Float.hashCode(this.f33587a) * 31, this.b, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.s(this.f33587a, this.b, "GoldRushCoordinatesGameFieldUiModel(y=", ", x=", ", position="));
    }
}
