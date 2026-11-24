package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ygg0 implements oz5, qde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bb10 f42582a;
    public final sz5 b;
    public dkj0 c;

    public ygg0(bb10 bb10Var, tz5 tz5Var, xgg0 xgg0Var) {
        this.f42582a = bb10Var;
        sz5 sz5VarF0 = xgg0Var.f40838a.f0();
        this.b = sz5VarF0;
        tz5Var.f(sz5VarF0);
        sz5VarF0.a(this);
    }

    public static int d(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // a.oz5
    public final void a() {
        this.f42582a.invalidateSelf();
    }

    @Override // a.qde
    public final void b(List list, List list2) {
    }
}
