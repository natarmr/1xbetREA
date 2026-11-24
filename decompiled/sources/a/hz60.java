package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hz60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lao0 f13893a;
    public final boolean b;
    public final String c;

    public hz60(lao0 lao0Var, boolean z, String str) {
        this.f13893a = lao0Var;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz60)) {
            return false;
        }
        hz60 hz60Var = (hz60) obj;
        return this.f13893a.equals(hz60Var.f13893a) && this.b == hz60Var.b && this.c.equals(hz60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f13893a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneXGamesHolderUiModel(tabBarUiModel=");
        sb.append(this.f13893a);
        sb.append(", tabBarVisible=");
        sb.append(this.b);
        sb.append(", tabBarSelectedTab=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
