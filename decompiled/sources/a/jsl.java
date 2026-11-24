package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jsl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17058a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ssl c;
    public final /* synthetic */ int d;

    public /* synthetic */ jsl(mm40 mm40Var, ssl sslVar, int i, byte b) {
        this.f17058a = b;
        this.b = mm40Var;
        this.c = sslVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17058a;
        int i = this.d;
        ssl sslVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                lgb.D(mm40Var, sslVar, fetVar, x8x.L(i | 1));
                break;
            default:
                lgb.b(mm40Var, sslVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
