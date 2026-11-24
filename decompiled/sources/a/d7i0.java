package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d7i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5595a;
    public final String b;

    public d7i0(int i, String str) {
        str.getClass();
        this.f5595a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7i0)) {
            return false;
        }
        d7i0 d7i0Var = (d7i0) obj;
        return this.f5595a == d7i0Var.f5595a && Intrinsics.d(this.b, d7i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f5595a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f5595a, "SelfExcludeReasonModel(id=", ", selfExcludeReason=", this.b, Separators.RPAREN);
    }
}
