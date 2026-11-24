package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class guy implements ger, Serializable {
    private final int arity;

    public guy(int i) {
        this.arity = i;
    }

    @Override // a.ger
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strJ = sre0.f32672a.j(this);
        strJ.getClass();
        return strJ;
    }
}
