package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class iko0 {
    public static final iko0 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14937a;
    public final List b;
    public final List c;
    public final List d;

    static {
        iun iunVar = iun.f15405a;
        e = new iko0(iunVar, iunVar, iunVar, iunVar);
    }

    public iko0(List list, List list2, List list3, List list4) {
        hne.C(list, list2, list3, list4);
        this.f14937a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iko0)) {
            return false;
        }
        iko0 iko0Var = (iko0) obj;
        return Intrinsics.d(this.f14937a, iko0Var.f14937a) && Intrinsics.d(this.b, iko0Var.b) && Intrinsics.d(this.c, iko0Var.c) && Intrinsics.d(this.d, iko0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(dw9.a(this.f14937a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return kng0.n(", footer=", Separators.RPAREN, w6x.t("TableModel(tag=", ", tableTitlesList=", this.f14937a, ", tableBodyList=", this.b), this.c, this.d);
    }
}
