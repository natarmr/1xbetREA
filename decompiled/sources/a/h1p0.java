package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h1p0 implements j1p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12295a;
    public final String b;
    public final a4x c;

    public h1p0(a4x a4xVar, String str, String str2) {
        str2.getClass();
        a4xVar.getClass();
        this.f12295a = str;
        this.b = str2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1p0)) {
            return false;
        }
        h1p0 h1p0Var = (h1p0) obj;
        return this.f12295a.equals(h1p0Var.f12295a) && Intrinsics.d(this.b, h1p0Var.b) && Intrinsics.d(this.c, h1p0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f12295a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("Data(title=", this.f12295a, ", subtitle=", this.b, ", sectors="), this.c, Separators.RPAREN);
    }
}
