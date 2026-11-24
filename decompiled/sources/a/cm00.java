package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cm00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4585a;
    public final double b;
    public final long c;
    public final double d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final ArrayList h;
    public final List i;
    public final List j;

    public cm00(boolean z, double d, long j, double d2, int i, boolean z2, boolean z3, ArrayList arrayList, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f4585a = z;
        this.b = d;
        this.c = j;
        this.d = d2;
        this.e = i;
        this.f = z2;
        this.g = z3;
        this.h = arrayList;
        this.i = list;
        this.j = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm00)) {
            return false;
        }
        cm00 cm00Var = (cm00) obj;
        return this.f4585a == cm00Var.f4585a && Double.compare(this.b, cm00Var.b) == 0 && this.c == cm00Var.c && Double.compare(this.d, cm00Var.d) == 0 && this.e == cm00Var.e && this.f == cm00Var.f && this.g == cm00Var.g && this.h.equals(cm00Var.h) && Intrinsics.d(this.i, cm00Var.i) && Intrinsics.d(this.j, cm00Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + dw9.a(twn.g(this.h, brm0.e(brm0.e(twn.a(this.e, brm0.d(this.d, rw2.b(brm0.d(this.b, Boolean.hashCode(this.f4585a) * 31, 31), 31, this.c), 31), 31), 31, this.f), 31, this.g), 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadCouponModel(advanceBet=");
        sb.append(this.f4585a);
        sb.append(", maxBet=");
        sb.append(this.b);
        kng0.A(sb, ", expressNum=", this.c, ", antiExpressCoef=");
        rz4.w(sb, this.d, ", vid=", this.e);
        w6x.A(", hasRemoveEvents=", ", withLobby=", sb, this.f, this.g);
        sb.append(", events=");
        sb.append(this.h);
        sb.append(", eventsIndexes=");
        sb.append(this.i);
        return ohs0.s(sb, ", minBetSystems=", this.j, Separators.RPAREN);
    }
}
