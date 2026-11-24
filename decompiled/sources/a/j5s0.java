package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j5s0 implements y8b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15948a;
    public final int b;

    public j5s0(int i, List list) {
        list.getClass();
        this.f15948a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5s0)) {
            return false;
        }
        j5s0 j5s0Var = (j5s0) obj;
        return Intrinsics.d(this.f15948a, j5s0Var.f15948a) && this.b == j5s0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f15948a.hashCode() * 31);
    }

    public final String toString() {
        return "Footer(footerList=" + this.f15948a + ", height=" + this.b + Separators.RPAREN;
    }
}
