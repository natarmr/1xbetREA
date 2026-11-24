package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xz7 implements yz7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zz7 f41742a;

    public xz7(zz7 zz7Var) {
        this.f41742a = zz7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xz7) && this.f41742a.equals(((xz7) obj).f41742a);
    }

    public final int hashCode() {
        return this.f41742a.hashCode();
    }

    public final String toString() {
        return "Fill(item=" + this.f41742a + Separators.RPAREN;
    }
}
