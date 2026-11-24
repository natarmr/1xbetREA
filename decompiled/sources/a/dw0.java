package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dw0 implements iw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6771a;
    public final String b;
    public final String c;

    public dw0(String str, String str2, String str3) {
        str.getClass();
        this.f6771a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw0)) {
            return false;
        }
        dw0 dw0Var = (dw0) obj;
        return Intrinsics.d(this.f6771a, dw0Var.f6771a) && Intrinsics.d(this.b, dw0Var.b) && Intrinsics.d(this.c, dw0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.f6771a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(b1j.n("DownloadFile(url=", this.f6771a, ", userAgent=", this.b, ", contentDescription="), this.c, Separators.RPAREN);
    }
}
