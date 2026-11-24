package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s9v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31866a;
    public final float b;
    public final float c;
    public final a73 d;

    public s9v(int i, float f, float f2, a73 a73Var) {
        this.f31866a = i;
        this.b = f;
        this.c = f2;
        this.d = a73Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9v)) {
            return false;
        }
        s9v s9vVar = (s9v) obj;
        return this.f31866a == s9vVar.f31866a && Float.compare(this.b, s9vVar.b) == 0 && Float.compare(this.c, s9vVar.c) == 0 && this.d == s9vVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + defpackage.c.a(defpackage.c.a(Integer.hashCode(this.f31866a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "GoldRushCoordinateUiModel(position=" + this.f31866a + ", x=" + this.b + ", y=" + this.c + ", direction=" + this.d + Separators.RPAREN;
    }
}
