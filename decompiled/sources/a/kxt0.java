package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kxt0 implements lxt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nus f19074a;

    public final boolean equals(Object obj) {
        if (obj instanceof kxt0) {
            return this.f19074a.equals(((kxt0) obj).f19074a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19074a.hashCode();
    }

    public final String toString() {
        return "OnToolbarAction(value=" + this.f19074a + Separators.RPAREN;
    }
}
