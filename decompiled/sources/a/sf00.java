package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sf00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32096a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ zdm0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;

    public /* synthetic */ sf00(mm40 mm40Var, zdm0 zdm0Var, boolean z, int i, byte b) {
        this.f32096a = b;
        this.b = mm40Var;
        this.c = zdm0Var;
        this.d = z;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32096a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                yyw.j(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            case 1:
                ucx.z(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            default:
                hfm0.h(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
        }
        return Unit.f46060a;
    }
}
