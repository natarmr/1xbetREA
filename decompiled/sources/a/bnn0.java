package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bnn0 extends zje implements ger {
    private final int arity;

    public bnn0(int i, yje yjeVar) {
        super(yjeVar);
        this.arity = i;
    }

    @Override // a.ger
    public int getArity() {
        return this.arity;
    }

    @Override // a.zw5
    public String toString() {
        return getCompletion() == null ? sre0.f32672a.i(this) : super.toString();
    }
}
