package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ec9 {
    public static final dc9 Companion = new dc9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7553a;
    public final double b;
    public final long c;
    public final String d;
    public final long e;

    public /* synthetic */ ec9(double d, int i, long j, long j2, String str, String str2) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, cc9.f4099a.getDescriptor());
            throw null;
        }
        this.f7553a = str;
        this.b = d;
        this.c = j;
        this.d = str2;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec9)) {
            return false;
        }
        ec9 ec9Var = (ec9) obj;
        return Intrinsics.d(this.f7553a, ec9Var.f7553a) && Double.compare(this.b, ec9Var.b) == 0 && this.c == ec9Var.c && Intrinsics.d(this.d, ec9Var.d) && this.e == ec9Var.e;
    }

    public final int hashCode() {
        int iB = rw2.b(brm0.d(this.b, this.f7553a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return Long.hashCode(this.e) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuilderEventRequest(coef=");
        sb.append(this.f7553a);
        sb.append(", param=");
        sb.append(this.b);
        kng0.A(sb, ", player=", this.c, ", playerName=");
        defpackage.c.i(sb, this.e, this.d, ", type=");
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public ec9(String str, double d, long j, String str2, long j2) {
        str.getClass();
        this.f7553a = str;
        this.b = d;
        this.c = j;
        this.d = str2;
        this.e = j2;
    }
}
