package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a010 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4a;
    public final long b;

    public a010(int i, long j) {
        this.f4a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a010)) {
            return false;
        }
        a010 a010Var = (a010) obj;
        return this.f4a == a010Var.f4a && znq0.e(this.b, a010Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.f4a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f4a, "LolGoldHistoryModel(value=", ", seconds=", znq0.h(this.b), Separators.RPAREN);
    }
}
