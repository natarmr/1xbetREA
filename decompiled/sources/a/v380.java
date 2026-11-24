package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v380 implements y380 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3m0 f36721a;
    public final String b;

    public v380(i3m0 i3m0Var, String str) {
        this.f36721a = i3m0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v380)) {
            return false;
        }
        v380 v380Var = (v380) obj;
        return this.f36721a.equals(v380Var.f36721a) && this.b.equals(v380Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36721a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateParams(stageType=" + this.f36721a + ", group=" + this.b + Separators.RPAREN;
    }
}
