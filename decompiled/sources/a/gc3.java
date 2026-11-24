package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gc3 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11040a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ wdr g;

    public /* synthetic */ gc3(mm40 mm40Var, ycl yclVar, ycp0 ycp0Var, float f, w6n w6nVar, Function2 function2) {
        this.f11040a = (byte) 3;
        this.c = mm40Var;
        this.d = yclVar;
        this.e = ycp0Var;
        this.b = f;
        this.f = w6nVar;
        this.g = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v24 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ?? r4;
        mm40 mm40VarW;
        int i;
        mm40 mm40VarW2;
        byte b = this.f11040a;
        wdr wdrVar = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ((do20) obj6).a((String) obj5, (qt20) obj4, this.b, (Function0) obj3, (Function0) wdrVar, (fet) obj, x8x.L(65));
                break;
            case 1:
                mm40 mm40Var = (mm40) obj6;
                l7m0 l7m0Var = (l7m0) obj5;
                Function2 function2 = (Function2) obj4;
                Function1 function1 = (Function1) obj3;
                Function1 function3 = (Function1) wdrVar;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    zcl zclVar = qmk.f28987a;
                    lh80 lh80VarU = s5x0.u(0.0f, 8.0f, 0.0f, 24.0f, 5);
                    qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                    boolean zG = fetVar.g(l7m0Var);
                    float f = this.b;
                    boolean zD = fetVar.d(f) | zG | fetVar.g(function2) | fetVar.g(function1) | fetVar.g(function3);
                    Object objP = fetVar.P();
                    if (zD || objP == ukd.f35823a) {
                        m9x m9xVar = new m9x(l7m0Var, function2, function1, function3, f);
                        fetVar.o0(m9xVar);
                        objP = m9xVar;
                    }
                    b8k0.e(mm40Var, xczVarA, lh80VarU, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
                } else {
                    fetVar.X();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                hmw0.N((mm40) obj6, (e3y) obj5, (vj50) obj4, this.b, (xcz) obj3, (Function2) wdrVar, (fet) obj, x8x.L(7));
                break;
            default:
                shd shdVar = gqw0.v;
                shd shdVar2 = gqw0.y;
                shd shdVar3 = gqw0.w;
                shd shdVar4 = gqw0.x;
                mm40 mm40Var2 = (mm40) obj6;
                ycl yclVar = (ycl) obj5;
                ycp0 ycp0Var = (ycp0) obj4;
                w6n w6nVar = (w6n) obj3;
                Function2 function4 = (Function2) wdrVar;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                xx7 xx7Var = gqw0.n;
                yx7 yx7Var = gqw0.k;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) fetVar2.k(kcp0.c)).booleanValue();
                    jm40 jm40Var = jm40.b;
                    float f2 = this.b;
                    pcy pcyVar = e7z.u1;
                    if (zBooleanValue) {
                        fetVar2.e0(-1118212978);
                        zcl zclVar2 = qmk.f28987a;
                        thg0 thg0VarA = shg0.a(new qw3(16.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
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
                        jpm0.o(fetVar2, thg0VarA, shdVar4);
                        jpm0.o(fetVar2, bh90VarM, shdVar3);
                        vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
                        x7z x7zVarI = ohs0.i(fetVar2, mm40VarC0, shdVar, 1.0f, true);
                        if (yclVar != null) {
                            mm40VarW2 = o7k0.e(jm40Var, yclVar.f42389a);
                            i = 0;
                        } else {
                            i = 0;
                            mm40VarW2 = o7k0.w(jm40Var, null, false, 3);
                        }
                        rcp0 rcp0Var = (rcp0) ycp0Var;
                        egp0.a(i, fetVar2, x7zVarI.e(mm40VarW2), rcp0Var.c);
                        x5d x5dVarA = w5d.a(new qw3(f2, true, new jf4((byte) 14)), xx7Var, fetVar2, 48);
                        int iHashCode2 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM2 = fetVar2.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, x5dVarA, shdVar4);
                        jpm0.o(fetVar2, bh90VarM2, shdVar3);
                        vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                        jpm0.o(fetVar2, mm40VarC1, shdVar);
                        cn80.a(rcp0Var.f30251a, rcp0Var.b, w6nVar, function4, fetVar2, 0, 1);
                        ohs0.x(fetVar2, true, true, false);
                    } else {
                        fetVar2.e0(-1116921270);
                        zcl zclVar3 = qmk.f28987a;
                        thg0 thg0VarA2 = shg0.a(new qw3(16.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
                        int iHashCode3 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM3 = fetVar2.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar2, mm40Var2);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, thg0VarA2, shdVar4);
                        jpm0.o(fetVar2, bh90VarM3, shdVar3);
                        vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
                        jpm0.o(fetVar2, mm40VarC2, shdVar);
                        x5d x5dVarA2 = w5d.a(new qw3(f2, true, new jf4((byte) 14)), xx7Var, fetVar2, 48);
                        int iHashCode4 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM4 = fetVar2.m();
                        mm40 mm40VarC3 = kbc.c0(fetVar2, jm40Var);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, x5dVarA2, shdVar4);
                        jpm0.o(fetVar2, bh90VarM4, shdVar3);
                        vqd.u(iHashCode4, fetVar2, shdVar2, fetVar2);
                        jpm0.o(fetVar2, mm40VarC3, shdVar);
                        rcp0 rcp0Var2 = (rcp0) ycp0Var;
                        cn80.a(rcp0Var2.f30251a, rcp0Var2.b, w6nVar, function4, fetVar2, 0, 1);
                        fetVar2.r(true);
                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                        if (yclVar != null) {
                            mm40VarW = o7k0.e(jm40Var, yclVar.f42389a);
                            r4 = 0;
                        } else {
                            r4 = 0;
                            mm40VarW = o7k0.w(jm40Var, null, false, 3);
                        }
                        egp0.a(r4, fetVar2, mm40VarD.e(mm40VarW), rcp0Var2.c);
                        fetVar2.r(true);
                        fetVar2.r(r4);
                    }
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ gc3(mm40 mm40Var, l7m0 l7m0Var, float f, Function2 function2, Function1 function1, Function1 function3) {
        this.f11040a = (byte) 1;
        this.c = mm40Var;
        this.d = l7m0Var;
        this.b = f;
        this.e = function2;
        this.f = function1;
        this.g = function3;
    }

    public /* synthetic */ gc3(Object obj, Object obj2, Object obj3, float f, Object obj4, wdr wdrVar, int i, byte b) {
        this.f11040a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = f;
        this.f = obj4;
        this.g = wdrVar;
    }
}
