package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzf0 extends yzf0 implements ger {
    private final int i;

    public zzf0(int i, yje yjeVar) {
        super(yjeVar);
        this.i = i;
    }

    @Override // a.ger
    public final int getArity() {
        return this.i;
    }

    @Override // a.zw5
    public final String toString() {
        return getCompletion() == null ? sre0.f32672a.i(this) : super.toString();
    }
}
