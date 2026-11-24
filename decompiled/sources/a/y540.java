package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y540 extends a640 {
    public final int c;
    public final ilf0 d;
    public final x640 e;
    public final Date f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y540(int i, ilf0 ilf0Var, x640 x640Var, Date date) {
        super(null, new wrt0("default"));
        x640Var.getClass();
        this.c = i;
        this.d = ilf0Var;
        this.e = x640Var;
        this.f = date;
    }

    @Override // a.a640
    public final Date a() {
        return this.f;
    }

    @Override // a.a640
    public final int b() {
        return this.c;
    }

    @Override // a.a640
    public final x640 d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y540)) {
            return false;
        }
        y540 y540Var = (y540) obj;
        return this.c == y540Var.c && Intrinsics.d(this.d, y540Var.d) && Intrinsics.d(this.e, y540Var.e) && this.f.equals(y540Var.f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.c) * 31;
        ilf0 ilf0Var = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (ilf0Var == null ? 0 : ilf0Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Unsupported(id=" + this.c + ", replyMessageModel=" + this.d + ", status=" + this.e + ", createdAt=" + this.f + Separators.RPAREN;
    }
}
