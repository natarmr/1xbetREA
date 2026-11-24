package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r9m implements s9m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30089a;
    public final a4x b;

    public r9m(i4 i4Var, String str) {
        str.getClass();
        i4Var.getClass();
        this.f30089a = str;
        this.b = i4Var;
    }

    @Override // a.s9m
    public final a4x a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9m)) {
            return false;
        }
        r9m r9mVar = (r9m) obj;
        return Intrinsics.d(this.f30089a, r9mVar.f30089a) && Intrinsics.d(this.b, r9mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30089a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("NoLeadingHeader(labeledHeader=", this.f30089a, ", trailingHeaders=", this.b, Separators.RPAREN);
    }
}
