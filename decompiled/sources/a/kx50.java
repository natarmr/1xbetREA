package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class kx50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19036a;
    public final t2m0 b;

    public kx50(t2m0 t2m0Var, String str) {
        this.f19036a = str;
        this.b = t2m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx50)) {
            return false;
        }
        kx50 kx50Var = (kx50) obj;
        return this.f19036a.equals(kx50Var.f19036a) && this.b == kx50Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19036a.hashCode() * 31);
    }

    public final String toString() {
        return "NextStageTitleModel(title=" + this.f19036a + ", colorRow=" + this.b + Separators.RPAREN;
    }
}
