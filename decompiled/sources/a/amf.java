package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class amf implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1104a;
    public final long b;
    public final bpf c;
    public final boolean d;

    public amf(List list, long j, bpf bpfVar, boolean z) {
        this.f1104a = list;
        this.b = j;
        this.c = bpfVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amf)) {
            return false;
        }
        amf amfVar = (amf) obj;
        return this.f1104a.equals(amfVar.f1104a) && this.b == amfVar.b && this.c.equals(amfVar.c) && this.d == amfVar.d;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof amf) && (p6t0Var2 instanceof amf)) {
            return ((amf) p6t0Var).c.f2979a.equals(((amf) p6t0Var2).c.f2979a);
        }
        return false;
    }

    @Override // a.p6t0
    public final String getKey() {
        return "GAME_LOG_KEY";
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(R.drawable.cs2_bomb_bg, twn.a(R.drawable.cs2_bomb_ic, (this.c.hashCode() + rw2.b(dw9.a(1758972809, 31, this.f1104a), 31, this.b)) * 31, 31), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof amf) || !(p6t0Var2 instanceof amf)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        amf amfVar = (amf) p6t0Var;
        amf amfVar2 = (amf) p6t0Var2;
        k9x.G(linkedHashSet, new ylf(amfVar.f1104a), new ylf(amfVar2.f1104a));
        k9x.G(linkedHashSet, new xlf(amfVar.b), new xlf(amfVar2.b));
        k9x.G(linkedHashSet, new zlf(amfVar.c), new zlf(amfVar2.c));
        k9x.G(linkedHashSet, new wlf(), new wlf());
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strR = twn.r(this.f1104a, "GameLogItems(value=", Separators.RPAREN);
        String strH = axq.h(this.b, "BombTime(value=", Separators.RPAREN);
        String str = "MapMovement(value=" + this.c + Separators.RPAREN;
        String strE = ua80.e(R.drawable.cs2_bomb_bg, "BombBackGround(value=", Separators.RPAREN);
        StringBuilder sbN = b1j.n("Cs2GameLogUiModel(key=GAME_LOG_KEY, gameLogItems=", strR, ", bombTime=", strH, ", mapMovement=");
        twn.w(R.drawable.cs2_bomb_ic, str, ", bombIcon=", ", backgroundBomb=", sbN);
        return defpackage.c.c(strE, ", mapMovementEnable=", Separators.RPAREN, sbN, this.d);
    }
}
