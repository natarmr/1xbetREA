package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class rb9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30173a;
    public final kb9 b;
    public final List c;
    public final String d;

    public rb9(long j, kb9 kb9Var, List list, String str) {
        list.getClass();
        this.f30173a = j;
        this.b = kb9Var;
        this.c = list;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb9)) {
            return false;
        }
        rb9 rb9Var = (rb9) obj;
        return this.f30173a == rb9Var.f30173a && this.b.equals(rb9Var.b) && Intrinsics.d(this.c, rb9Var.c) && this.d.equals(rb9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a((this.b.hashCode() + (Long.hashCode(this.f30173a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "BuilderCouponGameModel(gameId=" + this.f30173a + ", key=" + this.b + ", events=" + this.c + ", gameTypeName=" + this.d + Separators.RPAREN;
    }
}
