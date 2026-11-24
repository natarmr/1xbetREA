package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kn2 implements on2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f18564a;
    public final int b;

    public kn2(mdm mdmVar, int i) {
        mdmVar.getClass();
        this.f18564a = mdmVar;
        this.b = i;
    }

    @Override // a.on2
    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn2)) {
            return false;
        }
        kn2 kn2Var = (kn2) obj;
        return Intrinsics.d(this.f18564a, kn2Var.f18564a) && this.b == kn2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f18564a.hashCode() * 31);
    }

    public final String toString() {
        return "Empty(config=" + this.f18564a + ", spanSize=" + this.b + Separators.RPAREN;
    }
}
