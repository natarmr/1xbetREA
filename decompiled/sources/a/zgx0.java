package a;

/* JADX INFO: loaded from: classes2.dex */
public final class zgx0 extends ehx0 {
    public final /* synthetic */ ehx0 c;
    public final /* synthetic */ ehx0 d;

    public zgx0(ehx0 ehx0Var, ehx0 ehx0Var2) {
        this.c = ehx0Var;
        this.d = ehx0Var2;
    }

    @Override // a.ehx0
    public final void a() {
        ehx0 ehx0Var = this.d;
        try {
            this.c.a();
        } finally {
            ehx0Var.a();
        }
    }
}
