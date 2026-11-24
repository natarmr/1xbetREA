package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ua50 implements wa50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wkm f35315a;
    public final wkm b;
    public final wkm c;

    public ua50(wkm wkmVar, wkm wkmVar2, wkm wkmVar3) {
        wkmVar.getClass();
        wkmVar2.getClass();
        wkmVar3.getClass();
        this.f35315a = wkmVar;
        this.b = wkmVar2;
        this.c = wkmVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua50)) {
            return false;
        }
        ua50 ua50Var = (ua50) obj;
        return Intrinsics.d(this.f35315a, ua50Var.f35315a) && Intrinsics.d(this.b, ua50Var.b) && Intrinsics.d(this.c, ua50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f35315a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ThreeIcons(firstIconModel=" + this.f35315a + ", secondIconModel=" + this.b + ", thirdIconModel=" + this.c + Separators.RPAREN;
    }
}
