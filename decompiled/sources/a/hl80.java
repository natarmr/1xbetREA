package a;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class hl80 extends n7x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13245a;
    public final ArrayList b;
    public final int c;
    public final int d;

    public hl80(int i, int i2, int i3, ArrayList arrayList) {
        this.f13245a = i;
        this.b = arrayList;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hl80)) {
            return false;
        }
        hl80 hl80Var = (hl80) obj;
        return this.f13245a == hl80Var.f13245a && this.b.equals(hl80Var.b) && this.c == hl80Var.c && this.d == hl80Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + Integer.hashCode(this.c) + this.b.hashCode() + Integer.hashCode(this.f13245a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Append loaded ");
        ArrayList arrayList = this.b;
        sb.append(arrayList.size());
        sb.append(" items (\n                    |   startIndex: ");
        sb.append(this.f13245a);
        sb.append("\n                    |   first item: ");
        sb.append(CollectionsKt.firstOrNull(arrayList));
        sb.append("\n                    |   last item: ");
        sb.append(CollectionsKt.f0(arrayList));
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.c);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.d);
        sb.append("\n                    |)\n                    |");
        return ntm0.d(sb.toString());
    }
}
