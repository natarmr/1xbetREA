package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bj00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2681a;
    public final int b;
    public final long c;
    public final List d;

    public bj00(int i, long j, List list, boolean z) {
        list.getClass();
        this.f2681a = z;
        this.b = i;
        this.c = j;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj00)) {
            return false;
        }
        bj00 bj00Var = (bj00) obj;
        return this.f2681a == bj00Var.f2681a && this.b == bj00Var.b && this.c == bj00Var.c && Intrinsics.d(this.d, bj00Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b(twn.a(this.b, Boolean.hashCode(this.f2681a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbT = ohs0.t(this.b, "LiveExpressTabsListModel(top=", ", position=", ", sportId=", this.f2681a);
        hne.x(sbT, this.c, ", tabs=", this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
