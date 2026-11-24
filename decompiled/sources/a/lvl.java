package a;

/* JADX INFO: loaded from: classes6.dex */
public final class lvl implements mvl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20719a;
    public final tui0 b;
    public final mvi0 c;
    public final tvi0 d;
    public final wui0 e;
    public final rqm f;

    public lvl(String str, tui0 tui0Var, mvi0 mvi0Var) {
        wui0 wui0Var = wui0.f39793a;
        this.f20719a = str;
        this.b = tui0Var;
        this.c = mvi0Var;
        qvi0 qvi0Var = qvi0.f29388a;
        this.d = qvi0Var;
        this.e = wui0Var;
        this.f = new rqm((vui0) tui0Var, (pui0) null, (pvi0) mvi0Var, d4d.BACKGROUND, (tvi0) qvi0Var, wui0Var, true, (e900) null, 8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvl)) {
            return false;
        }
        lvl lvlVar = (lvl) obj;
        return this.f20719a.equals(lvlVar.f20719a) && this.b.equals(lvlVar.b) && this.c.equals(lvlVar.c) && this.d.equals(lvlVar.d) && this.e == lvlVar.e;
    }

    public final int hashCode() {
        return brm0.e(rw2.c(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f20719a.hashCode() * 31)) * 961)) * 31)) * 31, 31), 31, true);
    }

    public final String toString() {
        return "Short(id=" + ((Object) this.f20719a) + ", settingCellMiddleStyle=" + this.b + ", settingCellLeftStyle=null, settingCellRightStyle=" + this.c + ", shape=" + this.d + ", position=" + this.e + ", enable=true, gradientBrush=null)";
    }
}
