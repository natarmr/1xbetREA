package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5626a;
    public final List b;

    public d84(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f5626a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d84)) {
            return false;
        }
        d84 d84Var = (d84) obj;
        return Intrinsics.d(this.f5626a, d84Var.f5626a) && Intrinsics.d(this.b, d84Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5626a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("AuthHistoryModel(activeSessions=", ", historySessions=", this.f5626a, Separators.RPAREN, this.b);
    }
}
