package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ob50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24961a;
    public final Object b;
    public final Map c;
    public final ugd d;

    /* JADX WARN: Illegal instructions before constructor call */
    public ob50(rb50 rb50Var, ugd ugdVar) {
        String str = rb50Var + Separators.COLON + sre0.f32672a.b(rb50Var.getClass());
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this(rb50Var, str, lunVar, ugdVar);
    }

    public final void a(int i, fet fetVar) {
        int i2;
        fetVar.g0(295512821);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            this.d.F(this.f24961a, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(this, i, b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ob50.class != obj.getClass()) {
            return false;
        }
        ob50 ob50Var = (ob50) obj;
        return Intrinsics.d(this.f24961a, ob50Var.f24961a) && Intrinsics.d(this.b, ob50Var.b) && Intrinsics.d(this.c, ob50Var.c) && this.d == ob50Var.d;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.b.hashCode() * 31) + (this.f24961a.hashCode() * 31);
    }

    public final String toString() {
        return "NavEntry(key=" + this.f24961a + ", contentKey=" + this.b + ", metadata=" + this.c + ", content=" + this.d + Separators.RPAREN;
    }

    public ob50(ob50 ob50Var, ugd ugdVar) {
        this(ob50Var.f24961a, ob50Var.b, ob50Var.c, ugdVar);
    }

    public ob50(Object obj, Object obj2, Map map, ugd ugdVar) {
        this.f24961a = obj;
        this.b = obj2;
        this.c = map;
        this.d = ugdVar;
    }
}
