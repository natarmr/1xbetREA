package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ds8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6600a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ds8(long j, qol qolVar, tol tolVar, Function0 function0) {
        this.f6600a = (byte) 2;
        this.b = j;
        this.c = qolVar;
        this.d = tolVar;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f6600a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        long j = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                s5x0.g((us8) obj5, this.b, (w6k) obj4, (xdr) obj3, (fet) obj, x8x.L(9));
                break;
            case 1:
                ((Integer) obj2).getClass();
                xkb.n((mm40) obj5, (mdm) obj4, this.b, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 2:
                qol qolVar = (qol) obj5;
                tol tolVar = (tol) obj4;
                Function0 function0 = (Function0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(1 & iIntValue, (iIntValue & 3) != 2)) {
                    fxb.i(this.b, qolVar, null, tolVar, null, null, function0, fetVar, 0, 52);
                } else {
                    fetVar.X();
                }
                break;
            case 3:
                String str = (String) obj5;
                String str2 = (String) obj4;
                pz40 pz40Var = (pz40) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x7z x7zVar = new x7z(1.0f, false);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, x7zVar);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    x7z x7zVarI = ohs0.i(fetVar2, mm40VarC0, gqw0.v, 1.0f, false);
                    y9q0 y9q0VarD = g1t0.d();
                    n05 n05Var = new n05(qmk.o, qmk.q, qmk.n);
                    Object objP = fetVar2.P();
                    if (objP == cl5Var) {
                        objP = new ryc0(pz40Var, (byte) 7);
                        fetVar2.o0(objP);
                    }
                    long j2 = this.b;
                    v8q0.a(str, x7zVarI, j2, n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, (Function1) objP, y9q0VarD, fetVar2, 0, 1597824, 45040);
                    if (str2.length() > 0) {
                        fetVar2.e0(1599732887);
                        v8q0.a(str2, s5x0.N(jm40.b, 2.0f, 0.0f, 0.0f, 0.0f, 14), j2, null, ((daq0) pz40Var.getValue()).f5764a, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.d(), fetVar2, 0, 24576, 114664);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(1600087093);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            case 4:
                mm40 mm40Var = (mm40) obj5;
                caj cajVar = (caj) obj4;
                pz40 pz40Var2 = (pz40) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    qw3 qw3Var = new qw3(12.0f, true, new jf4((byte) 14));
                    boolean zG = fetVar3.g(cajVar) | fetVar3.f(j);
                    Object objP2 = fetVar3.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new qi4((Object) cajVar, j, (byte) 16);
                        fetVar3.o0(objP2);
                    }
                    mm40 mm40VarB = hp4.B(s5x0.J(rq8.K(mm40Var, (Function1) objP2), 12.0f));
                    x5d x5dVarA = w5d.a(qw3Var, gqw0.m, fetVar3, 0);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarB);
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
                    fetVar3.e0(744878161);
                    Iterator it = ((Iterable) pz40Var2.getValue()).iterator();
                    while (it.hasNext()) {
                        d7x.n(null, (rrj0) it.next(), fetVar3, 0);
                    }
                    fetVar3.r(false);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                ntr.n((mm40) obj5, this.b, (v2n) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 6:
                o6s0 o6s0Var = (o6s0) obj5;
                mie0 mie0Var = (mie0) obj3;
                dpa0 dpa0Var = (dpa0) obj;
                ne60 ne60Var = (ne60) obj2;
                dpa0Var.getClass();
                dpa0Var.a();
                ne60 ne60Var2 = (ne60) ((ngk0) obj4).get(Long.valueOf(j));
                o6s0Var.b(ne60.e(ne60Var2 != null ? ne60Var2.f23370a : 0L, ne60Var.f23370a));
                dqm0.l((j6u0) mie0Var.f21842a, dpa0Var);
                break;
            default:
                ((Integer) obj2).getClass();
                hxm0.k((mm40) obj5, (ugg0) obj4, this.b, (ugd) obj3, (fet) obj, x8x.L(3073));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ds8(mm40 mm40Var, Object obj, long j, wdr wdrVar, int i, byte b) {
        this.f6600a = b;
        this.c = mm40Var;
        this.d = obj;
        this.b = j;
        this.e = wdrVar;
    }

    public /* synthetic */ ds8(Object obj, long j, Object obj2, wdr wdrVar, int i, byte b) {
        this.f6600a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
        this.e = wdrVar;
    }

    public /* synthetic */ ds8(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.f6600a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }

    public /* synthetic */ ds8(String str, long j, String str2, pz40 pz40Var) {
        this.f6600a = (byte) 3;
        this.c = str;
        this.b = j;
        this.d = str2;
        this.e = pz40Var;
    }
}
