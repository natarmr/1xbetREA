package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s00 implements w00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31387a;
    public final String b;
    public final String c;

    public s00(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f31387a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s00)) {
            return false;
        }
        s00 s00Var = (s00) obj;
        return Intrinsics.d(this.f31387a, s00Var.f31387a) && Intrinsics.d(this.b, s00Var.b) && Intrinsics.d(this.c, s00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f31387a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("Multi(firstMultiTeamTitle=", this.f31387a, ", secondMultiTeamTitle=", this.b, ", infoLabel="), this.c, Separators.RPAREN);
    }
}
