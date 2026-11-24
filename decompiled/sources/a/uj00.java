package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uj00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35757a;
    public final int b;
    public final List c;
    public final n3h0 d;

    public uj00(int i, int i2, List list, n3h0 n3h0Var) {
        list.getClass();
        this.f35757a = i;
        this.b = i2;
        this.c = list;
        this.d = n3h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj00)) {
            return false;
        }
        uj00 uj00Var = (uj00) obj;
        return this.f35757a == uj00Var.f35757a && this.b == uj00Var.b && Intrinsics.d(this.c, uj00Var.c) && this.d.equals(uj00Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(twn.a(this.b, Integer.hashCode(this.f35757a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("LiveGameEventsModel(id=", this.f35757a, ", constId=", ", events=", this.b);
        sbT.append(this.c);
        sbT.append(", score=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
