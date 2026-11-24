package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sbs0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qbs0 f31951a;
    public final String b;
    public final r7p c;

    public sbs0(qbs0 qbs0Var, String str, r7p r7pVar) {
        qbs0Var.getClass();
        this.f31951a = qbs0Var;
        this.b = str;
        this.c = r7pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbs0)) {
            return false;
        }
        sbs0 sbs0Var = (sbs0) obj;
        return Intrinsics.d(this.f31951a, sbs0Var.f31951a) && this.b.equals(sbs0Var.b) && this.c.equals(sbs0Var.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f31951a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "TrackCoefUIItem(coefModel=" + this.f31951a + ", key=" + this.b + ", model=" + this.c + Separators.RPAREN;
    }
}
