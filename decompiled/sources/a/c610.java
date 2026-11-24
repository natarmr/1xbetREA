package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c610 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3797a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public c610(String str, String str2, String str3, String str4, String str5) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f3797a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c610)) {
            return false;
        }
        c610 c610Var = (c610) obj;
        return Intrinsics.d(this.f3797a, c610Var.f3797a) && Intrinsics.d(this.b, c610Var.b) && Intrinsics.d(this.c, c610Var.c) && Intrinsics.d(this.d, c610Var.d) && Intrinsics.d(this.e, c610Var.e);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return c610.class;
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f3797a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("LolTopPlayerHeaderUiModel(firstLeftColumnTitle=", this.f3797a, ", secondLeftColumnTitle=", this.b, ", firstRightColumnTitle=");
        f140.v(sbN, this.c, ", secondRightColumnTitle=", this.d, ", thirdRightColumnTitle=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
