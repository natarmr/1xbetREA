package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class aw20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final urv f1552a;
    public final sw20 b;
    public final i0d c;
    public final s4d d;
    public final qy20 e;
    public final t730 f;

    public aw20(urv urvVar, sw20 sw20Var, i0d i0dVar, s4d s4dVar, qy20 qy20Var, t730 t730Var) {
        urvVar.getClass();
        sw20Var.getClass();
        i0dVar.getClass();
        s4dVar.getClass();
        this.f1552a = urvVar;
        this.b = sw20Var;
        this.c = i0dVar;
        this.d = s4dVar;
        this.e = qy20Var;
        this.f = t730Var;
    }

    public static aw20 a(aw20 aw20Var, urv urvVar, sw20 sw20Var, i0d i0dVar, s4d s4dVar, qy20 qy20Var, t730 t730Var, int i) {
        if ((i & 1) != 0) {
            urvVar = aw20Var.f1552a;
        }
        urv urvVar2 = urvVar;
        if ((i & 2) != 0) {
            sw20Var = aw20Var.b;
        }
        sw20 sw20Var2 = sw20Var;
        if ((i & 4) != 0) {
            i0dVar = aw20Var.c;
        }
        i0d i0dVar2 = i0dVar;
        if ((i & 8) != 0) {
            s4dVar = aw20Var.d;
        }
        s4d s4dVar2 = s4dVar;
        if ((i & 16) != 0) {
            qy20Var = aw20Var.e;
        }
        qy20 qy20Var2 = qy20Var;
        if ((i & 32) != 0) {
            t730Var = aw20Var.f;
        }
        aw20Var.getClass();
        urvVar2.getClass();
        sw20Var2.getClass();
        i0dVar2.getClass();
        s4dVar2.getClass();
        return new aw20(urvVar2, sw20Var2, i0dVar2, s4dVar2, qy20Var2, t730Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw20)) {
            return false;
        }
        aw20 aw20Var = (aw20) obj;
        return this.f1552a == aw20Var.f1552a && this.b == aw20Var.b && this.c == aw20Var.c && this.d == aw20Var.d && this.e == aw20Var.e && this.f == aw20Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f1552a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MarketPropertiesModel(headerSize=" + this.f1552a + ", marketSize=" + this.b + ", coefficientSize=" + this.c + ", colorScheme=" + this.d + ", marketsArrangement=" + this.e + ", marketsStyleType=" + this.f + Separators.RPAREN;
    }
}
