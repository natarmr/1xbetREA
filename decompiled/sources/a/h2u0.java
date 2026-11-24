package a;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class h2u0 extends sz5 {
    public final Object i;

    public h2u0(zn00 zn00Var, Object obj) {
        super(Collections.EMPTY_LIST);
        j(zn00Var);
        this.i = obj;
    }

    @Override // a.sz5
    public final float b() {
        return 1.0f;
    }

    @Override // a.sz5
    public final Object e() {
        zn00 zn00Var = this.e;
        Object obj = this.i;
        float f = this.d;
        return zn00Var.L0(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // a.sz5
    public final Object f(cmy cmyVar, float f) {
        return e();
    }

    @Override // a.sz5
    public final void h() {
        if (this.e != null) {
            super.h();
        }
    }

    @Override // a.sz5
    public final void i(float f) {
        this.d = f;
    }
}
