package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xl80 implements am80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41059a;
    public final boolean b;

    public xl80(List list, boolean z) {
        list.getClass();
        this.f41059a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl80)) {
            return false;
        }
        xl80 xl80Var = (xl80) obj;
        return Intrinsics.d(this.f41059a, xl80Var.f41059a) && this.b == xl80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f41059a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(pagingItems=" + this.f41059a + ", isInitial=" + this.b + Separators.RPAREN;
    }
}
