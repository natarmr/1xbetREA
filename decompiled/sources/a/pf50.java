package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pf50 implements sf50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final im3 f26885a;

    public pf50(im3 im3Var) {
        this.f26885a = im3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pf50) && this.f26885a.equals(((pf50) obj).f26885a);
    }

    public final int hashCode() {
        return this.f26885a.hashCode();
    }

    public final String toString() {
        return "OpenAppUpdateScreen(appUpdateModel=" + this.f26885a + Separators.RPAREN;
    }
}
