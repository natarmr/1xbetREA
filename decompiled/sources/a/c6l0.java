package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c6l0 implements d6l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3822a;
    public final qzl b;
    public final fxs0 c;
    public final fxs0 d;
    public final String e;

    public c6l0(long j, qzl qzlVar, fxs0 fxs0Var, fxs0 fxs0Var2, String str) {
        str.getClass();
        this.f3822a = j;
        this.b = qzlVar;
        this.c = fxs0Var;
        this.d = fxs0Var2;
        this.e = str;
    }

    @Override // a.d6l0
    public final long a() {
        return this.f3822a;
    }

    @Override // a.d6l0
    public final qzl c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6l0)) {
            return false;
        }
        c6l0 c6l0Var = (c6l0) obj;
        return this.f3822a == c6l0Var.f3822a && this.b.equals(c6l0Var.b) && this.c.equals(c6l0Var.c) && this.d.equals(c6l0Var.d) && Intrinsics.d(this.e, c6l0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f3822a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoPairs(gameId=");
        sb.append(this.f3822a);
        sb.append(", bottomBlock=");
        sb.append(this.b);
        sb.append(", teamOne=");
        sb.append(this.c);
        sb.append(", teamTwo=");
        sb.append(this.d);
        return rw2.o(sb, ", infoLabel=", this.e, Separators.RPAREN);
    }
}
