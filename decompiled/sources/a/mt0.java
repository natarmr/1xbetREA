package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mt0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22347a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ nur c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ mt0(mm40 mm40Var, nur nurVar, boolean z, int i, byte b) {
        this.f22347a = b;
        this.b = mm40Var;
        this.c = nurVar;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22347a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ro4.h(this.b, this.c, this.d, fetVar, x8x.L(7));
                break;
            case 1:
                o2e.g(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            default:
                ohq0.f(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
