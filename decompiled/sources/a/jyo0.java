package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jyo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dxh0 f17370a;

    public jyo0(dxh0 dxh0Var) {
        this.f17370a = dxh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jyo0) && this.f17370a.equals(((jyo0) obj).f17370a);
    }

    public final int hashCode() {
        return this.f17370a.hashCode();
    }

    public final String toString() {
        return "TeamBetContainerConfig(segmentedControlStyle=" + this.f17370a + Separators.RPAREN;
    }
}
