package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hjl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13166a;
    public final c280 b;

    public hjl0(c280 c280Var, String str) {
        this.f13166a = str;
        this.b = c280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjl0)) {
            return false;
        }
        hjl0 hjl0Var = (hjl0) obj;
        return this.f13166a.equals(hjl0Var.f13166a) && this.b.equals(hjl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13166a.hashCode() * 31);
    }

    public final String toString() {
        return "SportPromotionEventCardTeamModel(name=" + this.f13166a + ", opponentIcon=" + this.b + Separators.RPAREN;
    }
}
