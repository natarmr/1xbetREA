package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vl80 implements bm80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f37609a;
    public final boolean b;

    public vl80(ArrayList arrayList, boolean z) {
        this.f37609a = arrayList;
        this.b = z;
    }

    @Override // a.bm80
    public final List a() {
        return this.f37609a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl80)) {
            return false;
        }
        vl80 vl80Var = (vl80) obj;
        return this.f37609a.equals(vl80Var.f37609a) && this.b == vl80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f37609a.hashCode() * 31);
    }

    public final String toString() {
        return "Idle(pagingItems=" + this.f37609a + ", endOfPaginationReached=" + this.b + Separators.RPAREN;
    }
}
