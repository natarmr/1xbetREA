package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ez3 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8654a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ ez3(mm40 mm40Var, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, byte b) {
        this.f8654a = b;
        this.b = mm40Var;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
        this.g = obj4;
        this.h = obj5;
        this.i = obj6;
        this.j = obj7;
        this.k = obj8;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8654a;
        int i = this.d;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        Object obj9 = this.c;
        Object obj10 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                uc9.d(this.b, (mm40) obj10, (String) obj9, (Integer) obj8, (y3d) obj7, (y3d) obj6, (u12) obj5, (qge) obj4, (a4x) obj3, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                cwr0.r(this.b, (nx6) obj10, (pln0) obj8, (gx6) obj7, (String) obj9, (Function1) obj6, (Function0) obj5, (Function2) obj4, (Function2) obj3, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                rsr0.u(this.b, (mx6) obj10, (oln0) obj8, (fx6) obj7, (String) obj9, (Function0) obj6, (Function1) obj5, (Function2) obj4, (Function2) obj3, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                fbc.l(this.b, (String) obj9, (c4i) obj10, (b4i) obj8, (u3i) obj7, (u3i) obj6, (u3i) obj5, (u3i) obj4, (Function1) obj3, (fet) obj, iL4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(i | 1);
                cwr0.n(this.b, (String) obj9, (ulq0) obj10, (String) obj8, (String) obj7, (ifj) obj6, (jfj) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, iL5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(i | 1);
                x9x.b(this.b, (tx6) obj10, (jx6) obj8, (mke) obj7, (String) obj9, (String) obj6, (Function1) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, iL6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iL7 = x8x.L(i | 1);
                kcx.c(this.b, (vx6) obj10, (ix6) obj8, (lke) obj7, (String) obj9, (String) obj6, (Function1) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, iL7);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL8 = x8x.L(i | 1);
                x0x.i(this.b, (uv20) obj10, (Function0) obj9, (ugd) obj8, (ugd) obj7, (ugd) obj6, (ugd) obj5, (ugd) obj4, (ugd) obj3, (fet) obj, iL8);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ez3(mm40 mm40Var, Object obj, Object obj2, Object obj3, String str, Object obj4, wdr wdrVar, wdr wdrVar2, wdr wdrVar3, int i, byte b) {
        this.f8654a = b;
        this.b = mm40Var;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.c = str;
        this.h = obj4;
        this.i = wdrVar;
        this.j = wdrVar2;
        this.k = wdrVar3;
        this.d = i;
    }

    public /* synthetic */ ez3(mm40 mm40Var, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, wdr wdrVar, int i, byte b) {
        this.f8654a = b;
        this.b = mm40Var;
        this.c = str;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = obj5;
        this.j = obj6;
        this.k = wdrVar;
        this.d = i;
    }
}
