package a;

/* JADX INFO: loaded from: classes2.dex */
public final class pdy extends t2 {
    public final yby f;
    public final int g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdy(vby vbyVar, yby ybyVar) {
        super(vbyVar, null);
        vbyVar.getClass();
        this.f = ybyVar;
        this.g = ybyVar.f42361a.size();
        this.h = -1;
    }

    @Override // a.t2
    public final mcy F(String str) {
        str.getClass();
        return (mcy) this.f.f42361a.get(Integer.parseInt(str));
    }

    @Override // a.t2
    public final String R(ugi0 ugi0Var, int i) {
        ugi0Var.getClass();
        return String.valueOf(i);
    }

    @Override // a.t2
    public final mcy T() {
        return this.f;
    }

    @Override // a.bld
    public final int f(ugi0 ugi0Var) {
        ugi0Var.getClass();
        int i = this.h;
        if (i >= this.g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.h = i2;
        return i2;
    }
}
