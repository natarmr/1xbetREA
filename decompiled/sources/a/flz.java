package a;

/* JADX INFO: loaded from: classes.dex */
public final class flz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public lkz f9760a;
    public zkz b;

    public final void a(clz clzVar, kkz kkzVar) {
        lkz lkzVarA = kkzVar.a();
        lkz lkzVar = this.f9760a;
        if (lkzVarA.compareTo(lkzVar) < 0) {
            lkzVar = lkzVarA;
        }
        this.f9760a = lkzVar;
        this.b.l(clzVar, kkzVar);
        this.f9760a = lkzVarA;
    }
}
