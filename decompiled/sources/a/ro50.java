package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ro50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30821a;
    public final /* synthetic */ float b;

    public /* synthetic */ ro50(float f, int i, byte b) {
        this.f30821a = b;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30821a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                lv00.k(this.b, fetVar, x8x.L(1));
                break;
            case 1:
                lv00.k(this.b, fetVar, x8x.L(1));
                break;
            case 2:
                k7x.d(this.b, fetVar, x8x.L(1));
                break;
            default:
                k7x.e(this.b, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
