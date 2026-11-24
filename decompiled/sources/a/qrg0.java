package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class qrg0 extends arg0 {
    @Override // a.arg0, a.brg0
    public final void g(frg0 frg0Var) throws fsg0 {
        if (frg0Var instanceof prg0) {
            this.i.add(frg0Var);
            return;
        }
        throw new fsg0("Text content elements cannot contain " + frg0Var + " elements.");
    }
}
