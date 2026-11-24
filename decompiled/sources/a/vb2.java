package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vb2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37119a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ mtl c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ vb2(mm40 mm40Var, mtl mtlVar, Function1 function1, int i, byte b) {
        this.f37119a = b;
        this.b = mm40Var;
        this.c = mtlVar;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37119a;
        int i = this.e;
        Function1 function1 = this.d;
        mtl mtlVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                cfx0.b(mm40Var, mtlVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 1:
                cy2.b(mm40Var, mtlVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 2:
                o050.f(mm40Var, mtlVar, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                x4d0.j(mm40Var, mtlVar, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
