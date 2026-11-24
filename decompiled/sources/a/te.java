package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class te implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33795a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ te(mm40 mm40Var, sum sumVar, sum sumVar2, mpm mpmVar, String str, mum mumVar, boolean z, int i, int i2) {
        this.b = mm40Var;
        this.f = sumVar;
        this.g = sumVar2;
        this.h = mpmVar;
        this.c = str;
        this.i = mumVar;
        this.d = z;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33795a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.f;
        Object obj6 = this.c;
        Object obj7 = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                wha0.a((Function0) obj5, (Function0) obj7, (String) obj6, (String) obj4, (String) obj3, this.d, this.e, this.b, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                f7k.l(this.b, (sum) obj5, (sum) obj7, (mpm) obj4, (String) obj6, (mum) obj3, this.d, (fet) obj, iL2, this.e ? 1 : 0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(12582913);
                bdx.A(this.b, this.d, this.e, (wom) obj7, (u12) obj6, (Function0) obj5, (ydr) obj4, (ugd) obj3, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ te(mm40 mm40Var, boolean z, boolean z2, wom womVar, u12 u12Var, Function0 function0, ydr ydrVar, ugd ugdVar, int i) {
        this.b = mm40Var;
        this.d = z;
        this.e = z2;
        this.g = womVar;
        this.c = u12Var;
        this.f = function0;
        this.h = ydrVar;
        this.i = ugdVar;
    }

    public /* synthetic */ te(Function0 function0, Function0 function1, String str, String str2, String str3, boolean z, boolean z2, mm40 mm40Var, int i) {
        this.f = function0;
        this.g = function1;
        this.c = str;
        this.h = str2;
        this.i = str3;
        this.d = z;
        this.e = z2;
        this.b = mm40Var;
    }
}
