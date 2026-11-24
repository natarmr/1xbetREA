package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rm20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30726a;
    public final /* synthetic */ g680 b;

    public /* synthetic */ rm20(g680 g680Var, byte b) {
        this.f30726a = b;
        this.b = g680Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30726a) {
            case 0:
                b820 b820Var = (b820) obj2;
                ly6 ly6Var = b820Var.f2138a;
                return b820.a(b820Var, ly6.a(ly6Var, null, jur.a(ly6Var.d, new j43("", "", c0d.f3518a, false), null, 27), null, this.b, 87), null, null, null, null, null, null, false, false, false, false, false, 8190);
            default:
                b820 b820Var2 = (b820) obj2;
                ly6 ly6Var2 = b820Var2.f2138a;
                return b820.a(b820Var2, ly6.a(ly6Var2, null, jur.a(ly6Var2.d, new j43("", "", c0d.f3518a, false), null, 27), null, this.b, 87), null, null, null, null, null, null, false, false, false, false, false, 8190);
        }
    }
}
