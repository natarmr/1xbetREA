package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fj9 implements hj9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9627a;

    public fj9(List list) {
        list.getClass();
        this.f9627a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fj9) && Intrinsics.d(this.f9627a, ((fj9) obj).f9627a);
    }

    @Override // a.hj9
    public final List getData() {
        return this.f9627a;
    }

    public final int hashCode() {
        return this.f9627a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f9627a, "Initial(data=", Separators.RPAREN);
    }
}
