package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class bpf implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2979a;
    public final String b;
    public final ArrayList c;
    public final jof d;
    public final short e;
    public final short f;
    public final float g;
    public final ArrayList h;

    /* JADX WARN: Multi-variable type inference failed */
    public bpf(String str, String str2, ArrayList arrayList, jof jofVar, int i, int i2, float f, ArrayList arrayList2) {
        this.f2979a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = jofVar;
        this.e = i;
        this.f = i2;
        this.g = f;
        this.h = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpf)) {
            return false;
        }
        bpf bpfVar = (bpf) obj;
        return this.f2979a.equals(bpfVar.f2979a) && this.b.equals(bpfVar.b) && this.c.equals(bpfVar.c) && this.d.equals(bpfVar.d) && this.e == bpfVar.e && this.f == bpfVar.f && Float.compare(this.g, bpfVar.g) == 0 && this.h.equals(bpfVar.h);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof bpf) && (p6t0Var2 instanceof bpf)) {
            return ((bpf) p6t0Var).f2979a.equals(((bpf) p6t0Var2).f2979a);
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.h.hashCode() + defpackage.c.a(twn.a(this.f, twn.a(this.e, (this.d.hashCode() + twn.g(this.c, ua80.b(this.f2979a.hashCode() * 31, 31, this.b), 31)) * 31, 31), 31), this.g, 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof bpf) || !(p6t0Var2 instanceof bpf)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        bpf bpfVar = (bpf) p6t0Var;
        bpf bpfVar2 = (bpf) p6t0Var2;
        k9x.G(linkedHashSet, new zof(bpfVar.b), new zof(bpfVar2.b));
        k9x.G(linkedHashSet, new apf(bpfVar.c), new apf(bpfVar2.c));
        k9x.G(linkedHashSet, new yof(bpfVar.d), new yof(bpfVar2.d));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("MapImage(value=", this.b, Separators.RPAREN);
        String strO = hne.o("Players(value=", Separators.RPAREN, this.c);
        String str = "Bomb(value=" + this.d + Separators.RPAREN;
        StringBuilder sbN = b1j.n("Cs2MapMovementUiModel(mapName=", this.f2979a, ", mapImage=", strL, ", players=");
        f140.v(sbN, strO, ", bomb=", str, ", mapOffsetX=");
        axq.r(this.e, this.f, ", mapOffsetY=", ", resolution=", sbN);
        sbN.append(this.g);
        sbN.append(", splits=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
