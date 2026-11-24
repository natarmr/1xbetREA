package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hir0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13129a;
    public final String b;
    public final List c;

    public hir0(long j, String str, List list) {
        list.getClass();
        this.f13129a = j;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hir0)) {
            return false;
        }
        hir0 hir0Var = (hir0) obj;
        return this.f13129a == hir0Var.f13129a && this.b.equals(hir0Var.b) && Intrinsics.d(this.c, hir0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f13129a) * 31, 31, this.b);
    }

    public final String toString() {
        return ohs0.s(axq.o(this.f13129a, "TotoBetChampModel(champId=", ", champName=", this.b), ", totoBetGameModels=", this.c, Separators.RPAREN);
    }
}
