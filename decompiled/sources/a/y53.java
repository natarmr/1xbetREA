package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y53 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42029a = 1;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ mm40 d;
    public final /* synthetic */ int e;

    public /* synthetic */ y53(a4x a4xVar, Function2 function2, mm40 mm40Var, int i) {
        this.b = a4xVar;
        this.c = function2;
        this.d = mm40Var;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42029a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                xia0.C(x8x.L(this.e | 1), fetVar, this.b, this.d, this.c);
                break;
            default:
                vbw0.C(x8x.L(this.e | 1), fetVar, this.b, this.d, this.c);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ y53(mm40 mm40Var, a4x a4xVar, Function2 function2, int i) {
        this.d = mm40Var;
        this.b = a4xVar;
        this.c = function2;
        this.e = i;
    }
}
