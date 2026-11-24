package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class dn00 {
    public static final cn00 Companion = new cn00();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6344a;
    public final String b;
    public final int c;
    public final int d;

    public /* synthetic */ dn00(String str, int i, int i2, int i3, String str2) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, bn00.f2858a.getDescriptor());
            throw null;
        }
        this.f6344a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn00)) {
            return false;
        }
        dn00 dn00Var = (dn00) obj;
        return Intrinsics.d(this.f6344a, dn00Var.f6344a) && Intrinsics.d(this.b, dn00Var.b) && this.c == dn00Var.c && this.d == dn00Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, ua80.b(this.f6344a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", cfView=", Separators.RPAREN, b1j.n("LoadCouponWithoutUserIdRequest(guid=", this.f6344a, ", lng=", this.b, ", partner="));
    }

    public dn00(int i, String str, String str2) {
        str.getClass();
        this.f6344a = str;
        this.b = str2;
        this.c = 1;
        this.d = i;
    }
}
