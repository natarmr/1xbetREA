package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pcp0 implements wcp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5a0 f26771a;
    public final c5a0 b;
    public final String c;

    public pcp0(c5a0 c5a0Var, c5a0 c5a0Var2, String str) {
        str.getClass();
        this.f26771a = c5a0Var;
        this.b = c5a0Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcp0)) {
            return false;
        }
        pcp0 pcp0Var = (pcp0) obj;
        return this.f26771a.equals(pcp0Var.f26771a) && this.b.equals(pcp0Var.b) && Intrinsics.d(this.c, pcp0Var.c);
    }

    public final int hashCode() {
        return ua80.b(twn.e(this.b.f3761a, this.f26771a.f3761a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(firstPlayerLogo=");
        sb.append(this.f26771a);
        sb.append(", secondPlayerLogo=");
        sb.append(this.b);
        sb.append(", name=");
        return axq.n(sb, this.c, ", additionalInfo=null)");
    }
}
