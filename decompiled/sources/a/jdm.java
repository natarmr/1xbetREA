package a;

import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jdm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16335a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ jdm(mm40 mm40Var, String str, String str2, String str3, String str4, long j, Date date, qol qolVar, iol iolVar, Function0 function0, int i, int i2) {
        tol tolVar = tol.f34290a;
        this.b = mm40Var;
        this.c = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.d = j;
        this.j = date;
        this.k = qolVar;
        this.l = iolVar;
        this.e = function0;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16335a;
        int i = this.f;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        switch (b) {
            case 0:
                tol tolVar = tol.f34290a;
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                int iL2 = x8x.L(i);
                lmc.n(this.b, this.c, (String) obj8, (String) obj7, (String) obj6, this.d, (Date) obj5, (qol) obj4, (iol) obj3, this.e, (fet) obj, iL, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                d5c.o(this.b, this.c, (t89) obj8, this.d, (i4) obj7, (gy40) obj6, (ezj) obj5, (o0x) obj4, (Function2) obj3, this.e, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ jdm(mm40 mm40Var, String str, t89 t89Var, long j, i4 i4Var, gy40 gy40Var, ezj ezjVar, o0x o0xVar, Function2 function2, Function0 function0, int i) {
        this.b = mm40Var;
        this.c = str;
        this.g = t89Var;
        this.d = j;
        this.h = i4Var;
        this.i = gy40Var;
        this.j = ezjVar;
        this.k = o0xVar;
        this.l = function2;
        this.e = function0;
        this.f = i;
    }
}
