package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m9x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21433a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m9x(mie0 mie0Var, float f, z63 z63Var, l73 l73Var, Function1 function1) {
        this.d = mie0Var;
        this.b = f;
        this.e = z63Var;
        this.f = l73Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f21433a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((pjs) ((l7m0) obj4).getValue()).g;
                v1x v1xVar = new v1x((byte) 10);
                hczVar.f(a4xVar.size(), new d2p(v1xVar, a4xVar, (byte) 26), new ubn(a4xVar, (byte) 7), new ugd(2039820996, true, new d7s(a4xVar, (Function2) obj3, this.c, (Function1) obj2, this.b)));
                break;
            case 1:
                long jLongValue = ((Long) obj).longValue();
                Object obj5 = ((mie0) obj4).f21842a;
                obj5.getClass();
                hhm0.t((i73) obj5, jLongValue, this.b, (z63) obj3, (l73) obj2, this.c);
                break;
            default:
                List list = (List) obj4;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                List listE = xdx.E(list, new meo0((byte) 2));
                hczVar2.f(list.size(), new adn0(listE, (byte) 5), new adn0(list, (byte) 6), new ugd(-1311333631, true, new d7s(list, this.c, this.b, (a4x) obj3, (ucr0) obj2)));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ m9x(l7m0 l7m0Var, Function2 function2, Function1 function1, Function1 function3, float f) {
        this.d = l7m0Var;
        this.e = function2;
        this.c = function1;
        this.f = function3;
        this.b = f;
    }

    public /* synthetic */ m9x(List list, Function1 function1, float f, a4x a4xVar, ucr0 ucr0Var) {
        this.d = list;
        this.c = function1;
        this.b = f;
        this.e = a4xVar;
        this.f = ucr0Var;
    }
}
