package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gd90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11093a;
    public final boolean b;

    public gd90(List list, boolean z) {
        list.getClass();
        this.f11093a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd90)) {
            return false;
        }
        gd90 gd90Var = (gd90) obj;
        return Intrinsics.d(this.f11093a, gd90Var.f11093a) && this.b == gd90Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f11093a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingEvents(events=" + this.f11093a + ", openMakeBet=" + this.b + Separators.RPAREN;
    }
}
