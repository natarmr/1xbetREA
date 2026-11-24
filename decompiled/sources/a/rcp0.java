package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rcp0 implements ycp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5a0 f30251a;
    public final g5a0 b;
    public final String c;

    public rcp0(g5a0 g5a0Var, g5a0 g5a0Var2, String str) {
        str.getClass();
        this.f30251a = g5a0Var;
        this.b = g5a0Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcp0)) {
            return false;
        }
        rcp0 rcp0Var = (rcp0) obj;
        return this.f30251a.equals(rcp0Var.f30251a) && this.b.equals(rcp0Var.b) && Intrinsics.d(this.c, rcp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f30251a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Default(firstPlayerLogo=");
        sb.append(this.f30251a);
        sb.append(", secondPlayerLogo=");
        sb.append(this.b);
        sb.append(", name=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
