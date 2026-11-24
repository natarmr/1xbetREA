package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ugv implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35644a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ ugv(mm40 mm40Var, pz40 pz40Var, Function1 function1, byte b) {
        this.f35644a = b;
        this.b = mm40Var;
        this.c = pz40Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35644a;
        byte b2 = 2;
        Function1 function1 = this.d;
        pz40 pz40Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                vic.n(mm40Var, pz40Var, function1, fetVar, x8x.L(7));
                break;
            case 1:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    kr00.a(u1c.M(-1251262001, new ugv(mm40Var, pz40Var, function1, b2), fetVar), fetVar, 6);
                } else {
                    fetVar.X();
                }
                break;
            case 2:
                int iIntValue2 = num.intValue();
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                    mm40 mm40VarB = hp4.B(mm40Var);
                    x5d x5dVarA = w5d.a(qw3Var, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarB);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    fetVar.e0(318287844);
                    Iterator it = ((Iterable) pz40Var.getValue()).iterator();
                    while (it.hasNext()) {
                        gzy.a(null, (hzy) it.next(), function1, fetVar, 0);
                    }
                    fetVar.r(false);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 3:
                num.getClass();
                w9x.h(mm40Var, pz40Var, function1, fetVar, x8x.L(1));
                break;
            case 4:
                num.getClass();
                jtm0.i(mm40Var, pz40Var, function1, fetVar, x8x.L(1));
                break;
            default:
                num.getClass();
                ktt0.f(mm40Var, pz40Var, function1, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ugv(mm40 mm40Var, pz40 pz40Var, Function1 function1, int i, byte b) {
        this.f35644a = b;
        this.b = mm40Var;
        this.c = pz40Var;
        this.d = function1;
    }
}
