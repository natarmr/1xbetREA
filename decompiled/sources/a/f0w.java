package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f0w implements g0w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f8735a;

    public f0w(i4 i4Var) {
        i4Var.getClass();
        this.f8735a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0w) && Intrinsics.d(this.f8735a, ((f0w) obj).f8735a);
    }

    public final int hashCode() {
        return this.f8735a.hashCode();
    }

    public final String toString() {
        return "Success(historyCouponItemList=" + this.f8735a + Separators.RPAREN;
    }
}
