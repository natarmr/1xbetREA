package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hlk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13265a;
    public final int b;
    public final int c;

    public hlk(int i, int i2, int i3) {
        this.f13265a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlk)) {
            return false;
        }
        hlk hlkVar = (hlk) obj;
        return this.f13265a == hlkVar.f13265a && this.b == hlkVar.b && this.c == hlkVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f13265a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("DiceRoundScoreModel(diceFirstValue=", this.f13265a, ", diceSecondValue=", ", roundScore=", this.b));
    }
}
