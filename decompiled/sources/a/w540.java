package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w540 extends a640 {
    public final int c;
    public final s540 d;
    public final ilf0 e;
    public final x640 f;
    public final Date g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w540(int i, s540 s540Var, ilf0 ilf0Var, x640 x640Var, Date date) {
        super(null, trt0.b);
        x640Var.getClass();
        this.c = i;
        this.d = s540Var;
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
        if (!(obj instanceof w540)) {
            return false;
        }
        w540 w540Var = (w540) obj;
        return this.c == w540Var.c && this.d.equals(w540Var.d) && Intrinsics.d(this.e, w540Var.e) && Intrinsics.d(this.f, w540Var.f) && this.g.equals(w540Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + (Integer.hashCode(this.c) * 31)) * 31;
        ilf0 ilf0Var = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (ilf0Var == null ? 0 : ilf0Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "SystemModel(id=" + this.c + ", action=" + this.d + ", replyMessageModel=" + this.e + ", status=" + this.f + ", createdAt=" + this.g + Separators.RPAREN;
    }
}
