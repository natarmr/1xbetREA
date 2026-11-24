package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class q84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28282a;
    public final rqm b;
    public final String c;
    public final long d;
    public final int e;
    public final boolean f;
    public final boolean g;

    public q84(String str, rqm rqmVar, String str2, long j, int i, boolean z, boolean z2) {
        this.f28282a = str;
        this.b = rqmVar;
        this.c = str2;
        this.d = j;
        this.e = i;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q84)) {
            return false;
        }
        q84 q84Var = (q84) obj;
        return this.f28282a.equals(q84Var.f28282a) && this.b.equals(q84Var.b) && this.c.equals(q84Var.c) && this.d == q84Var.d && this.e == q84Var.e && this.f == q84Var.f && this.g == q84Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + brm0.e(twn.a(this.e, rw2.b(ua80.b((this.b.hashCode() + (this.f28282a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthHistorySessionUiModel(sessionId=");
        sb.append(this.f28282a);
        sb.append(", settingCellStyle=");
        sb.append(this.b);
        sb.append(", title=");
        defpackage.c.i(sb, this.d, this.c, ", date=");
        dw9.v(this.e, ", osIconResId=", ", addStatusBadge=", sb, this.f);
        return f140.n(sb, ", currentSession=", this.g, Separators.RPAREN);
    }
}
