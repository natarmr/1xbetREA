package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vqb0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37849a;
    public final boolean b;
    public final String c;

    public vqb0(String str, long j, boolean z) {
        this.f37849a = j;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqb0)) {
            return false;
        }
        vqb0 vqb0Var = (vqb0) obj;
        return this.f37849a == vqb0Var.f37849a && this.b == vqb0Var.b && this.c.equals(vqb0Var.c);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof vqb0) && (p6t0Var2 instanceof vqb0);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "POWER_OF_POWER_TIMER_KEY";
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(rw2.b(twn.a(R.drawable.ic_glyph_later, rw2.b(779701539, 31, 0L), 31), 31, this.f37849a), 31, this.b);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof vqb0) || !(p6t0Var2 instanceof vqb0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        vqb0 vqb0Var = (vqb0) p6t0Var;
        vqb0 vqb0Var2 = (vqb0) p6t0Var2;
        k9x.G(linkedHashSet, new rqb0(), new rqb0());
        k9x.G(linkedHashSet, new sqb0(vqb0Var.f37849a), new sqb0(vqb0Var2.f37849a));
        k9x.G(linkedHashSet, new tqb0(vqb0Var.b), new tqb0(vqb0Var2.b));
        k9x.G(linkedHashSet, new qqb0(vqb0Var.c), new qqb0(vqb0Var2.c));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strE = ua80.e(R.drawable.ic_glyph_later, "Icon(value=", Separators.RPAREN);
        String strH = axq.h(this.f37849a, "Time(value=", Separators.RPAREN);
        return ua80.m(b1j.n("PowerOfPowerTimerUiModel(key=POWER_OF_POWER_TIMER_KEY, id=0, icon=", strE, ", time=", strH, ", timerVisibility="), defpackage.c.d("TimerVisibility(value=", Separators.RPAREN, this.b), ", description=", kng0.l("Description(value=", this.c, Separators.RPAREN), Separators.RPAREN);
    }
}
