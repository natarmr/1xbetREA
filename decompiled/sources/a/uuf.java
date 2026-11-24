package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uuf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36297a;
    public final String b;

    public uuf(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f36297a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uuf)) {
            return false;
        }
        uuf uufVar = (uuf) obj;
        return Intrinsics.d(this.f36297a, uufVar.f36297a) && Intrinsics.d(this.b, uufVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36297a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CurrencyInfoData(currency=", this.f36297a, ", symbol=", this.b, Separators.RPAREN);
    }
}
