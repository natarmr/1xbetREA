package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q8p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28311a;
    public final String b;
    public final String c;
    public final boolean d;

    public q8p0(String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.f28311a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8p0)) {
            return false;
        }
        q8p0 q8p0Var = (q8p0) obj;
        return Intrinsics.d(this.f28311a, q8p0Var.f28311a) && Intrinsics.d(this.b, q8p0Var.b) && Intrinsics.d(this.c, q8p0Var.c) && this.d == q8p0Var.d;
    }

    public final int hashCode() {
        int iB = ua80.b(this.f28311a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return defpackage.c.c(this.c, ", isToday=", Separators.RPAREN, b1j.n("TeamDetailsCalendarModel(day=", this.f28311a, ", month=", this.b, ", year="), this.d);
    }
}
