package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class x72 implements y72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3n f40391a;

    public x72(n3n n3nVar) {
        this.f40391a = n3nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x72) && this.f40391a.equals(((x72) obj).f40391a);
    }

    public final int hashCode() {
        return this.f40391a.hashCode();
    }

    public final String toString() {
        return "NearestGame(model=" + this.f40391a + Separators.RPAREN;
    }
}
