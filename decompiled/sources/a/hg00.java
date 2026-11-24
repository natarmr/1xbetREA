package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hg00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12995a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ r020 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ hg00(mm40 mm40Var, r020 r020Var, boolean z, Function1 function1, int i, byte b) {
        this.f12995a = b;
        this.b = mm40Var;
        this.c = r020Var;
        this.d = z;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12995a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(7);
                j0x.e(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(7);
                wgm0.i(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
