package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q9m implements s9m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28355a;
    public final String b;
    public final a4x c;

    public q9m(i4 i4Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        i4Var.getClass();
        this.f28355a = str;
        this.b = str2;
        this.c = i4Var;
    }

    @Override // a.s9m
    public final a4x a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9m)) {
            return false;
        }
        q9m q9mVar = (q9m) obj;
        return Intrinsics.d(this.f28355a, q9mVar.f28355a) && Intrinsics.d(this.b, q9mVar.b) && Intrinsics.d(this.c, q9mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f28355a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("Default(leadingHeader=", this.f28355a, ", labeledHeader=", this.b, ", trailingHeaders="), this.c, Separators.RPAREN);
    }
}
