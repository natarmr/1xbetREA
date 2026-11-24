package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class afr0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f792a;
    public final /* synthetic */ ofr0 b;

    public /* synthetic */ afr0(ofr0 ofr0Var, byte b) {
        this.f792a = b;
        this.b = ofr0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f792a;
        b1r0 b1r0Var = b1r0.f1823a;
        ofr0 ofr0Var = this.b;
        switch (b) {
            case 0:
                uk0 uk0Var = (uk0) obj;
                uk0Var.getClass();
                if (uk0Var.j) {
                    c4m0 c4m0Var = ofr0Var.E0;
                    if (c4m0Var != null) {
                        e3c.n(c4m0Var);
                    }
                    ofr0Var.R();
                }
                break;
            case 1:
                ((Throwable) obj).getClass();
                ofr0Var.V(new t0r0(b1r0Var, iun.f15405a));
                break;
            case 2:
                ((Throwable) obj).getClass();
                ofr0Var.V(new s0r0(b1r0Var, iun.f15405a));
                break;
            case 3:
                ((Throwable) obj).getClass();
                ofr0Var.V(new r0r0(b1r0Var, iun.f15405a));
                break;
            case 4:
                Throwable th = (Throwable) obj;
                th.getClass();
                ofr0Var.k0.b(th, new p6r0(ofr0Var, (byte) 6));
                break;
            case 5:
                ((Throwable) obj).getClass();
                ofr0Var.V(new g0r0(b1r0Var, iun.f15405a));
                break;
            case 6:
                ((Throwable) obj).getClass();
                ofr0Var.V(new h0r0(b1r0Var));
                break;
            default:
                ((Throwable) obj).getClass();
                ofr0Var.V(new l0r0(b1r0Var, iun.f15405a));
                break;
        }
        return Unit.f46060a;
    }
}
