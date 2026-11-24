package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tl80 implements cm80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34131a;
    public final Throwable b;

    public tl80(Throwable th, List list) {
        list.getClass();
        th.getClass();
        this.f34131a = list;
        this.b = th;
    }

    @Override // a.cm80
    public final List a() {
        return this.f34131a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl80)) {
            return false;
        }
        tl80 tl80Var = (tl80) obj;
        return Intrinsics.d(this.f34131a, tl80Var.f34131a) && Intrinsics.d(this.b, tl80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34131a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(pagingItems=" + this.f34131a + ", throwable=" + this.b + Separators.RPAREN;
    }
}
