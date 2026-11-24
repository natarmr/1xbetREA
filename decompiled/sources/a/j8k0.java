package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j8k0 implements jvg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16088a;

    public j8k0(List list) {
        list.getClass();
        this.f16088a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8k0) && Intrinsics.d(this.f16088a, ((j8k0) obj).f16088a);
    }

    @Override // a.jvg0
    public final int getItemId() {
        return 1;
    }

    public final int hashCode() {
        return this.f16088a.hashCode() + (Integer.hashCode(1) * 31);
    }

    public final String toString() {
        return twn.r(this.f16088a, "SlidersGroupUiModel(itemId=1, sliders=", Separators.RPAREN);
    }
}
