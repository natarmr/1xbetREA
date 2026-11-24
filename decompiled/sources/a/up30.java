package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class up30 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36044a;
    public final /* synthetic */ ilp b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ up30(ilp ilpVar, boolean z, boolean z2, Function1 function1, int i, byte b) {
        this.f36044a = b;
        this.b = ilpVar;
        this.c = z;
        this.d = z2;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36044a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                uc9.K(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                ny9.G(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
