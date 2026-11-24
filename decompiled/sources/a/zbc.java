package a;

import java.util.Calendar;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zbc implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44108a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ wdr d;
    public final /* synthetic */ int e;
    public final /* synthetic */ short f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zbc(ngv ngvVar, mm40 mm40Var, d9z d9zVar, hh80 hh80Var, sw3 sw3Var, ow3 ow3Var, qkq qkqVar, boolean z, vf80 vf80Var, Function1 function1, int i, int i2) {
        this.g = ngvVar;
        this.b = mm40Var;
        this.h = d9zVar;
        this.l = hh80Var;
        this.i = sw3Var;
        this.j = ow3Var;
        this.k = qkqVar;
        this.c = z;
        this.m = vf80Var;
        this.d = function1;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44108a;
        Object obj3 = this.m;
        int i = this.e;
        wdr wdrVar = this.d;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.l;
        Object obj8 = this.h;
        Object obj9 = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                lcc.b(this.b, (a4x) obj9, (vxl) obj8, (tyl) obj6, (syl) obj5, (jyl) obj4, (hh80) obj7, this.c, (Function1) wdrVar, (Function1) obj3, (fet) obj, iL, this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                tlb.g(this.b, (SimpleDate) obj9, (SimpleDate) obj8, (Long) obj6, this.c, (Calendar) obj5, (Locale) obj4, (SimpleDate) obj7, this.m, (Function1) wdrVar, (fet) obj, iL2, this.f);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                ulb.i((Function0) obj9, this.b, this.c, (em40) obj8, (Function2) obj6, (xpj0) obj5, (Function2) obj4, (xdr) obj7, (xdr) wdrVar, (ugd) obj3, (fet) obj, iL3, this.f);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                slb.n(this.b, (CharSequence) obj9, (o0x) obj8, (o0x) obj6, (xe9) obj5, this.c, (y3d) obj4, (rjm) obj7, (Function0) wdrVar, (Function0) obj3, (fet) obj, iL4, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(i | 1);
                g8x.i((ngv) obj9, this.b, (d9z) obj8, (hh80) obj7, (sw3) obj6, (ow3) obj5, (qkq) obj4, this.c, (vf80) obj3, (Function1) wdrVar, (fet) obj, iL5, this.f);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zbc(mm40 mm40Var, a4x a4xVar, vxl vxlVar, tyl tylVar, syl sylVar, jyl jylVar, hh80 hh80Var, boolean z, Function1 function1, Function1 function2, int i, int i2) {
        this.b = mm40Var;
        this.g = a4xVar;
        this.h = vxlVar;
        this.i = tylVar;
        this.j = sylVar;
        this.k = jylVar;
        this.l = hh80Var;
        this.c = z;
        this.d = function1;
        this.m = function2;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zbc(mm40 mm40Var, CharSequence charSequence, o0x o0xVar, o0x o0xVar2, xe9 xe9Var, boolean z, y3d y3dVar, rjm rjmVar, Function0 function0, Function0 function1, int i, int i2) {
        this.b = mm40Var;
        this.g = charSequence;
        this.h = o0xVar;
        this.i = o0xVar2;
        this.j = xe9Var;
        this.c = z;
        this.k = y3dVar;
        this.l = rjmVar;
        this.d = function0;
        this.m = function1;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zbc(mm40 mm40Var, SimpleDate simpleDate, SimpleDate simpleDate2, Long l, boolean z, Calendar calendar, Locale locale, SimpleDate simpleDate3, Object obj, Function1 function1, int i, int i2) {
        this.b = mm40Var;
        this.g = simpleDate;
        this.h = simpleDate2;
        this.i = l;
        this.c = z;
        this.j = calendar;
        this.k = locale;
        this.l = simpleDate3;
        this.m = obj;
        this.d = function1;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zbc(Function0 function0, mm40 mm40Var, boolean z, em40 em40Var, Function2 function2, xpj0 xpj0Var, Function2 function3, xdr xdrVar, xdr xdrVar2, ugd ugdVar, int i, int i2) {
        this.g = function0;
        this.b = mm40Var;
        this.c = z;
        this.h = em40Var;
        this.i = function2;
        this.j = xpj0Var;
        this.k = function3;
        this.l = xdrVar;
        this.d = xdrVar2;
        this.m = ugdVar;
        this.e = i;
        this.f = i2;
    }
}
