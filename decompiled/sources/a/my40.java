package a;

/* JADX INFO: loaded from: classes2.dex */
public final class my40 extends oo20 implements nhy {
    public final vh90 d;
    public wb00 e;
    public final int f;

    public my40(vh90 vh90Var, Object obj, wb00 wb00Var) {
        super(obj, wb00Var.f38853a, (byte) 1);
        this.d = vh90Var;
        this.e = wb00Var;
        this.f = vh90Var.d.f;
    }

    @Override // a.oo20, java.util.Map.Entry
    public final Object getValue() {
        return this.e.f38853a;
    }

    @Override // a.oo20, java.util.Map.Entry
    public final Object setValue(Object obj) {
        wb00 wb00Var = this.e;
        Object obj2 = wb00Var.f38853a;
        wb00 wb00Var2 = new wb00(obj, wb00Var.b, wb00Var.c);
        this.e = wb00Var2;
        vh90 vh90Var = this.d;
        gh90 gh90Var = vh90Var.d;
        int i = gh90Var.f;
        int i2 = this.f;
        Object obj3 = this.b;
        if (i == i2) {
            vh90Var.f37419a = null;
            gh90Var.put(obj3, wb00Var2);
            return obj2;
        }
        if (gh90Var.containsKey(obj3)) {
            vh90Var.put(obj3, obj);
        }
        return obj2;
    }
}
