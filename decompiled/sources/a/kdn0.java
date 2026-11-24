package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kdn0 implements mdn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f18115a;
    public final boolean b;

    public kdn0(i4 i4Var, boolean z) {
        i4Var.getClass();
        this.f18115a = i4Var;
        this.b = z;
    }

    @Override // a.mdn0
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdn0)) {
            return false;
        }
        kdn0 kdn0Var = (kdn0) obj;
        return Intrinsics.d(this.f18115a, kdn0Var.f18115a) && this.b == kdn0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + f140.c(this.f18115a, Boolean.hashCode(false) * 31, 31);
    }

    public final String toString() {
        return "ShowSubscriptions(isRefreshing=false, eventCardList=" + this.f18115a + ", supportRtl=" + this.b + Separators.RPAREN;
    }
}
