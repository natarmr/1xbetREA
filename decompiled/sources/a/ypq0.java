package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ypq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43043a;
    public final String b;
    public final String c;
    public final sso0 d;

    public ypq0(String str, String str2, String str3, sso0 sso0Var) {
        brm0.B(str, str2, str3);
        this.f43043a = str;
        this.b = str2;
        this.c = str3;
        this.d = sso0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypq0)) {
            return false;
        }
        ypq0 ypq0Var = (ypq0) obj;
        return Intrinsics.d(this.f43043a, ypq0Var.f43043a) && Intrinsics.d(this.b, ypq0Var.b) && Intrinsics.d(this.c, ypq0Var.c) && this.d.equals(ypq0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f43043a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TirageHeaderUiModel(date=", this.f43043a, ", tirage=", this.b, ", status=");
        sbN.append(this.c);
        sbN.append(", tagStyleRes=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
