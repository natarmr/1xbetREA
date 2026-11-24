package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qzd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29574a;
    public final yzd0 b;
    public final yzd0 c;
    public final List d;
    public final List e;

    public qzd0(String str, yzd0 yzd0Var, yzd0 yzd0Var2, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f29574a = str;
        this.b = yzd0Var;
        this.c = yzd0Var2;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzd0)) {
            return false;
        }
        qzd0 qzd0Var = (qzd0) obj;
        return this.f29574a.equals(qzd0Var.f29574a) && this.b.equals(qzd0Var.b) && this.c.equals(qzd0Var.c) && Intrinsics.d(this.d, qzd0Var.d) && Intrinsics.d(this.e, qzd0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a((this.c.hashCode() + ((this.b.hashCode() + (this.f29574a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RainbowStatisticMatchesMatchModel(map=");
        sb.append(this.f29574a);
        sb.append(", team1=");
        sb.append(this.b);
        sb.append(", team2=");
        sb.append(this.c);
        sb.append(", rounds=");
        sb.append(this.d);
        sb.append(", operatorBans=");
        return dw9.r(sb, this.e, Separators.RPAREN);
    }
}
