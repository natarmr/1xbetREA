package a;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class eqg0 extends drg0 implements brg0 {
    public ArrayList h = new ArrayList();
    public Boolean i;
    public Matrix j;
    public int k;
    public String l;

    @Override // a.brg0
    public final void g(frg0 frg0Var) throws fsg0 {
        if (frg0Var instanceof wqg0) {
            this.h.add(frg0Var);
            return;
        }
        throw new fsg0("Gradient elements cannot contain " + frg0Var + " elements.");
    }

    @Override // a.brg0
    public final List getChildren() {
        return this.h;
    }
}
