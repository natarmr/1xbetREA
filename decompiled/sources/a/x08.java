package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x08 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40059a;
    public final a4x b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    public x08(String str, a4x a4xVar, String str2, String str3, String str4, int i) {
        str.getClass();
        a4xVar.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f40059a = str;
        this.b = a4xVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x08)) {
            return false;
        }
        x08 x08Var = (x08) obj;
        return Intrinsics.d(this.f40059a, x08Var.f40059a) && Intrinsics.d(this.b, x08Var.b) && Intrinsics.d(this.c, x08Var.c) && Intrinsics.d(this.d, x08Var.d) && Intrinsics.d(this.e, x08Var.e) && this.f == x08Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ua80.b(ua80.b(ua80.b(cs0.b(this.b, this.f40059a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbU = kng0.u("BigPigStatisticUiModel(playerName=", this.f40059a, ", throws=", this.b, ", totalPointsTitle=");
        f140.v(sbU, this.c, ", totalPoints=", this.d, ", totalPointsBeforeThrow=");
        return brm0.j(this.f, this.e, ", currentThrowNumber=", Separators.RPAREN, sbU);
    }
}
