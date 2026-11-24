package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class iw1 implements kw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15467a;
    public final String b;
    public final a4x c;

    public iw1(a4x a4xVar, String str, String str2) {
        str.getClass();
        a4xVar.getClass();
        this.f15467a = str;
        this.b = str2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw1)) {
            return false;
        }
        iw1 iw1Var = (iw1) obj;
        return Intrinsics.d(this.f15467a, iw1Var.f15467a) && this.b.equals(iw1Var.b) && Intrinsics.d(this.c, iw1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f15467a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("Content(header=", this.f15467a, ", headerButtonTitle=", this.b, ", prizePlaces="), this.c, Separators.RPAREN);
    }
}
