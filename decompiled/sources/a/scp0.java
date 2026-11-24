package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class scp0 implements ycp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5a0 f31999a;
    public final g5a0 b;
    public final String c;

    public scp0(g5a0 g5a0Var, g5a0 g5a0Var2, String str) {
        str.getClass();
        this.f31999a = g5a0Var;
        this.b = g5a0Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scp0)) {
            return false;
        }
        scp0 scp0Var = (scp0) obj;
        return this.f31999a.equals(scp0Var.f31999a) && this.b.equals(scp0Var.b) && Intrinsics.d(this.c, scp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f31999a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(firstPlayerLogo=");
        sb.append(this.f31999a);
        sb.append(", secondPlayerLogo=");
        sb.append(this.b);
        sb.append(", name=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
