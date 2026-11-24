package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n540 extends a640 {
    public final int c;
    public final m540 d;
    public final ilf0 e;
    public final x640 f;
    public final Date g;

    public n540(int i, m540 m540Var, ilf0 ilf0Var, x640 x640Var, Date date) {
        super(null, trt0.b);
        this.c = i;
        this.d = m540Var;
        this.e = ilf0Var;
        this.f = x640Var;
        this.g = date;
    }

    @Override // a.a640
    public final Date a() {
        return this.g;
    }

    @Override // a.a640
    public final int b() {
        return this.c;
    }

    @Override // a.a640
    public final x640 d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n540)) {
            return false;
        }
        n540 n540Var = (n540) obj;
        return this.c == n540Var.c && this.d.equals(n540Var.d) && Intrinsics.d(this.e, n540Var.e) && this.f.equals(n540Var.f) && this.g.equals(n540Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + (Integer.hashCode(this.c) * 31)) * 31;
        ilf0 ilf0Var = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (ilf0Var == null ? 0 : ilf0Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "EventModel(id=" + this.c + ", event=" + this.d + ", replyMessageModel=" + this.e + ", status=" + this.f + ", createdAt=" + this.g + Separators.RPAREN;
    }
}
