package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fl40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9722a;
    public final cl40 b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final List g;

    public fl40(List list, cl40 cl40Var, int i, int i2, int i3, float f, List list2) {
        list.getClass();
        list2.getClass();
        this.f9722a = list;
        this.b = cl40Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = f;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl40)) {
            return false;
        }
        fl40 fl40Var = (fl40) obj;
        return Intrinsics.d(this.f9722a, fl40Var.f9722a) && this.b == fl40Var.b && this.c == fl40Var.c && this.d == fl40Var.d && this.e == fl40Var.e && Float.compare(this.f, fl40Var.f) == 0 && Intrinsics.d(this.g, fl40Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + defpackage.c.a(twn.a(this.e, twn.a(this.d, twn.a(this.c, (this.b.hashCode() + (this.f9722a.hashCode() * 31)) * 31, 31), 31), 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MlbbTeamStatisticModel(heroes=");
        sb.append(this.f9722a);
        sb.append(", side=");
        sb.append(this.b);
        sb.append(", towers=");
        axq.r(this.c, this.d, ", lords=", ", turtles=", sb);
        sb.append(this.e);
        sb.append(", gold=");
        sb.append(this.f);
        sb.append(", goldHistoryList=");
        return dw9.r(sb, this.g, Separators.RPAREN);
    }
}
