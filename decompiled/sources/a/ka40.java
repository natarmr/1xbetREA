package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ka40 implements ma40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia40 f17947a;

    public final boolean equals(Object obj) {
        if (obj instanceof ka40) {
            return this.f17947a.equals(((ka40) obj).f17947a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17947a.hashCode();
    }

    public final String toString() {
        return "Content(value=" + this.f17947a + Separators.RPAREN;
    }
}
