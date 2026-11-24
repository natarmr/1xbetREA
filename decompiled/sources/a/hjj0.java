package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13162a;
    public final String b;
    public final swp0 c;

    public hjj0(swp0 swp0Var, String str, String str2) {
        str2.getClass();
        this.f13162a = str;
        this.b = str2;
        this.c = swp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjj0)) {
            return false;
        }
        hjj0 hjj0Var = (hjj0) obj;
        return this.f13162a.equals(hjj0Var.f13162a) && Intrinsics.d(this.b, hjj0Var.b) && this.c.equals(hjj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f13162a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SetupTwoFactorModel(authString=", this.f13162a, ", resetSecretKey=", this.b, ", auth=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
