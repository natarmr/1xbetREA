package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18129a;
    public final String b;

    public ke(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f18129a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke)) {
            return false;
        }
        ke keVar = (ke) obj;
        return Intrinsics.d(this.f18129a, keVar.f18129a) && Intrinsics.d(this.b, keVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18129a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AccountInfoAmountCurrencyModel(amount=", this.f18129a, ", currency=", this.b, Separators.RPAREN);
    }
}
