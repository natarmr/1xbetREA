package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d1w implements i1w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f5331a;

    public d1w(i4 i4Var) {
        i4Var.getClass();
        this.f5331a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1w) && Intrinsics.d(this.f5331a, ((d1w) obj).f5331a);
    }

    public final int hashCode() {
        return this.f5331a.hashCode();
    }

    public final String toString() {
        return "BottomButtonUiModel(bottomButtonList=" + this.f5331a + Separators.RPAREN;
    }
}
