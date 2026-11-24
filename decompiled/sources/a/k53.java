package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k53 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17699a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ k53(kwj kwjVar, int i, i4 i4Var, pv40 pv40Var, aig aigVar, int i2) {
        this.f17699a = (byte) 2;
        this.b = kwjVar;
        this.c = i;
        this.e = i4Var;
        this.f = pv40Var;
        this.g = aigVar;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17699a;
        int i = this.d;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                nia0.h((mm40) obj6, (p53) obj5, (t6k) obj4, this.c, (Function0) obj3, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                ffb0.e((mm40) obj6, (fop0) obj5, (a4x) obj4, this.c, (Function1) obj3, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                xbc.h((kwj) obj6, this.c, (i4) obj5, (pv40) obj4, (aig) obj3, (fet) obj, iL3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                bww.h((mm40) obj6, (a4x) obj5, this.c, (gna0) obj4, (Function1) obj3, (fet) obj, iL4);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ k53(byte b, int i, int i2, wdr wdrVar, mm40 mm40Var, Object obj, Object obj2) {
        this.f17699a = b;
        this.b = mm40Var;
        this.e = obj;
        this.f = obj2;
        this.c = i;
        this.g = wdrVar;
        this.d = i2;
    }

    public /* synthetic */ k53(mm40 mm40Var, a4x a4xVar, int i, gna0 gna0Var, Function1 function1, int i2) {
        this.f17699a = (byte) 3;
        this.b = mm40Var;
        this.e = a4xVar;
        this.c = i;
        this.f = gna0Var;
        this.g = function1;
        this.d = i2;
    }
}
