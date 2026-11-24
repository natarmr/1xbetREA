package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ouz implements tuz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l810 f25900a;

    public final boolean equals(Object obj) {
        if (obj instanceof ouz) {
            return this.f25900a.equals(((ouz) obj).f25900a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25900a.hashCode();
    }

    public final String toString() {
        return "OnLossLimitClick(limitType=" + this.f25900a + Separators.RPAREN;
    }
}
