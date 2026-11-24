package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cjw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f4479a;
    public final n0x b;

    public cjw(n0x n0xVar, n0x n0xVar2) {
        this.f4479a = n0xVar;
        this.b = n0xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjw)) {
            return false;
        }
        cjw cjwVar = (cjw) obj;
        return this.f4479a.equals(cjwVar.f4479a) && this.b.equals(cjwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4479a.hashCode() * 31);
    }

    public final String toString() {
        return "HomeScreenParams(toolbarImage=" + this.f4479a + ", backgroundImage=" + this.b + Separators.RPAREN;
    }
}
