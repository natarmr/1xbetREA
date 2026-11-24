package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ogs0 implements vk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25234a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final double j;
    public final int k;
    public final boolean l;

    public ogs0(long j, long j2, int i, int i2, String str, String str2, String str3, String str4, int i3, double d, int i4, boolean z) {
        str3.getClass();
        this.f25234a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = i3;
        this.j = d;
        this.k = i4;
        this.l = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogs0)) {
            return false;
        }
        ogs0 ogs0Var = (ogs0) obj;
        return this.f25234a == ogs0Var.f25234a && this.b == ogs0Var.b && this.c == ogs0Var.c && this.d == ogs0Var.d && this.e.equals(ogs0Var.e) && this.f.equals(ogs0Var.f) && Intrinsics.d(this.g, ogs0Var.g) && this.h.equals(ogs0Var.h) && this.i == ogs0Var.i && Double.compare(this.j, ogs0Var.j) == 0 && this.k == ogs0Var.k && this.l == ogs0Var.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + twn.a(this.k, brm0.d(this.j, twn.a(this.i, ua80.b(ua80.b(ua80.b(ua80.b(twn.a(this.d, twn.a(this.c, rw2.b(Long.hashCode(this.f25234a) * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f25234a, "TransactionUiModel(id=", ", dateTime=");
        ua80.v(sbQ, this.b, ", amountTextColor=", this.c);
        w6x.w(this.d, ", iconId=", ", sum=", this.e, sbQ);
        f140.v(sbQ, ", message=", this.f, ", currencySymbol=", this.g);
        axq.s(this.i, ", bonusCurrency=", this.h, ", idMove=", sbQ);
        ohs0.A(sbQ, this.j, ", defaultSum=", ", position=");
        return ohs0.k(this.k, ", is24HourFormat=", Separators.RPAREN, sbQ, this.l);
    }
}
