package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tjl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34053a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ bkl c;
    public final /* synthetic */ int d;

    public /* synthetic */ tjl(mm40 mm40Var, bkl bklVar, int i, byte b) {
        this.f34053a = b;
        this.b = mm40Var;
        this.c = bklVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f34053a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                uc9.P(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 1:
                ny9.K(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 2:
                p8a.J(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            default:
                q8a.G(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
        }
        return Unit.f46060a;
    }
}
