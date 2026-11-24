package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class dan implements ean {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ban f5757a;
    public final ban b;

    public dan(ban banVar, ban banVar2) {
        this.f5757a = banVar;
        this.b = banVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dan)) {
            return false;
        }
        dan danVar = (dan) obj;
        return this.f5757a.equals(danVar.f5757a) && this.b.equals(danVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5757a.hashCode() * 31);
    }

    public final String toString() {
        return "TwoButton(firstButton=" + this.f5757a + ", secondButton=" + this.b + Separators.RPAREN;
    }
}
