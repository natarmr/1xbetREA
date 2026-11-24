package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bt5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3165a;
    public final String b;
    public final mvc c;

    public bt5(int i, String str, mvc mvcVar) {
        mvcVar.getClass();
        this.f3165a = i;
        this.b = str;
        this.c = mvcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt5)) {
            return false;
        }
        bt5 bt5Var = (bt5) obj;
        return this.f3165a == bt5Var.f3165a && this.b.equals(bt5Var.b) && this.c == bt5Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f3165a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f3165a, "BannerTypeUiModel(bannerTypeId=", ", bannerTypeName=", this.b, ", bannerCategoryCode=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
