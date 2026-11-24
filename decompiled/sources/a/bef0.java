package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bef0 implements def0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f2447a;
    public final int b;
    public final boolean c;

    public bef0(a4x a4xVar, int i, boolean z) {
        a4xVar.getClass();
        this.f2447a = a4xVar;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bef0)) {
            return false;
        }
        bef0 bef0Var = (bef0) obj;
        return Intrinsics.d(this.f2447a, bef0Var.f2447a) && this.b == bef0Var.b && this.c == bef0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, this.f2447a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(items=");
        sb.append(this.f2447a);
        sb.append(", columns=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
