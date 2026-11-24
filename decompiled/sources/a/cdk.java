package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cdk extends ock implements jhy, biy {
    public cdk() {
        super(rgy.k);
    }

    public abstract b0d0 A();

    public abstract rdk B();

    @Override // a.dre0
    public final bv9 G() {
        return null;
    }

    @Override // a.dre0
    public final ihy K() {
        return B().h;
    }

    @Override // a.dre0
    public final Object L() {
        return B().k;
    }

    @Override // a.jhy
    public final boolean isExternal() {
        return A().g;
    }

    @Override // a.jhy
    public final boolean isInfix() {
        A().getClass();
        return false;
    }

    @Override // a.jhy
    public final boolean isInline() {
        return A().j;
    }

    @Override // a.jhy
    public final boolean isOperator() {
        A().getClass();
        return false;
    }

    @Override // a.qgy
    public final boolean isSuspend() {
        A().getClass();
        return false;
    }
}
