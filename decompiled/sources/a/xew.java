package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40763a;
    public final a4x b;
    public final String c;
    public final int d;

    public xew(String str, i4 i4Var, String str2, int i) {
        i4Var.getClass();
        this.f40763a = str;
        this.b = i4Var;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xew)) {
            return false;
        }
        xew xewVar = (xew) obj;
        return this.f40763a.equals(xewVar.f40763a) && Intrinsics.d(this.b, xewVar.b) && this.c.equals(xewVar.c) && this.d == xewVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ua80.b(cs0.b(this.b, this.f40763a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return brm0.j(this.d, this.c, ", placeHolder=", Separators.RPAREN, kng0.u("HltvAwardsToolbarUiState(title=", this.f40763a, ", chips=", this.b, ", image="));
    }
}
