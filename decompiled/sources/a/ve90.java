package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ve90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37273a;
    public final String b;
    public final String c;
    public final boolean d;

    public ve90(String str, String str2, String str3, boolean z) {
        str.getClass();
        this.f37273a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve90)) {
            return false;
        }
        ve90 ve90Var = (ve90) obj;
        return Intrinsics.d(this.f37273a, ve90Var.f37273a) && Intrinsics.d(this.b, ve90Var.b) && Intrinsics.d(this.c, ve90Var.c) && this.d == ve90Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(this.f37273a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return defpackage.c.c(this.c, ", filledByEmptyScore=", Separators.RPAREN, b1j.n("PeriodScoreModel(periodName=", this.f37273a, ", teamOneScore=", this.b, ", teamTwoScore="), this.d);
    }

    public /* synthetic */ ve90(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }
}
