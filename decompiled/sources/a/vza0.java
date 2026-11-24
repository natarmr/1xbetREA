package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vza0 implements wza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38289a;
    public final String b;
    public final String c;

    public vza0(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f38289a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vza0)) {
            return false;
        }
        vza0 vza0Var = (vza0) obj;
        return Intrinsics.d(this.f38289a, vza0Var.f38289a) && Intrinsics.d(this.b, vza0Var.b) && Intrinsics.d(this.c, vza0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f38289a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ShowWarningDialog(title=", this.f38289a, ", message=", this.b, ", positiveButtonText="), this.c, Separators.RPAREN);
    }
}
