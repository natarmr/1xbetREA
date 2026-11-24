package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pwe implements rwe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27707a;
    public final a4x b;
    public final int c;
    public final String d;
    public final boolean e;

    public pwe(String str, a4x a4xVar, int i, String str2, boolean z) {
        a4xVar.getClass();
        this.f27707a = str;
        this.b = a4xVar;
        this.c = i;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwe)) {
            return false;
        }
        pwe pweVar = (pwe) obj;
        return this.f27707a.equals(pweVar.f27707a) && Intrinsics.d(this.b, pweVar.b) && this.c == pweVar.c && this.d.equals(pweVar.d) && this.e == pweVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(twn.a(this.c, cs0.b(this.b, this.f27707a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbU = kng0.u("CardHeader(title=", this.f27707a, ", icons=", this.b, ", eventCount=");
        kng0.w(this.c, ", odds=", this.d, ", expanded=", sbU);
        return rw2.p(sbU, this.e, Separators.RPAREN);
    }
}
