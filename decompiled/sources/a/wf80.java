package a;

import android.gov.nist.core.Separators;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/wf80;", "La/um40;", "La/ag80;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
final /* data */ class wf80 extends um40 {
    public final BottomSheetBehavior b;

    public wf80(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.getClass();
        this.b = bottomSheetBehavior;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wf80) && Intrinsics.d(this.b, ((wf80) obj).b);
    }

    @Override // a.um40
    public final lm40 f() {
        return new ag80(this.b);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        ag80 ag80Var = (ag80) lm40Var;
        ag80Var.getClass();
        BottomSheetBehavior bottomSheetBehavior = this.b;
        bottomSheetBehavior.getClass();
        ag80Var.q = bottomSheetBehavior;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OverscrollElement(behavior=" + this.b + Separators.RPAREN;
    }
}
