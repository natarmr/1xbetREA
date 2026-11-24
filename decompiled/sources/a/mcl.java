package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class mcl {
    public static final lcl Companion = new lcl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21558a;
    public final String b;

    public /* synthetic */ mcl(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f21558a = null;
        } else {
            this.f21558a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcl)) {
            return false;
        }
        mcl mclVar = (mcl) obj;
        return Intrinsics.d(this.f21558a, mclVar.f21558a) && Intrinsics.d(this.b, mclVar.b);
    }

    public final int hashCode() {
        String str = this.f21558a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("DownloadLinkResponse(uri=", this.f21558a, ", expiryIn=", this.b, Separators.RPAREN);
    }
}
