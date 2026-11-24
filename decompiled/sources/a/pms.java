package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class pms {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27252a;
    public final String b;

    public pms(int i, String str) {
        this.f27252a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pms)) {
            return false;
        }
        pms pmsVar = (pms) obj;
        return this.f27252a == pmsVar.f27252a && this.b.equals(pmsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f27252a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f27252a, "GameModel(id=", ", name=", this.b, Separators.RPAREN);
    }
}
