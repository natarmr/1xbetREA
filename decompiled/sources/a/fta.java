package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fta implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10101a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ xcz c;
    public final /* synthetic */ int d;

    public /* synthetic */ fta(mm40 mm40Var, xcz xczVar, int i, byte b) {
        this.f10101a = b;
        this.b = mm40Var;
        this.c = xczVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10101a;
        int i = this.d;
        xcz xczVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                j120.k(mm40Var, xczVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                o050.i(mm40Var, xczVar, fetVar, x8x.L(i | 1));
                break;
            case 2:
                qcc.q(mm40Var, xczVar, fetVar, x8x.L(i | 1));
                break;
            default:
                qcc.p(mm40Var, xczVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
