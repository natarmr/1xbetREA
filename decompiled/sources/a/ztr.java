package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ztr implements cur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ytr f44975a;
    public final int b;
    public final boolean c;

    public ztr(ytr ytrVar, int i, boolean z) {
        this.f44975a = ytrVar;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztr)) {
            return false;
        }
        ztr ztrVar = (ztr) obj;
        return this.f44975a.equals(ztrVar.f44975a) && this.b == ztrVar.b && this.c == ztrVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, this.f44975a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportIcon(sportIconUrl=");
        sb.append(this.f44975a);
        sb.append(", placeholder=");
        sb.append(this.b);
        sb.append(", topIcon=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
