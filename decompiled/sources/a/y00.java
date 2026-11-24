package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w00 f41779a;
    public final String b;
    public final int c;

    public y00(w00 w00Var, String str, int i) {
        str.getClass();
        this.f41779a = w00Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00)) {
            return false;
        }
        y00 y00Var = (y00) obj;
        return this.f41779a.equals(y00Var.f41779a) && Intrinsics.d(this.b, y00Var.b) && this.c == y00Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f41779a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdditionalTopUiState(additionalTopStyle=");
        sb.append(this.f41779a);
        sb.append(", backgroundImgUrl=");
        sb.append(this.b);
        sb.append(", placeholderRes=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
