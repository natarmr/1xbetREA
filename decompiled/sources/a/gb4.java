package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gb4 implements lb4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10998a;
    public final String b;
    public final boolean c;

    public gb4(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f10998a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb4)) {
            return false;
        }
        gb4 gb4Var = (gb4) obj;
        return Intrinsics.d(this.f10998a, gb4Var.f10998a) && Intrinsics.d(this.b, gb4Var.b) && this.c == gb4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f10998a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("ShowAuthErrorDialog(title=", this.f10998a, ", message=", this.b, ", isConsultantAvailable="), this.c, Separators.RPAREN);
    }
}
