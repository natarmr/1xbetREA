package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ait {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f941a;
    public final String b;
    public final String c;
    public final String d;

    public ait(String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f941a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ait)) {
            return false;
        }
        ait aitVar = (ait) obj;
        return Intrinsics.d(this.f941a, aitVar.f941a) && Intrinsics.d(this.b, aitVar.b) && Intrinsics.d(this.c, aitVar.c) && Intrinsics.d(this.d, aitVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f941a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("GenerateCouponStringResource(resourceStringBetSum=", this.f941a, ", resourceStringWontedSum=", this.b, ", generateCouponTitle="), this.c, ", assembleButtonTitle=", this.d, Separators.RPAREN);
    }
}
