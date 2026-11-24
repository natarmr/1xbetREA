package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ksm implements msm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18820a;
    public final String b;
    public final a4x c;

    public ksm(a4x a4xVar, String str, String str2) {
        w6x.x(a4xVar, str, str2);
        this.f18820a = str;
        this.b = str2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksm)) {
            return false;
        }
        ksm ksmVar = (ksm) obj;
        return Intrinsics.d(this.f18820a, ksmVar.f18820a) && Intrinsics.d(this.b, ksmVar.b) && Intrinsics.d(this.c, ksmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f18820a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("Default(btnFilterText=", this.f18820a, ", btnAllText=", this.b, ", items="), this.c, Separators.RPAREN);
    }
}
