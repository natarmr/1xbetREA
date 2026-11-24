package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class avv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bsv0 f1545a;

    public avv0(bsv0 bsv0Var) {
        bsv0Var.getClass();
        this.f1545a = bsv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof avv0) && Intrinsics.d(this.f1545a, ((avv0) obj).f1545a);
    }

    public final int hashCode() {
        return this.f1545a.hashCode();
    }

    public final String toString() {
        return "XBottomSheetLiveConfigKey(anchors=" + this.f1545a + Separators.RPAREN;
    }
}
