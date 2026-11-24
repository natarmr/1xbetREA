package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ffr implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9460a;
    public final a4x b;
    public final boolean c;
    public final int d;

    public ffr(int i, i4 i4Var, String str, boolean z) {
        i4Var.getClass();
        this.f9460a = str;
        this.b = i4Var;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffr)) {
            return false;
        }
        ffr ffrVar = (ffr) obj;
        return this.f9460a.equals(ffrVar.f9460a) && Intrinsics.d(this.b, ffrVar.b) && this.c == ffrVar.c && this.d == ffrVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + brm0.e(cs0.b(this.b, this.f9460a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbU = kng0.u("FutureGamesUiModel(teamIcon=", this.f9460a, ", games=", this.b, ", needFooter=");
        sbU.append(this.c);
        sbU.append(", footerIcon=");
        sbU.append(this.d);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
