package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jmm0 implements nmm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16773a;
    public final c280 b;
    public final String c;
    public final String d;
    public final String e;

    public jmm0(c280 c280Var, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f16773a = str;
        this.b = c280Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmm0)) {
            return false;
        }
        jmm0 jmm0Var = (jmm0) obj;
        return Intrinsics.d(this.f16773a, jmm0Var.f16773a) && this.b.equals(jmm0Var.b) && Intrinsics.d(this.c, jmm0Var.c) && this.d.equals(jmm0Var.d) && this.e.equals(jmm0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(hne.g(this.b, this.f16773a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "OneOpponentWithLogo(opponentName=", this.f16773a, ", opponentIcon=", ", infoLabel=");
        f140.v(sbP, this.c, ", seedingLeft=", this.d, ", seedingRight=");
        return axq.n(sbP, this.e, Separators.RPAREN);
    }
}
