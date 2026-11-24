package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class bp extends ahe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f2956a;
    public final Function2 b;
    public final Function2 c;
    public final Function2 d;
    public final xdr e;

    public bp(Function2 function2, p0z p0zVar, int i) {
        q8 q8Var = new q8((byte) 10);
        hhd hhdVar = new hhd((byte) 25);
        hhd hhdVar2 = new hhd((byte) 26);
        xdr ahdVar = (i & 16) != 0 ? new ahd((byte) 18) : p0zVar;
        this.f2956a = q8Var;
        this.b = hhdVar;
        this.c = function2;
        this.d = hhdVar2;
        this.e = ahdVar;
    }

    @Override // a.ahe0
    public final void a() {
        this.f2956a.invoke();
    }

    @Override // a.ahe0
    public final void b(int i, int i2) {
        this.b.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // a.ahe0
    public final void d(int i, int i2) {
        this.c.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // a.ahe0
    public final void e(int i, int i2) {
        this.e.F(Integer.valueOf(i), Integer.valueOf(i2), 1);
    }

    @Override // a.ahe0
    public final void f(int i, int i2) {
        this.d.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
