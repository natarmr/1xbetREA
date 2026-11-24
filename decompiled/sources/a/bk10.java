package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class bk10 {
    public static final ak10 Companion = new ak10();
    public static final a8z[] g = {null, null, null, null, maz.a(wez.f39042a, new gf10(3)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2728a;
    public final bg8 b;
    public final Double c;
    public final int d;
    public final List e;
    public final String f;

    public bk10(int i, int i2, long j, bg8 bg8Var, Double d, String str, List list) {
        if (41 != (i & 41)) {
            m2x.I(i, 41, zj10.f44465a.getDescriptor());
            throw null;
        }
        this.f2728a = j;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bg8Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        this.d = i2;
        if ((i & 16) == 0) {
            this.e = iun.f15405a;
        } else {
            this.e = list;
        }
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk10)) {
            return false;
        }
        bk10 bk10Var = (bk10) obj;
        return this.f2728a == bk10Var.f2728a && Intrinsics.d(this.b, bk10Var.b) && Intrinsics.d(this.c, bk10Var.c) && this.d == bk10Var.d && Intrinsics.d(this.e, bk10Var.e) && Intrinsics.d(this.f, bk10Var.f);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f2728a) * 31;
        bg8 bg8Var = this.b;
        int iHashCode2 = (iHashCode + (bg8Var == null ? 0 : bg8Var.hashCode())) * 31;
        Double d = this.c;
        return this.f.hashCode() + dw9.a(twn.a(this.d, (iHashCode2 + (d != null ? d.hashCode() : 0)) * 31, 31), 31, this.e);
    }

    public final String toString() {
        return "LuckyCardRequest(walletId=" + this.f2728a + ", bonusRequest=" + this.b + ", bet=" + this.c + ", whence=" + this.d + ", additionalInfo=" + this.e + ", lng=" + this.f + Separators.RPAREN;
    }

    public bk10(long j, bg8 bg8Var, Double d, String str, List list) {
        list.getClass();
        this.f2728a = j;
        this.b = bg8Var;
        this.c = d;
        this.d = 22;
        this.e = list;
        this.f = str;
    }
}
