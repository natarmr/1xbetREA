package a;

import java.util.Calendar;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nfe implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23432a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ wdr m;

    public /* synthetic */ nfe(a4x a4xVar, ehm0 ehm0Var, ehm0 ehm0Var2, ehm0 ehm0Var3, ehm0 ehm0Var4, ehm0 ehm0Var5, ehm0 ehm0Var6, ehm0 ehm0Var7, db00 db00Var, boolean z, Function1 function1, mm40 mm40Var, int i) {
        this.d = a4xVar;
        this.e = ehm0Var;
        this.f = ehm0Var2;
        this.g = ehm0Var3;
        this.h = ehm0Var4;
        this.i = ehm0Var5;
        this.j = ehm0Var6;
        this.k = ehm0Var7;
        this.l = db00Var;
        this.c = z;
        this.m = function1;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23432a;
        wdr wdrVar = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        Object obj9 = this.f;
        Object obj10 = this.e;
        Object obj11 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                kkb.f((a4x) obj11, (ehm0) obj10, (ehm0) obj9, (ehm0) obj8, (ehm0) obj7, (ehm0) obj6, (ehm0) obj5, (ehm0) obj4, (db00) obj3, this.c, (Function1) wdrVar, this.b, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(19169281);
                rsr0.R(this.b, (am) obj11, this.c, (Locale) obj10, (SimpleDateTime) obj9, (SimpleDateTime) obj8, (SimpleDateTime) obj7, (SimpleDateTime) obj6, (Calendar) obj5, (yg40) obj4, (Function2) obj3, (Function2) wdrVar, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ nfe(mm40 mm40Var, am amVar, boolean z, Locale locale, SimpleDateTime simpleDateTime, SimpleDateTime simpleDateTime2, SimpleDateTime simpleDateTime3, SimpleDateTime simpleDateTime4, Calendar calendar, yg40 yg40Var, Function2 function2, Function2 function3, int i) {
        this.b = mm40Var;
        this.d = amVar;
        this.c = z;
        this.e = locale;
        this.f = simpleDateTime;
        this.g = simpleDateTime2;
        this.h = simpleDateTime3;
        this.i = simpleDateTime4;
        this.j = calendar;
        this.k = yg40Var;
        this.l = function2;
        this.m = function3;
    }
}
