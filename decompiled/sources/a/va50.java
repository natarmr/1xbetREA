package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class va50 implements wa50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wkm f37070a;
    public final wkm b;

    public va50(wkm wkmVar, wkm wkmVar2) {
        wkmVar.getClass();
        wkmVar2.getClass();
        this.f37070a = wkmVar;
        this.b = wkmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va50)) {
            return false;
        }
        va50 va50Var = (va50) obj;
        return Intrinsics.d(this.f37070a, va50Var.f37070a) && Intrinsics.d(this.b, va50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37070a.hashCode() * 31);
    }

    public final String toString() {
        return "TwoIcons(firstIconModel=" + this.f37070a + ", secondIconModel=" + this.b + Separators.RPAREN;
    }
}
