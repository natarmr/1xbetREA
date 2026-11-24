package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class brc0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3074a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ brc0(a4x a4xVar, boolean z, Function2 function2, mm40 mm40Var, ch80 ch80Var, int i) {
        this.f3074a = (byte) 1;
        this.d = a4xVar;
        this.b = z;
        this.e = function2;
        this.c = mm40Var;
        this.f = ch80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3074a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(4097);
                q0x.v((mm40) obj6, (shc0) obj5, this.b, (w2d) obj4, (Function1) obj3, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                piz.w((a4x) obj5, this.b, (Function2) obj4, (mm40) obj6, (ch80) obj3, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                ccq0.I((Function0) obj6, (Function0) obj5, (Function1) obj3, (crh0) obj4, this.b, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(24577);
                t9x.y((mm40) obj6, (db00) obj5, this.b, (Function1) obj3, (Function1) obj4, (fet) obj, iL4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                mym0.c((mm40) obj6, (nym0) obj5, (Function1) obj3, (Function0) obj4, (fet) obj, x8x.L(1), this.b ? 1 : 0);
                break;
            case 5:
                ((Integer) obj2).getClass();
                bcm0.d((mm40) obj6, (d280) obj5, (String) obj4, (j83) obj3, (fet) obj, x8x.L(1), this.b ? 1 : 0);
                break;
            default:
                ((Integer) obj2).getClass();
                ghm0.h((mm40) obj6, (c280) obj5, (d280) obj4, (String) obj3, (fet) obj, x8x.L(1), this.b ? 1 : 0);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ brc0(mm40 mm40Var, db00 db00Var, boolean z, Function1 function1, Function1 function2, int i) {
        this.f3074a = (byte) 3;
        this.c = mm40Var;
        this.d = db00Var;
        this.b = z;
        this.f = function1;
        this.e = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ brc0(mm40 mm40Var, d280 d280Var, Object obj, CharSequence charSequence, int i, int i2, byte b) {
        this.f3074a = b;
        this.c = mm40Var;
        this.d = d280Var;
        this.e = obj;
        this.f = charSequence;
        this.b = i2;
    }

    public /* synthetic */ brc0(mm40 mm40Var, shc0 shc0Var, boolean z, w2d w2dVar, Function1 function1, int i) {
        this.f3074a = (byte) 0;
        this.c = mm40Var;
        this.d = shc0Var;
        this.b = z;
        this.e = w2dVar;
        this.f = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ brc0(mm40 mm40Var, nym0 nym0Var, Function1 function1, Function0 function0, int i, int i2) {
        this.f3074a = (byte) 4;
        this.c = mm40Var;
        this.d = nym0Var;
        this.f = function1;
        this.e = function0;
        this.b = i2;
    }

    public /* synthetic */ brc0(Function0 function0, Function0 function1, Function1 function2, crh0 crh0Var, boolean z, int i) {
        this.f3074a = (byte) 2;
        this.c = function0;
        this.d = function1;
        this.f = function2;
        this.e = crh0Var;
        this.b = z;
    }
}
