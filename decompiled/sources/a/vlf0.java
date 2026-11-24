package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class vlf0 {
    public static final ulf0 Companion = new ulf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37620a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ vlf0(int i, Integer num, Integer num2, String str, String str2) {
        if ((i & 1) == 0) {
            this.f37620a = null;
        } else {
            this.f37620a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlf0)) {
            return false;
        }
        vlf0 vlf0Var = (vlf0) obj;
        return Intrinsics.d(this.f37620a, vlf0Var.f37620a) && Intrinsics.d(this.b, vlf0Var.b) && Intrinsics.d(this.c, vlf0Var.c) && Intrinsics.d(this.d, vlf0Var.d);
    }

    public final int hashCode() {
        String str = this.f37620a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.l(b1j.n("ReportFilesResponse(cephFullPath=", this.f37620a, ", fileName=", this.b, ", partNumber="), this.c, ", size=", this.d, Separators.RPAREN);
    }
}
