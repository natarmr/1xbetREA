package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ul80 implements am80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35860a;
    public final boolean b;
    public final boolean c;

    public ul80(List list, boolean z, boolean z2) {
        list.getClass();
        this.f35860a = list;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul80)) {
            return false;
        }
        ul80 ul80Var = (ul80) obj;
        return Intrinsics.d(this.f35860a, ul80Var.f35860a) && this.b == ul80Var.b && this.c == ul80Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f35860a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Idle(pagingItems=");
        sb.append(this.f35860a);
        sb.append(", endOfPaginationReached=");
        sb.append(this.b);
        sb.append(", isInitial=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
