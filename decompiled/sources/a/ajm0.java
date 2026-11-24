package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ajm0 implements ejm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f984a;
    public final c280 b;
    public final String c;
    public final String d;
    public final String e;

    public ajm0(c280 c280Var, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f984a = str;
        this.b = c280Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajm0)) {
            return false;
        }
        ajm0 ajm0Var = (ajm0) obj;
        return Intrinsics.d(this.f984a, ajm0Var.f984a) && this.b.equals(ajm0Var.b) && Intrinsics.d(this.c, ajm0Var.c) && this.d.equals(ajm0Var.d) && this.e.equals(ajm0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(hne.g(this.b, this.f984a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "OneOpponentWithLogo(opponentName=", this.f984a, ", opponentIcon=", ", infoLabel=");
        f140.v(sbP, this.c, ", seedingLeft=", this.d, ", seedingRight=");
        return axq.n(sbP, this.e, Separators.RPAREN);
    }
}
