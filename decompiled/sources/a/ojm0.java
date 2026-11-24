package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ojm0 implements sjm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25366a;
    public final c280 b;
    public final String c;
    public final String d;
    public final String e;

    public ojm0(c280 c280Var, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f25366a = str;
        this.b = c280Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojm0)) {
            return false;
        }
        ojm0 ojm0Var = (ojm0) obj;
        return Intrinsics.d(this.f25366a, ojm0Var.f25366a) && this.b.equals(ojm0Var.b) && Intrinsics.d(this.c, ojm0Var.c) && this.d.equals(ojm0Var.d) && this.e.equals(ojm0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(hne.g(this.b, this.f25366a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "OneOpponentWithLogo(opponentName=", this.f25366a, ", opponentIcon=", ", infoLabel=");
        f140.v(sbP, this.c, ", seedingLeft=", this.d, ", seedingRight=");
        return axq.n(sbP, this.e, Separators.RPAREN);
    }
}
