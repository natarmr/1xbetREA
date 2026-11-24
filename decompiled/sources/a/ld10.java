package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class ld10 {
    public static final kd10 Companion = new kd10();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19827a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final boolean h;
    public final Integer i;
    public final ou0 j;

    public /* synthetic */ ld10(int i, long j, int i2, String str, String str2, String str3, long j2, String str4, boolean z, Integer num, ou0 ou0Var) {
        if (1023 != (i & 1023)) {
            m2x.I(i, 1023, jd10.f16307a.getDescriptor());
            throw null;
        }
        this.f19827a = j;
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
        if (!(obj instanceof ld10)) {
            return false;
        }
        ld10 ld10Var = (ld10) obj;
        return this.f19827a == ld10Var.f19827a && this.b == ld10Var.b && Intrinsics.d(this.c, ld10Var.c) && Intrinsics.d(this.d, ld10Var.d) && Intrinsics.d(this.e, ld10Var.e) && this.f == ld10Var.f && Intrinsics.d(this.g, ld10Var.g) && this.h == ld10Var.h && Intrinsics.d(this.i, ld10Var.i) && Intrinsics.d(this.j, ld10Var.j);
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(rw2.b(ua80.b(ua80.b(ua80.b(twn.a(this.b, Long.hashCode(this.f19827a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        Integer num = this.i;
        return this.j.hashCode() + ((iE + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f19827a, "LottoRequest(gameId=", ", whence=");
        f140.v(sbQ, ", lang=", this.c, ", lobbyUrl=", this.d);
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

    public ld10(String str, String str2, String str3, long j, String str4, Integer num, ou0 ou0Var) {
        str3.getClass();
        this.f19827a = 148525L;
        this.b = 22;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = str4;
        this.h = false;
        this.i = num;
        this.j = ou0Var;
    }
}
