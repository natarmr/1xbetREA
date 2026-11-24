package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nlc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23720a;
    public final String b;
    public final boolean c;

    public nlc0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f23720a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlc0)) {
            return false;
        }
        nlc0 nlc0Var = (nlc0) obj;
        return Intrinsics.d(this.f23720a, nlc0Var.f23720a) && Intrinsics.d(this.b, nlc0Var.b) && this.c == nlc0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f23720a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("PromoInfoItemUiModel(title=", this.f23720a, ", value=", this.b, ", possibleWin="), this.c, Separators.RPAREN);
    }
}
