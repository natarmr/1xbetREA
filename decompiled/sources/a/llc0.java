package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class llc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20240a;
    public final String b;
    public final boolean c;

    public llc0(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f20240a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llc0)) {
            return false;
        }
        llc0 llc0Var = (llc0) obj;
        return Intrinsics.d(this.f20240a, llc0Var.f20240a) && Intrinsics.d(this.b, llc0Var.b) && this.c == llc0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f20240a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("PromoInfoItemUiModel(title=", this.f20240a, ", value=", this.b, ", possibleWin="), this.c, Separators.RPAREN);
    }
}
