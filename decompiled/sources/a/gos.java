package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gos implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11647a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ gos(a4x a4xVar, boolean z, int i, byte b) {
        this.f11647a = b;
        this.b = a4xVar;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11647a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                kkb.v(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                w7n0.b(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
