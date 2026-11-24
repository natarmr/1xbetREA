package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mr70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22255a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public mr70(int i, String str, String str2, String str3, boolean z) {
        this.f22255a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr70)) {
            return false;
        }
        mr70 mr70Var = (mr70) obj;
        return this.f22255a == mr70Var.f22255a && this.b.equals(mr70Var.b) && this.c.equals(mr70Var.c) && this.d.equals(mr70Var.d) && this.e == mr70Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f22255a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f22255a, "OnlineCallLanguageModel(languageId=", ", languageName=", this.b, ", webLanguageName=");
        f140.v(sbR, this.c, ", isoLang=", this.d, ", isSelected=");
        return rw2.p(sbR, this.e, Separators.RPAREN);
    }
}
