package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k820 {
    public static final List e = q3d.j(i2o.A, i2o.GameIsNotInLine, i2o.WrongGameBet);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mii0 f17853a;
    public final zr1 b;
    public final duj c;
    public final mh20 d;

    public k820(mii0 mii0Var, zr1 zr1Var, duj dujVar, mh20 mh20Var) {
        this.f17853a = mii0Var;
        this.b = zr1Var;
        this.c = dujVar;
        this.d = mh20Var;
    }

    public final void a(Throwable th) {
        th.getClass();
        this.c.b(th, new b120(this, (byte) 2));
    }
}
