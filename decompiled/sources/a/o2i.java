package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o2i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24530a;
    public final /* synthetic */ l0x b;
    public final /* synthetic */ y3d c;

    public /* synthetic */ o2i(l0x l0xVar, y3d y3dVar, int i, byte b) {
        this.f24530a = b;
        this.b = l0xVar;
        this.c = y3dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24530a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                sac.j(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                ebc.k(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
