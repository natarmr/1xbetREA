package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class esm implements gsm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8336a;
    public final String b;
    public final a4x c;

    public esm(a4x a4xVar, String str, String str2) {
        w6x.x(a4xVar, str, str2);
        this.f8336a = str;
        this.b = str2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esm)) {
            return false;
        }
        esm esmVar = (esm) obj;
        return Intrinsics.d(this.f8336a, esmVar.f8336a) && Intrinsics.d(this.b, esmVar.b) && Intrinsics.d(this.c, esmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f8336a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("Default(btnFilterText=", this.f8336a, ", btnAllText=", this.b, ", items="), this.c, Separators.RPAREN);
    }
}
