package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class olm0 implements slm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25463a;
    public final c280 b;
    public final String c;
    public final String d;
    public final String e;

    public olm0(c280 c280Var, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f25463a = str;
        this.b = c280Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olm0)) {
            return false;
        }
        olm0 olm0Var = (olm0) obj;
        return Intrinsics.d(this.f25463a, olm0Var.f25463a) && this.b.equals(olm0Var.b) && Intrinsics.d(this.c, olm0Var.c) && this.d.equals(olm0Var.d) && this.e.equals(olm0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(hne.g(this.b, this.f25463a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "OneOpponentWithLogo(opponentName=", this.f25463a, ", opponentIcon=", ", infoLabel=");
        f140.v(sbP, this.c, ", seedingLeft=", this.d, ", seedingRight=");
        return axq.n(sbP, this.e, Separators.RPAREN);
    }
}
