package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class yv0 {
    public static final xv0 Companion = new xv0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43295a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final boolean h;
    public final Integer i;
    public final ou0 j;

    public /* synthetic */ yv0(int i, long j, int i2, String str, String str2, String str3, long j2, String str4, boolean z, Integer num, ou0 ou0Var) {
        if (1023 != (i & 1023)) {
            m2x.I(i, 1023, wv0.f39815a.getDescriptor());
            throw null;
        }
        this.f43295a = j;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j2;
        this.g = str4;
        this.h = z;
        this.i = num;
        this.j = ou0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv0)) {
            return false;
        }
        yv0 yv0Var = (yv0) obj;
        return this.f43295a == yv0Var.f43295a && this.b == yv0Var.b && Intrinsics.d(this.c, yv0Var.c) && Intrinsics.d(this.d, yv0Var.d) && Intrinsics.d(this.e, yv0Var.e) && this.f == yv0Var.f && Intrinsics.d(this.g, yv0Var.g) && this.h == yv0Var.h && Intrinsics.d(this.i, yv0Var.i) && Intrinsics.d(this.j, yv0Var.j);
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(rw2.b(ua80.b(ua80.b(ua80.b(twn.a(this.b, Long.hashCode(this.f43295a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        Integer num = this.i;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        ou0 ou0Var = this.j;
        return iHashCode + (ou0Var != null ? ou0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f43295a, "AggregatorGameRequestWithAuthRequest(gameId=", ", whence=");
        f140.v(sbQ, ", lng=", this.c, ", lobbyUrl=", this.d);
        hne.B(sbQ, ", appGuid=", this.e, ", playerBonusId=");
        kng0.z(sbQ, this.f, ", domen=", this.g);
        sbQ.append(", demo=");
        sbQ.append(this.h);
        sbQ.append(", subCategoryId=");
        sbQ.append(this.i);
        sbQ.append(", metrics=");
        sbQ.append(this.j);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public yv0(long j, String str, String str2, String str3, long j2, String str4, boolean z, Integer num, ou0 ou0Var) {
        str2.getClass();
        str3.getClass();
        this.f43295a = j;
        this.b = 22;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j2;
        this.g = str4;
        this.h = z;
        this.i = num;
        this.j = ou0Var;
    }
}
