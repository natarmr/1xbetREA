package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sl80 implements bm80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32387a;
    public final Throwable b;
    public final lk80 c;

    public sl80(List list, Throwable th, lk80 lk80Var) {
        list.getClass();
        th.getClass();
        lk80Var.getClass();
        this.f32387a = list;
        this.b = th;
        this.c = lk80Var;
    }

    @Override // a.bm80
    public final List a() {
        return this.f32387a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl80)) {
            return false;
        }
        sl80 sl80Var = (sl80) obj;
        return Intrinsics.d(this.f32387a, sl80Var.f32387a) && Intrinsics.d(this.b, sl80Var.b) && this.c == sl80Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f32387a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Error(pagingItems=" + this.f32387a + ", throwable=" + this.b + ", pagerLoadingType=" + this.c + Separators.RPAREN;
    }
}
