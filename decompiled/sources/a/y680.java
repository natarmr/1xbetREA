package a;

/* JADX INFO: loaded from: classes2.dex */
public final class y680 implements p5d0 {
    public static final hny c = new hny((byte) 20);
    public static final ogd d = new ogd(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public izj f42084a;
    public volatile p5d0 b;

    public y680(hny hnyVar, p5d0 p5d0Var) {
        this.f42084a = hnyVar;
        this.b = p5d0Var;
    }

    public final void a(izj izjVar) {
        p5d0 p5d0Var;
        p5d0 p5d0Var2;
        p5d0 p5d0Var3 = this.b;
        ogd ogdVar = d;
        if (p5d0Var3 != ogdVar) {
            izjVar.a(p5d0Var3);
            return;
        }
        synchronized (this) {
            p5d0Var = this.b;
            if (p5d0Var != ogdVar) {
                p5d0Var2 = p5d0Var;
            } else {
                this.f42084a = new uq((Object) this.f42084a, (Object) izjVar, (byte) 22);
                p5d0Var2 = null;
            }
        }
        if (p5d0Var2 != null) {
            izjVar.a(p5d0Var);
        }
    }

    @Override // a.p5d0
    public final Object get() {
        return this.b.get();
    }
}
