package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h2i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12335a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ short f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h2i(mm40 mm40Var, int i, boolean z, Function0 function0, int i2, byte b) {
        this.f12335a = b;
        this.b = mm40Var;
        this.c = i;
        this.d = z;
        this.e = function0;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12335a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(this.f | 1);
                d5c.e(this.c, iL, (fet) obj, this.b, this.e, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(this.f | 1);
                ibc.i(this.c, iL2, (fet) obj, this.b, this.e, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(this.f | 1);
                vbc.q(this.c, iL3, (fet) obj, this.b, this.e, this.d);
                break;
        }
        return Unit.f46060a;
    }
}
