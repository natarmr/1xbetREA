package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class krq0 implements lrq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18780a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public krq0(String str, String str2, String str3, String str4, String str5, String str6) {
        ohs0.z(str, str2, str3, str4, str5);
        str6.getClass();
        this.f18780a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krq0)) {
            return false;
        }
        krq0 krq0Var = (krq0) obj;
        return Intrinsics.d(this.f18780a, krq0Var.f18780a) && Intrinsics.d(this.b, krq0Var.b) && Intrinsics.d(this.c, krq0Var.c) && Intrinsics.d(this.d, krq0Var.d) && Intrinsics.d(this.e, krq0Var.e) && Intrinsics.d(this.f, krq0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f18780a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TotoContent(jackpot=", this.f18780a, ", pool=", this.b, ", prizeFund=");
        f140.v(sbN, this.c, ", betSlipsNumber=", this.d, ", combinationsNumber=");
        return ua80.m(sbN, this.e, ", uniqueNumber=", this.f, Separators.RPAREN);
    }
}
