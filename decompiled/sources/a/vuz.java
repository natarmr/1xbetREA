package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class vuz implements ivz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38072a;

    public vuz(String str) {
        str.getClass();
        this.f38072a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vuz) && Intrinsics.d(this.f38072a, ((vuz) obj).f38072a);
    }

    public final int hashCode() {
        return this.f38072a.hashCode();
    }

    public final String toString() {
        return kng0.l("LimitsEeFooterUiModel(text=", this.f38072a, Separators.RPAREN);
    }
}
