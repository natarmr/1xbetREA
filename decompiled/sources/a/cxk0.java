package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cxk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5126a;
    public final List b;
    public final List c;

    public cxk0(List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f5126a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxk0)) {
            return false;
        }
        cxk0 cxk0Var = (cxk0) obj;
        return Intrinsics.d(this.f5126a, cxk0Var.f5126a) && Intrinsics.d(this.b, cxk0Var.b) && Intrinsics.d(this.c, cxk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f5126a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(w6x.t("SpecialEventsModel(liveList=", ", lineList=", this.f5126a, ", historyList=", this.b), this.c, Separators.RPAREN);
    }
}
