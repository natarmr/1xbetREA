package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ytc0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43211a;
    public final a4x b;

    public ytc0(long j, a4x a4xVar) {
        a4xVar.getClass();
        this.f43211a = j;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytc0)) {
            return false;
        }
        ytc0 ytc0Var = (ytc0) obj;
        return this.f43211a == ytc0Var.f43211a && Intrinsics.d(this.b, ytc0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return h97.h(this.f43211a, super.getKey());
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f43211a) * 31);
    }

    public final String toString() {
        return "PromoStoreCollectionCardItemUiModel(categoryId=" + this.f43211a + ", cards=" + this.b + Separators.RPAREN;
    }
}
