package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class apq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1266a;
    public final String b;
    public final String c;
    public final String d;

    public apq0(String str, String str2, String str3, String str4) {
        brm0.B(str2, str3, str4);
        this.f1266a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apq0)) {
            return false;
        }
        apq0 apq0Var = (apq0) obj;
        return this.f1266a.equals(apq0Var.f1266a) && Intrinsics.d(this.b, apq0Var.b) && Intrinsics.d(this.c, apq0Var.c) && Intrinsics.d(this.d, apq0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f1266a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("TirageCardUiModel(jackpot=", this.f1266a, ", betSlipsNumber=", this.b, ", combinationsNumber="), this.c, ", uniqueNumber=", this.d, Separators.RPAREN);
    }
}
