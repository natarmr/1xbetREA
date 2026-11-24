package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m14 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20986a;

    public m14(String str) {
        str.getClass();
        this.f20986a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m14) && Intrinsics.d(this.f20986a, ((m14) obj).f20986a);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof m14) && (p6t0Var2 instanceof m14)) {
            return Intrinsics.d(((m14) p6t0Var).f20986a, ((m14) p6t0Var2).f20986a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20986a.hashCode();
    }

    public final String toString() {
        return kng0.l("AttachedImageUiItem(path=", this.f20986a, Separators.RPAREN);
    }
}
