package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rzc0 implements tzc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq5 f31353a;
    public final i4 b;

    public rzc0(lq5 lq5Var, i4 i4Var) {
        lq5Var.getClass();
        i4Var.getClass();
        this.f31353a = lq5Var;
        this.b = i4Var;
    }

    @Override // a.tzc0
    public final lq5 a() {
        return this.f31353a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzc0)) {
            return false;
        }
        rzc0 rzc0Var = (rzc0) obj;
        return Intrinsics.d(this.f31353a, rzc0Var.f31353a) && Intrinsics.d(this.b, rzc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31353a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(styleType=" + this.f31353a + ", items=" + this.b + Separators.RPAREN;
    }
}
