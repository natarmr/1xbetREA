package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uol implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36022a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ uol(mm40 mm40Var, float f, long j, float f2, yjj0 yjj0Var, hd9 hd9Var, List list, int i, int i2, tcj tcjVar, int i3, int i4) {
        this.b = mm40Var;
        this.c = f;
        this.d = j;
        this.e = f2;
        this.j = yjj0Var;
        this.k = hd9Var;
        this.l = list;
        this.f = i;
        this.g = i2;
        this.m = tcjVar;
        this.h = i3;
        this.i = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        float f2;
        long j;
        fet fetVar;
        boolean z;
        byte b = this.f36022a;
        int i = this.i;
        int i2 = this.h;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.j;
        switch (b) {
            case 0:
                iol iolVar = (iol) obj6;
                qol qolVar = (qol) obj5;
                y9q0 y9q0Var = (y9q0) obj4;
                y9q0 y9q0Var2 = (y9q0) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarE0 = o2e.e0(o7k0.y(this.b, null, 3), "TIMER_ROW");
                    yx7 yx7Var = gqw0.j;
                    zcl zclVar = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    dh90 dh90Var = iolVar.d.d;
                    boolean zContainsKey = dh90Var.containsKey(rol.f30844a);
                    float f3 = this.c;
                    long j2 = this.d;
                    float f4 = this.e;
                    if (zContainsKey) {
                        fetVar2.e0(1000743268);
                        f2 = f4;
                        j = j2;
                        f = f3;
                        z = false;
                        dyb.l(null, dyb.S(this.f), qolVar.f29078a, y9q0Var, y9q0Var2, iolVar.f15122a, iolVar.b, f, j, f2, fetVar2, 0);
                        fetVar = fetVar2;
                        dyb.H(null, y9q0Var, iolVar.c, fetVar, 0);
                        y9q0Var = y9q0Var;
                        fetVar.r(false);
                    } else {
                        f = f3;
                        f2 = f4;
                        j = j2;
                        fetVar = fetVar2;
                        z = false;
                        fetVar.e0(1001461135);
                        fetVar.r(false);
                    }
                    if (dh90Var.containsKey(rol.b)) {
                        fetVar.e0(1001576486);
                        fet fetVar3 = fetVar;
                        dyb.K(null, dyb.S(this.g), qolVar.b, y9q0Var, y9q0Var2, iolVar.f15122a, iolVar.b, f, j, f2, fetVar3, 0);
                        fetVar = fetVar3;
                        if (dh90Var.containsKey(rol.c)) {
                            fetVar.e0(1002226649);
                            y9q0 y9q0Var3 = y9q0Var;
                            dyb.H(null, y9q0Var3, iolVar.c, fetVar, 0);
                            y9q0Var = y9q0Var3;
                            fetVar.r(z);
                        } else {
                            fetVar.e0(1002401551);
                            fetVar.r(z);
                        }
                        fetVar.r(z);
                    } else {
                        fetVar.e0(1002415439);
                        fetVar.r(z);
                    }
                    if (dh90Var.containsKey(rol.c)) {
                        fetVar.e0(1002532867);
                        fet fetVar4 = fetVar;
                        dyb.K(null, dyb.S(i2), qolVar.c, y9q0Var, y9q0Var2, iolVar.f15122a, iolVar.b, f, j, f2, fetVar4, 0);
                        fetVar = fetVar4;
                        if (dh90Var.containsKey(rol.d)) {
                            fetVar.e0(1003185913);
                            y9q0 y9q0Var4 = y9q0Var;
                            dyb.H(null, y9q0Var4, iolVar.c, fetVar, 0);
                            y9q0Var = y9q0Var4;
                            fetVar.r(z);
                        } else {
                            fetVar.e0(1003360815);
                            fetVar.r(z);
                        }
                        fetVar.r(z);
                    } else {
                        fetVar.e0(1003374703);
                        fetVar.r(z);
                    }
                    if (dh90Var.containsKey(rol.d)) {
                        fetVar.e0(1003483575);
                        fet fetVar5 = fetVar;
                        dyb.K(null, dyb.S(i), qolVar.d, y9q0Var, y9q0Var2, iolVar.f15122a, iolVar.b, f, j, f2, fetVar5, 0);
                        fetVar = fetVar5;
                        fetVar.r(z);
                    } else {
                        fetVar.e0(1004060175);
                        fetVar.r(z);
                    }
                    fetVar.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                wdx.y(this.b, this.c, this.d, this.e, (yjj0) obj6, (hd9) obj5, (List) obj4, this.f, this.g, (tcj) obj3, (fet) obj, x8x.L(i2 | 1), x8x.L(i));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ uol(mm40 mm40Var, iol iolVar, int i, qol qolVar, y9q0 y9q0Var, y9q0 y9q0Var2, float f, long j, float f2, int i2, int i3, int i4) {
        this.b = mm40Var;
        this.j = iolVar;
        this.f = i;
        this.k = qolVar;
        this.l = y9q0Var;
        this.m = y9q0Var2;
        this.c = f;
        this.d = j;
        this.e = f2;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }
}
