package a;

/* JADX INFO: loaded from: classes.dex */
public final class aku0 extends dku0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1040a = false;
    public int b = 0;
    public final /* synthetic */ bku0 c;

    public aku0(bku0 bku0Var) {
        this.c = bku0Var;
    }

    @Override // a.cku0
    public final void onAnimationEnd() {
        int i = this.b + 1;
        this.b = i;
        bku0 bku0Var = this.c;
        if (i == bku0Var.f2767a.size()) {
            cku0 cku0Var = bku0Var.d;
            if (cku0Var != null) {
                cku0Var.onAnimationEnd();
            }
            this.b = 0;
            this.f1040a = false;
            bku0Var.e = false;
        }
    }

    @Override // a.dku0, a.cku0
    public final void onAnimationStart() {
        if (this.f1040a) {
            return;
        }
        this.f1040a = true;
        cku0 cku0Var = this.c.d;
        if (cku0Var != null) {
            cku0Var.onAnimationStart();
        }
    }
}
