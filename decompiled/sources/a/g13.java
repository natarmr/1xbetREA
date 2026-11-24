package a;

import java.util.Calendar;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g13 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10490a;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g13(ugd ugdVar, w2d w2dVar, mm40 mm40Var, ugd ugdVar2, int i, int i2) {
        this.f10490a = (byte) 2;
        this.g = ugdVar;
        this.d = w2dVar;
        this.e = mm40Var;
        this.f = ugdVar2;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10490a;
        int i = this.b;
        Object obj3 = this.f;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                k13.a((vmb0) obj6, (Function0) obj5, (wmb0) obj3, (ugd) obj4, (fet) obj, x8x.L(i | 1), this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                rsr0.e((mm40) obj6, (lo5) obj5, (qdz) obj3, (Function1) obj4, (fet) obj, x8x.L(i | 1), this.c);
                break;
            case 2:
                ((Integer) obj2).getClass();
                pzb.c((ugd) obj4, (w2d) obj6, (mm40) obj5, (ugd) obj3, (fet) obj, x8x.L(i | 1), this.c);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                byte b2 = this.c;
                f7k.e((mm40) obj6, (SimpleDate) obj5, b2, (Locale) obj3, (Calendar) obj4, (fet) obj, iL);
                break;
            case 4:
                ((Integer) obj2).getClass();
                y9a.s((mm40) obj6, (hkl) obj3, (ene) obj4, (Function0) obj5, (fet) obj, x8x.L(i | 1), this.c);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                byte b3 = this.c;
                sj3.p(iL2, b3, (fet) obj, (mm40) obj6, (String) obj5, (String) obj3, (String) obj4);
                break;
            case 6:
                ((Integer) obj2).getClass();
                e9x.x((mm40) obj6, (hgg0) obj5, (qdz) obj3, (Function1) obj4, (fet) obj, x8x.L(i | 1), this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                cww.k((mm40) obj6, (xdr) obj5, (ugd) obj4, (xdr) obj3, (fet) obj, x8x.L(i | 1), this.c);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g13(byte b, int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f10490a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g13(mm40 mm40Var, hkl hklVar, ene eneVar, Function0 function0, int i, int i2) {
        this.f10490a = (byte) 4;
        this.d = mm40Var;
        this.f = hklVar;
        this.g = eneVar;
        this.e = function0;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g13(mm40 mm40Var, xdr xdrVar, ugd ugdVar, xdr xdrVar2, int i, int i2) {
        this.f10490a = (byte) 7;
        this.d = mm40Var;
        this.e = xdrVar;
        this.g = ugdVar;
        this.f = xdrVar2;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g13(mm40 mm40Var, SimpleDate simpleDate, int i, Locale locale, Calendar calendar, int i2) {
        this.f10490a = (byte) 3;
        this.d = mm40Var;
        this.e = simpleDate;
        this.c = i;
        this.f = locale;
        this.g = calendar;
        this.b = i2;
    }
}
