package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hp20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13422a;
    public final /* synthetic */ jp20 b;

    public /* synthetic */ hp20(jp20 jp20Var, int i, byte b) {
        this.f13422a = b;
        this.b = jp20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13422a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                cfx0.p(this.b, fetVar, x8x.L(1));
                break;
            case 1:
                cfx0.k(this.b, fetVar, x8x.L(1));
                break;
            default:
                cfx0.v(this.b, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
