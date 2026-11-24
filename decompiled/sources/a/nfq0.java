package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nfq0 extends ofq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23450a;
    public final List b;

    public nfq0(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f23450a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfq0)) {
            return false;
        }
        nfq0 nfq0Var = (nfq0) obj;
        return Intrinsics.d(this.f23450a, nfq0Var.f23450a) && Intrinsics.d(this.b, nfq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23450a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("UpdateCells(cells=", ", winCells=", this.f23450a, Separators.RPAREN, this.b);
    }

    public nfq0(List list) {
        this(list, iun.f15405a);
    }
}
