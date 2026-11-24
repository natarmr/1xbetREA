package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class zcc0 {
    public static final ycc0 Companion = new ycc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44159a;
    public final String b;
    public final String c;

    public /* synthetic */ zcc0(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f44159a = null;
        } else {
            this.f44159a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcc0)) {
            return false;
        }
        zcc0 zcc0Var = (zcc0) obj;
        return Intrinsics.d(this.f44159a, zcc0Var.f44159a) && Intrinsics.d(this.b, zcc0Var.b) && Intrinsics.d(this.c, zcc0Var.c);
    }

    public final int hashCode() {
        String str = this.f44159a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(b1j.n("PromoCodeConditionResponse(key=", this.f44159a, ", value=", this.b, ", name="), this.c, Separators.RPAREN);
    }
}
