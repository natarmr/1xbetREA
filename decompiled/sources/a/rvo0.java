package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rvo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31181a;
    public final String b;

    public rvo0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f31181a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvo0)) {
            return false;
        }
        rvo0 rvo0Var = (rvo0) obj;
        return Intrinsics.d(this.f31181a, rvo0Var.f31181a) && Intrinsics.d(this.b, rvo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31181a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TaxSpoilerParamUiItem(title=", this.f31181a, ", value=", this.b, Separators.RPAREN);
    }
}
