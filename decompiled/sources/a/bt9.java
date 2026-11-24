package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bt9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3171a;
    public final String b;
    public final String c;

    public bt9(int i, String str, String str2) {
        this.f3171a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt9)) {
            return false;
        }
        bt9 bt9Var = (bt9) obj;
        return this.f3171a == bt9Var.f3171a && this.b.equals(bt9Var.b) && this.c.equals(bt9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f3171a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f3171a, "CallbackLanguageModel(languageId=", ", languageName=", this.b, ", isoLang="), this.c, Separators.RPAREN);
    }
}
