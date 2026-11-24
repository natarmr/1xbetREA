package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qt0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29276a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qt0(mm40 mm40Var, bdz bdzVar, bzl bzlVar, Object obj, float f, Function1 function1, int i, int i2, byte b) {
        this.f29276a = b;
        this.b = mm40Var;
        this.g = bdzVar;
        this.h = bzlVar;
        this.i = obj;
        this.c = f;
        this.d = function1;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29276a;
        int i = this.e;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.d;
        Object obj6 = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                tke.d(this.b, (pe0) obj6, this.c, (Function1) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, iL, this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                f1t0.c(this.b, (bdz) obj6, (bzl) obj4, (vg2) obj3, this.c, (Function1) obj5, (fet) obj, iL2, this.f);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                vbw0.c(this.b, (bdz) obj6, (bzl) obj4, (ol2) obj3, this.c, (Function1) obj5, (fet) obj, iL3, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                v3c.r(this.b, (ejm) obj6, this.c, (gy40) obj5, (ezj) obj4, (Function2) obj3, (fet) obj, iL4, this.f);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qt0(mm40 mm40Var, Object obj, float f, Object obj2, Object obj3, wdr wdrVar, int i, int i2, byte b) {
        this.f29276a = b;
        this.b = mm40Var;
        this.g = obj;
        this.c = f;
        this.d = obj2;
        this.h = obj3;
        this.i = wdrVar;
        this.e = i;
        this.f = i2;
    }
}
