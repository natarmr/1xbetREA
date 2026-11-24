package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fqs {
    public static final fqs g = new fqs(0, 0, 0, "", false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9989a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final boolean f;

    public fqs(int i, int i2, int i3, String str, boolean z, boolean z2) {
        this.f9989a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqs)) {
            return false;
        }
        fqs fqsVar = (fqs) obj;
        return this.f9989a == fqsVar.f9989a && this.b == fqsVar.b && this.c == fqsVar.c && this.d == fqsVar.d && this.e.equals(fqsVar.e) && this.f == fqsVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(twn.a(this.d, twn.a(this.c, twn.a(this.b, Boolean.hashCode(this.f9989a) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = ohs0.t(this.b, "GameResultState(isVisible=", ", iconResId=", ", titleResId=", this.f9989a);
        axq.r(this.c, this.d, ", titleColorResId=", ", descriptionText=", sbT);
        return defpackage.c.c(this.e, ", showActivateButton=", Separators.RPAREN, sbT, this.f);
    }
}
