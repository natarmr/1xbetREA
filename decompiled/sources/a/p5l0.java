package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p5l0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26409a;
    public final /* synthetic */ c280 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ p5l0(c280 c280Var, String str, int i, byte b) {
        this.f26409a = b;
        this.b = c280Var;
        this.c = str;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26409a;
        int i = this.d;
        String str = this.c;
        c280 c280Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                c9x.e(c280Var, str, fetVar, x8x.L(i | 1));
                break;
            case 1:
                w9x.f(c280Var, str, fetVar, x8x.L(i | 1));
                break;
            case 2:
                x9x.o(c280Var, str, fetVar, x8x.L(i | 1));
                break;
            case 3:
                kcx.k(c280Var, str, fetVar, x8x.L(i | 1));
                break;
            case 4:
                bdx.n(c280Var, str, fetVar, x8x.L(i | 1));
                break;
            default:
                idx.f(c280Var, str, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
