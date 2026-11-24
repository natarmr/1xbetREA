package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class sa90 implements ta90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lun f31881a;
    public final boolean b;
    public final boolean c;

    public sa90(lun lunVar, boolean z, boolean z2) {
        this.f31881a = lunVar;
        this.b = z;
        this.c = z2;
    }

    @Override // a.ta90
    public final boolean a() {
        return this.b;
    }

    @Override // a.ta90
    public final float b() {
        return 1.0f;
    }

    @Override // a.ta90
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa90)) {
            return false;
        }
        sa90 sa90Var = (sa90) obj;
        return this.f31881a.equals(sa90Var.f31881a) && this.b == sa90Var.b && this.c == sa90Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(url=, extraHeaders=");
        sb.append(this.f31881a);
        sb.append(", reloadEnable=");
        sb.append(this.b);
        sb.append(", deposit=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
