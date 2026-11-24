package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class twk0 implements uwk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34654a;
    public final List b;
    public final List c;
    public final boolean d;

    public twk0(List list, List list2, List list3, boolean z) {
        b1j.B(list, list2, list3);
        this.f34654a = list;
        this.b = list2;
        this.c = list3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twk0)) {
            return false;
        }
        twk0 twk0Var = (twk0) obj;
        return Intrinsics.d(this.f34654a, twk0Var.f34654a) && Intrinsics.d(this.b, twk0Var.b) && Intrinsics.d(this.c, twk0Var.c) && this.d == twk0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dw9.a(dw9.a(this.f34654a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("Success(liveEventList=", ", lineEventList=", this.f34654a, ", historyEventList=", this.b);
        sbT.append(this.c);
        sbT.append(", isAllHistoryAvailable=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
