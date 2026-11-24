package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class t9n0 {
    public static final s9n0 Companion = new s9n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7m0 f33574a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ t9n0(int i, b7m0 b7m0Var, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f33574a = null;
        } else {
            this.f33574a = b7m0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9n0)) {
            return false;
        }
        t9n0 t9n0Var = (t9n0) obj;
        return this.f33574a == t9n0Var.f33574a && Intrinsics.d(this.b, t9n0Var.b) && Intrinsics.d(this.c, t9n0Var.c) && Intrinsics.d(this.d, t9n0Var.d);
    }

    public final int hashCode() {
        b7m0 b7m0Var = this.f33574a;
        int iHashCode = (b7m0Var == null ? 0 : b7m0Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionTabloStatResponse(id=");
        sb.append(this.f33574a);
        sb.append(", s1=");
        sb.append(this.b);
        sb.append(", s2=");
        return ua80.m(sb, this.c, ", name=", this.d, Separators.RPAREN);
    }
}
