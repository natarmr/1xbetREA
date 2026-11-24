package a;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class kl80 extends n7x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f18474a;
    public final int b;
    public final int c;

    public kl80(ArrayList arrayList, int i, int i2) {
        this.f18474a = arrayList;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kl80)) {
            return false;
        }
        kl80 kl80Var = (kl80) obj;
        return this.f18474a.equals(kl80Var.f18474a) && this.b == kl80Var.b && this.c == kl80Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + Integer.hashCode(this.b) + this.f18474a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Prepend loaded ");
        ArrayList arrayList = this.f18474a;
        sb.append(arrayList.size());
        sb.append(" items (\n                    |   first item: ");
        sb.append(CollectionsKt.firstOrNull(arrayList));
        sb.append("\n                    |   last item: ");
        sb.append(CollectionsKt.f0(arrayList));
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.b);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.c);
        sb.append("\n                    |)\n                    |");
        return ntm0.d(sb.toString());
    }
}
