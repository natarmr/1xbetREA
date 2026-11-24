package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xf5 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wf5 f40775a;
    public final List b;
    public final List c;

    public xf5(wf5 wf5Var, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f40775a = wf5Var;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf5)) {
            return false;
        }
        xf5 xf5Var = (xf5) obj;
        return this.f40775a == xf5Var.f40775a && Intrinsics.d(this.b, xf5Var.b) && Intrinsics.d(this.c, xf5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f40775a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BakkaraModel(matchState=");
        sb.append(this.f40775a);
        sb.append(", playerOneCardList=");
        sb.append(this.b);
        sb.append(", playerTwoCardList=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
