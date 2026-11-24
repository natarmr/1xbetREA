package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class jq40 {
    public static final iq40 Companion = new iq40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16932a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;

    public /* synthetic */ jq40(int i, String str, String str2, String str3, long j, long j2) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, hq40.f13469a.getDescriptor());
            throw null;
        }
        this.f16932a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq40)) {
            return false;
        }
        jq40 jq40Var = (jq40) obj;
        return Intrinsics.d(this.f16932a, jq40Var.f16932a) && Intrinsics.d(this.b, jq40Var.b) && Intrinsics.d(this.c, jq40Var.c) && this.d == jq40Var.d && this.e == jq40Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + rw2.b(ua80.b(ua80.b(this.f16932a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MoneyTransferWithSmsRequest(guid=", this.f16932a, ", codePlaceholder=", this.b, ", amount=");
        defpackage.c.i(sbN, this.d, this.c, ", balanceId=");
        return rw2.n(sbN, this.e, ", productId=", Separators.RPAREN);
    }

    public jq40(long j, long j2, String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f16932a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
    }
}
