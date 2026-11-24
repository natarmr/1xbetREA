package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jj6 implements nj6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16607a;
    public final a4x b;
    public final boolean c;

    public jj6(long j, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f16607a = j;
        this.b = a4xVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj6)) {
            return false;
        }
        jj6 jj6Var = (jj6) obj;
        return this.f16607a == jj6Var.f16607a && Intrinsics.d(this.b, jj6Var.b) && this.c == jj6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, Long.hashCode(this.f16607a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketsLoaded(selectedSubGameId=");
        sb.append(this.f16607a);
        sb.append(", markets=");
        sb.append(this.b);
        return f140.n(sb, ", rtlSupport=", this.c, Separators.RPAREN);
    }
}
