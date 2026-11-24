package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w9q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38793a;
    public String b;
    public boolean c = false;
    public bo80 d = null;

    public w9q0(String str, String str2) {
        this.f38793a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9q0)) {
            return false;
        }
        w9q0 w9q0Var = (w9q0) obj;
        return Intrinsics.d(this.f38793a, w9q0Var.f38793a) && Intrinsics.d(this.b, w9q0Var.b) && this.c == w9q0Var.c && Intrinsics.d(this.d, w9q0Var.d);
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(this.f38793a.hashCode() * 31, 31, this.b), 31, this.c);
        bo80 bo80Var = this.d;
        return iE + (bo80Var == null ? 0 : bo80Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + Separators.RPAREN;
    }
}
