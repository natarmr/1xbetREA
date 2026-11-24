package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class r3f implements c4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29784a;
    public final String b;

    public r3f(int i, String str) {
        this.f29784a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3f)) {
            return false;
        }
        r3f r3fVar = (r3f) obj;
        return this.f29784a == r3fVar.f29784a && this.b.equals(r3fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f29784a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f29784a, "ShowExpressBoostInfoDialog(eventsCount=", ", minCoef=", this.b, Separators.RPAREN);
    }
}
