package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ym60 implements dn60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbv f42873a;

    public ym60(pbv pbvVar) {
        this.f42873a = pbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ym60) && this.f42873a.equals(((ym60) obj).f42873a);
    }

    public final int hashCode() {
        return this.f42873a.hashCode();
    }

    public final String toString() {
        return "OnActionSelected(game=" + this.f42873a + Separators.RPAREN;
    }
}
