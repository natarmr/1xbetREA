package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yl80 implements bm80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42828a;
    public final lk80 b;

    public yl80(List list, lk80 lk80Var) {
        list.getClass();
        lk80Var.getClass();
        this.f42828a = list;
        this.b = lk80Var;
    }

    @Override // a.bm80
    public final List a() {
        return this.f42828a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl80)) {
            return false;
        }
        yl80 yl80Var = (yl80) obj;
        return Intrinsics.d(this.f42828a, yl80Var.f42828a) && this.b == yl80Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42828a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(pagingItems=" + this.f42828a + ", pagerLoadingType=" + this.b + Separators.RPAREN;
    }
}
