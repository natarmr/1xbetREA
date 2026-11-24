package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wo9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39482a;
    public final bs10 b;
    public final long c;

    public wo9(boolean z, bs10 bs10Var, long j) {
        bs10Var.getClass();
        this.f39482a = z;
        this.b = bs10Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo9)) {
            return false;
        }
        wo9 wo9Var = (wo9) obj;
        return this.f39482a == wo9Var.f39482a && this.b == wo9Var.b && this.c == wo9Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.f39482a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallBackScreenParams(showNavBar=");
        sb.append(this.f39482a);
        sb.append(", tabType=");
        sb.append(this.b);
        sb.append(", callbackAnimatedItemId=");
        return brm0.k(this.c, Separators.RPAREN, sb);
    }
}
