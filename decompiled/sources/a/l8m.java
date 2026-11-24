package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class l8m implements wqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9m f19611a;
    public final String b;
    public final String c;
    public final boolean d;

    public l8m(l9m l9mVar, String str, String str2, boolean z) {
        this.f19611a = l9mVar;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8m)) {
            return false;
        }
        l8m l8mVar = (l8m) obj;
        return this.f19611a.equals(l8mVar.f19611a) && this.b.equals(l8mVar.b) && this.c.equals(l8mVar.c) && this.d == l8mVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(this.f19611a.hashCode() * 31, 961, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsCyberLabeledCellUiModel(mediaCell=");
        sb.append(this.f19611a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", badge=, caption=");
        return defpackage.c.c(this.c, ", active=", Separators.RPAREN, sb, this.d);
    }
}
