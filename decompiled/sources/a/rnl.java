package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rnl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30793a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ eol c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ rnl(mm40 mm40Var, eol eolVar, Function0 function0, int i, byte b) {
        this.f30793a = b;
        this.b = mm40Var;
        this.c = eolVar;
        this.d = function0;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30793a;
        int i = this.e;
        Function0 function0 = this.d;
        eol eolVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                dtb.g(mm40Var, eolVar, function0, fetVar, x8x.L(i | 1));
                break;
            case 1:
                dtb.i(mm40Var, eolVar, function0, fetVar, x8x.L(i | 1));
                break;
            case 2:
                ntb.j(mm40Var, eolVar, function0, fetVar, x8x.L(i | 1));
                break;
            case 3:
                ntb.h(mm40Var, eolVar, function0, fetVar, x8x.L(i | 1));
                break;
            case 4:
                vtb.p(mm40Var, eolVar, function0, fetVar, x8x.L(i | 1));
                break;
            case 5:
                vtb.n(mm40Var, eolVar, function0, fetVar, x8x.L(i | 1));
                break;
            case 6:
                dub.r(mm40Var, eolVar, function0, fetVar, x8x.L(i | 1));
                break;
            default:
                dub.t(mm40Var, eolVar, function0, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
