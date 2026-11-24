package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class t680 {
    public static final r680 Companion = new r680();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33404a;
    public final String b;
    public final Boolean c;

    public /* synthetic */ t680(int i, Boolean bool, String str, String str2) {
        if ((i & 1) == 0) {
            this.f33404a = null;
        } else {
            this.f33404a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t680)) {
            return false;
        }
        t680 t680Var = (t680) obj;
        return Intrinsics.d(this.f33404a, t680Var.f33404a) && Intrinsics.d(this.b, t680Var.b) && Intrinsics.d(this.c, t680Var.c);
    }

    public final int hashCode() {
        String str = this.f33404a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return defpackage.c.e(b1j.n("OptionResponse(title=", this.f33404a, ", value=", this.b, ", default="), this.c, Separators.RPAREN);
    }
}
