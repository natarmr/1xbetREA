package a;

/* JADX INFO: loaded from: classes.dex */
public final class kov0 implements zkz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ glz f18649a;
    public final /* synthetic */ n5a b;
    public final /* synthetic */ nsr c;

    public kov0(glz glzVar, n5a n5aVar, nsr nsrVar) {
        lkz lkzVar = lkz.f20223a;
        this.f18649a = glzVar;
        this.b = n5aVar;
        this.c = nsrVar;
    }

    @Override // a.zkz
    public final void l(clz clzVar, kkz kkzVar) {
        Object g0g0Var;
        ikz ikzVar = kkz.Companion;
        lkz lkzVar = lkz.f20223a;
        ikzVar.getClass();
        kkz kkzVar2 = kkz.ON_RESUME;
        n5a n5aVar = this.b;
        glz glzVar = this.f18649a;
        if (kkzVar != kkzVar2) {
            if (kkzVar == kkz.ON_DESTROY) {
                glzVar.f(this);
                e0g0 e0g0Var = j0g0.b;
                n5aVar.resumeWith(new g0g0(new ukz(null, (byte) 0)));
                return;
            }
            return;
        }
        glzVar.f(this);
        nsr nsrVar = this.c;
        try {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = nsrVar.invoke();
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        n5aVar.resumeWith(g0g0Var);
    }
}
