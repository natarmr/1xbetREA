package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bt7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3168a;
    public final long b;

    public bt7(long j, List list) {
        list.getClass();
        this.f3168a = list;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt7)) {
            return false;
        }
        bt7 bt7Var = (bt7) obj;
        return Intrinsics.d(this.f3168a, bt7Var.f3168a) && this.b == bt7Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f3168a.hashCode() * 31);
    }

    public final String toString() {
        return "BetsListModel(events=" + this.f3168a + ", groupId=" + this.b + Separators.RPAREN;
    }
}
