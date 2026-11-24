package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ag implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f803a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ag(mm40 mm40Var, String str, boolean z, boolean z2, Function1 function1, Function0 function0, int i) {
        this.f803a = (byte) 2;
        tf6 tf6Var = tf6.f33852a;
        this.f = mm40Var;
        this.e = str;
        this.b = z;
        this.d = z2;
        this.h = function1;
        this.g = function0;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f803a;
        int i = this.c;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                int iL = x8x.L(1 | i);
                nia0.Y((String) obj6, (String) obj5, this.b, this.d, (Function0) obj4, (Function0) obj3, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1 | i);
                ahy.b((mm40) obj6, (nyq0) obj5, this.b, (ugd) obj4, (ugd) obj3, (fet) obj, iL2, this.d ? 1 : 0);
                break;
            case 2:
                tf6 tf6Var = tf6.f33852a;
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1 | i);
                rf6.a((mm40) obj5, (String) obj6, this.b, this.d, (Function1) obj3, (Function0) obj4, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                n5n.a((mm40) obj6, this.b, (l5n) obj5, this.d, (gy40) obj4, (Function1) obj3, (fet) obj, iL4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(1 | i);
                rcb.g((mm40) obj6, (eye) obj5, (wul) obj4, this.b, this.d, (Function1) obj3, (fet) obj, iL5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(1 | i);
                azw.h((mm40) obj6, (l7m0) obj5, this.b, (xdr) obj4, (xdr) obj3, (fet) obj, iL6, this.d ? 1 : 0);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iL7 = x8x.L(1);
                hmw0.a(this.c, this.b, this.d, (String) obj6, (String) obj5, (String) obj3, (Function0) obj4, (fet) obj, iL7);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL8 = x8x.L(i | 1);
                fzn0.b((mm40) obj6, this.b, this.d, (dzn0) obj5, (gy40) obj4, (yjj0) obj3, (fet) obj, iL8);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ag(mm40 mm40Var, eye eyeVar, wul wulVar, boolean z, boolean z2, Function1 function1, int i) {
        this.f803a = (byte) 4;
        this.e = mm40Var;
        this.f = eyeVar;
        this.g = wulVar;
        this.b = z;
        this.d = z2;
        this.h = function1;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ag(mm40 mm40Var, Object obj, boolean z, xdr xdrVar, xdr xdrVar2, int i, int i2, byte b) {
        this.f803a = b;
        this.e = mm40Var;
        this.f = obj;
        this.b = z;
        this.g = xdrVar;
        this.h = xdrVar2;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ ag(int i, boolean z, boolean z2, String str, String str2, String str3, Function0 function0, int i2) {
        this.f803a = (byte) 6;
        this.c = i;
        this.b = z;
        this.d = z2;
        this.e = str;
        this.f = str2;
        this.h = str3;
        this.g = function0;
    }

    public /* synthetic */ ag(mm40 mm40Var, boolean z, l5n l5nVar, boolean z2, gy40 gy40Var, Function1 function1, int i) {
        this.f803a = (byte) 3;
        this.e = mm40Var;
        this.b = z;
        this.f = l5nVar;
        this.d = z2;
        this.g = gy40Var;
        this.h = function1;
        this.c = i;
    }

    public /* synthetic */ ag(mm40 mm40Var, boolean z, boolean z2, dzn0 dzn0Var, gy40 gy40Var, yjj0 yjj0Var, int i) {
        this.f803a = (byte) 7;
        this.e = mm40Var;
        this.b = z;
        this.d = z2;
        this.f = dzn0Var;
        this.g = gy40Var;
        this.h = yjj0Var;
        this.c = i;
    }

    public /* synthetic */ ag(String str, String str2, boolean z, boolean z2, Function0 function0, Function0 function1, int i) {
        this.f803a = (byte) 0;
        this.e = str;
        this.f = str2;
        this.b = z;
        this.d = z2;
        this.g = function0;
        this.h = function1;
        this.c = i;
    }
}
