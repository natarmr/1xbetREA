package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vlm0 implements zlm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37632a;
    public final c280 b;
    public final String c;
    public final String d;
    public final String e;

    public vlm0(c280 c280Var, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f37632a = str;
        this.b = c280Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlm0)) {
            return false;
        }
        vlm0 vlm0Var = (vlm0) obj;
        return Intrinsics.d(this.f37632a, vlm0Var.f37632a) && this.b.equals(vlm0Var.b) && Intrinsics.d(this.c, vlm0Var.c) && this.d.equals(vlm0Var.d) && this.e.equals(vlm0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(hne.g(this.b, this.f37632a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "OneOpponentWithLogo(opponentName=", this.f37632a, ", opponentIcon=", ", infoLabel=");
        f140.v(sbP, this.c, ", seedingLeft=", this.d, ", seedingRight=");
        return axq.n(sbP, this.e, Separators.RPAREN);
    }
}
