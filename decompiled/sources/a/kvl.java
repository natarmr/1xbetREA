package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kvl implements mvl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18960a;
    public final tui0 b;
    public final pui0 c;
    public final pvi0 d;
    public final d4d e;
    public final tvi0 f;
    public final wui0 g;
    public final rqm h;

    public kvl(Object obj, tui0 tui0Var, oui0 oui0Var, pvi0 pvi0Var, wui0 wui0Var, int i) {
        oui0 oui0Var2 = (i & 4) != 0 ? null : oui0Var;
        pvi0 pvi0Var2 = (i & 8) != 0 ? null : pvi0Var;
        d4d d4dVar = d4d.BACKGROUND_CONTENT;
        wui0 wui0Var2 = (i & 64) != 0 ? wui0.f39793a : wui0Var;
        obj.getClass();
        this.f18960a = obj;
        this.b = tui0Var;
        this.c = oui0Var2;
        this.d = pvi0Var2;
        this.e = d4dVar;
        qvi0 qvi0Var = qvi0.f29388a;
        this.f = qvi0Var;
        this.g = wui0Var2;
        this.h = new rqm((vui0) tui0Var, (pui0) oui0Var2, pvi0Var2, d4dVar, (tvi0) qvi0Var, wui0Var2, true, (e900) null, 8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvl)) {
            return false;
        }
        kvl kvlVar = (kvl) obj;
        return Intrinsics.d(this.f18960a, kvlVar.f18960a) && this.b.equals(kvlVar.b) && Intrinsics.d(this.c, kvlVar.c) && Intrinsics.d(this.d, kvlVar.d) && this.e == kvlVar.e && this.f.equals(kvlVar.f) && this.g == kvlVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f18960a.hashCode() * 31)) * 31;
        pui0 pui0Var = this.c;
        int iHashCode2 = (iHashCode + (pui0Var == null ? 0 : pui0Var.hashCode())) * 31;
        pvi0 pvi0Var = this.d;
        return brm0.e(rw2.c(this.g, (this.f.hashCode() + dw9.b(this.e, (iHashCode2 + (pvi0Var != null ? pvi0Var.hashCode() : 0)) * 31, 31)) * 31, 31), 31, true);
    }

    public final String toString() {
        return "Long(id=" + this.f18960a + ", settingCellMiddleStyle=" + this.b + ", settingCellLeftStyle=" + this.c + ", settingCellRightStyle=" + this.d + ", backgroundColor=" + this.e + ", shape=" + this.f + ", position=" + this.g + ", enable=true, gradientBrush=null)";
    }
}
