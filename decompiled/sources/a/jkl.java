package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jkl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16675a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ okl c;
    public final /* synthetic */ int d;

    public /* synthetic */ jkl(mm40 mm40Var, okl oklVar, int i, byte b) {
        this.f16675a = b;
        this.b = mm40Var;
        this.c = oklVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16675a;
        int i = this.d;
        okl oklVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                zgc.u(mm40Var, oklVar, fetVar, x8x.L(i | 1));
                break;
            default:
                zgc.v(mm40Var, oklVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
