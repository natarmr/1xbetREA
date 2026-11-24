package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class fse0 {
    public static final ese0 Companion = new ese0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f10060a;
    public final String b;
    public final String c;

    public /* synthetic */ fse0(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f10060a = null;
        } else {
            this.f10060a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fse0)) {
            return false;
        }
        fse0 fse0Var = (fse0) obj;
        return Intrinsics.d(this.f10060a, fse0Var.f10060a) && Intrinsics.d(this.b, fse0Var.b) && Intrinsics.d(this.c, fse0Var.c);
    }

    public final int hashCode() {
        Long l = this.f10060a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f10060a, "RefreshTokenResponse(refreshExpiry=", ", refreshToken=", this.b, ", token="), this.c, Separators.RPAREN);
    }
}
