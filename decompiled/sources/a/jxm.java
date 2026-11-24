package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17313a;
    public final String b;
    public final a4x c;

    public jxm(a4x a4xVar, String str, String str2) {
        str.getClass();
        a4xVar.getClass();
        this.f17313a = str;
        this.b = str2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxm)) {
            return false;
        }
        jxm jxmVar = (jxm) obj;
        return Intrinsics.d(this.f17313a, jxmVar.f17313a) && this.b.equals(jxmVar.b) && Intrinsics.d(this.c, jxmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f17313a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("V1(opponentLabel=", this.f17313a, ", seed=", this.b, ", scores="), this.c, Separators.RPAREN);
    }
}
