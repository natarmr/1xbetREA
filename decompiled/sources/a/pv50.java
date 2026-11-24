package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pv50 extends rv50 {
    public final String d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv50(String str, String str2) {
        super(str, str2, dv50.f6730a);
        str.getClass();
        str2.getClass();
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv50)) {
            return false;
        }
        pv50 pv50Var = (pv50) obj;
        return Intrinsics.d(this.d, pv50Var.d) && Intrinsics.d(this.e, pv50Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AuthenticatorDialog(authenticatorMessage=", this.d, ", authenticatorButtonText=", this.e, Separators.RPAREN);
    }
}
