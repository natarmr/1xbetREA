package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class snl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32500a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ eol c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ snl(mm40 mm40Var, eol eolVar, Function1 function1, int i, byte b) {
        this.f32500a = b;
        this.b = mm40Var;
        this.c = eolVar;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32500a;
        int i = this.e;
        Function1 function1 = this.d;
        eol eolVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                dtb.k(mm40Var, eolVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 1:
                ntb.l(mm40Var, eolVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 2:
                vtb.r(mm40Var, eolVar, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                dub.v(mm40Var, eolVar, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
