package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class akf implements nkf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uss f1019a;

    public final boolean equals(Object obj) {
        if (obj instanceof akf) {
            return this.f1019a.equals(((akf) obj).f1019a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1019a.hashCode();
    }

    public final String toString() {
        return "OnGameStreamAction(value=" + this.f1019a + Separators.RPAREN;
    }
}
