package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class awn0 implements fwn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1584a;

    public final boolean equals(Object obj) {
        if (obj instanceof awn0) {
            return this.f1584a.equals(((awn0) obj).f1584a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1584a.hashCode();
    }

    public final String toString() {
        return kng0.l("Coef(value=", this.f1584a, Separators.RPAREN);
    }
}
