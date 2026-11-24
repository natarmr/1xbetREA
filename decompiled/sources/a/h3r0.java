package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h3r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12400a;
    public final List b;

    public h3r0(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f12400a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3r0)) {
            return false;
        }
        h3r0 h3r0Var = (h3r0) obj;
        return Intrinsics.d(this.f12400a, h3r0Var.f12400a) && Intrinsics.d(this.b, h3r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12400a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("TopEventModel(tabs=", ", legends=", this.f12400a, Separators.RPAREN, this.b);
    }
}
