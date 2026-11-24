package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t7a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33458a;
    public final String b;
    public final String c;
    public final String d;

    public t7a0(String str, String str2, String str3, String str4) {
        brm0.B(str2, str3, str4);
        this.f33458a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7a0)) {
            return false;
        }
        t7a0 t7a0Var = (t7a0) obj;
        return this.f33458a.equals(t7a0Var.f33458a) && Intrinsics.d(this.b, t7a0Var.b) && Intrinsics.d(this.c, t7a0Var.c) && Intrinsics.d(this.d, t7a0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f33458a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("PlayerMedalsStatisticUiModel(competition=", this.f33458a, ", gold=", this.b, ", silver="), this.c, ", bronze=", this.d, Separators.RPAREN);
    }
}
