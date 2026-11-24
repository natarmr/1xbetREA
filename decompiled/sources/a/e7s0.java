package a;

import android.gov.nist.core.Separators;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e7s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f7342a;
    public final long b;
    public final String c;
    public final String d;
    public final s7s0 e;
    public final boolean f;
    public final gqt0 g;
    public final int h;
    public final boolean i;

    public e7s0(Locale locale, long j, String str, String str2, s7s0 s7s0Var, boolean z, gqt0 gqt0Var, int i, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f7342a = locale;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = s7s0Var;
        this.f = z;
        this.g = gqt0Var;
        this.h = i;
        this.i = z2;
    }

    public static e7s0 a(e7s0 e7s0Var, q7s0 q7s0Var, boolean z, gqt0 gqt0Var, boolean z2, int i) {
        Locale locale = e7s0Var.f7342a;
        long j = e7s0Var.b;
        String str = e7s0Var.c;
        String str2 = e7s0Var.d;
        s7s0 s7s0Var = q7s0Var;
        if ((i & 16) != 0) {
            s7s0Var = e7s0Var.e;
        }
        s7s0 s7s0Var2 = s7s0Var;
        if ((i & 32) != 0) {
            z = e7s0Var.f;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            gqt0Var = e7s0Var.g;
        }
        gqt0 gqt0Var2 = gqt0Var;
        int i2 = e7s0Var.h;
        boolean z4 = (i & 256) != 0 ? e7s0Var.i : z2;
        e7s0Var.getClass();
        str.getClass();
        str2.getClass();
        gqt0Var2.getClass();
        return new e7s0(locale, j, str, str2, s7s0Var2, z3, gqt0Var2, i2, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7s0)) {
            return false;
        }
        e7s0 e7s0Var = (e7s0) obj;
        return this.f7342a.equals(e7s0Var.f7342a) && this.b == e7s0Var.b && Intrinsics.d(this.c, e7s0Var.c) && Intrinsics.d(this.d, e7s0Var.d) && this.e.equals(e7s0Var.e) && this.f == e7s0Var.f && this.g == e7s0Var.g && this.h == e7s0Var.h && this.i == e7s0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + twn.a(this.h, (this.g.hashCode() + brm0.e((this.e.hashCode() + ua80.b(ua80.b(rw2.b(this.f7342a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TournamentStagesState(locale=");
        sb.append(this.f7342a);
        sb.append(", tournamentId=");
        sb.append(this.b);
        f140.v(sb, ", tournamentTitle=", this.c, ", tournamentType=", this.d);
        sb.append(", tournamentState=");
        sb.append(this.e);
        sb.append(", hasBlockingError=");
        sb.append(this.f);
        sb.append(", userActionButtonType=");
        sb.append(this.g);
        sb.append(", lottieAnimationTypeId=");
        sb.append(this.h);
        return f140.n(sb, ", isLoading=", this.i, Separators.RPAREN);
    }
}
