package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class npk implements ppk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fyl f23917a;

    public npk(fyl fylVar) {
        this.f23917a = fylVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof npk) && this.f23917a.equals(((npk) obj).f23917a);
    }

    public final int hashCode() {
        return this.f23917a.hashCode();
    }

    public final String toString() {
        return "Available(chips=" + this.f23917a + Separators.RPAREN;
    }
}
