package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b6e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2050a;
    public final ArrayList b;
    public final List c;
    public final w8b d;

    public b6e0(ArrayList arrayList, ArrayList arrayList2, List list, w8b w8bVar) {
        list.getClass();
        this.f2050a = arrayList;
        this.b = arrayList2;
        this.c = list;
        this.d = w8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b6e0) {
            b6e0 b6e0Var = (b6e0) obj;
            return this.f2050a.equals(b6e0Var.f2050a) && this.b.equals(b6e0Var.b) && Intrinsics.d(this.c, b6e0Var.c) && this.d == b6e0Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(twn.g(this.b, this.f2050a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "Content(cellList=" + this.f2050a + ", rowHeaderList=" + this.b + ", columnHeaderList=" + this.c + ", firstColumnTitle=" + this.d + Separators.RPAREN;
    }
}
