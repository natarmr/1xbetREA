package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bcc implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2350a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ bcc(mdm mdmVar, xcz xczVar, hdz hdzVar, jk5 jk5Var, boolean z, Function1 function1, Function1 function2, Function1 function3, Function0 function0, Function0 function4, int i) {
        this.f2350a = (byte) 7;
        this.b = mdmVar;
        this.h = xczVar;
        this.i = hdzVar;
        this.j = jk5Var;
        this.d = z;
        this.e = function1;
        this.f = function2;
        this.k = function3;
        this.c = function0;
        this.l = function4;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2350a;
        int i = this.g;
        Object obj3 = this.l;
        Object obj4 = this.c;
        Object obj5 = this.k;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.j;
        Object obj9 = this.i;
        Object obj10 = this.h;
        Object obj11 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                lcc.d((mm40) obj11, (a4x) obj10, (vxl) obj9, (tyl) obj8, (syl) obj5, (hh80) obj4, (jyl) obj3, this.d, (Function1) obj7, (Function1) obj6, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                ckb.h((mm40) obj11, (List) obj10, (pt0) obj9, (d9z) obj8, (hh80) obj4, this.d, (Function0) obj5, (Function1) obj7, (Function1) obj6, (Function1) obj3, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                xkb.p((mm40) obj11, (String) obj9, (String) obj8, (a4x) obj10, (a4x) obj5, (String) obj4, (String) obj3, (kpm) obj7, (String) obj6, this.d, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                tlb.m((mm40) obj11, (String) obj9, (String) obj8, (a4x) obj10, (a4x) obj5, (String) obj4, (String) obj3, (y1m) obj7, (String) obj6, this.d, (fet) obj, iL4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(i | 1);
                ohq0.B((mm40) obj11, (gvm) obj9, (gvm) obj8, (mpm) obj5, (String) obj4, (String) obj3, (String) obj7, (a4x) obj10, (zum) obj6, this.d, (fet) obj, iL5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(i | 1);
                dub.A((mm40) obj11, (ivm) obj9, (ivm) obj8, (mpm) obj5, (String) obj4, (String) obj3, (a4x) obj10, (String) obj7, (zum) obj6, this.d, (fet) obj, iL6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iL7 = x8x.L(i | 1);
                jwb.m((mm40) obj11, (kvm) obj9, (kvm) obj8, (a2m) obj5, (String) obj4, (String) obj3, (a4x) obj10, (String) obj7, (zum) obj6, this.d, (fet) obj, iL7);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL8 = x8x.L(i | 1);
                cfx0.r((mdm) obj11, (xcz) obj10, (hdz) obj9, (jk5) obj8, this.d, (Function1) obj7, (Function1) obj6, (Function1) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, iL8);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ bcc(mm40 mm40Var, gvm gvmVar, gvm gvmVar2, mpm mpmVar, String str, String str2, String str3, a4x a4xVar, zum zumVar, boolean z, int i) {
        this.f2350a = (byte) 4;
        this.b = mm40Var;
        this.i = gvmVar;
        this.j = gvmVar2;
        this.k = mpmVar;
        this.c = str;
        this.l = str2;
        this.e = str3;
        this.h = a4xVar;
        this.f = zumVar;
        this.d = z;
        this.g = i;
    }

    public /* synthetic */ bcc(mm40 mm40Var, a4x a4xVar, vxl vxlVar, tyl tylVar, syl sylVar, hh80 hh80Var, jyl jylVar, boolean z, Function1 function1, Function1 function2, int i) {
        this.f2350a = (byte) 0;
        this.b = mm40Var;
        this.h = a4xVar;
        this.i = vxlVar;
        this.j = tylVar;
        this.k = sylVar;
        this.c = hh80Var;
        this.l = jylVar;
        this.d = z;
        this.e = function1;
        this.f = function2;
        this.g = i;
    }

    public /* synthetic */ bcc(mm40 mm40Var, Object obj, Object obj2, Object obj3, String str, String str2, a4x a4xVar, String str3, zum zumVar, boolean z, int i, byte b) {
        this.f2350a = b;
        this.b = mm40Var;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.c = str;
        this.l = str2;
        this.h = a4xVar;
        this.e = str3;
        this.f = zumVar;
        this.d = z;
        this.g = i;
    }

    public /* synthetic */ bcc(mm40 mm40Var, String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, Object obj, String str5, boolean z, int i, byte b) {
        this.f2350a = b;
        this.b = mm40Var;
        this.i = str;
        this.j = str2;
        this.h = a4xVar;
        this.k = a4xVar2;
        this.c = str3;
        this.l = str4;
        this.e = obj;
        this.f = str5;
        this.d = z;
        this.g = i;
    }

    public /* synthetic */ bcc(mm40 mm40Var, List list, pt0 pt0Var, d9z d9zVar, hh80 hh80Var, boolean z, Function0 function0, Function1 function1, Function1 function2, Function1 function3, int i) {
        this.f2350a = (byte) 1;
        this.b = mm40Var;
        this.h = list;
        this.i = pt0Var;
        this.j = d9zVar;
        this.c = hh80Var;
        this.d = z;
        this.k = function0;
        this.e = function1;
        this.f = function2;
        this.l = function3;
        this.g = i;
    }
}
