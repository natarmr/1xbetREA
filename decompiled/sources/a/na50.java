package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class na50 implements oa50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final skm f23174a;
    public final skm b;

    public na50(skm skmVar, skm skmVar2) {
        skmVar.getClass();
        this.f23174a = skmVar;
        this.b = skmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na50)) {
            return false;
        }
        na50 na50Var = (na50) obj;
        return Intrinsics.d(this.f23174a, na50Var.f23174a) && this.b.equals(na50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23174a.hashCode() * 31);
    }

    public final String toString() {
        return "TwoIcons(firstIconModel=" + this.f23174a + ", secondIconModel=" + this.b + Separators.RPAREN;
    }
}
