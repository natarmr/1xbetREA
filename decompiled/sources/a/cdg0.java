package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cdg0 implements ddg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4161a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public cdg0(String str, String str2, String str3, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f4161a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
    }

    @Override // a.ddg0
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdg0)) {
            return false;
        }
        cdg0 cdg0Var = (cdg0) obj;
        return Intrinsics.d(this.f4161a, cdg0Var.f4161a) && Intrinsics.d(this.b, cdg0Var.b) && Intrinsics.d(this.c, cdg0Var.c) && this.d == cdg0Var.d && this.e == cdg0Var.e;
    }

    public final int hashCode() {
        int iB = ua80.b(this.f4161a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + brm0.e((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RollingCalendarDateUiModel(day=", this.f4161a, ", month=", this.b, ", year=");
        brm0.C(this.c, ", hasBadge=", ", isSelected=", sbN, this.d);
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
