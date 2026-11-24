package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t6m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33424a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ int e;

    public /* synthetic */ t6m(mm40 mm40Var, a4x a4xVar, xcz xczVar, int i, byte b) {
        this.f33424a = b;
        this.b = mm40Var;
        this.c = a4xVar;
        this.d = xczVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33424a;
        int i = this.e;
        xcz xczVar = this.d;
        a4x a4xVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                sj3.v(mm40Var, a4xVar, xczVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                vbc.O(mm40Var, a4xVar, xczVar, fetVar, x8x.L(i | 1));
                break;
            case 2:
                xbc.F(mm40Var, a4xVar, xczVar, fetVar, x8x.L(i | 1));
                break;
            case 3:
                qcc.z(mm40Var, a4xVar, xczVar, fetVar, x8x.L(i | 1));
                break;
            case 4:
                vcc.t(mm40Var, a4xVar, xczVar, fetVar, x8x.L(i | 1));
                break;
            default:
                ro4.V(mm40Var, a4xVar, xczVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
