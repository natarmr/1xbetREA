package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ame0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1103a;
    public final ArrayList b;
    public final ArrayList c;
    public final vke0 d;

    public ame0(List list, ArrayList arrayList, ArrayList arrayList2, vke0 vke0Var) {
        list.getClass();
        this.f1103a = list;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = vke0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ame0)) {
            return false;
        }
        ame0 ame0Var = (ame0) obj;
        return Intrinsics.d(this.f1103a, ame0Var.f1103a) && this.b.equals(ame0Var.b) && this.c.equals(ame0Var.c) && this.d.equals(ame0Var.d);
    }

    public final int hashCode() {
        return this.d.d.hashCode() + twn.g(this.c, twn.g(this.b, this.f1103a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "RefereeTourTableUiModel(columnHeaderList=" + this.f1103a + ", rowHeaderList=" + this.b + ", cellList=" + this.c + ", cornerCell=" + this.d + Separators.RPAREN;
    }
}
