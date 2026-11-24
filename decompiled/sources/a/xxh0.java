package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xxh0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41659a;
    public final List b;
    public final wxh0 c;
    public final long d;

    public xxh0(List list, List list2, wxh0 wxh0Var, long j) {
        list.getClass();
        list2.getClass();
        this.f41659a = list;
        this.b = list2;
        this.c = wxh0Var;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxh0)) {
            return false;
        }
        xxh0 xxh0Var = (xxh0) obj;
        return Intrinsics.d(this.f41659a, xxh0Var.f41659a) && Intrinsics.d(this.b, xxh0Var.b) && this.c == xxh0Var.c && this.d == xxh0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + dw9.a(this.f41659a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("SekaModel(playerOneCardList=", ", playerTwoCardList=", this.f41659a, ", matchState=", this.b);
        sbT.append(this.c);
        sbT.append(", time=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
