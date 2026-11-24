package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xw80 implements zw80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41598a;
    public final String b;
    public final a4x c;

    public xw80(a4x a4xVar, String str, String str2) {
        w6x.x(a4xVar, str, str2);
        this.f41598a = str;
        this.b = str2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw80)) {
            return false;
        }
        xw80 xw80Var = (xw80) obj;
        return Intrinsics.d(this.f41598a, xw80Var.f41598a) && Intrinsics.d(this.b, xw80Var.b) && Intrinsics.d(this.c, xw80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f41598a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("Content(teamName=", this.f41598a, ", title=", this.b, ", disciplines="), this.c, Separators.RPAREN);
    }
}
