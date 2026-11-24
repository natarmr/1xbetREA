package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hgg0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13017a;
    public final String b;
    public final a4x c;
    public final boolean d;

    public hgg0(a4x a4xVar, String str, String str2, boolean z) {
        a4xVar.getClass();
        this.f13017a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgg0)) {
            return false;
        }
        hgg0 hgg0Var = (hgg0) obj;
        return this.f13017a.equals(hgg0Var.f13017a) && this.b.equals(hgg0Var.b) && Intrinsics.d(this.c, hgg0Var.c) && this.d == hgg0Var.d;
    }

    @Override // a.p6t0
    public final String getKey() {
        return "STATISTIC_ROUND_STAT";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.b(this.c, ua80.b(ua80.b(-968934004, 31, this.f13017a), 31, this.b), 31);
    }

    public final String toString() {
        return rz4.m(b1j.n("RoundStatUiModel(key=STATISTIC_ROUND_STAT, firstTeamImage=", this.f13017a, ", secondTeamImage=", this.b, ", rounds="), this.c, ", scrollToEnd=", this.d, Separators.RPAREN);
    }
}
