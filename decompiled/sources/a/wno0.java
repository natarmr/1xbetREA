package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wno0 implements zno0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39459a;
    public final a4x b;

    public wno0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f39459a = z;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wno0)) {
            return false;
        }
        wno0 wno0Var = (wno0) obj;
        return this.f39459a == wno0Var.f39459a && Intrinsics.d(this.b, wno0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f39459a) * 31);
    }

    public final String toString() {
        return "PlainListItems(scrollToTop=" + this.f39459a + ", items=" + this.b + Separators.RPAREN;
    }
}
