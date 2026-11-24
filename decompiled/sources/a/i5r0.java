package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i5r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14207a;
    public final String b;
    public final z4r0 c;
    public final boolean d;
    public final wul e;

    public i5r0(String str, String str2, z4r0 z4r0Var, boolean z, wul wulVar) {
        str.getClass();
        str2.getClass();
        this.f14207a = str;
        this.b = str2;
        this.c = z4r0Var;
        this.d = z;
        this.e = wulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5r0)) {
            return false;
        }
        i5r0 i5r0Var = (i5r0) obj;
        return Intrinsics.d(this.f14207a, i5r0Var.f14207a) && Intrinsics.d(this.b, i5r0Var.b) && this.c.equals(i5r0Var.c) && this.d == i5r0Var.d && this.e.equals(i5r0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e((this.c.hashCode() + ua80.b(this.f14207a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TopGamesByStatBottomSheetUiState(title=", this.f14207a, ", description=", this.b, ", content=");
        sbN.append(this.c);
        sbN.append(", supportRtl=");
        sbN.append(this.d);
        sbN.append(", goToEventButton=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
