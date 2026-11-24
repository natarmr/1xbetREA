package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dn5 implements on5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6351a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public dn5(String str, String str2, String str3, String str4, String str5) {
        brm0.B(str2, str4, str5);
        this.f6351a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // a.on5
    public final String a() {
        return this.e;
    }

    @Override // a.on5
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn5)) {
            return false;
        }
        dn5 dn5Var = (dn5) obj;
        return this.f6351a.equals(dn5Var.f6351a) && Intrinsics.d(this.b, dn5Var.b) && this.c.equals(dn5Var.c) && Intrinsics.d(this.d, dn5Var.d) && Intrinsics.d(this.e, dn5Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f6351a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BalanceValue(balanceSum=", this.f6351a, ", balanceCurrency=", this.b, ", balanceSumCurrency=");
        f140.v(sbN, this.c, ", balanceName=", this.d, ", topUpTitle=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
