package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class plv0 implements rlv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wkv0 f27203a;

    public final boolean equals(Object obj) {
        if (obj instanceof plv0) {
            return this.f27203a.equals(((plv0) obj).f27203a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27203a.hashCode();
    }

    public final String toString() {
        return "OnItemClick(menuType=" + this.f27203a + Separators.RPAREN;
    }
}
