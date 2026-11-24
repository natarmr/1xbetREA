package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ecg0 extends s2 {
    public int c;
    public int d;
    public final /* synthetic */ fcg0 e;

    public ecg0(fcg0 fcg0Var) {
        this.e = fcg0Var;
        this.c = fcg0Var.e;
        this.d = fcg0Var.d;
    }

    @Override // a.s2
    public final void a() {
        int i = this.c;
        if (i == 0) {
            this.f31478a = (byte) 2;
            return;
        }
        fcg0 fcg0Var = this.e;
        Object[] objArr = fcg0Var.b;
        int i2 = this.d;
        this.b = objArr[i2];
        this.f31478a = (byte) 1;
        this.d = (i2 + 1) % fcg0Var.c;
        this.c = i - 1;
    }
}
