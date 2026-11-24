package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z9o0 implements p6t0, y640, tde0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44029a;
    public final CharSequence b;
    public final x640 c;
    public final Date d;

    public z9o0(int i, String str, x640 x640Var, Date date) {
        str.getClass();
        x640Var.getClass();
        this.f44029a = i;
        this.b = str;
        this.c = x640Var;
        this.d = date;
    }

    @Override // a.tde0
    public final int c() {
        return this.f44029a;
    }

    @Override // a.y640
    public final Date e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9o0)) {
            return false;
        }
        z9o0 z9o0Var = (z9o0) obj;
        return this.f44029a == z9o0Var.f44029a && Intrinsics.d(this.b, z9o0Var.b) && Intrinsics.d(this.c, z9o0Var.c) && this.d.equals(z9o0Var.d);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof z9o0) && (p6t0Var2 instanceof z9o0) && ((z9o0) p6t0Var).f44029a == ((z9o0) p6t0Var2).f44029a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f44029a) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return xun.f41520a;
    }

    public final String toString() {
        return "SystemMessageUIModel(id=" + this.f44029a + ", text=" + ((Object) this.b) + ", status=" + this.c + ", createdAt=" + this.d + Separators.RPAREN;
    }
}
