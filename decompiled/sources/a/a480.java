package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a480 implements b480 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211a;
    public final String b;
    public final boolean c;

    public a480(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f211a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a480)) {
            return false;
        }
        a480 a480Var = (a480) obj;
        return Intrinsics.d(this.f211a, a480Var.f211a) && Intrinsics.d(this.b, a480Var.b) && this.c == a480Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f211a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("TwoOpponentsUiModel(firstTeamName=", this.f211a, ", secondTeamName=", this.b, ", isSupportRtl="), this.c, Separators.RPAREN);
    }
}
