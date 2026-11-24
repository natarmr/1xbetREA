package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qg5 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28666a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qg5(mm40 mm40Var, yjj0 yjj0Var, boolean z, fqj0 fqj0Var, boolean z2, int i) {
        this.f28666a = (byte) 7;
        this.b = mm40Var;
        this.f = yjj0Var;
        this.c = z;
        this.e = fqj0Var;
        this.d = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28666a;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(7);
                oja0.d((mm40) obj5, (ql5) obj4, this.c, this.d, (Function1) obj3, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(385);
                qbc.k((mm40) obj5, (qzl) obj4, this.c, this.d, (Function1) obj3, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                yom.a((mm40) obj5, this.c, this.d, (utd0) obj4, (Function0) obj3, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(1);
                o2e.R((clp) obj5, this.c, this.d, (String) obj4, (Function1) obj3, (fet) obj, iL4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(1);
                o2e.Q((olp) obj5, this.c, this.d, (String) obj4, (Function1) obj3, (fet) obj, iL5);
                break;
            case 5:
                fet fetVar = (fet) obj;
                ((Integer) obj2).getClass();
                jh70 jh70Var = lja0.n2;
                ((lja0) obj5).P0((String) obj4, this.c, this.d, (Function0) obj3, fetVar, x8x.L(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(1);
                ccq0.y((iqh0) obj5, (Function0) obj4, (Function1) obj3, this.c, this.d, (fet) obj, iL6);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL7 = x8x.L(25009);
                eeq.O((mm40) obj5, (yjj0) obj4, this.c, (fqj0) obj3, this.d, (fet) obj, iL7);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ qg5(iqh0 iqh0Var, Function0 function0, Function1 function1, boolean z, boolean z2, int i) {
        this.f28666a = (byte) 6;
        this.b = iqh0Var;
        this.f = function0;
        this.e = function1;
        this.c = z;
        this.d = z2;
    }

    public /* synthetic */ qg5(Object obj, Object obj2, boolean z, boolean z2, wdr wdrVar, int i, byte b) {
        this.f28666a = b;
        this.b = obj;
        this.f = obj2;
        this.c = z;
        this.d = z2;
        this.e = wdrVar;
    }

    public /* synthetic */ qg5(Object obj, boolean z, boolean z2, Object obj2, wdr wdrVar, int i, byte b) {
        this.f28666a = b;
        this.b = obj;
        this.c = z;
        this.d = z2;
        this.f = obj2;
        this.e = wdrVar;
    }
}
