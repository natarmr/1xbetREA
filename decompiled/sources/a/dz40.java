package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dz40 extends fz40 implements thy {
    @Override // a.op9
    public final qgy computeReflected() {
        return sre0.f32672a.e(this);
    }

    @Override // a.iiy
    public final fiy d() {
        return ((thy) getReflected()).d();
    }

    @Override // a.uhy
    public final shy e() {
        return ((thy) getReflected()).e();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
