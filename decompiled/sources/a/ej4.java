package a;

import java.util.Calendar;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ej4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7889a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ej4(mm40 mm40Var, itv itvVar, p580 p580Var, c0s c0sVar, g0d g0dVar, j680 j680Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i) {
        this.f7889a = (byte) 1;
        this.b = mm40Var;
        this.e = itvVar;
        this.f = p580Var;
        this.g = c0sVar;
        this.h = g0dVar;
        this.i = j680Var;
        this.c = function0;
        this.j = function1;
        this.k = function2;
        this.l = function3;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7889a;
        int i = this.d;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        Object obj9 = this.c;
        Object obj10 = this.f;
        Object obj11 = this.e;
        Object obj12 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                wha0.e((mm40) obj12, (l7m0) obj11, (wul) obj10, (Function0) obj9, (ugd) obj8, (ugd) obj7, (ugd) obj6, (xdr) obj5, (ydr) obj4, (ydr) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                nnw0.c((mm40) obj12, (itv) obj11, (p580) obj10, (c0s) obj8, (g0d) obj7, (j680) obj6, (Function0) obj9, (Function0) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                rsr0.F((SimpleDateTime) obj12, (SimpleDateTime) obj11, (SimpleDateTime) obj10, (SimpleDateTime) obj9, (Locale) obj8, (ulq0) obj7, (Calendar) obj6, (yg40) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ebc.u((mm40) obj12, (z0n) obj11, (z0n) obj10, (p0n) obj9, (sem) obj8, (String) obj7, (String) obj6, (String) obj5, (String) obj4, (xem) obj3, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ej4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i, byte b) {
        this.f7889a = b;
        this.b = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = obj7;
        this.j = obj8;
        this.k = obj9;
        this.l = obj10;
        this.d = i;
    }
}
