package a;

import android.gov.nist.core.Separators;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fds0 implements gds0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9372a;
    public final Map b;

    public fds0(List list, HashMap map) {
        list.getClass();
        map.getClass();
        this.f9372a = list;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fds0)) {
            return false;
        }
        fds0 fds0Var = (fds0) obj;
        return Intrinsics.d(this.f9372a, fds0Var.f9372a) && Intrinsics.d(this.b, fds0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9372a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackedCoefs(coefList=" + this.f9372a + ", specialTypeMap=" + this.b + Separators.RPAREN;
    }
}
