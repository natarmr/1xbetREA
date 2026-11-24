package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class db3 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5782a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ wdr i;

    public /* synthetic */ db3(mm40 mm40Var, l7m0 l7m0Var, l7m0 l7m0Var2, float f, float f2, float f3, Function1 function1, int i) {
        this.f5782a = (byte) 0;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.h = l7m0Var2;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.i = function1;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5782a;
        int i = this.g;
        wdr wdrVar = this.i;
        Object obj3 = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                mm40 mm40Var = this.b;
                l7m0 l7m0Var = this.c;
                float f = this.d;
                float f2 = this.e;
                float f3 = this.f;
                j47.J(mm40Var, l7m0Var, (l7m0) obj3, f, f2, f3, (Function1) wdrVar, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                mm40 mm40Var2 = this.b;
                ntr.o(mm40Var2, (flb) obj3, this.c, this.d, this.e, this.f, (Function0) wdrVar, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                mm40 mm40Var3 = this.b;
                b34.t(mm40Var3, (f9o) obj3, this.c, this.d, this.e, this.f, (Function0) wdrVar, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                mm40 mm40Var4 = this.b;
                rq8.E(mm40Var4, (qbp0) obj3, this.c, this.d, this.e, this.f, (Function1) wdrVar, (fet) obj, iL4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(i | 1);
                mm40 mm40Var5 = this.b;
                aad.E(mm40Var5, (edt0) obj3, this.c, this.d, this.e, this.f, (Function0) wdrVar, (fet) obj, iL5);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(i | 1);
                mm40 mm40Var6 = this.b;
                l7m0 l7m0Var2 = this.c;
                float f4 = this.d;
                float f5 = this.e;
                float f6 = this.f;
                q8a.J(mm40Var6, (wpu0) obj3, l7m0Var2, f4, f5, f6, (Function0) wdrVar, (fet) obj, iL6);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ db3(mm40 mm40Var, Object obj, l7m0 l7m0Var, float f, float f2, float f3, wdr wdrVar, int i, byte b) {
        this.f5782a = b;
        this.b = mm40Var;
        this.h = obj;
        this.c = l7m0Var;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.i = wdrVar;
        this.g = i;
    }
}
