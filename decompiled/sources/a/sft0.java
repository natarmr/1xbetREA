package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class sft0 implements p6t0, y640, tde0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32132a;
    public final x640 b;
    public final Date c;

    public sft0(int i, x640 x640Var, Date date) {
        x640Var.getClass();
        this.f32132a = i;
        this.b = x640Var;
        this.c = date;
    }

    @Override // a.tde0
    public final int c() {
        return this.f32132a;
    }

    @Override // a.y640
    public final Date e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sft0)) {
            return false;
        }
        sft0 sft0Var = (sft0) obj;
        return this.f32132a == sft0Var.f32132a && Intrinsics.d(this.b, sft0Var.b) && this.c.equals(sft0Var.c);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof sft0) && (p6t0Var2 instanceof sft0) && ((sft0) p6t0Var).f32132a == ((sft0) p6t0Var2).f32132a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.f32132a) * 31)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return xun.f41520a;
    }

    public final String toString() {
        return "UnsupportedMessageUIModel(id=" + this.f32132a + ", status=" + this.b + ", createdAt=" + this.c + Separators.RPAREN;
    }
}
