package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lo5 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20375a;
    public final String b;
    public final a4x c;
    public final boolean d;

    public lo5(a4x a4xVar, String str, String str2, boolean z) {
        a4xVar.getClass();
        this.f20375a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo5)) {
            return false;
        }
        lo5 lo5Var = (lo5) obj;
        return this.f20375a.equals(lo5Var.f20375a) && this.b.equals(lo5Var.b) && Intrinsics.d(this.c, lo5Var.c) && this.d == lo5Var.d;
    }

    @Override // a.p6t0
    public final String getKey() {
        return "BAN_PICKS";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.b(this.c, ua80.b(ua80.b(1963130942, 31, this.f20375a), 31, this.b), 31);
    }

    public final String toString() {
        return rz4.m(b1j.n("BanPicksUiModel(key=BAN_PICKS, firstTeamImage=", this.f20375a, ", secondTeamImage=", this.b, ", heroes="), this.c, ", scrollToEnd=", this.d, Separators.RPAREN);
    }
}
