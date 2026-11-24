package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class owq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25977a;
    public final List b;
    public final boolean c;

    public owq0(List list, List list2, boolean z) {
        list.getClass();
        list2.getClass();
        this.f25977a = list;
        this.b = list2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owq0)) {
            return false;
        }
        owq0 owq0Var = (owq0) obj;
        return Intrinsics.d(this.f25977a, owq0Var.f25977a) && Intrinsics.d(this.b, owq0Var.b) && this.c == owq0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dw9.a(this.f25977a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(w6x.t("ToolbarStatisticBlocksItemParams(availableIds=", ", disableIds=", this.f25977a, ", statisticBlocksActive=", this.b), this.c, Separators.RPAREN);
    }
}
