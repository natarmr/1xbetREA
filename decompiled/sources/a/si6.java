package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class si6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32248a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ si6(mm40 mm40Var, String str, String str2, long j, Function0 function0, int i) {
        this.f32248a = (byte) 4;
        sjm[] sjmVarArr = sjm.f32310a;
        this.b = mm40Var;
        this.d = str;
        this.e = str2;
        this.c = j;
        this.f = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32248a;
        cl5 cl5Var = ukd.f35823a;
        pcy pcyVar = e7z.u1;
        byte b2 = 2;
        byte b3 = 1;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.b;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj5;
                pz40 pz40Var = (pz40) obj6;
                xcz xczVar = (xcz) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarE = mm40Var.e(o7k0.c);
                    long j = this.c;
                    boolean zF = fetVar.f(j);
                    Object objP = fetVar.P();
                    if (zF || objP == cl5Var) {
                        objP = new bx((byte) 10, j);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarK = rq8.K(mm40VarE, (Function1) objP);
                    udl0 udl0Var = udl0.ADVANCED;
                    boolean zG = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new wc2(function1, (byte) 29);
                        fetVar.o0(objP2);
                    }
                    Function1 function2 = (Function1) objP2;
                    Object objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = new h26((byte) 9);
                        fetVar.o0(objP3);
                    }
                    Function1 function3 = (Function1) objP3;
                    boolean zG2 = fetVar.g(function1);
                    Object objP4 = fetVar.P();
                    if (zG2 || objP4 == cl5Var) {
                        objP4 = new gn(function1, b3);
                        fetVar.o0(objP4);
                    }
                    xdr xdrVar = (xdr) objP4;
                    boolean zG3 = fetVar.g(function1);
                    Object objP5 = fetVar.P();
                    if (zG3 || objP5 == cl5Var) {
                        objP5 = new gn(function1, b2);
                        fetVar.o0(objP5);
                    }
                    xdr xdrVar2 = (xdr) objP5;
                    boolean zG4 = fetVar.g(function1);
                    Object objP6 = fetVar.P();
                    if (zG4 || objP6 == cl5Var) {
                        objP6 = new gn(function1, (byte) 3);
                        fetVar.o0(objP6);
                    }
                    xdr xdrVar3 = (xdr) objP6;
                    boolean zG5 = fetVar.g(function1);
                    Object objP7 = fetVar.P();
                    if (zG5 || objP7 == cl5Var) {
                        objP7 = new wc2(function1, (byte) 28);
                        fetVar.o0(objP7);
                    }
                    idx.d(mm40VarK, pz40Var, udl0Var, true, xczVar, function2, function3, xdrVar, xdrVar2, xdrVar3, (Function1) objP7, fetVar, 1576320, 0, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                List list = (List) obj6;
                mm40 mm40Var2 = (mm40) obj5;
                w6k w6kVar = (w6k) obj4;
                xdr xdrVar4 = (xdr) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qf6 qf6Var = new qf6(list);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, qf6Var, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    Iterator itV = kng0.v(fetVar2, mm40VarC0, gqw0.v, -851343352, list);
                    int i = 0;
                    while (itV.hasNext()) {
                        Object next = itV.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        us8 us8Var = (us8) next;
                        fetVar2.b0(-815535763, fetVar2.G(Integer.valueOf(us8Var.f36199a.g), Integer.valueOf(i)));
                        s5x0.g(us8Var, this.c, w6kVar, xdrVar4, fetVar2, 8);
                        fetVar2.r(false);
                        i = i2;
                    }
                    fetVar2.r(false);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                lgb.u((mm40) obj5, (mm40) obj6, (mz3) obj4, this.c, (qge) obj3, (fet) obj, x8x.L(196609));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                jcb.G((mm40) obj5, (sd) obj6, (y9q0) obj4, this.c, (y3d) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                sjm[] sjmVarArr = sjm.f32310a;
                ((Integer) obj2).getClass();
                slb.l((mm40) obj5, (String) obj6, (String) obj4, this.c, (Function0) obj3, (fet) obj, x8x.L(49));
                return Unit.f46060a;
            case 5:
                mm40 mm40Var3 = (mm40) obj5;
                pz40 pz40Var2 = (pz40) obj6;
                aaj aajVar = (aaj) obj4;
                Function1 function4 = (Function1) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    qw3 qw3Var = new qw3(2.0f, true, new jf4((byte) 14));
                    mm40 mm40VarN = s5x0.N(hp4.B(mm40Var3), 0.0f, 2.0f, 0.0f, 0.0f, 13);
                    x5d x5dVarA = w5d.a(qw3Var, gqw0.m, fetVar3, 0);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarN);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                    fetVar3.e0(1121367762);
                    int i3 = 0;
                    for (Object obj7 : (Iterable) pz40Var2.getValue()) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            q3d.p();
                            throw null;
                        }
                        elo0 elo0Var = (elo0) obj7;
                        boolean zE = fetVar3.e(i3) | fetVar3.g(pz40Var2) | fetVar3.g(aajVar);
                        long j2 = this.c;
                        boolean zF2 = zE | fetVar3.f(j2);
                        Object objP8 = fetVar3.P();
                        if (zF2 || objP8 == cl5Var) {
                            zz0 zz0Var = new zz0(i3, pz40Var2, aajVar, j2);
                            fetVar3.o0(zz0Var);
                            objP8 = zz0Var;
                        }
                        vko0.a(rq8.K(jm40.b, (Function1) objP8), elo0Var, function4, fetVar3, 0);
                        i3 = i4;
                    }
                    fetVar3.r(false);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                jar0.f(this.c, (String) obj5, (String) obj6, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                unh0.a0((xx7) obj6, (mm40) obj5, (String) obj4, (String) obj3, this.c, (fet) obj, x8x.L(7));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ si6(xx7 xx7Var, mm40 mm40Var, String str, String str2, long j, int i) {
        this.f32248a = (byte) 7;
        this.d = xx7Var;
        this.b = mm40Var;
        this.e = str;
        this.f = str2;
        this.c = j;
    }

    public /* synthetic */ si6(mm40 mm40Var, long j, pz40 pz40Var, xcz xczVar, Function1 function1) {
        this.f32248a = (byte) 0;
        this.b = mm40Var;
        this.c = j;
        this.d = pz40Var;
        this.e = xczVar;
        this.f = function1;
    }

    public /* synthetic */ si6(mm40 mm40Var, pz40 pz40Var, aaj aajVar, long j, Function1 function1) {
        this.f32248a = (byte) 5;
        this.b = mm40Var;
        this.d = pz40Var;
        this.e = aajVar;
        this.c = j;
        this.f = function1;
    }

    public /* synthetic */ si6(mm40 mm40Var, Object obj, Object obj2, long j, Object obj3, int i, byte b) {
        this.f32248a = b;
        this.b = mm40Var;
        this.d = obj;
        this.e = obj2;
        this.c = j;
        this.f = obj3;
    }

    public /* synthetic */ si6(long j, String str, String str2, Function0 function0, Function0 function1, int i) {
        this.f32248a = (byte) 6;
        this.c = j;
        this.b = str;
        this.d = str2;
        this.e = function0;
        this.f = function1;
    }

    public /* synthetic */ si6(List list, mm40 mm40Var, long j, w6k w6kVar, xdr xdrVar) {
        this.f32248a = (byte) 1;
        this.d = list;
        this.b = mm40Var;
        this.c = j;
        this.e = w6kVar;
        this.f = xdrVar;
    }
}
