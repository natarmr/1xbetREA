package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q4t0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28118a;
    public final y3t0 b;
    public final a4x c;
    public final boolean d;

    public q4t0(String str, y3t0 y3t0Var, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f28118a = str;
        this.b = y3t0Var;
        this.c = a4xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4t0)) {
            return false;
        }
        q4t0 q4t0Var = (q4t0) obj;
        return this.f28118a.equals(q4t0Var.f28118a) && this.b == q4t0Var.b && Intrinsics.d(this.c, q4t0Var.c) && this.d == q4t0Var.d;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f28118a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(cs0.b(this.c, (this.b.hashCode() + (this.f28118a.hashCode() * 31)) * 31, 31), 31, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UfcPeekingGameCardUiModel(key=");
        sb.append(this.f28118a);
        sb.append(", orientation=");
        sb.append(this.b);
        sb.append(", gamesCards=");
        return rz4.m(sb, this.c, ", userScrollEnabled=true, supportRtl=", this.d, Separators.RPAREN);
    }
}
