package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yha implements dia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gha f42629a;

    public final boolean equals(Object obj) {
        if (obj instanceof yha) {
            return this.f42629a.equals(((yha) obj).f42629a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42629a.hashCode();
    }

    public final String toString() {
        return "Attack(value=" + this.f42629a + Separators.RPAREN;
    }
}
