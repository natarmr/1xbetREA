package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class cd90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4151a;
    public final int b;
    public final ArrayList c;
    public final ArrayList d;

    public cd90(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        this.f4151a = i;
        this.b = i2;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd90)) {
            return false;
        }
        cd90 cd90Var = (cd90) obj;
        return this.f4151a == cd90Var.f4151a && this.b == cd90Var.b && this.c.equals(cd90Var.c) && this.d.equals(cd90Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.g(this.c, twn.a(this.b, Integer.hashCode(this.f4151a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("PenaltyScoreModel(teamOneScore=", this.f4151a, ", teamTwoScore=", ", teamOnePenalties=", this.b);
        sbT.append(this.c);
        sbT.append(", teamTwoPenalties=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
