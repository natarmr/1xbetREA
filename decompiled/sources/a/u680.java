package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class u680 {
    public static final s680 Companion = new s680();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35126a;
    public final String b;
    public final Boolean c;

    public /* synthetic */ u680(int i, Boolean bool, String str, String str2) {
        if ((i & 1) == 0) {
            this.f35126a = null;
        } else {
            this.f35126a = str;
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
        if (!(obj instanceof u680)) {
            return false;
        }
        u680 u680Var = (u680) obj;
        return Intrinsics.d(this.f35126a, u680Var.f35126a) && Intrinsics.d(this.b, u680Var.b) && Intrinsics.d(this.c, u680Var.c);
    }

    public final int hashCode() {
        String str = this.f35126a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return defpackage.c.e(b1j.n("OptionResponse(title=", this.f35126a, ", value=", this.b, ", isDefault="), this.c, Separators.RPAREN);
    }
}
