package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v5x0 implements yy3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36848a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v5x0(Object obj, byte b) {
        this.f36848a = b;
        this.b = obj;
    }

    @Override // a.yy3
    public final ig00 apply(Object obj) {
        byte b = this.f36848a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                l6x0 l6x0Var = (l6x0) obj2;
                int i = ((s2x0) obj).f31527a;
                if ((i == 29501 || i == 29537 || i == 29538 || i == 29539 || i == 29540 || i == 29541 || i == 29542 || i == 29543 || i == 29544) && !l6x0Var.g.l()) {
                    l6x0Var.b();
                }
                return n3x.b;
            case 1:
                glt0 glt0Var = (glt0) obj2;
                nxw0 nxw0Var = new nxw0(glt0Var, (y7x0) obj);
                fr40 fr40VarA = ((c1x0) glt0Var.b).a();
                trs0 trs0Var = new trs0(nxw0Var);
                fr40VarA.execute(trs0Var);
                return trs0Var;
            default:
                return hkb.J((ig00) ((i8x0) obj2).e.get());
        }
    }
}
