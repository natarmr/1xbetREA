package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pnj0 implements qnj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27291a;
    public final String b;

    public pnj0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f27291a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnj0)) {
            return false;
        }
        pnj0 pnj0Var = (pnj0) obj;
        return Intrinsics.d(this.f27291a, pnj0Var.f27291a) && Intrinsics.d(this.b, pnj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27291a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowSnackbar(title=", this.f27291a, ", subtitle=", this.b, Separators.RPAREN);
    }
}
