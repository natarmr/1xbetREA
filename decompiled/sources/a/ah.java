package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.betting.core.zip.model.zip.bet.ChildBets;

/* JADX INFO: loaded from: classes3.dex */
public final class ah implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChildBets f850a;
    public final long b;
    public final boolean c;
    public final zq20 d;
    public final int e;

    public ah(ChildBets childBets, long j, boolean z, zq20 zq20Var, int i) {
        childBets.getClass();
        this.f850a = childBets;
        this.b = j;
        this.c = z;
        this.d = zq20Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return Intrinsics.d(this.f850a, ahVar.f850a) && this.b == ahVar.b && this.c == ahVar.c && this.d == ahVar.d && this.e == ahVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + brm0.e(rw2.b(this.f850a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccuracyBetUiModel(childs=");
        sb.append(this.f850a);
        sb.append(", groupId=");
        sb.append(this.b);
        sb.append(", betTypeIsDecimal=");
        sb.append(this.c);
        sb.append(", marginDirection=");
        sb.append(this.d);
        return vqd.p(sb, ", selectedPosition=", this.e, Separators.RPAREN);
    }
}
