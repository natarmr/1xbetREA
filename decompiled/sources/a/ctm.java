package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ctm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4944a = 2;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ boolean j;

    public /* synthetic */ ctm(mm40 mm40Var, fue fueVar, String str, boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, int i) {
        this.b = mm40Var;
        this.d = fueVar;
        this.c = str;
        this.j = z;
        this.g = function0;
        this.h = function1;
        this.e = function2;
        this.f = function3;
        this.i = function4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4944a;
        Object obj3 = this.i;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.d;
        switch (b) {
            case 0:
                a4x a4xVar = (a4x) obj5;
                kpm kpmVar = (kpm) obj3;
                String str = (String) obj8;
                String str2 = (String) obj7;
                String str3 = (String) obj6;
                a4x a4xVar2 = (a4x) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                    mm40 mm40VarJ = s5x0.J(o7k0.d(this.b, 1.0f), 8.0f);
                    thg0 thg0VarA = shg0.a(qw3Var, gqw0.j, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    zhg0 zhg0Var = zhg0.f44392a;
                    jm40 jm40Var = jm40.b;
                    hkb.v(zhg0Var.a(1.0f, jm40Var, true), this.c, a4xVar, true, fetVar, 3072);
                    hkb.a(0, kpmVar, fetVar, zhg0Var.a(1.0f, jm40Var, true), str, str2, this.j);
                    hkb.v(zhg0Var.a(1.0f, jm40Var, true), str3, a4xVar2, false, fetVar, 3072);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                uzb.H(this.b, this.c, (String) obj8, (a4x) obj5, (a4x) obj4, (String) obj7, (String) obj6, (kpm) obj3, this.j, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                acb.r(this.b, (fue) obj8, this.c, this.j, (Function0) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ctm(mm40 mm40Var, String str, a4x a4xVar, kpm kpmVar, String str2, String str3, boolean z, String str4, a4x a4xVar2) {
        this.b = mm40Var;
        this.c = str;
        this.e = a4xVar;
        this.i = kpmVar;
        this.d = str2;
        this.g = str3;
        this.j = z;
        this.h = str4;
        this.f = a4xVar2;
    }

    public /* synthetic */ ctm(mm40 mm40Var, String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, kpm kpmVar, boolean z, int i) {
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = a4xVar;
        this.f = a4xVar2;
        this.g = str3;
        this.h = str4;
        this.i = kpmVar;
        this.j = z;
    }
}
