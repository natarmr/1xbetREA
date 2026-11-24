package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kb3 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17993a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ kb3(ugd ugdVar, mm40 mm40Var, ugd ugdVar2, ugd ugdVar3, float f, vhv0 vhv0Var, kyq0 kyq0Var, int i) {
        this.f17993a = (byte) 0;
        this.e = ugdVar;
        this.b = mm40Var;
        this.f = ugdVar2;
        this.g = ugdVar3;
        this.c = f;
        this.h = vhv0Var;
        this.i = kyq0Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17993a;
        int i = this.d;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                ob3.a((ugd) obj7, this.b, (ugd) obj6, (ugd) obj5, this.c, (vhv0) obj4, (kyq0) obj3, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                sac.a(this.b, (l7m0) obj7, (String) obj6, this.c, (t33) obj5, (l7m0) obj4, (String) obj3, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                tke.u(this.b, (esm) obj7, this.c, (Function1) obj6, (Function0) obj5, (Function0) obj4, (xdr) obj3, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                x8f.w(this.b, (hsm) obj7, this.c, (Function1) obj6, (Function0) obj5, (Function0) obj4, (xdr) obj3, (fet) obj, iL4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(i | 1);
                saj.q(this.b, (ksm) obj7, this.c, (Function1) obj6, (Function0) obj5, (Function0) obj4, (xdr) obj3, (fet) obj, iL5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(i | 1);
                qjj.m(this.b, (nsm) obj7, this.c, (Function1) obj6, (Function0) obj5, (Function0) obj4, (xdr) obj3, (fet) obj, iL6);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL7 = x8x.L(i | 1);
                eeq.t(this.b, (qsm) obj7, this.c, (Function1) obj6, (Function0) obj5, (Function0) obj4, (xdr) obj3, (fet) obj, iL7);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ kb3(mm40 mm40Var, tsm tsmVar, float f, Function1 function1, Function0 function0, Function0 function2, xdr xdrVar, int i, byte b) {
        this.f17993a = b;
        this.b = mm40Var;
        this.e = tsmVar;
        this.c = f;
        this.f = function1;
        this.g = function0;
        this.h = function2;
        this.i = xdrVar;
        this.d = i;
    }

    public /* synthetic */ kb3(mm40 mm40Var, l7m0 l7m0Var, String str, float f, t33 t33Var, l7m0 l7m0Var2, String str2, int i) {
        this.f17993a = (byte) 1;
        this.b = mm40Var;
        this.e = l7m0Var;
        this.f = str;
        this.c = f;
        this.g = t33Var;
        this.h = l7m0Var2;
        this.i = str2;
        this.d = i;
    }
}
