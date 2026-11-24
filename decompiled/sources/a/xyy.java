package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xyy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mim0 f41728a;
    public final String b;

    public xyy(mim0 mim0Var, String str) {
        this.f41728a = mim0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyy)) {
            return false;
        }
        xyy xyyVar = (xyy) obj;
        return this.f41728a.equals(xyyVar.f41728a) && this.b.equals(xyyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41728a.hashCode() * 31);
    }

    public final String toString() {
        return "LastGameEventUiModel(card=" + this.f41728a + ", statisticGameId=" + this.b + Separators.RPAREN;
    }
}
