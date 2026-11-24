package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uwy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36414a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ gk00 c;
    public final /* synthetic */ int d;

    public /* synthetic */ uwy(mm40 mm40Var, gk00 gk00Var, int i, byte b) {
        this.f36414a = b;
        this.b = mm40Var;
        this.c = gk00Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36414a;
        int i = this.d;
        gk00 gk00Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                x8f.N(mm40Var, gk00Var, fetVar, x8x.L(i | 1));
                break;
            case 1:
                kc5.y0(mm40Var, gk00Var, fetVar, x8x.L(i | 1));
                break;
            case 2:
                dj8.M(mm40Var, gk00Var, fetVar, x8x.L(i | 1));
                break;
            default:
                j47.l0(mm40Var, gk00Var, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
