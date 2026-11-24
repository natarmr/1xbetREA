package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gko0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11454a;
    public final List b;
    public final List c;
    public final List d;

    public gko0(List list, List list2, List list3, List list4) {
        hne.C(list, list2, list3, list4);
        this.f11454a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gko0)) {
            return false;
        }
        gko0 gko0Var = (gko0) obj;
        return Intrinsics.d(this.f11454a, gko0Var.f11454a) && Intrinsics.d(this.b, gko0Var.b) && Intrinsics.d(this.c, gko0Var.c) && Intrinsics.d(this.d, gko0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(dw9.a(this.f11454a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return kng0.n(", footer=", Separators.RPAREN, w6x.t("TableModel(tag=", ", tableTitlesList=", this.f11454a, ", tableBodyList=", this.b), this.c, this.d);
    }
}
