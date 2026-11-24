package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cfr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4277a;
    public final /* synthetic */ ofr0 b;

    public /* synthetic */ cfr0(ofr0 ofr0Var, byte b) {
        this.f4277a = b;
        this.b = ofr0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4277a;
        d1r0 d1r0Var = d1r0.f5324a;
        ofr0 ofr0Var = this.b;
        switch (b) {
            case 0:
                e3c.n(ofr0Var.r0);
                e3c.n(ofr0Var.s0);
                break;
            case 1:
                ofr0Var.H(new shq0((byte) 27));
                ofr0Var.Y(n8r0.b);
                ofr0Var.N();
                e3c.n(ofr0Var.q0);
                break;
            case 2:
                ofr0Var.V(new q0r0(d1r0Var, iun.f15405a));
                break;
            default:
                iun iunVar = iun.f15405a;
                ofr0Var.V(new n0r0(d1r0Var, iunVar));
                ofr0Var.V(new m0r0(d1r0Var, iunVar));
                break;
        }
        return Unit.f46060a;
    }
}
