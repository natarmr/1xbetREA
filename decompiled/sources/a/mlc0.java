package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class mlc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21983a;
    public final String b;
    public final boolean c;

    public mlc0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f21983a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlc0)) {
            return false;
        }
        mlc0 mlc0Var = (mlc0) obj;
        return Intrinsics.d(this.f21983a, mlc0Var.f21983a) && Intrinsics.d(this.b, mlc0Var.b) && this.c == mlc0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f21983a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("PromoInfoItemUiModel(title=", this.f21983a, ", value=", this.b, ", possibleWin="), this.c, Separators.RPAREN);
    }
}
