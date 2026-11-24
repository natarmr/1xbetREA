package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ovl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25931a;
    public final String b;
    public final String c;

    public ovl(String str, String str2, String str3) {
        str.getClass();
        this.f25931a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovl)) {
            return false;
        }
        ovl ovlVar = (ovl) obj;
        return Intrinsics.d(this.f25931a, ovlVar.f25931a) && Intrinsics.d(this.b, ovlVar.b) && Intrinsics.d(this.c, ovlVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.f25931a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(b1j.n("DsCellWagerUiModel(wagerTitle=", this.f25931a, ", wagerStart=", this.b, ", wagerEnd="), this.c, Separators.RPAREN);
    }
}
