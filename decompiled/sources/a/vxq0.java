package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vxq0 implements wxq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b5l0 f38214a;

    public vxq0(b5l0 b5l0Var) {
        this.f38214a = b5l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vxq0) && this.f38214a.equals(((vxq0) obj).f38214a);
    }

    public final int hashCode() {
        return this.f38214a.hashCode();
    }

    public final String toString() {
        return "SportItem(delegateAction=" + this.f38214a + Separators.RPAREN;
    }
}
