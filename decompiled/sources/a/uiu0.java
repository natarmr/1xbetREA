package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uiu0 implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ viu0 f35750a;
    public final /* synthetic */ xiu0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uiu0(viu0 viu0Var, xiu0 xiu0Var, Object obj) {
        this.f35750a = viu0Var;
        this.b = xiu0Var;
        this.c = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        viu0 viu0Var = this.f35750a;
        int i = viu0Var.c - 1;
        viu0Var.c = i;
        if (!viu0Var.d || i > 0) {
            return;
        }
        this.b.a().w(this.c);
    }
}
