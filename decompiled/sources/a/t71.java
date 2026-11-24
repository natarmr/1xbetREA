package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t71 implements t81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33444a;
    public final String b;
    public final String c;

    public t71(String str, String str2, String str3) {
        str.getClass();
        this.f33444a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t71)) {
            return false;
        }
        t71 t71Var = (t71) obj;
        return Intrinsics.d(this.f33444a, t71Var.f33444a) && Intrinsics.d(this.b, t71Var.b) && Intrinsics.d(this.c, t71Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.f33444a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(b1j.n("DownloadFile(url=", this.f33444a, ", userAgent=", this.b, ", contentDescription="), this.c, Separators.RPAREN);
    }
}
