package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r5l0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29892a;
    public final /* synthetic */ d280 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ r5l0(d280 d280Var, String str, int i, byte b) {
        this.f29892a = b;
        this.b = d280Var;
        this.c = str;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29892a;
        int i = this.d;
        String str = this.c;
        d280 d280Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                d9x.j(d280Var, str, fetVar, x8x.L(i | 1));
                break;
            case 1:
                e9x.m(d280Var, str, fetVar, x8x.L(i | 1));
                break;
            case 2:
                k9x.g(d280Var, str, fetVar, x8x.L(i | 1));
                break;
            default:
                t9x.j(d280Var, str, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
