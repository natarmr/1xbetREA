package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bia implements dia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sha f2650a;

    public final boolean equals(Object obj) {
        if (obj instanceof bia) {
            return this.f2650a.equals(((bia) obj).f2650a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2650a.hashCode();
    }

    public final String toString() {
        return "Status(value=" + this.f2650a + Separators.RPAREN;
    }
}
