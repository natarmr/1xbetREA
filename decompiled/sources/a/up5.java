package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class up5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mq5 f36046a;
    public final int b;

    public up5(mq5 mq5Var, int i) {
        this.f36046a = mq5Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up5)) {
            return false;
        }
        up5 up5Var = (up5) obj;
        return this.f36046a == up5Var.f36046a && this.b == up5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f36046a.hashCode() * 31);
    }

    public final String toString() {
        return "BannerCollectionShimmersModel(style=" + this.f36046a + ", shimmersCount=" + this.b + Separators.RPAREN;
    }
}
