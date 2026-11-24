package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22922a;
    public final List b;

    public n52(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f22922a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n52)) {
            return false;
        }
        n52 n52Var = (n52) obj;
        return Intrinsics.d(this.f22922a, n52Var.f22922a) && Intrinsics.d(this.b, n52Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22922a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("AllTopChampsMapModel(liveTopChamps=", ", lineTopChamps=", this.f22922a, Separators.RPAREN, this.b);
    }
}
