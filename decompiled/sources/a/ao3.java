package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ao3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1181a;
    public final String b;
    public final boolean c;
    public final String d;

    public ao3(String str, String str2, String str3, boolean z) {
        this.f1181a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao3)) {
            return false;
        }
        ao3 ao3Var = (ao3) obj;
        return this.f1181a.equals(ao3Var.f1181a) && this.b.equals(ao3Var.b) && this.c == ao3Var.c && Intrinsics.d(this.d, ao3Var.d);
    }

    public final int hashCode() {
        int iE = brm0.e(ua80.b(this.f1181a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return twn.q(", titleLink=", this.d, Separators.RPAREN, b1j.n("AppUpdateWhatsNewUiModel(title=", this.f1181a, ", message=", this.b, ", clickEnable="), this.c);
    }
}
