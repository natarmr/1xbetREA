package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a970 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f463a;
    public final boolean b;
    public final boolean c;
    public final sd d;
    public final r2v0 e;

    public a970(boolean z, boolean z2, boolean z3, sd sdVar, r2v0 r2v0Var) {
        r2v0Var.getClass();
        this.f463a = z;
        this.b = z2;
        this.c = z3;
        this.d = sdVar;
        this.e = r2v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a970)) {
            return false;
        }
        a970 a970Var = (a970) obj;
        return this.f463a == a970Var.f463a && this.b == a970Var.b && this.c == a970Var.c && this.d.equals(a970Var.d) && Intrinsics.d(this.e, a970Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + brm0.e(brm0.e(Boolean.hashCode(this.f463a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("OneXGamesWebGameBalanceUiModel(enable=", ", visible=", ", withChevron=", this.f463a, this.b);
        sbQ.append(this.c);
        sbQ.append(", accountControlDsModel=");
        sbQ.append(this.d);
        sbQ.append(", webGamesAccountControlColors=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
