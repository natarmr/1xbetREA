package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pr9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27453a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pr9(Function0 function0, xcz xczVar, Function1 function1, a4x a4xVar, int i) {
        this.f27453a = (byte) 4;
        this.e = function0;
        this.c = xczVar;
        this.d = function1;
        this.f = a4xVar;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27453a;
        byte b2 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                f1t0.m((mm40) obj6, (qr9) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1), this.b);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ibc.O((jam) obj6, (a4x) obj5, (p9m) obj4, (l7m0) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                wwb.n((mm40) obj6, (x6q0) obj5, (kly) obj4, (Function1) obj3, (fet) obj, x8x.L(1), this.b);
                break;
            case 3:
                ((Integer) obj2).getClass();
                idx.j((mm40) obj6, (a4x) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                unh0.I((Function0) obj4, (xcz) obj6, (Function1) obj5, (a4x) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                h8x.a((mm40) obj6, (bhl0) obj5, (zgl0) obj3, (Function0) obj4, (fet) obj, x8x.L(b2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                q8x.j((mm40) obj6, (s0) obj5, (ahl0) obj3, (Function0) obj4, (fet) obj, x8x.L(b2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ay3.H((mm40) obj6, (wcp) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1), this.b);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pr9(mm40 mm40Var, Object obj, ahl0 ahl0Var, Function0 function0, int i, byte b) {
        this.f27453a = b;
        this.c = mm40Var;
        this.d = obj;
        this.f = ahl0Var;
        this.e = function0;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pr9(Object obj, a4x a4xVar, Object obj2, Object obj3, int i, byte b) {
        this.f27453a = b;
        this.c = obj;
        this.d = a4xVar;
        this.e = obj2;
        this.f = obj3;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pr9(byte b, int i, int i2, wdr wdrVar, mm40 mm40Var, Object obj, Object obj2) {
        this.f27453a = b;
        this.c = mm40Var;
        this.d = obj;
        this.e = obj2;
        this.f = wdrVar;
        this.b = i2;
    }
}
