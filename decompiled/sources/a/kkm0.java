package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kkm0 implements okm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18448a;
    public final c280 b;
    public final String c;
    public final String d;
    public final String e;

    public kkm0(c280 c280Var, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f18448a = str;
        this.b = c280Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkm0)) {
            return false;
        }
        kkm0 kkm0Var = (kkm0) obj;
        return Intrinsics.d(this.f18448a, kkm0Var.f18448a) && this.b.equals(kkm0Var.b) && Intrinsics.d(this.c, kkm0Var.c) && this.d.equals(kkm0Var.d) && this.e.equals(kkm0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(hne.g(this.b, this.f18448a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "OneOpponentWithLogo(opponentName=", this.f18448a, ", opponentIcon=", ", infoLabel=");
        f140.v(sbP, this.c, ", seedingLeft=", this.d, ", seedingRight=");
        return axq.n(sbP, this.e, Separators.RPAREN);
    }
}
