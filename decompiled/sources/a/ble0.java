package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes7.dex */
public final class ble0 implements fle0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ame0 f2791a;

    public ble0(ame0 ame0Var) {
        this.f2791a = ame0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ble0) && this.f2791a.equals(((ble0) obj).f2791a);
    }

    public final int hashCode() {
        return this.f2791a.hashCode();
    }

    public final String toString() {
        return "Content(tableModel=" + this.f2791a + Separators.RPAREN;
    }
}
