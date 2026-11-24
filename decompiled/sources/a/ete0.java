package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ete0 {
    public static final dte0 Companion = new dte0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8373a;
    public final String b;
    public final Boolean c;

    public /* synthetic */ ete0(int i, Boolean bool, String str, String str2) {
        if ((i & 1) == 0) {
            this.f8373a = null;
        } else {
            this.f8373a = str;
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
        if (!(obj instanceof ete0)) {
            return false;
        }
        ete0 ete0Var = (ete0) obj;
        return Intrinsics.d(this.f8373a, ete0Var.f8373a) && Intrinsics.d(this.b, ete0Var.b) && Intrinsics.d(this.c, ete0Var.c);
    }

    public final int hashCode() {
        String str = this.f8373a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return defpackage.c.e(b1j.n("RegisterAuthenticatorResponse(registrationGuid=", this.f8373a, ", secret=", this.b, ", canUseAuthenticator="), this.c, Separators.RPAREN);
    }
}
