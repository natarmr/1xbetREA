package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xgx implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40861a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ygx c;
    public final /* synthetic */ xdr d;
    public final /* synthetic */ int e;

    public /* synthetic */ xgx(mm40 mm40Var, ygx ygxVar, xdr xdrVar, int i, byte b) {
        this.f40861a = b;
        this.b = mm40Var;
        this.c = ygxVar;
        this.d = xdrVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40861a;
        int i = this.e;
        xdr xdrVar = this.d;
        ygx ygxVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qxw.b(mm40Var, ygxVar, xdrVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                piz.e(mm40Var, ygxVar, xdrVar, fetVar, x8x.L(i | 1));
                break;
            case 2:
                azw.d(mm40Var, ygxVar, xdrVar, fetVar, x8x.L(i | 1));
                break;
            default:
                pzw.g(mm40Var, ygxVar, xdrVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
