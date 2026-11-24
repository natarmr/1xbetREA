package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class llp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20260a;
    public final a4x b;

    public llp0(i4 i4Var, boolean z) {
        i4Var.getClass();
        this.f20260a = z;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llp0)) {
            return false;
        }
        llp0 llp0Var = (llp0) obj;
        return this.f20260a == llp0Var.f20260a && Intrinsics.d(this.b, llp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f20260a) * 31);
    }

    public final String toString() {
        return "TeamStatisticItemsUiModel(visible=" + this.f20260a + ", itemList=" + this.b + Separators.RPAREN;
    }
}
