package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u6b implements w6b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f35130a;
    public final boolean b;

    public u6b(udl0 udl0Var, boolean z) {
        this.f35130a = udl0Var;
        this.b = z;
    }

    @Override // a.w6b
    public final boolean a() {
        return this.b;
    }

    @Override // a.w6b
    public final udl0 b() {
        return this.f35130a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6b)) {
            return false;
        }
        u6b u6bVar = (u6b) obj;
        return this.f35130a == u6bVar.f35130a && this.b == u6bVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f35130a.hashCode() * 31);
    }

    public final String toString() {
        return "Progress(sportGameType=" + this.f35130a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
