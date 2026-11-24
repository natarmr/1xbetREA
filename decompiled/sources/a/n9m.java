package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n9m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23148a;
    public final n0x b;
    public final a4x c;
    public final a4x d;

    public n9m(String str, n0x n0xVar, a4x a4xVar, a4x a4xVar2) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f23148a = str;
        this.b = n0xVar;
        this.c = a4xVar;
        this.d = a4xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9m)) {
            return false;
        }
        n9m n9mVar = (n9m) obj;
        return this.f23148a.equals(n9mVar.f23148a) && this.b.equals(n9mVar.b) && Intrinsics.d(this.c, n9mVar.c) && Intrinsics.d(this.d, n9mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, f140.f(this.b, this.f23148a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "UFC(name=" + this.f23148a + ", image=" + this.b + ", badgeList=" + this.c + ", cellList=" + this.d + Separators.RPAREN;
    }
}
