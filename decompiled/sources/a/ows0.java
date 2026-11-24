package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ows0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25981a;
    public final int b;
    public final u6n c;

    public ows0(String str, int i, u6n u6nVar) {
        str.getClass();
        this.f25981a = str;
        this.b = i;
        this.c = u6nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ows0)) {
            return false;
        }
        ows0 ows0Var = (ows0) obj;
        return Intrinsics.d(this.f25981a, ows0Var.f25981a) && this.b == ows0Var.b && this.c.equals(ows0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f25981a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "TwoOpponentsFinalGameUTeamUiModel(name=", this.f25981a, ", redCardCount=", ", logo=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
