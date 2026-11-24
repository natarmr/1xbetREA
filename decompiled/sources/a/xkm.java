package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xkm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41034a;
    public final /* synthetic */ imm b;

    public /* synthetic */ xkm(imm immVar, int i, byte b) {
        this.f41034a = b;
        this.b = immVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41034a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                hlm.f(this.b, fetVar, x8x.L(1));
                break;
            default:
                hlm.a(this.b, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
