package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class uq60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36104a;
    public final vpv0 b;

    public uq60(int i, vpv0 vpv0Var) {
        this.f36104a = i;
        this.b = vpv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq60)) {
            return false;
        }
        uq60 uq60Var = (uq60) obj;
        return this.f36104a == uq60Var.f36104a && this.b == uq60Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f36104a) * 31);
    }

    public final String toString() {
        return "OneXGamesActionsWorkStatusModel(id=" + this.f36104a + ", status=" + this.b + Separators.RPAREN;
    }
}
