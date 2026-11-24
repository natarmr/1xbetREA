package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class r450 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29821a = 1;
    public final /* synthetic */ tf40 b;
    public final /* synthetic */ Function1 c;

    public r450(tf40 tf40Var, Function1 function1) {
        this.b = tf40Var;
        this.c = function1;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29821a;
        tf40 tf40Var = this.b;
        Function1 function1 = this.c;
        switch (b) {
            case 0:
                function1.invoke(new i350(((jf40) tf40Var).f16407a));
                break;
            default:
                ozh ozhVar = ((gf40) tf40Var).f11190a;
                if (ozhVar instanceof kzh) {
                    function1.invoke(new m350(((kzh) ozhVar).o));
                } else if (ozhVar instanceof izh) {
                    izh izhVar = (izh) ozhVar;
                    if (izhVar.s == qll.GAMING) {
                        function1.invoke(new n350(izhVar.q, izhVar.t));
                    } else {
                        function1.invoke(o350.f24567a);
                    }
                } else {
                    function1.invoke(o350.f24567a);
                }
                break;
        }
        return Unit.f46060a;
    }

    public r450(Function1 function1, tf40 tf40Var) {
        this.c = function1;
        this.b = tf40Var;
    }
}
