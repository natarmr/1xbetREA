package a;

/* JADX INFO: loaded from: classes.dex */
public final class uh00 extends vh00 implements zkz {
    public final clz e;
    public final /* synthetic */ wh00 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh00(wh00 wh00Var, clz clzVar, ee60 ee60Var) {
        super(wh00Var, ee60Var);
        this.f = wh00Var;
        this.e = clzVar;
    }

    @Override // a.vh00
    public final void b() {
        this.e.x().f(this);
    }

    @Override // a.vh00
    public final boolean c(clz clzVar) {
        return this.e == clzVar;
    }

    @Override // a.vh00
    public final boolean d() {
        return this.e.x().i.compareTo(lkz.d) >= 0;
    }

    @Override // a.zkz
    public final void l(clz clzVar, kkz kkzVar) {
        clz clzVar2 = this.e;
        lkz lkzVar = clzVar2.x().i;
        if (lkzVar == lkz.f20223a) {
            this.f.j(this.f37409a);
            return;
        }
        lkz lkzVar2 = null;
        while (lkzVar2 != lkzVar) {
            a(d());
            lkzVar2 = lkzVar;
            lkzVar = clzVar2.x().i;
        }
    }
}
