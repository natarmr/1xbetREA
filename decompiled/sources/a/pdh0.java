package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pdh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26806a;
    public final edh0 b;
    public final edh0 c;

    public pdh0(int i, edh0 edh0Var, edh0 edh0Var2) {
        this.f26806a = i;
        this.b = edh0Var;
        this.c = edh0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdh0)) {
            return false;
        }
        pdh0 pdh0Var = (pdh0) obj;
        return this.f26806a == pdh0Var.f26806a && this.b.equals(pdh0Var.b) && this.c.equals(pdh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f26806a) * 31)) * 31);
    }

    public final String toString() {
        return "SeaBattleShipUiModel(drawableRes=" + this.f26806a + ", startCoordinates=" + this.b + ", endCoordinates=" + this.c + Separators.RPAREN;
    }
}
