package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qd80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28523a;
    public final String b;
    public final md80 c;
    public final boolean d;

    public qd80(int i, String str, md80 md80Var, boolean z) {
        str.getClass();
        this.f28523a = i;
        this.b = str;
        this.c = md80Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd80)) {
            return false;
        }
        qd80 qd80Var = (qd80) obj;
        return this.f28523a == qd80Var.f28523a && Intrinsics.d(this.b, qd80Var.b) && this.c == qd80Var.c && this.d == qd80Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ua80.b(Integer.hashCode(this.f28523a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f28523a, "OutcomeCheckboxButtonModel(gameId=", ", text=", this.b, ", outComesModel=");
        sbR.append(this.c);
        sbR.append(", isChosen=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
