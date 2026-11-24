package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ylp0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42856a;
    public final rep0 b;
    public final a4x c;
    public final dep0 d;
    public final ybp0 e;
    public final llp0 f;

    public ylp0(String str, rep0 rep0Var, i4 i4Var, dep0 dep0Var, ybp0 ybp0Var, llp0 llp0Var) {
        i4Var.getClass();
        this.f42856a = str;
        this.b = rep0Var;
        this.c = i4Var;
        this.d = dep0Var;
        this.e = ybp0Var;
        this.f = llp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylp0)) {
            return false;
        }
        ylp0 ylp0Var = (ylp0) obj;
        return this.f42856a.equals(ylp0Var.f42856a) && this.b.equals(ylp0Var.b) && Intrinsics.d(this.c, ylp0Var.c) && this.d.equals(ylp0Var.d) && this.e.equals(ylp0Var.e) && this.f.equals(ylp0Var.f);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f42856a;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + cs0.b(this.c, (this.b.hashCode() + (this.f42856a.hashCode() * 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TeamStatisticUiModel(key=" + this.f42856a + ", teamInfo=" + this.b + ", heroItemList=" + this.c + ", teamGold=" + this.d + ", teamDragons=" + this.e + ", teamStatisticItems=" + this.f + Separators.RPAREN;
    }
}
