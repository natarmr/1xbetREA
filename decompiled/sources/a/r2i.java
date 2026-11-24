package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r2i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29734a;
    public final /* synthetic */ m0x b;
    public final /* synthetic */ y3d c;

    public /* synthetic */ r2i(m0x m0xVar, y3d y3dVar, int i, byte b) {
        this.f29734a = b;
        this.b = m0xVar;
        this.c = y3dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29734a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                sac.k(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                ebc.l(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
