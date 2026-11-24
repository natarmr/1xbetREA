package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class c7q0 implements bch0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bch0 f3877a;
    public final zbk b;
    public final zbk c;

    public c7q0(bch0 bch0Var, final d7q0 d7q0Var) {
        this.f3877a = bch0Var;
        final byte b = 0;
        this.b = jgk0.b(new Function0() { // from class: a.b7q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                d7q0 d7q0Var2 = d7q0Var;
                switch (b2) {
                    case 0:
                        return Boolean.valueOf(d7q0Var2.f5606a.l() < d7q0Var2.b.l());
                    default:
                        return Boolean.valueOf(d7q0Var2.f5606a.l() > 0.0f);
                }
            }
        });
        final byte b2 = 1;
        this.c = jgk0.b(new Function0() { // from class: a.b7q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                d7q0 d7q0Var2 = d7q0Var;
                switch (b3) {
                    case 0:
                        return Boolean.valueOf(d7q0Var2.f5606a.l() < d7q0Var2.b.l());
                    default:
                        return Boolean.valueOf(d7q0Var2.f5606a.l() > 0.0f);
                }
            }
        });
    }

    @Override // a.bch0
    public final boolean a() {
        return this.f3877a.a();
    }

    @Override // a.bch0
    public final Object b(c050 c050Var, Function2 function2, yje yjeVar) {
        return this.f3877a.b(c050Var, function2, yjeVar);
    }

    @Override // a.bch0
    public final boolean c() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // a.bch0
    public final boolean d() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // a.bch0
    public final float e(float f) {
        return this.f3877a.e(f);
    }
}
