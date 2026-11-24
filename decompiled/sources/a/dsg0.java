package a;

/* JADX INFO: loaded from: classes.dex */
public final class dsg0 extends x2x {
    public float b = 0.0f;
    public final /* synthetic */ esg0 c;

    public dsg0(esg0 esg0Var) {
        this.c = esg0Var;
    }

    @Override // a.x2x
    public final void k0(String str) {
        this.b = ((csg0) this.c.c).d.measureText(str) + this.b;
    }
}
