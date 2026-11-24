package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ac70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f616a;
    public final imm b;
    public final a970 c;

    public ac70(long j, imm immVar, a970 a970Var) {
        immVar.getClass();
        a970Var.getClass();
        this.f616a = j;
        this.b = immVar;
        this.c = a970Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac70)) {
            return false;
        }
        ac70 ac70Var = (ac70) obj;
        long j = ac70Var.f616a;
        int i = y3d.h;
        return h2t0.a(this.f616a, j) && Intrinsics.d(this.b, ac70Var.b) && Intrinsics.d(this.c, ac70Var.c);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.c.hashCode() + h97.a(this.b, Long.hashCode(this.f616a) * 31, 31);
    }

    public final String toString() {
        return "OneXGamesWebGameToolbarUiModel(statusBarColor=" + y3d.i(this.f616a) + ", navBarModel=" + this.b + ", balanceModel=" + this.c + Separators.RPAREN;
    }
}
