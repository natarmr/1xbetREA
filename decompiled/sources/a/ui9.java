package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ui9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f35720a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final Integer e;
    public final Integer f;

    public ui9(ArrayList arrayList, ArrayList arrayList2, int i, int i2, Integer num, Integer num2) {
        this.f35720a = arrayList;
        this.b = arrayList2;
        this.c = i;
        this.d = i2;
        this.e = num;
        this.f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui9)) {
            return false;
        }
        ui9 ui9Var = (ui9) obj;
        return this.f35720a.equals(ui9Var.f35720a) && this.b.equals(ui9Var.b) && this.c == ui9Var.c && this.d == ui9Var.d && Intrinsics.d(this.e, ui9Var.e) && Intrinsics.d(this.f, ui9Var.f);
    }

    public final int hashCode() {
        int iA = twn.a(this.d, twn.a(this.c, twn.g(this.b, this.f35720a.hashCode() * 31, 31), 31), 31);
        Integer num = this.e;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CachePenaltyModel(teamOnePenaltyList=");
        sb.append(this.f35720a);
        sb.append(", teamTwoPenaltyList=");
        sb.append(this.b);
        sb.append(", currentTeamOnePenalty=");
        axq.r(this.c, this.d, ", currentTeamTwoPenalty=", ", teamOnePreviousPenalty=", sb);
        return ua80.l(sb, this.e, ", teamTwoPreviousPenalty=", this.f, Separators.RPAREN);
    }
}
