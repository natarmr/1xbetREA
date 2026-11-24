package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vs10 extends lne {
    @Override // a.lne
    public String toString() {
        vs10 vs10VarX;
        String str;
        rwj rwjVar = tvk.f34603a;
        vs10 vs10Var = ys10.f43147a;
        if (this == vs10Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                vs10VarX = vs10Var.x();
            } catch (UnsupportedOperationException unused) {
                vs10VarX = null;
            }
            str = this == vs10VarX ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + qjj.R(this);
    }

    @Override // a.lne
    public lne w(int i) {
        g7x.x(i);
        return this;
    }

    public vs10 x() {
        return this;
    }
}
