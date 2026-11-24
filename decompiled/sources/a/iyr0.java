package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class iyr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15603a;
    public final String b;
    public final String c;

    public iyr0(String str, String str2, String str3) {
        str3.getClass();
        this.f15603a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyr0)) {
            return false;
        }
        iyr0 iyr0Var = (iyr0) obj;
        return Intrinsics.d(this.f15603a, iyr0Var.f15603a) && Intrinsics.d(this.b, iyr0Var.b) && Intrinsics.d(this.c, iyr0Var.c);
    }

    public final int hashCode() {
        String str = this.f15603a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return axq.n(b1j.n("Image(backgroundMediaValue=", this.f15603a, ", verticalImageLink=", this.b, ", listMediaValue="), this.c, Separators.RPAREN);
    }
}
