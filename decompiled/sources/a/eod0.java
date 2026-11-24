package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class eod0 implements jod0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8134a;
    public final String b;

    public eod0(String str, String str2) {
        str.getClass();
        this.f8134a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eod0)) {
            return false;
        }
        eod0 eod0Var = (eod0) obj;
        return Intrinsics.d(this.f8134a, eod0Var.f8134a) && this.b.equals(eod0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8134a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("SetHelperText(message=", this.f8134a, ", currencyIconResName=", this.b, Separators.RPAREN);
    }
}
