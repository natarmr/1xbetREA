package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class of90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25154a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public of90(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        str3.getClass();
        str4.getClass();
        this.f25154a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of90)) {
            return false;
        }
        of90 of90Var = (of90) obj;
        return this.f25154a.equals(of90Var.f25154a) && this.b.equals(of90Var.b) && Intrinsics.d(this.c, of90Var.c) && Intrinsics.d(this.d, of90Var.d) && this.e.equals(of90Var.e) && this.f == of90Var.f && this.g == of90Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(this.f25154a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PeriodScoresUiModel(score1=", this.f25154a, ", score2=", this.b, ", subScore1=");
        f140.v(sbN, this.c, ", subScore2=", this.d, ", shortTitle=");
        brm0.C(this.e, ", score1Changed=", ", score2Changed=", sbN, this.f);
        return rw2.p(sbN, this.g, Separators.RPAREN);
    }
}
