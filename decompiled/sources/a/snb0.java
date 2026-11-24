package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class snb0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32486a;
    public final /* synthetic */ tnb0 b;

    public /* synthetic */ snb0(tnb0 tnb0Var, int i, byte b) {
        this.f32486a = b;
        this.b = tnb0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32486a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                zvw.l(this.b, fetVar, x8x.L(1));
                break;
            case 1:
                s0x.q(this.b, fetVar, x8x.L(1));
                break;
            default:
                fem0.f(this.b, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
