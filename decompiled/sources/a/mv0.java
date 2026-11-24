package a;

import android.gov.nist.core.Separators;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes6.dex */
public final class mv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22435a;
    public final boolean b;
    public final boolean c;
    public final Regex d;

    public mv0(String str, boolean z, boolean z2, Regex regex) {
        this.f22435a = str;
        this.b = z;
        this.c = z2;
        this.d = regex;
    }

    public static mv0 a(mv0 mv0Var, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            str = mv0Var.f22435a;
        }
        boolean z2 = (i & 2) != 0 ? mv0Var.b : true;
        if ((i & 4) != 0) {
            z = mv0Var.c;
        }
        return new mv0(str, z2, z, mv0Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mv0) {
            mv0 mv0Var = (mv0) obj;
            return this.f22435a.equals(mv0Var.f22435a) && this.b == mv0Var.b && this.c == mv0Var.c && this.d == mv0Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(brm0.e(this.f22435a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("AggregatorGameNicknameState(nickname=", this.f22435a, ", autoFocus=", this.b, ", saveAvailable=");
        sbU.append(this.c);
        sbU.append(", validateRegex=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
