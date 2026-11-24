package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ap8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1239a;
    public final String b;
    public final String c;
    public final boolean d;

    public ap8(int i, String str, String str2, boolean z) {
        this.f1239a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap8)) {
            return false;
        }
        ap8 ap8Var = (ap8) obj;
        return this.f1239a == ap8Var.f1239a && this.b.equals(ap8Var.b) && this.c.equals(ap8Var.c) && this.d == ap8Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(Integer.hashCode(this.f1239a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return defpackage.c.c(this.c, ", isSelected=", Separators.RPAREN, vqd.r(this.f1239a, "LanguageItem(id=", ", title=", this.b, ", subtitle="), this.d);
    }
}
