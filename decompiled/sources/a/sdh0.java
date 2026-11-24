package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sdh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ych0 f32034a;
    public final edh0 b;

    public sdh0(ych0 ych0Var, edh0 edh0Var) {
        this.f32034a = ych0Var;
        this.b = edh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdh0)) {
            return false;
        }
        sdh0 sdh0Var = (sdh0) obj;
        return this.f32034a.equals(sdh0Var.f32034a) && this.b.equals(sdh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32034a.hashCode() * 31);
    }

    public final String toString() {
        return "SeaBattleSquare(geometricCoordinate=" + this.f32034a + ", gameCoordinate=" + this.b + Separators.RPAREN;
    }
}
