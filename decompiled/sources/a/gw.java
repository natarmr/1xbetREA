package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11999a;
    public final long b;
    public final String c;
    public final String d;

    public gw(String str, xuf xufVar) {
        str.getClass();
        xufVar.getClass();
        long j = xufVar.f41508a;
        String str2 = xufVar.f;
        String str3 = xufVar.b;
        brm0.B(str, str2, str3);
        this.f11999a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw)) {
            return false;
        }
        gw gwVar = (gw) obj;
        return Intrinsics.d(this.f11999a, gwVar.f11999a) && this.b == gwVar.b && Intrinsics.d(this.c, gwVar.c) && Intrinsics.d(this.d, gwVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(rw2.b(this.f11999a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "AddWalletParams(name=", this.f11999a, ", currencyId=");
        f140.v(sbO, ", currencySymbol=", this.c, ", currencyIsoCode=", this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
