package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class hm6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final im6 f13291a;
    public final String b;

    public hm6(im6 im6Var, String str) {
        this.f13291a = im6Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm6)) {
            return false;
        }
        hm6 hm6Var = (hm6) obj;
        return this.f13291a.equals(hm6Var.f13291a) && this.b.equals(hm6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() - 1049283810;
    }

    public final String toString() {
        return "BetBuilderTipModel(screen=" + this.f13291a + ", imagePath=" + this.b + Separators.RPAREN;
    }
}
