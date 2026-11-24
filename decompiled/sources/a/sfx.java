package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class sfx extends lm40 implements hps0 {
    public vhv0 o;
    public vhv0 p;

    public sfx() {
        niq niqVar = i120.m;
        this.o = niqVar;
        this.p = niqVar;
    }

    @Override // a.lm40
    public void R0() {
        etm0.t(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new rfx(this, (byte) 1));
        a1();
    }

    @Override // a.lm40
    public void S0() {
        this.p = this.o;
        etm0.v(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new rfx(this, (byte) 0));
    }

    @Override // a.lm40
    public final void T0() {
        this.o = i120.m;
    }

    public void a1() {
        this.p = Z0(this.o);
        etm0.v(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new rfx(this, (byte) 0));
    }

    @Override // a.hps0
    public final Object j() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    public vhv0 Z0(vhv0 vhv0Var) {
        return vhv0Var;
    }
}
