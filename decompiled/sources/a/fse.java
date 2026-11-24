package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class fse implements ise {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10059a;

    public final boolean equals(Object obj) {
        if (obj instanceof fse) {
            return this.f10059a.equals(((fse) obj).f10059a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10059a.hashCode();
    }

    public final String toString() {
        return kng0.l("TagText(value=", this.f10059a, Separators.RPAREN);
    }
}
