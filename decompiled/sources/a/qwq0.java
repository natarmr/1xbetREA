package a;

/* JADX INFO: loaded from: classes.dex */
public final class qwq0 extends dku0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f29446a = false;
    public final /* synthetic */ byte b;
    public final /* synthetic */ rwq0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public qwq0(rwq0 rwq0Var, int i) {
        this.c = rwq0Var;
        this.b = i;
    }

    @Override // a.dku0, a.cku0
    public final void a() {
        this.f29446a = true;
    }

    @Override // a.cku0
    public final void onAnimationEnd() {
        if (this.f29446a) {
            return;
        }
        this.c.f31228a.setVisibility(this.b);
    }

    @Override // a.dku0, a.cku0
    public final void onAnimationStart() {
        this.c.f31228a.setVisibility(0);
    }
}
