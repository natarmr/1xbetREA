package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class si00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aj00 f32240a;
    public final String b;
    public final int c;

    public si00(aj00 aj00Var, String str, int i) {
        this.f32240a = aj00Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si00)) {
            return false;
        }
        si00 si00Var = (si00) obj;
        return this.f32240a.equals(si00Var.f32240a) && this.b.equals(si00Var.b) && this.c == si00Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f32240a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveExpressTabModel(type=");
        sb.append(this.f32240a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", gamesCount=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
