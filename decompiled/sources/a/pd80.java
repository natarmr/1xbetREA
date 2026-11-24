package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pd80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26796a;
    public final String b;
    public final iqr0 c;
    public final boolean d;

    public pd80(int i, String str, iqr0 iqr0Var, boolean z) {
        str.getClass();
        this.f26796a = i;
        this.b = str;
        this.c = iqr0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd80)) {
            return false;
        }
        pd80 pd80Var = (pd80) obj;
        return this.f26796a == pd80Var.f26796a && Intrinsics.d(this.b, pd80Var.b) && this.c == pd80Var.c && this.d == pd80Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ua80.b(Integer.hashCode(this.f26796a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f26796a, "OutcomeButtonUiModel(gameId=", ", text=", this.b, ", outComesModel=");
        sbR.append(this.c);
        sbR.append(", isChosen=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
