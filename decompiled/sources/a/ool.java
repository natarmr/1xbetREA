package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ool implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25600a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ool(long j, qol qolVar, mm40 mm40Var, tol tolVar, sol solVar, iol iolVar, Function0 function0, int i, int i2) {
        this.c = j;
        this.g = qolVar;
        this.b = mm40Var;
        this.h = tolVar;
        this.i = solVar;
        this.j = iolVar;
        this.d = function0;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25600a;
        int i = this.e;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                fxb.i(this.c, (qol) obj6, this.b, (tol) obj5, (sol) obj4, (iol) obj3, this.d, (fet) obj, iL, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                gkb.i(this.b, (vul) obj6, (wul) obj5, (wul) obj4, this.c, this.d, (Function0) obj3, (fet) obj, iL2, this.f);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ool(mm40 mm40Var, vul vulVar, wul wulVar, wul wulVar2, long j, Function0 function0, Function0 function1, int i, int i2) {
        this.b = mm40Var;
        this.g = vulVar;
        this.h = wulVar;
        this.i = wulVar2;
        this.c = j;
        this.d = function0;
        this.j = function1;
        this.e = i;
        this.f = i2;
    }
}
