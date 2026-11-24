package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rkk implements wkk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkk f30652a;

    public final boolean equals(Object obj) {
        if (obj instanceof rkk) {
            return this.f30652a.equals(((rkk) obj).f30652a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30652a.hashCode();
    }

    public final String toString() {
        return "FirstPlayerRoll(value=" + this.f30652a + Separators.RPAREN;
    }
}
