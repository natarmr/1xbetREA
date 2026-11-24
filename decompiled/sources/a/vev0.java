package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vev0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37303a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;

    public /* synthetic */ vev0(mm40 mm40Var, int i, byte b) {
        this.f37303a = b;
        this.b = mm40Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37303a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                k5n0.o(x8x.L(this.c | 1), fetVar, this.b);
                break;
            default:
                jeb.n(x8x.L(this.c | 1), fetVar, this.b);
                break;
        }
        return Unit.f46060a;
    }
}
