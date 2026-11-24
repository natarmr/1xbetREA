package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kx00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19028a;
    public final String b;
    public final long c;
    public final long d;

    public kx00(long j, long j2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f19028a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx00)) {
            return false;
        }
        kx00 kx00Var = (kx00) obj;
        return Intrinsics.d(this.f19028a, kx00Var.f19028a) && Intrinsics.d(this.b, kx00Var.b) && this.c == kx00Var.c && this.d == kx00Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + rw2.b(ua80.b(this.f19028a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("LogonModel(refreshToken=", this.f19028a, ", token=", this.b, ", tokenExpiry=");
        sbN.append(this.c);
        return rw2.n(sbN, this.d, ", userId=", Separators.RPAREN);
    }
}
