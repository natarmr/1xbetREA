package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k0d0 extends m0d0 implements hiy {
    @Override // a.op9
    public final qgy computeReflected() {
        return sre0.f32672a.h(this);
    }

    @Override // a.iiy
    public final pdk d() {
        return ((hiy) getReflected()).d();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0d0) this).d().call(obj, obj2);
    }
}
