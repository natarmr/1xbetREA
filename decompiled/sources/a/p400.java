package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p400 implements q400 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xrz f26326a;
    public final String b;
    public final String c;
    public final wui0 d;
    public final boolean e;

    public p400(xrz xrzVar, String str, String str2, wui0 wui0Var, boolean z) {
        str.getClass();
        str2.getClass();
        this.f26326a = xrzVar;
        this.b = str;
        this.c = str2;
        this.d = wui0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p400)) {
            return false;
        }
        p400 p400Var = (p400) obj;
        return this.f26326a.equals(p400Var.f26326a) && Intrinsics.d(this.b, p400Var.b) && Intrinsics.d(this.c, p400Var.c) && this.d == p400Var.d && this.e == p400Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rw2.c(this.d, ua80.b(ua80.b(this.f26326a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeLimit(limitType=");
        sb.append(this.f26326a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", limit=");
        sb.append(this.c);
        sb.append(", position=");
        sb.append(this.d);
        sb.append(", enabled=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
