package a;

/* JADX INFO: loaded from: classes.dex */
public class vmk extends i7k {
    public int m;

    public vmk(hev0 hev0Var) {
        super(hev0Var);
        if (hev0Var instanceof cmw) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // a.i7k
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (d7k d7kVar : this.k) {
            d7kVar.a(d7kVar);
        }
    }
}
