package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vwl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38156a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ vwl(a4x a4xVar, l7m0 l7m0Var, boolean z, bdz bdzVar, boolean z2, Function1 function1, Function1 function2, int i) {
        this.f38156a = (byte) 3;
        this.g = a4xVar;
        this.b = l7m0Var;
        this.c = z;
        this.f = bdzVar;
        this.d = z2;
        this.i = function1;
        this.h = function2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38156a;
        int i = this.e;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                n4c.j((mm40) obj7, (xcz) obj6, (a4x) obj5, (lh80) obj4, this.c, this.d, (Function1) obj3, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                zjb.p((mm40) obj7, (String) obj6, (String) obj5, (String) obj4, (String) obj3, this.c, this.d, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                cww.f((gf50) obj7, this.c, (Function0) obj6, (Function0) obj5, this.d, (Function0) obj4, (Function0) obj3, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                epv0.E((a4x) obj5, (l7m0) obj7, this.c, (bdz) obj6, this.d, (Function1) obj3, (Function1) obj4, (fet) obj, iL4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(i | 1);
                l8x.k((mm40) obj7, (kpe) obj6, (spe) obj5, (zb) obj4, this.c, this.d, (Function1) obj3, (fet) obj, iL5);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ vwl(mm40 mm40Var, Object obj, Object obj2, Object obj3, boolean z, boolean z2, Function1 function1, int i, byte b) {
        this.f38156a = b;
        this.b = mm40Var;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.c = z;
        this.d = z2;
        this.i = function1;
        this.e = i;
    }

    public /* synthetic */ vwl(mm40 mm40Var, String str, String str2, String str3, String str4, boolean z, boolean z2, int i) {
        this.f38156a = (byte) 1;
        this.b = mm40Var;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.c = z;
        this.d = z2;
        this.e = i;
    }

    public /* synthetic */ vwl(gf50 gf50Var, boolean z, Function0 function0, Function0 function1, boolean z2, Function0 function2, Function0 function3, int i) {
        this.f38156a = (byte) 2;
        this.b = gf50Var;
        this.c = z;
        this.f = function0;
        this.g = function1;
        this.d = z2;
        this.h = function2;
        this.i = function3;
        this.e = i;
    }
}
