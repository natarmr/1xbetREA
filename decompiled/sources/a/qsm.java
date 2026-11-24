package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qsm implements ssm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29265a;
    public final String b;
    public final a4x c;

    public qsm(a4x a4xVar, String str, String str2) {
        w6x.x(a4xVar, str, str2);
        this.f29265a = str;
        this.b = str2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsm)) {
            return false;
        }
        qsm qsmVar = (qsm) obj;
        return Intrinsics.d(this.f29265a, qsmVar.f29265a) && Intrinsics.d(this.b, qsmVar.b) && Intrinsics.d(this.c, qsmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f29265a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("Default(label=", this.f29265a, ", btnAllText=", this.b, ", items="), this.c, Separators.RPAREN);
    }
}
