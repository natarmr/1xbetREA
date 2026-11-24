package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class w89 implements e8q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ijj0 f38711a;
    public final float b;

    public w89(ijj0 ijj0Var, float f) {
        this.f38711a = ijj0Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w89)) {
            return false;
        }
        w89 w89Var = (w89) obj;
        return this.f38711a.equals(w89Var.f38711a) && Float.compare(this.b, w89Var.b) == 0;
    }

    @Override // a.e8q0
    public final float g() {
        return this.b;
    }

    @Override // a.e8q0
    public final long h() {
        int i = y3d.h;
        return y3d.g;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.f38711a.hashCode() * 31);
    }

    @Override // a.e8q0
    public final t89 l() {
        return this.f38711a;
    }

    public final String toString() {
        return "BrushStyle(value=" + this.f38711a + ", alpha=" + this.b + Separators.RPAREN;
    }
}
