package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rdh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final edh0 f30291a;
    public final qdh0 b;

    public rdh0(edh0 edh0Var, qdh0 qdh0Var) {
        this.f30291a = edh0Var;
        this.b = qdh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdh0)) {
            return false;
        }
        rdh0 rdh0Var = (rdh0) obj;
        return this.f30291a.equals(rdh0Var.f30291a) && this.b == rdh0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30291a.hashCode() * 31);
    }

    public final String toString() {
        return "SeaBattleShotUiModel(coordinatesField=" + this.f30291a + ", shotState=" + this.b + Separators.RPAREN;
    }
}
