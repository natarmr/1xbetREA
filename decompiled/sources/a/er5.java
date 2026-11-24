package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class er5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8264a;
    public final gro0 b;

    public er5(String str, gro0 gro0Var) {
        this.f8264a = str;
        this.b = gro0Var;
    }

    public static er5 a(er5 er5Var, gro0 gro0Var) {
        String str = er5Var.f8264a;
        er5Var.getClass();
        return new er5(str, gro0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er5)) {
            return false;
        }
        er5 er5Var = (er5) obj;
        return this.f8264a.equals(er5Var.f8264a) && this.b.equals(er5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8264a.hashCode() * 31);
    }

    public final String toString() {
        return "BannerItemTagUiModel(tagText=" + this.f8264a + ", tagStyle=" + this.b + Separators.RPAREN;
    }
}
